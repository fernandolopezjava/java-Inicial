
package clase_5;


public class Clase_5 {

    /* Defincion de Procedimientos y Funciones */
    
    /* HolaMundo */
    static void HolaMundo()
    {
        System.out.println("Hola Mundo!");
    }
    
    /* ParImpar */
    static void ParImpar( int num )
    {
        if( num%2 == 0 )
            System.out.println("Par");
        else
            System.out.println("Impar");
    }
    
    /* Calculadora **************************************** */
    
    /* Suma */
    static double Suma( double num1, double num2 )
    {
        return num1 + num2;
    }
    
    /* Resta */
    static double Resta( double num1, double num2 )
    {
        return num1 - num2;
    }
    
    /* Multiplicacion */
    static double Mul( double num1, double num2 ) 
    {
        return num1 * num2;
    }
    
    /* Division */
    static double Div( double num1, double num2 )
    {
        return num1 / num2;
    }
    
    
    
    /* SupCirculo */
    static float SupCirculo( float radio )
    {
        /* Declaracion de variables y constantes */
        final float PI = 3.14f;
        float superficie;
        
        /* Calculo */
        superficie = PI * radio * radio;
        
        /* Devuelvo resultado */        
        return superficie;
    }
    
    /* Chequeo Usuario */
    static boolean ChequeoUsuario( String usuario, String clave )
    {
        /* Declaraciones de variables y constantes */
        final String U_VAL = "admin", C_VAL = "1234";
                
        /* Analisis de datos */
        if ( usuario.equals(U_VAL) & clave.equals(C_VAL) )
            return true;
        else
            return false;
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        java.util.Scanner teclado = new java.util.Scanner( System.in );
        
//        String txt;
//        
//        System.out.println("Ingrese texto:");
//        txt = teclado.nextLine();
//        System.out.println("Texto ingresado: " + txt);
//        
//        int num;
//        
//        System.out.println("Ingrese número:");
//        num = teclado.nextInt();
//        System.out.println("número recibido: " + num);
//        
//        
        /* ********************************************************/
        
//        byte x = 0;
//        
//        System.out.println("Ingrese un número:");
//        x = teclado.nextByte();
        
//        if( x == 10 )
//            System.out.println("DIEZ");
//        else if( x == 20 )
//            System.out.println("VEINTE");
//        else if( x == 30 )
//            System.out.println("TREINTA");
//        else
//            System.out.println("NINGUNO");
                
        /* Estructura Switch ************* */    
//        switch( x )
//        {
//            case 10:
//                System.out.println("DIEZ");
//                break;
//            case 20:
//                System.out.println("VEINTE");
//                break;
//            case 30:
//                System.out.println("TREINTA");
//                break;
//            default:
//                System.out.println("NINGUNO");
//                break;
//        }
        
        
        /* PROCEDIMIENTOS y FUNCIONES ********************************** */
        
        /* Procedimientos que no reciben parámetros
        
        * Definición
        
        static void NombreProcedimiento()
        {
            //código
        }
        
        * Llamado al procedimiento
        
        NombreProcedimiento();
        
        */
        
        /* Llamado al procedimiento HolaMundo */
        //HolaMundo();
        
        /* Procedimiento que recibe parámetros
        
        * Definición:
        
        static void NombreProcedimiento( tipo idVar1, tipo idVar2, tipo idVar3, ..., tipo idVarN )
        {
            //código
        }
        
        * Llamado:
        
        NombreProcedimiento( valor1, valor2, valor3, ..., valorN );
        
        */
        
//        int n;
//        
//        System.out.println("Ingrese número a verrificar:");
//        n = teclado.nextInt();
//        
//        /* Llamado a la función ParImpar */
//        ParImpar( n );
//        
        
        /* Función
        
        * Definición:
        
        static tipo NombreFunción( tipo idVar )
        {
            //código
        
            return valor;
        }
        
        * Llamado:
        
        var = NombreFunción( valor );
        
        */
        
//        double result;
//        
//        /* Llamado a la función Suma */
//        result = Suma( 2.5, 7.3 );
//        
//        System.out.println("Resultado: " + result);
//        
        
        /* Superficie */
        
//        /* Declaraciones */
//        float sup, rad = 2.14f;
//        
//        /* Llamado a la función */
//        sup = SupCirculo( rad );
//        
//        /* Imprimo en pantalla */
//        System.out.println("Superficie: " + sup + "cm2");
        
        
        /* Chequeo de usuario */
        
//        /* Variables */
//        String user, pass;
//        
//        /* Ingreso de datos */
//        System.out.println("Ingrese nombre de usuario:");
//        user = teclado.nextLine();
//        System.out.println("Ingrese contraseña:");
//        pass = teclado.nextLine();
//        
//        /* Llamado a función ChequeoUsuario */
//        /* Impresión en pantalla */
//        if( ChequeoUsuario( user, pass ) )
//            System.out.println("Bienvenidx " + user);
//        else
//            System.out.println("Usuario y/o clave incorrecta");
//        
        
        
        /* Calculadora ********************************* */
        
        /* Declaraciones */
        double n1, n2, res = 0;
        String operacion;
        
        /* Ingreso de datos */
        System.out.println("Ingrese numero1:");
        n1 = teclado.nextDouble();
        System.out.println("Ingrese numero2:");
        n2 = teclado.nextDouble();
        
        System.out.println("Ingrese operación +, -, *, /");
        operacion = teclado.nextLine();
        operacion = teclado.nextLine();
        
        /* Selección de la operación */
        switch( operacion )
        {
            case "+":
                res = Suma( n1, n2 );
                break;
            case "-":
                res = Resta( n1, n2 );
                break;
            case "*":
                res = Mul( n1, n2 );
                break;
            case "/":
                res = Div( n1, n2 );
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        
        /* Impresión del resultado */
        System.out.println("Resultado: " + res);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
