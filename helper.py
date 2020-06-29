#Jeisson Yato Tintaya
class Produccion:
	def __init__(self,texto):
		self.izq = ""
		self.der = []
		s = texto.split()
		self.izq = s[0]
		self.der.clear()
		for i in range(2,len(s)):
			self.der.append(s[i])

class Grammar:
	dolar = "$"
	def __init__(self):
		self.producciones = []
		self.terminales = []
		self.noterminales = []
		self.TablaSintactica = {}

	def cargar(self,texto):
		for line in texto:
			prod = Produccion(line)
			self.producciones.append(prod)
			del prod
		for i in self.producciones:
			if i.izq not in self.noterminales:
				self.noterminales.append(i.izq)
		for obj in self.producciones:
			for i in range(0, len(obj.der)):
				if obj.der[i] not in self.noterminales and obj.der[i] not in self.terminales:
					self.terminales.append(obj.der[i])
		self.nodoinicial = self.getPrimero(self.producciones[0].izq)[0]

	def get_produccion(self,izq):
		lista = []
		for obj in self.producciones:
			if izq == obj.izq:
				lista.append(obj.der)
		return lista

	def getProducciones(self):
		return self.producciones

	def getPrimeros(self):
		primeros = {}
		for nodo in self.noterminales:
			primeros[nodo] = self.getPrimero(nodo)
		return primeros

	def getPrimero(self,nodo):
		cad = ""
		for pr in self.producciones:
			if pr.izq == nodo:
				if pr.der[0] in self.terminales:
					cad += pr.der[0]
					for i in range(1, len(pr.der)):
						if(pr.der[i] == "|"):
							cad = cad + " " + pr.der[i+1]
				else:
					cad += self.getPrimero(pr.der[0])
				cad += " "
		return cad

	def getSiguientes(self):
		siguientes = {}
		siguientes[self.noterminales[0]] = [self.dolar]
		siguientes[self.noterminales[0]].append(self.getSiguiente(self.noterminales[0], siguientes))
		productions = self.getProducciones() 
		for i in range(1,len(productions)):
			siguientes[productions[i].izq] = self.getSiguiente(productions[i].izq, siguientes)
		return siguientes

	def getSiguiente(self, nod, dicc):
		if nod in self.terminales:
			return nod
		if(nod == self.noterminales[0]):
			for prods in self.getProducciones():
				for i in range(0,len(prods.der)):
					if nod == prods.der[i]:
						if i < len(prods.der)-1:
							return self.getSiguiente(prods.der[i+1],dicc)
							break
		else:
			for prods in self.getProducciones():
				for i in range(0,len(prods.der)):
					if nod == prods.der[i]:
						if i < len(prods.der)-1:
							return self.getSiguiente(prods.der[i+1],dicc)
							break
						else:
							return dicc[prods.izq]
							break

	def imprimir(self):
		for prod in self.producciones:
			print(prod.izq+" :=", end = " ")
			print(*(prod.der))

	def llenarestaticamente(self):
		for el in self.noterminales:
			self.TablaSintactica[el] = {}
		print("\nLlenar tabla - Colocar en formato no_terminal terminal produccion:\t Ejemplo: E ( T Ep:")
		while True:
			user_input = input()
			if user_input.strip() == "":
				break
			cads = user_input.split()
			cads[2 : len(cads)] = [''.join(cads[2 : len(cads)])] 
			self.TablaSintactica[cads[0]][cads[1]] = cads[2]

	def imprimir_tabla(self):
		for p_id, p_info in self.TablaSintactica.items():
			print(p_id, end = "\t")
			for key in p_info:
				print(p_info[key], end = "\t")
			print("")



#-------------------------------------------------------------------------------------------
#MAIN
if __name__ == "__main__":
	lines = []
	while True:
		user_input = input()
		if user_input.strip() == "":
		        break
		lines.append(user_input)
	gramatica = Grammar()
	gramatica.cargar(lines)
	print("getProducciones")
	for prod in gramatica.getProducciones():
		print(prod.izq+ " :=", end = " ")
		print(*(prod.der))
