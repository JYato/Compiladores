

linea = "variable = tmp0 + 20"
print(linea[0])
print(linea[15].isdigit())



















class Token:
	palabra = ""
	indice = -1
	tipo = ""

lista_separadores = [" ", "=", "+", "-", "*", "/"]

#pregunta1
#Descripcion: 
def pregunta1(linea):
	analizador = linea.split()
	print(analizador)

#pregunta2
def reconocerNumero(linea):
	

def reconocerVariable(linea):
	if linea.isdigit():
		return False
	return True


def analizadorLexico(linea):
	tokens = []
	idx = 0
	while idx < len(linea):
		if reconocerNumero(linea[idx]):
			token,idx = reconocerNumero(linea,idx)
			tokens.append(token);
		elif reconocerVariable(linea[idx]):
			token,idx = reconocerVariable(linea,idx)
			tokens.append(token)
	return tokens;

#main
#linea = "variable = tmp0 + 20"
#pregunta1(linea)

#tokens = analizadorLexico(linea)
#for token in tokens:
#	print(token.toString())