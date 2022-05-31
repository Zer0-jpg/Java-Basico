/*Un número es perfecto si es igual a la suma de todos sus divisores 
  positivos sin incluir el propio número.
  Programa Java para calcular si un numero es perfecto o no
 */
package NumeroPerfecto;

import java.util.Scanner;

public class NumeroPerfecto {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int num = lector.nextInt();
        int sumaDigitos=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sumaDigitos+=i;
            }
        }
        if(num==sumaDigitos){
            System.out.println("El numero "+num+" es perfecto");
        }else{
            System.out.println("El numero "+num+" no es perfecto");
        }
    }
    
}
