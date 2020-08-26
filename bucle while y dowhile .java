/* 
 * ***********************
 * Parte 3
 * ***********************
 */
package parte3;


public class Parte3 {

        public static void main(String[] args) {


        // Estructura de repeticion While

        int a;
        a = 1;
        while (a <= 10) {
         System.out.println(a);
         a++;
        }
        
        System.out.println("-- fin estructura while --");
        
        System.out.println(a);
        
        System.out.println("");
       

        // Estructura de repeticion DO While
        // esta estructura asegura por lo menos una pasada
        
        a = 1;
        
        do {
            System.out.println(a);
            a++;
            
        } while (a <= 10);
        System.out.println("-- fin estructura do while --");
        
        System.out.println(a);
        
        System.out.println("");


        // Estructura While Anidada
        
        int x = 1;
        int s = 1;
        int t = 1;
        while (x <= 10) {
            while (s <= 10) {
                System.out.println("x:" + x + " s:" + s + " t:" + t);
                t++;
                s++;
            }
            s = 1;
            x++;
        }
        /* En las estructuras de repeticion anidadas 
         las instrucciones de adentro se repiten X x S veces */



        
        // Laboratorio  Estructura de control While
        
        // Ejercicio 1
        //Imprimir los numeros del 1 al 10 uno abajo del otro

        System.out.println("---Ejercicio 1---");
        //int a
        a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        //Ejercicio 2 
        //Imprimir los numeros del 1 al 10 salteando de a 2 uno abajo del otro

        System.out.println("---Ejercicio 2---");
        //int a;
        a = 1;
        while (a <= 10) {
            System.out.println(a);
            a += 2;
        }

        //Ejercicio 3 
        //Imprimir los numeros del 10 al 1 uno abajo del otro

        System.out.println("---Ejercicio 3---");
        //int a;
        a = 10;
        while (a >= 1) {
            System.out.println(a);
            a--;
        }

        //Ejercicio 4 
        //Imprimir los numeros del 1 al 10 sin imprimir numeros 2,5 y 9 uno abajo //del otro.
        //Requisito: se necesita tener conocimientos del operador AND (&&) y del operador NOT  (!=)

        System.out.println("---Ejercicio 4---");
        //int a;
        a = 1;
        while (a <= 10) {
            if (a != 2 && a != 5 && a != 9) {
                System.out.println(a);
            }
            a++;
        }

       
        //Ejercicio 5 
        //Imprimir los numeros del 1 al 30 sin imprimir numeros entre 
        //el 10 y el 20 uno abajo del otro.
        //Requisitos: se necesita tener conocimientos del operador OR (||)  

        System.out.println("---Ejercicio 5---");
        //int a;
        a = 1;
        while (a <= 30) {
            if (a < 10 || a > 20) {
                System.out.println(a);
            }
            a++;
        }

        //Ejercicio 6 
        // Imprimir la suma de los numeros del 1 al 10

        System.out.println("---Ejercicio 6---");
        //int a;
        a = 1;
        int sumador = 0;
        while (a <= 10) {
            sumador += a;
            a++;
        }
        System.out.println("la suma total es : " + sumador);
        

        // Ejercicio 7
        // Imprimir la suma de los numeros pares del 1 al 25
        // Requisito: se necesita tener conocimiento del operador RESTO  // (%)

        System.out.println("---Ejercicio 7---");
        //int a;
        a = 1;
        //int sumador;
        sumador = 0;
        while (a <= 25) {
            if (a % 2 == 0) {
                sumador += a;
            }
            a++;
        }

        System.out.println("la suma total es : " + sumador);



        // Ejercicio 8
        //Imprimir la multiplicacion de numeros impares 
        //que se encuentran entre el -10 y 10

        System.out.println("---Ejercicio 8---");
        //int a;
        a = -10;
        int multiplicador = 1;
        while (a <= 10) {
            if (a % 2 != 0) {
                multiplicador *= a;
            }
            a++;
        }
        System.out.println("la multiplicacion total es : " + multiplicador);


        //Ejercicio 9
        //Imprimir la suma de los numeros pares mayores a 9 y menores a 20
        //que se encuentran entre el 1 y el 30

        System.out.println("---Ejercicio 9---");
        //int a;
        a = 1;
        //int sumador;
        sumador = 0;

        while (a <= 30) {
            if (a % 2 == 0 && a > 9 && a < 20) {
                sumador += a;
            }
            a++;
        }
        System.out.println("la suma total es : " + sumador);


        