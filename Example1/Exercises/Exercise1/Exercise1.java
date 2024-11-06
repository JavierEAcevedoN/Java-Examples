/** Cuenta desde el 1 hasta el numero que le des */
package Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        teclado.close();
    }
}