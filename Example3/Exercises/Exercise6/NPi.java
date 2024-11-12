package Exercise6;

import java.util.Scanner;

public class NPi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 2.0;
        
        System.out.print("Ingresa la cantidad de términos de Pi: ");
        int nterminos = input.nextInt();

        if (nterminos < 0) {
            System.out.println("Ese numero no es valido");
            input.close();
            return;
        }
        
        for (int i = 1; i <= nterminos; i++) {
            pi *= (2.0 * i) / (2 * i - 1.0);
            pi *= (2.0 * i) / (2 * i + 1.0);
        }

        System.out.println(nterminos + " términos de Pi es: " + pi);
        input.close();
    }
}