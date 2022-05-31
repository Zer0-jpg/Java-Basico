/*Programa Java que lee un número entero N y 
  muestra la tabla de multiplicar de ese número.
*/
package TablaDeMultiplicar;

import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
        System.out.println("tabla de multiplicar del numero?");
        int numero = lector.nextInt();
        for(int i=0;i<=10;i++){
            
            System.out.println(numero+" * "+ i+" = "+(numero*i));
        }
    }
   
}
