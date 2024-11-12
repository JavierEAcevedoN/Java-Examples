package Exercise9;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = input.nextInt();
        
        if (numero<2) {
            System.out.println("Ese numero no es valido");
            input.close();
            return;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                input.close();
                System.out.println("El numero "+numero+" no es primo");
                return;
            }
        }
        System.out.println("El numero "+numero+" es primo");
        input.close();
    }
}