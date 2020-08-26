
package bucle;


public class buclefor {

    
    
    public static void main(String[] args) {
      
        
        // Estructura FOR

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("---fin de la estructura FOR---");

        for (int i = 1; i <= 10; i++) {
            //System.out.println(a);
            System.out.println("0");
        }
       
        int b;
        for (b = 1; b <= 10; b++) {
            System.out.println(b);
        }
        System.out.println("---fin de la estructura FOR---");
        System.out.println(b);
        // usando una variable global dispongo de la variable en todo el codigo

        // controlando varias variables en un FOR
        for (int i = 1, j = 1; i <= 5 && j <= 10; i++, j++) {
            System.out.println(i + " " + j);
        }
        // es posible recorrer controlando varias variables

        // FOR anidado
        int tt = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("i:" + i + " j:" + j + " tt:" + tt);
                tt++;
            }
        }
        /* En las estructuras de repeticion anidadas 
        las instrucciones de adentro se repiten X x S veces */


        
        //Laboratorio Estructura de control FOR 

        //Ejercicio 1
        // Imprimir los numeros del 1 al 10 uno abajo del otro

        System.out.println("--- Ejercicio 1 ---");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }



        //Ejercicio 2
        // Imprimir los numeros del 1 al 10 uno abajo del otro
        // salteando de a dos

        System.out.println("--- Ejercicio 2 ---");

        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }


        // Ejercicio 3
        // Imprimir los numeros del 10 al 1 uno abajo del otro

        System.out.println("--- Ejercicio 3 ---");
           int a = 1;
        for (int i = 10; i >= 1; i--) {
            
            System.out.println(a);
        }



        // Ejercicio 4

        // Imprimir la suma de numeros impares del 1 al 10

        System.out.println("--- Ejercicio 4 ---");

        int acumulador = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                acumulador += i;
            }
        }
        System.out.println("la suma total es: " + acumulador);


        // Ejercicio 5
        // Imprimir la suma de la multiplicacion de los numeros del 1 al 5
        // con la resta de los numeros del 1 al 5

        System.out.println("--- Ejercicio 5 ---");

        int multiplicacion = 1, resta = 0;
        for (int k = 1; k <= 5; k++) {
            multiplicacion *= k;
            resta -= k;
        }
        System.out.println(multiplicacion);
        System.out.println(resta);
        System.out.println(multiplicacion + resta);




    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
