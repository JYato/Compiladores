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
	def __init__(self):
		self.produccion = []
		self.terminales = []
		self.noterminales = []
		self.TablaSintactica = {}

	def cargar(self,texto):
		for line in texto:#llena la lista de producciones
			prod = Produccion(line)
			self.produccion.append(prod)
			del prod
		for i in self.produccion:#llena noterminales
			if i.izq not in self.noterminales:
				self.noterminales.append(i.izq)
		for obj in self.produccion:#llena terminales
			for i in range(0, len(obj.der)):
				if obj.der[i] not in self.noterminales and obj.der[i] not in self.terminales:
					self.terminales.append(obj.der[i])

	#retorna una lista de la parte derecha de todas las producciones que coincidan con izq
	def get_produccion(self,izq):
		lista = []
		for obj in self.produccion:
			if izq == obj.izq:
				lista.append(obj.der)
		return lista

	def imprimir(self):#imprime la gramatica
		for prod in self.produccion:
			print(prod.izq+" :=", end = " ")
			print(*(prod.der))

	def llenarestaticamente(self):#llena la tabla de predicciones
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
	print("Ingresar la gramatica:")
	while True:
		user_input = input()
		if user_input.strip() == "":
		        break
		lines.append(user_input)
	gramatica = Grammar()
	gramatica.cargar(lines)
	gramatica.imprimir()
	gramatica.llenarestaticamente()
	gramatica.imprimir_tabla()
	#print(gramatica.get_produccion("Ep"))
#Se debe presionar dos veces Enter
