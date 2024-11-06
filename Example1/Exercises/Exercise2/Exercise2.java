/** Programa que calcule el numero de digitos de un numero */
package Exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = input.nextInt();
        int contador = 1;
        
        do {
            numero = numero/10;
            contador++;
        } while (numero < 1);

        System.out.print("La cantidad de digitos que tiene el numero dado es de: ");
        System.out.println(contador);

        input.close();
    }
}