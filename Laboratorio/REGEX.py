# -*- coding: utf-8 -*-
#JEISSON YATO TINTAYA
import re

#1
p = re.compile("[0-9]+$")
if p.match("123"):
	print("SI ES UN NUMERO")
else:
	print("NO ES UN NUMERO")

#2
regstr = "[a-z]+"
text = "abc cde 777ghi  jkl999mno"
groups = re.findall(regstr,text)
for group in groups:
	print(group)

#TAREA
#---------------------------------------------------------------------------------------------------------------------------------------------------------
#Ejercicio 1: direccion IP
s = re.compile("([0-9]{1,3}\.){3}[0-9]{1,3}$")
#s = re.compile("[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}$")
if s.match("192.31.255.255"):
	print("SI ES UNA DIRECCION IP")
else:
	print("NO ES UNA DIRECCION IP")

#Ejercicio 2: Reconoer variable que no empiece por numero
r = re.compile("[A-z]+([A-z]*[0-9]*_*){1,}$")
if r.match("Var1_"):
	print("ES UNA VARIABLE")
else:
	print("NO ES UNA VARIABLE")


r = re.compile("((0[1-9]|[12][0-9]|3[01])[- /.](01|03|05|07|08|10|12)[- /.](19|20)\d\d)|((0[1-9]|[12][0-9]|3[0])[- /.](04|06|09|11)[- /.](19|20)\d\d)|((0[1-9]|[1][0-9]|2[0-8])[- /.](02)[- /.](19|20)\d\d)")
if r.match("29/02/2020"):
	print("YES")
else:
	print("NO")