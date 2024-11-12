package Exercise3;

import java.util.Random;
import java.util.Scanner;

public class Apuesta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        double saldo = 7.00;
        double ganancias = 0.00;
        int numero;
        int dado;

        while (true) {
            System.out.print("¿Que numero saldra en el dado?: ");
            numero = input.nextInt();
            dado = random.nextInt(6)+1;
			System.out.println("El dado boto: "+dado);

			if (numero == dado) {
				ganancias += 5.00;
				saldo += 5.00;
				System.out.println("Acaba de ganar $5.00");
				System.out.println("Su saldo es de $"+saldo);
			} else {
				ganancias -= 1.00;
				saldo -= 1.00;
				System.out.println("Acaba de perder $1.00");
				System.out.println("Su saldo es de $"+saldo);
			}

			if (saldo <= 0.00 || ganancias >= 6.00) {
				break;
			}
        }
		System.out.println("Ha terminado el juego");
		System.out.println("Su saldo final es de $"+saldo);

		input.close();
    }
}