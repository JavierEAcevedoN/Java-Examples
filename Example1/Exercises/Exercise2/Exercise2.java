/** Programa que calcule el numero de digitos de un numero */
package Exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = input.nextInt();
        int contador = 1;
        
        while (numero > 1) {
            numero = numero/10;
            contador++;
        }

        System.out.print("La cantidad de digitos que tiene el numero dado es de: ");
        System.out.println(contador);

        input.close();
    }
}