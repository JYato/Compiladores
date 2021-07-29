import string

def pregunta1(entrada):
	entrada.strip()
	tam = len(entrada)
	if tam % 2 != 0:
		print("NO")
	else:
		apertura = ["(","[","{"]
		cierre = [")","]","}"] 
		pila = []
		for i in entrada:
			if i in apertura:
				pila.append(i)
			elif i in cierre:
				temp = cierre.index(i)
				if ((apertura[temp] == pila[-1]) and (len(pila) > 0)):
					pila.pop()
				else:
					print("NO")
					return
		if len(pila) == 0:
			print("SI")

def pregunta2(entrada):
	verbo,gerundio = entrada.split()
	if verbo == "reir":
		if gerundio == "riendo":
			print("SI")
			return
		else:
			print("NO")
			return
	elif verbo[-2] == "a":
		substr = verbo[0:-2]
		substr = substr + "ando"
		if substr == gerundio:
			print("SI")
			return
		else:
			print("NO")
			return
	elif verbo[-2] == "e" or verbo[-2] == "i":
		if(len(verbo) < 3 or verbo[-3] == "a" or verbo[-3] == "e" or verbo[-3] == "i" or verbo[-3] == "o" or verbo[-3] == "u"):
			substr = verbo[0:-2]
			substr = substr + "yendo"
			if substr == gerundio:
				print("SI")
				return
			else:
				print("NO")
				return
		elif verbo[-2] == "e":
			substr = verbo[0:-2]
			substr = substr + "iendo"
			if substr == gerundio:
				print("SI")
				return
			else:
				print("NO")
				return
		elif verbo[-2] == "i":
			substr = verbo[0:-1]
			substr = substr + "endo"
			if substr == gerundio:
				print("SI")
				return
			else:
				print("NO")
				return
	print("NO")

def pregunta3(entrada):
	arr = entrada.split()
	tipos = ""
	I = 1.0
	U = 1.0
	P = 1.0
	cant = 0
	for i in arr:
		if "I=" in i:
			cant +=1
			tipos += "I"
			if i[-2] == "m" or i[-2] == "k" or i[-2] == "M":
				substr = i[2:-2]
				I = I * float(substr)
				if i[-2] == "m":
					I = I * 0.001
				elif i[-2] == "k":
					I = I * 1000
				else:
					I = I * 1000000
			else:
				substr = i[2:-1]
				print(substr)
				I = I * float(substr)
		elif "U=" in i:
			cant +=1
			tipos += "U"
			if i[-2] == "m" or i[-2] == "k" or i[-2] == "M":
				substr = i[2:-2]
				U = U * float(substr)
				if i[-2] == "m":
					U = U * 0.001
				elif i[-2] == "k":
					U = U * 1000
				else:
					U = U * 1000000
			else:
				substr = i[2:-2]
				U = U * float(substr)
		elif "P=" in i:
			cant +=1
			tipos += "P"
			if i[-2] == "m" or i[-2] == "k" or i[-2] == "M":
				substr = i[2:-2]
				P = P * float(substr)
				if i[-2] == "m":
					P = P * 0.001
				elif i[-2] == "k":
					P = P * 1000
				else:
					P = P * 1000000
			else:
				substr = i[2:-2]
				P = P * float(substr)
		if cant > 1:
			break

	if tipos == "PU" or tipos == "UP":
		I = P/U
		print("I="+str(I)+"A")
	elif tipos == "IP" or tipos == "PI":
		U = P/I
		print("U="+str(U)+"v")
	elif tipos == "IU" or tipos == "UI":
		P = U*I
		print("P="+str(P)+"W")

#-------------------------------------------------------------------------------------------------------------
#1
entrada = "[ (   [)]  ]"
#entrada = str(input("Cual es la cadena?: "))
pregunta1(entrada)

#2
entrada = "correr corriendo"
#entrada = input("Ingresar verbo y gerundio: ")
pregunta2(entrada)

#3
entrada = "bla bla bla lightning strike I=2A bla bla bla P=2.5MW bla bla voltage"
#entrada = input("Ingresar cadenas: ")
pregunta3(entrada)

