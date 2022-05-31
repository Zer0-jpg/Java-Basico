
package NumeroDeDigitos;

import java.util.Scanner;


public class NumeroDeDigitos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = lector.nextInt();
        int numDigitos=1;
        System.out.println("El numero "+numero+" tiene ");
        while(numero/10!=0){
            numDigitos++;
            numero/=10;
        }
        System.out.println(numDigitos+" digitos");
    }
}
