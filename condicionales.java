/* 
 * ***********************
 * CURSO JAVA 2 SE INICIAL
 * Parte 2
 * ***********************
 */
package parte2;

import java.util.Scanner;
public class Parte2 {

        public static void main(String[] args) {

        // Operador Condicional IF

        int condicion = 3;
        System.out.println("Condicion = " + condicion);

        // modo recomendado para JAVA
        if (condicion == 3) {
            System.out.println("La condicion se cumplio");
        }

        // Operador Condicional IF con Else
        if (true) {
            System.out.println("La condicion se cumplio");

        } else {
            System.out.println("La condicion no se cumplio");

        }

        // Estructura if anidada

        String clima;
        string plata;

        clima = "bueno";
        plata = "si";

        System.out.println("El Clima es :" + clima);
        System.out.println("Hay Plata :" + plata);

        if (clima == "bueno") {
            if (plata == "no") {
                System.out.println("Ponete la bata por que no salimos, no hay plata");
            } else {
                System.out.println("salimos");
            }
        } else {
            System.out.println("Ponete la bata por que no salimos, el clima esta malo");
        }

        // estructura switch
        int cond = 12;

        switch (cond) {
            case 10:
                System.out.println("El Valor 10");
                break;
            case 11:
                System.out.println("El Valor 11");
                break;
            case 12:
                System.out.println("El Valor 12");

            case 13:
                System.out.println("El Valor 13");

            case 14:
                System.out.println("El Valor 14");
                break;
            case 15:
                System.out.println("El Valor 15");
                break;
            default:
                System.out.println("El Valor otro");
        }

    


        // Ingresos por consola
        
        // Entradas de teclado
        
        // Al inicio del codigo importamos la libreria Scanner de Java Util
        
        //import java.util.Scanner;
        
        Scanner teclado = new Scanner(System.in);
//        int valor1;
//        int valor2;

//        System.out.println("Ingrese el Valor 1 :");
//        valor1 = teclado.nextInt();

//        System.out.println("Ingrese el Valor 2 :");
//        valor2 = teclado.nextInt();
//
//        System.out.println("El Valor 1 es:" + valor1);
//        System.out.println("El Valor 2 es:" + valor2);

        // en caso de ingresar String usar el metodo .next()
        // en caso de ingresar float usar el metodo .nextFloat()



        // ejercicios IF

        //Trabajo 1


        /*Dado el siguiente codigo:
         int nro1 = 100, nro2 = 500, nro3 = 250;
         Informar cual de los 3 numeros es el mayor.
         Requisitos: se necesita tener conociendo de operadores mayor y menor, 
         y la utilizacion //de if anidados.*/

        int nro1 = 150;
        int nro2 = 500;
        int nro3 = 250;


        if (nro1 > nro2) {
            if (nro1 > nro3) {
                System.out.println("el mayor es el Numero 1");
            } else {
                System.out.println("el mayor es el Numero 3");
            }

        } else {
            if (nro2 > nro3) {
                System.out.println("el mayor es el Numero 2");
            } else {
                System.out.println("el mayor es el Numero 3");
            }

        }



        /* Trabajo 2
        Dado el siguiente codigo:
        int a=10, b=-2, c=5; // hay 2 numeros positivos y 1 negativo
        Informar la multiplicacion de los dos numeros positivos*/

        int a = 10;
        int b = -2;
        int c = 5;


        if (a < 0) {
            System.out.println(b * c);
        } else {
            if (b < 0) {
                System.out.println(a * c);
            } else {
                System.out.println(a * b);
            }

        }



        /*Trabajo 3
         Dado el siguiente codigo:
         String usuario = "pepito", clave = "educacionIT";
         Informar los siguientes casos:
         si usuario="pepito" y clave="educacionIT" Informar "Bienvenido pepito!"
         si usuario="pepito" y clave no es "educacionIT" 
         informar "El usuario no coincide con la contraseña"
         si el usuario no es "pepito" informar "El usuario no existe!"*/


        String usuario, clave;
        usuario = "Pepito";
        clave = "educacionIT";

        if (usuario == "Pepito" && clave == "educacionIT") {
            System.out.println("Bienvenido Pepito");
        } else {
            if (usuario == "Pepito") {
                System.out.println("Contraseña Incorrecta");
            } else {
                System.out.println("Usuario Incorrecto");
            }
        }

        /* remake Trabajo 3 con consola

        String usuario, clave;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su nombre de Usuario:");
        usuario = teclado.next();
        System.out.println("Ingrese su clave:");
       clave = teclado.next();

       if (usuario.equals("Pepito") && clave.equals("educacionIT")) {
            System.out.println("Bienvenido Pepito");
       } else {
            if (usuario.equals("Pepito")) {
                System.out.println("Contraseï¿½a Incorrecta");
            } else {
                System.out.println("Usuario Incorrecto");
            }
        }
      el metodo equals compara la propiedad texto de los objetos clase String

       }*/
      }
