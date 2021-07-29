#Jeisson Yato Tintaya
import string

class Token:
	palabra = ""
	indice = -1
	tipo = ""

lista_separadores = ["=", "+", "-", "*", "/", ",", ";", "."]

def espaciador(linea):
	idx = 0
	for i in linea:
		if(i in lista_separadores):
			substr1 = linea[0:idx]
			substr2 = linea[idx:len(linea)]
			linea = substr1 + " " + substr2
	return linea
	
def recnum(arg):
	return arg.isdigit()
def recvar(arg):
	if arg.isdigit() == True:
		return True
	return False

def reconocerNumero(linea,idx):
	print("a moment")

def reconocerVariable(linea,idx):
	print("a moment")

def analizadorLexico(linea):
	linea1 = linea.split()
	idx = 0
#substr = i[2:-2]

linea = "variable = tmp0 + 20"
linea = espaciador(linea)
#tokens = analizadorLexico(linea)

class Grammar:
	tokens = ""
	indice = -1