
package clasecuatro;


public class ClaseCuatro {

    public static void main(String[] args) {
      
        //arreglos
        
        float[] temperaturas;
        temperaturas = new float[10];
        
        String[] nombres = new String[15];
        
        temperaturas[2] = 34.17f;
        temperaturas[0] = 12.30f;
        
        nombres[14] = "JosÃ©";
        nombres[6]  = "Laura";
        
        System.out.println( temperaturas[0] );
        System.out.println( nombres[6] );
        
        
        /* Inicializacion de arreglos */
        int[] nums = { 125, 88, -1001, 2043, 96, -21, 637 };
        //              0    1    2     3    4    5    6  
        
        /* Impresion completa del arreglo */
        for(byte i = 0; i < nums.length; i++)
            System.out.println( nums[i] );
        
        System.out.println("Longitud del arreglo: " + nums.length);
        
        
        /* Copia de arreglos */
        char[] origen = { 'x', '#', '&', 'A', '?', 'k' };
                        // 0    1    2    3    4    5
        char[] destino = new char[ origen.length ];
        
        /* Copia */
        for(byte i = 0; i < origen.length; i++ )
            destino[i] = origen[i];
       
        /* Imprimo destino */
        for(byte i = 0; i < destino.length; i++)
            System.out.println( destino[i] );
        
        /* ****************** Ejercicio 1 (alumni)********************* */
        byte[] vec = {10, 20, 5, 15, 30, 20};
        //             0   1  2   3   4   5 
        
        /* Informar el vector de la forma: "indice: X, Valor: Y" */
        for(byte j = 0; j < vec.length; j++)
            System.out.println("Ã?ndice: "+ j +", Valor: "+ vec[j]);
       
        /* Totalizar el vector e informar el total */
        short total = 0;
        
        for(byte j = 0; j < vec.length; j++ )
            total += vec[j];
        
        System.out.println("Total: "+ total);
        
        /* Informar el contenido de las posiciones impares 
        (por ejemplo, las posiciones 1,3,5,etc) */
        for(byte j = 0; j < vec.length; j++)
        {
            if( j%2 != 0 )
                System.out.println( vec[j] );
        }
        
        /* Informar el mayor numero */
        byte maximo = vec[0];
        
        for(byte j = 1; j < vec.length; j++)
        {
            if( vec[j] > maximo )
                maximo = vec[j];
        }
        
        System.out.println("Mayor: "+ maximo);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
