#Jeisson Yato Tintaya

El archivo .py contiene todas las funciones pedidas en la pr�ctica 3b

COMO FUNCIONA EL PROGRAMA:
Al correr le pedir� ingresar una gram�tica: (m�todo cargar())
1.- Ingrese una gram�tica, por ejemplo:
E  := T Ep
Ep := + T Ep
Ep := - T Ep
Ep := lambda
T  := F Tp
Tp := * F Tp  |  /  F Tp  | lambda
F  := ( E ) | num | id

2.- Presione Enter 2 veces

3.- El sistema imprimir� el resultado de getProducciones()...esta funcion esta en la linea 42 del archivo.py

4.- El sistema imprimir� el resultado de getPrimeros()...esta funcion esta en la linea 45 del archivo.py

5.- El sistema imprimir� el resultado de getSiguientes()...esta funcion esta en la linea 65 del archivo.py