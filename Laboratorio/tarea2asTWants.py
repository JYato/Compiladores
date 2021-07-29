#Jeisson Yato Tintaya

class Token:
	palabra = ""
	indice = -1
	tipo = ""
	def toString(obj):#Método que devuelve los atributos del objeto token en una cadena lista para imprimir
		cad = "Token[" + obj.palabra + "]: pos = " + str(obj.indice) + ", tipo = " + obj.tipo
		return cad

lista_separadores = [" ", "=", "+", "-", "*", "/", ",", ";"] #Esta lista contiene operadores y otros caracteres diferentes a numeros y alfabeto

#Las siguientes tres funciones se hicieron siguiendo el ejemplo de la practica
def reconocerNumero(linea,idx):
	substr = ""#En esta variable guardo el numero
	idx1 = idx#En esta variable guardo el valor de idx antes que esta ultima se modifique
	while idx < len(linea):
		if linea[idx].isdigit():#solo digitos
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
	token.tipo = "E"
	return token,idx

def reconocerVariable(linea,idx):
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
	token.tipo = "V"
	return token,idx


def analizadorLexico(linea):
	tokens = []
	idx = 0
	while idx < len(linea):
		token = Token()#Objeto Token
		if linea[idx].isdigit() == True:
			token,idx = reconocerNumero(linea,idx)
			tokens.append(token)
		elif linea[idx].isalpha():
			token,idx = reconocerVariable(linea,idx)
			tokens.append(token)
		elif linea[idx] == " ":
			idx += 1
		elif linea[idx] in lista_separadores:#si el caracter es algun operador o caracter no numerico/del alfabeto
			token.palabra = linea[idx]#asignar valores a los atributos del objeto token
			token.indice = idx
			token.tipo = "O"
			idx += 1
			tokens.append(token)
		else:
			idx += 1
			print("Signo no valido o no visto en la practica")
	return tokens


#MAIN ------------------------------------------------------------------------------------------------
linea = "variable = tmp0 + 20"
#linea = "1+2"
#linea = "4*3-8"
#linea = "60   /    5 + 3 - 0"
#linea = "A=12"
#linea = "variable1 =14"
#linea = "C = A + variable1"
tokens = analizadorLexico(linea)
for token in tokens:
	print(token.toString())