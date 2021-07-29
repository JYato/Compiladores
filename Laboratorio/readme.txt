#Jeisson Yato Tintaya

El archivo .py contiene todas las funciones pedidas en la práctica 3a

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

3.- Se imprimirá la gramática: (método imprimir())

4.- Le pedirá entradas para la tabla_sintactica: (método LlenarEstaticamente())
En caso haber ingresado la gramática de ejemplo anterior, ingresar:
E ( T Ep
E num T Ep
E id T Ep
Ep + + T Ep
Ep - - T Ep
Ep ) lambda
Ep $ lambda
T ( F Tp
T num F Tp
T id F Tp
Tp + lambda
Tp - lambda
Tp * * F Tp
Tp / / F Tp
Tp ) lambda
Tp $ lambda
F ( ( E )
F num num
F id id

caso contrario, ingresar entradas propias

5.- Presione Enter 2 veces

6.-El sistema imprimirá la tabla, con los no terminales a la izquierda, y sus predicciones en la misma linea

El programa tiene los constructores para cada clase.
El método get_produccion() esta disponible, solo necesita como parámetro a un izq, esta comentado en el main