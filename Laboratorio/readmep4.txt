#Jeisson Yato Tintaya

El archivo .py contiene todas las funciones pedidas en la práctica 3b

COMO FUNCIONA EL PROGRAMA:
Al correr le pedirá ingresar una gramática: (método cargar())
1.- Ingrese una gramática, por ejemplo:
E  := T Ep
Ep := + T Ep
Ep := - T Ep
Ep := lambda
T  := F Tp
Tp := * F Tp  |  /  F Tp  | lambda
F  := ( E ) | num | id

2.- Presione Enter 2 veces

3.- El sistema imprimirá el resultado de getProducciones()...esta funcion esta en la linea 42 del archivo.py

4.- El sistema imprimirá el resultado de getPrimeros()...esta funcion esta en la linea 45 del archivo.py

5.- El sistema imprimirá el resultado de getSiguientes()...esta funcion esta en la linea 65 del archivo.py