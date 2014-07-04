/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aportefunciones;

/**
 *
 * @author V1C70R MU3N735
 */
public class enunciados {
    public String enun1()
    {
    return "Mira esta serie: 7, 6, 8, 4, 9, 2, 10, 0, 11, -2, ...\n" +
"Cree una función que recibe dos enteros: x e y. Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debe devolver -1\n" +
"De lo contrario, la función debe devolver la suma de los elementos X e Y de la serie.\n" +
"Por ejemplo: Si la función recibe x = 1, y = 3, se debería devolver: 15 (Debido a que la suma de la primera, más el tercer argumento es 7 +8 = 15).. Si la función recibe x = 8, y = 9, es conveniente devolver 11. (Debido a que la suma de la octava más el elemento noveno es 0 11 = 11).\n" +
"La función recibirá 2 enteros, y devuelve un entero.";
    }
        public String enun2()
    {
    return "Mira esta serie: 2, 2, 4, 12, 48, ... la semilla de esta serie fue el número 2 Mira esta serie:. 3, 3, 6, 18, 72, ... la semilla de esta serie fue el número 3.\n" +
"Cree una función que recibe dos enteros: x, y  y. Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debe devolver -1\n" +
"La función debe devolver el elemento y de las series generadas por x.\n" +
"Por ejemplo, si la serie recibe x = 3, y = 4, es conveniente devolver 72, porque 72 es el cuarto elemento de la serie generado cuando x = 3.\n" +
"La función recibirá 2 enteros, y devuelve un entero.";
    }
           public String enun3()
    {
    return "Mira esta serie: 60, 30, 20, 15, 12 ... la semilla de esta serie fue el número 60.\n" +
"Cree una función que recibe dos enteros: x, y y. Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debe devolver -1.\n" +
"La función debe devolver el elemento y de las series generadas por x.\n" +
"Por ejemplo: Si la función recibe x = 60, y = 3, devolverá 20, porque el 20 es el elemento 3 º en la serie genera cuando x = 60.\n" +
"La función recibirá 2 enteros, devuelve un valor de punto flotante.";
    }
              public String enun4()
    {
    return "Dadas dos cadenas S1 y S2. Eliminar en S1 todos esos caracteres que se presentan en S2. Devolver un S1 limpio con los caracteres eliminados. Cualquier carácter se elimina tanto en mayúsculas como en minúsculas.\n" +
"Por ejemplo, dado:\n" +
"S1 = \"La vida es bella\" S2 = \"El santo\"\n" +
"La función debe devolver: \"vidb\".\n" +
"La función recibirá 2 cadenas y devolver una cadena";
    }
              public String enun5()
    {
    return "Escriba una función para eliminar los duplicados de una matriz ordenada de enteros en una línea de código. (Usted puede usar tantas declaraciones como sea necesario, pero el código debe ser escrito en una sola línea).\n" +
"Ejemplo:\n" +
"Si la función recibe esta matriz: A = [-3, -2, 0, 0, 5, 7, 9, 11, 11, 25]\n" +
"La función debe devolver: A = [-3, -2, 0, 5, 7, 9, 11, 25]\n" +
"La función recibirá un arreglo de enteros, y devolver una matriz de enteros.";
    }
              public String enun6()
    {
    return "Dada una cadena, que contiene palabras y espacios (caracteres especiales), crear una función que devuelva una cadena con las palabras en un orden inverso.\n" +
"Ejemplo:\n" +
"Si la función recibe: \"esta es una prueba\", debe regresar: \"prueba una es este\".\n" +
"Si se recibe una cadena vacía, una cadena vacía se debe devolver. Si sólo hay una palabra recibida, la misma palabra que se debe devolver.\n" +
"La función recibirá una cadena y devolver una cadena.";
    }
              public String enun7()
    {
    return "Dada una cadena que contiene letras (mayúsculas y minúsculas), números y caracteres especiales, devuelva la misma cadena en minúsculas.\n" +
"Por ejemplo, si la función recibe:\n" +
"\"Nanito, QUÉ bien! Este es un texto de ejemplo, Lorem Ipsum, 2 CONVertido \".\n" +
"La función debe devolver:\n" +
"\"nanito, qué bien! este es un texto de ejemplo, lorem ipsum, 2 convertido \".\n" +
"La función debe considerar la conversión: Todos los caracteres de AZ, A, E, I, O, U y Ñ.Otros caracteres seguirán siendo los mismos.\n" +
"Limitación: La conversión debe hacerse teniendo en cuenta los valores ASCII. Obviamente no se puede utilizar las funciones proporcionadas por el lenguaje (toLowercase (), Lowercase (), etc.) No se puede tener una gran sentencia switch de los casos para cada letra, o un montón de if / else.\n" +
"Esta función recibirá una cadena y devuelve una cadena";
    }
              public String enun8()
    {
    return "Dada una cadena, busque el número de palabras que tiene por lo menos una \"a\" como caracteres (mayúsculos o minúsculos). No tener en cuenta las variaciones de carácter como á, à, etc .. sólo los sencillos \"A\" y cuenta \"A\".\n" +
"Las palabras siempre están separadas por un espacio, una coma, un punto y coma o un punto.\n" +
"Por ejemplo:\n" +
"Si la función recibe: \". Ah, este es un texto de muestra, que da una lid de análisis\" La función debe devolver 5, ya que cinco palabras tiene caracteres \"a\". (Ah, muestra, da, una, análisis).\n" +
"La función recibirá una cadena y devolver un entero.\n" +
"Limitaciones: No utilice el split (función), o similar.";
    }
              public String enun9()
    {
    return "Dado un número entero positivo determinar si es la potencia de dos de otro número entero.\n" +
"No empezar a programar, lea las limitaciones.\n" +
"Por ejemplo:\n" +
"Si la función recibe 25, debe devolver TRUE, porque 5 ^ 2 = 25 Si la función recibe 1, debe devolver TRUE, porque 1 ^ 2 = 1 Si la función recibe 16, debe devolver TRUE, porque 4 ^ 2 = 16 Si la función recibe 14, debería devolver FALSE.\n" +
"Limitación: No es posible utilizar las funciones de raíz cuadrada (sqrt () o similar), potenciación (pow () o similar). Sólo se permiten las operaciones aritméticas básicas (suma, resta, multiplicación, división), y las operaciones lógicas.\n" +
"La función recibe un número entero positivo mayor que 0, y debe devolver un valor booleano.";
    }
              public String enun10()
    {
    return "Un número perfecto es un número entero positivo que es igual a la suma de sus divisores apropiados. Por ejemplo, 6 es un número perfecto porque 6 = 1 +2 +3.\n" +
"Crear una función que recibe dos valores X y Y, debe devolver  el menor número perfecto encontrado, que es mayor o igual que X y menor o igual a Y. Si ningún número perfecto encontró, debe devolver -1.\n" +
"Por ejemplo, si la función recibe X = 5, Y = 7, se debe devolver 6, porque 6 es el número perfecto menor entre 5 y 7.\n" +
"La función recibirá dos enteros y devolver un entero.";
    }
              public String enun11()
    {
    return "Dada una matriz de enteros, encontrar que se repite más veces. Devuelve el número que tiene más repeticiones. Si dos números tienen la misma cantidad de repeticiones, devuelva el número más bajo.\n" +
"Por ejemplo, dada la matriz:\n" +
"A = [1, 5, 3, -2, 4, 2, 4, -2, 5, 5, 2, 1, 3]\n" +
"1 se repite 2 veces, 5 se repite 3 veces, 3 se repite 2 veces, 4 se repite 2 veces 2 se repite 2 veces\n" +
"El número que más se repite es 5 La función debe devolver:.. 5 (5 Porque se repite 3 veces en la matriz).\n" +
"La función recibirá una matriz de enteros y devolver un entero.";
    }
              public String enun12()
    {
    return "Índice de equilibrio de una secuencia es un índice tal que la suma de los elementos en índices más bajos es igual a la suma de los elementos en los índices más altos.\n" +
"Cree una función que recibe una matriz de enteros y devuelve el primer índice de equilibrio encontrado. Si no hay ningún índice de equilibrio encontrado, la función debe devolver -1\n" +
"Por ejemplo, si la matriz recibida es: A = [-7, 1, 5, 2, -4, 3, 0]\n" +
"3 es un índice de equilibrio, porque: a [0] + A [1] + A [2] = A [4] + A [5] + A [6]\n" +
"En otras palabras, usted debe encontrar el índice de la matriz en la que la suma de los elementos de la izquierda es igual a la suma de los elementos adecuados.\n" +
"En el ejemplo, la función devolverá 3, porque es el primer índice de equilibrio se encuentra en la matriz.\n" +
"La función recibe un arreglo de enteros y devuelve un entero.";
    }
              public String enun13()
    {
    return "Se le da una matriz con números enteros positivos y negativos. Escriba una función para cambiar el orden de los elementos de la matriz de tal manera que los\n"
+ "enteros negativos estén al principio, los enteros positivos queden al final. Cero (0) y números enteros que tienen el mismo signo no cambia el orden.\n" +
"Por ejemplo, si la función recibe: a[0] = 4; a[1] = -3; a[2] = -100; a[3] = 7; a[4] = 0; a[5] = 1; a[6] = -6;\n" +
"la función debe devolver:\n" +
"a[0] = -3; a[1] = -100; a[2] = -6; a[3] = 4; a[4] = 7; a[5] = 0; a[6] = 1;\n" +
"La función recibe un arreglo de enteros y devuelve un array de enteros.\n" +
"Limitaciones: Usted no puede utilizar métodos proporcionados por el lenguaje de clasificación.\n"
+ "(Por ejemplo, Array.sort (), sort (), etc ..). Si usted lo necesita, debe crear su propia implementación de la función de clasificación.";
    }
              public String enun14()
    {
    return "Mira esta serie: 53, 35, 64, 46, 75, 57, 86 , 68, 97, 79, 108, 810, 119, 911, 1210, 1012, ... las semillas de esta serie fueron los números 5 y 3.\n" +
"Mira esta serie: 103, 310, 114, 411, 125, 512, 136, 613, 147, 714, 158, 815, 169, 916, 1710, 1017, ... las semillas de esta serie fueron los números 10 y 3.\n" +
"Mira esta serie: 1012, 1210, 1113, 1311, 1214, 1412, 1315, 1513, 1416, 1614, 1517, 1715, 1618, 1816, 1719, 1917, ... las semillas de esta serie fueron los números 10 y 12.\n" +
"Cree una función que recibe tres enteros: x, y y z. Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debe devolver -1\n" +
"La función debe devolver el elemento Z de la serie generada por x y y.\n" +
"Por ejemplo: Si la función recibe x = 5, y = 3, z = 3, devolverá 64, porque 64 es el elemento 3 º en la serie generada cuando x = 5 e y = 3.\n" +
"La función recibirá 3 enteros, devolver un entero.";
    }
              public String enun15()
    {
    return "Dada una matriz de enteros (positivos y negativos), encontrar el subconjunto contiguo con la suma más grande. Volver a la suma.\n" +
"El subconjunto puede ser de cualquier longitud, incluso podría ser todo el conjunto. Podría ser también un único elemento.\n" +
"Por ejemplo:\n" +
"Si la función recibe la siguiente matriz:\n" +
"A = [4, -3, 7, 2, 4, -5, 1, 2]\n" +
"Algunos subconjuntos contiguos son los siguientes:\n" +
"Submatriz de índice de 0 a 1: [4, -3] suma 1 submatriz de índice 2 a 4: [7, 2, 4] suma 13 submatriz de índice de 0 a 7: [4, -3, 7, 2, 4, -5, 1, 2] suma 12 submatriz desde el índice 0 a 0: [4] suma 4 ....\n" +
"[4, 7, 2, 4] no es un subconjunto contiguo.\n" +
"La función se encontrará con que el subconjunto contiguo con la suma más grande es [4, -3, 7, 2, 4], que suma 14. La función debe devolver 14.";
    }
              public String enun16()
    {
    return "Mira esta serie: 3, 6, 24, 144, ... la semilla de esta serie fue el número 3 Mira esta serie:. 8, 16, 64, 384, ... la semilla de esta serie era el número 8.\n" +
"Cree una función que recibe tres enteros: x, y y z. Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debe devolver -1\n" +
"Esta función debe devolver un valor calculado basado en z y y de las series generadas por x. (X es la semilla de la serie).\n" +
"Por ejemplo, si la función recibe x = 3, y = 1, z = 3, la función encontrará (basado en x), que es la serie 3, 6, 24, 144, ..., sobre la base de esa serie, y basa en y = 1 y z = 3, la función debe devolver 33.\n" +
"Si la función recibe x = 8, y = 2, z = 4, la función debe devolver 464. Si la función recibe x = 5, y = 2, z = 2, la función debe devolver 10. Para cualquier caso en que Y> z, la función devolverá 0.\n" +
"Para encontrar la relación entre y, z, y el resultado es parte del problema a resolver.\n" +
"La función recibirá 3 enteros, y devolver un entero.";
    }
              public String enun17()
    {
    return "Las palabras a números\n" +
"Cree una función que transforma una cadena en un número. El número puede estar entre 0 y 255.\n" +
"Por ejemplo:\n" +
"Si la función recibe \"cero\", debe devolver 0. Si la función recibe \"Uno\", debería devolver 1. Si la función recibe \"once\", debería devolver 11. Si la función recibe \"trece\", debe devolver 13. Si la función recibe \"cincuenta y cinco\", debe devolver 55. Si la función recibe \"CIEN\", debe devolver 100. Si la función recibe \"Doscientos treinta y uno\", debe devolver 231.\n" +
"Si la función no entiende la cadena, debe devolver -1\n" +
"La función recibirá una cadena y devolver un entero.";
    }
              public String enun18()
    {
    return "Cree una función que ordena una matriz de palabras en orden alfabético. El texto será siempre en minúsculas, y no contendrá ningún carácter especial o número. No utilice funciones de ordenación proporcionadas por el lenguaje (lectura de las limitaciones).\n" +
"Por ejemplo:\n" +
"Si la función recibe:\n" +
"A = ['prueba', 'concurso', 'programación', 'más'];\n" +
"La función debe devolver:\n" +
"['Concurso', 'más', 'programación', 'test']\n" +
"Limitaciones: No utilice ninguna función de ordenamiento (Sort, Array.sort (), etc) proporcionado por el lenguaje. Usted puede crear su propia función de clasificación.\n" +
"La función recibirá una matriz de cadenas y devolver una matriz de cadenas.";
    }
              public String enun19()
    {
    return "Cree una función que recibe un entero de 32 bits y devuelva el número de unos en el binario de ese número. (Precaución: recorrer y preguntar por cada bit no es una solución).\n" +
"La función puede recibir cualquier número entero positivo de 32 bits.\n" +
"Por ejemplo:\n" +
"Si la función recibe 25, debe devolver 3. ¿Por qué? Debido a que 25 en binario es 11001, que tiene 3 unidades.\n" +
"La función recibirá un entero y devolver un entero.";
    }
              public String enun20()
    {
    return "En teoría de números, una partición de un entero positivo n, también denominada partición entera, es una forma de escribir n como suma de enteros positivos. Dos sumas que difieren sólo en el orden de sus sumandos se consideran la misma partición.\n" +
"Las particiones de 4 se enumeran a continuación:..... 1. 4 2. 3 + 1 3. 2 + 2 4. 2 + 1 + 1 5. 1 + 1 + 1 + 1 \n" +
"Las particiones de 8 se enumeran a continuación:....... 1. 8 2. 7 + 1 3. 6 + 2 4. 6 + 1 + 1 5. 5 + 3 6. 5 + 2 + 1 7. 5 + 1 + 1 + 1 8. 4 + 4 9. 4 + 3 + 1 10. 4 + 2 + 2 11. 4 + 2 + 1 + 1 12. 4 + 1 + 1 + 1 + 1 13. 3 + 3 + 2 14. 3 + 3 + 1 + 1\n" +
"15. 3 + 2 + 2 + 1 16. 3 + 2 + 1 + 1 + 1 17. 3 + 1 + 1 + 1 + 1 + 1 18. 2 + 2 + 2 + 2 19. 2 + 2 + 2 + 1 + 1 20. 2 + 2 + 1 + 1 + 1 + 1 21. 2 + 1 + 1 + 1 + 1 + 1 + 1 22. 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 Cree una función que recibe un entero: x. Si el valor recibido es 0 o negativo, o si es mayor que 255, la función debe devolver -1\n" +
"La función debe devolver el número de particiones x tiene.\n" +
"Por ejemplo: Si la función recibe 4, debe devolver 5 Si recibe 8, devolverá 22, etc.\n" +
"La función recibirá un número entero, devuelve otro entero.";
    }
              public String enun21()
    {
    return "Dada una matriz 2-D de caracteres, escribir una función que devuelve una cadena con los caracteres de la matriz con el fin de caracol. (A partir de [0] [0] elemento, elemento siguiente: [0] [1], etc ..).\n" +
"La matriz puede tener cualquier longitud, pero siempre será un cuadrado.\n" +
"Por ejemplo: Dada esta matriz:\n" +
"a b c \n" +
"d e f\n" +
"g h i\n" +
"Devuelve una cadena con el valor: \"abcfihgde\".";
    }
              public String enun22()
    {
    return "Dada una matriz 2-D de los números enteros, escribir una función que, con el fin de caracol, sumas y restas, a continuación, y luego se multiplican los valores de los elementos (a partir de [0] [0] elemento, elemento siguiente:. [0] [1 ], etc ..)\n" +
"La matriz puede tener cualquier longitud, siempre va a ser un rectángulo, pero no necesariamente un cuadrado.\n" +
"Por ejemplo: Dada esta matriz:\n" +
"5 4 7 \n" +
"1 2 3\n" +
"3 2 1\n" +
"Comenzamos con el primer elemento: 5 Luego sumamos el siguiente elemento: 5 +4 = 9 Entonces restamos el siguiente elemento: 9-7 = 2 Entonces multiplicamos el siguiente elemento: 2 * 3 = 6 Entonces sumamos el siguiente elemento : 6 + 1 = 7 El restamos el siguiente elemento: 7 - 2 = 5 Entonces multiplicamos el siguiente elemento: 5 * 3 = 15 Entonces sumamos el siguiente elemento: 15 + 1 = 16 Entonces restamos el siguiente elemento: 16 - 2 = 14\n" +
"La función debe devolver 14";
    }
              public String enun23()
    {
    return "Expresiones de Postfix son expresiones aritméticas en que los operadores vienen después de todo lo que operan en. Postfix es importante porque mantiene la precedencia sin el uso de (), y son \"fáciles\" de evaluar.\n" +
"Cree una función que recibe una cadena con una expresión de postfix y devolver el valor calculado.\n" +
"La función recibirá una expresión sufijo correcto. Habrá un espacio entre cada número / operador. Los operadores son + (suma), - (resta), * (multiplicación), potencia (**). Los números negativos están precedidos por un signo menos (-). No considere el caso de un número elevado a una potencia negativa (exponente será siempre positivo).\n" +
"Ejemplos de resultados esperados:\n" +
"Input Output\n" +
"5 3 * 15\n" +
"6 4 * 2 + 26\n" +
"10 25 + 3 * 100 * 50 - 85 + 10 13 al 04 * 36 * + -5242\n" +
"10 -2 + 5 * 40\n" +
"10 2** 100 ";
    }
              public String enun24()
    {
    return "Dada una matriz 2-D de valores booleanos, busque el número de pasos necesarios para salir de la esquina superior izquierda a la esquina inferior derecha de la matriz. Los falsos valores serán considerados como paredes, y los verdaderos valores como espacios vacíos donde podemos caminar.\n" +
"La esquina superior izquierda es la [0] [0] Valor de la matriz. La esquina inferior derecha es el valor [n] [m] de la matriz. Una matriz siempre será rectangular, pero no siempre un cuadrado.\n" +
"Se le permite moverse en cualquier dirección (arriba, abajo, izquierda, derecha, en diagonal).\n" +
"Si no hay un camino, la función debe devolver -1.\n" +
"Por ejemplo:\n" +
"Dada la matriz: (T es verdadera, F es falsa)\n" +
"V F F F V\n" +
" F V V V F\n" +
" F F V F V\n" +
" V F V V V\n" +
"El camino más corto tendrá 4 pasos: 1 De [0] [0] a [1] [1] 2 En [1] [1] a [2] [2] 3 En [2] [2] para... [3] [3] 4. Desde [3] [3] a [3] [4]\n" +
"La función debe devolver el número 4.";
    }
    
}
