#Jeisson Yato Tintaya

class Token:
	palabra = ""#LEXEMA
	indice = -1#POSICION LINEA
	nro_linea = -1#NRO LINEA
	tipo = ""
	def toString(obj):#Método que devuelve los atributos del objeto token en una cadena lista para imprimir
		cad = "Token[" + obj.palabra + "]: nro_linea = "+str(obj.nro_linea) +", pos = " + str(obj.indice) + ", tipo_token = " + obj.tipo
		return cad

lista_separadores = [" ", "=", "+", "-", "*", "/", ",", ";","(",")","[","]","{","}","\t","\n","\"",".","<",">"] #Esta lista contiene operadores y otros caracteres diferentes a numeros y alfabeto
tokens_separadores = {"(":"LEFT_PAR",
		")":"RIGHT_PAR",
		"[":"L_COR",
		"]":"R_COR",
		"{":"L_LLV",
		"}":"R_LL",
		",":"COMA",
		";":"PUCOMA",
		"\"":"AC_STRING",
		"\n":"SAL_LINEA",
		"\t":"TAB",
		".":"DOT",
		"<":"APER_VEC",
		">":"CIER_VEC",
		"=":"ASSIGN"}
lista_reservadas = ["main","int","float","string","cg","cg_var","gnv_var","gnv","gnu","gnu_var","vector","insert","delete","dijkstra","asterisk","floyd_w","lca","bst","if","else","while","read","print","txt","funcion","for"]
tokens_reservados = {"main":"MAIN",
		"int":"INT",
		"float":"FLOAT",
		"string":"STRING",
		"cg":"CG",
		"cg_var":"CG_VAR",
		"gnv_var":"GNV_VAR",
		"gnv":"GNV",
		"gnu":"GNU",
		"gnu_var":"GNU_VAR",
		"vector":"VECTOR",
		"insert":"INSERT_",
		"delete":"DELETE_",
		"dijsktra":"DIJKSTRA",
		"asterisk":"ASTERISK",
		"floyd_w":"FLOYD",
		"lca":"LCA",
		"bst":"BST",
		"if":"IF",
		"else":"ELSE",
		"while":"WHILE",
		"read":"READ",
		"print":"PRINT",
		"txt":"TXT",
		"funcion":"FUNCION",
		"for":"FOR"}

#Las siguientes tres funciones se hicieron siguiendo el ejemplo de la practica
def reconocerNumero(linea,idx):
	substr = ""#En esta variable guardo el numero
	idx1 = idx#En esta variable guardo el valor de idx antes que esta ultima se modifique
	while idx < len(linea):
		if linea[idx].isdigit():#solo digitos
			substr += linea[idx]
			idx += 1
		elif linea[idx] == ".":
			substr += linea[idx]
			idx += 1
		elif linea[idx].isalpha():#para la condicion 2c,una variable debe empezar por una letra,Seguidamente puede venir varios caracteres (números o letras)
			print("Error, la variable no puede empezar con numeros, el analizador se detendra en el indice " + str(idx))
			token = Token()
			token.palabra = "-"
			token.indice = idx
			token.tipo = "-" #imprimira error y token con atributos 'nulos'
			idx = len(linea)#para q el while de la funcion analizadorLexico se detenga
			return token,idx
		else:
			break
	token = Token()#Objeto token con todos sus atributos
	token.palabra = substr#asignar valores a los atributos del objeto token
	token.indice = idx1
	if("." in substr):
		token.tipo = "FLOAT"
	else:
		token.tipo = "INT"
	return token,idx

def reconocerReserved(linea,idx):
	substr = ""
	idx1 = idx
	while idx < len(linea):
		if linea[idx] in lista_separadores:#cualquier caracter q no sea numero o alfabeto detiene el bucle
			break
		else:#q si lo es
			substr += linea[idx]
			idx += 1
	token = Token()
	token.palabra = substr
	token.indice = idx1
	if substr in lista_reservadas:
		token.tipo = tokens_reservados[str(substr)]
	elif True:
		token.tipo = "ID"
	else:
		print("Entrada no valida en la posicion", end = " ")
		print(idx1)
	return token,idx


def analizar_linea(linea):
	tokens = []
	idx = 0
	while idx < len(linea):
		token = Token()#Objeto Token
		if linea[idx] == " " or linea[idx] == "\t":
			idx += 1
		elif linea[idx].isdigit() == True:
			token,idx = reconocerNumero(linea,idx)
			#print(token.palabra)
			#print(token.tipo)
			tokens.append(token)
		elif linea[idx].isalpha() == True:
			token,idx = reconocerReserved(linea,idx)
			#print(token.palabra)
			#print(token.tipo)
			tokens.append(token)
		elif linea[idx] == "/" and linea[idx+1] == "/":
			break
		elif linea[idx] in lista_separadores:#si el caracter es algun operador o caracter no numerico/del alfabeto
			token.palabra = linea[idx]#asignar valores a los atributos del objeto token
			token.indice = idx
			if linea[idx] in lista_separadores:
				token.tipo = tokens_separadores[str(linea[idx])]
			else:
				print("Signo no valido en ", end = " ")
				print(idx)
			idx += 1
			#print(token.palabra)
			#print(token.tipo)
			tokens.append(token)
		else:
			print("Signo no valido en ", end = " ")
			print(idx)
			idx += 1
	return tokens

class Lexycal:
	def __init__(self):
		self.tokens = []
	def Analisis_lexico(self):
		lines = []
		txt = open('pdraph1.txt', 'r')
		while True:
			text = txt.readline()
			if(str(text) == ""):
				break
			lines.append(str(text))
		for line in lines:
			#print(line)
			self.tokens.append(analizar_linea(str(line)))
		#tokens = analizadorLexico(linea)
		cont_linea = 0
		for lista in self.tokens:
			cont_linea += 1
			for token in lista:
				token.nro_linea = cont_linea
				print(token.toString())
	#while True:
	#	user_input = input()
	#	if user_input.strip() == "":
	#	        break
	#	lines.append(user_input)

if __name__ == '__main__':
	analyzer = Lexycal()
	analyzer.Analisis_lexico()