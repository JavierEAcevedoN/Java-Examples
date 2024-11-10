package Exercise3;

import java.util.Random;
import java.util.Scanner;

public class MenorMayor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int saldo = 5;
        int ganancias = 0;
        String decision;
        int dado1;
        int dado2;
        int dadototal;

        while (true) {
            System.out.print("¿Que rango vas a elegir Menor (2-6) o Mayor (8-12) o 7?: ");
            decision = input.nextLine();
            dado1 = random.nextInt(6)+1;
            dado2 = random.nextInt(6)+1;
            dadototal = dado1+dado2;
			System.out.println("La suma de los dados boto: "+(dadototal));

            if (decision.toLowerCase().equals("menor")) {
                if (1<dadototal&&dadototal<7) {
                    ganancias += 1;
                    saldo += 1;
                    System.out.println("Acaba de ganar $1");
                    System.out.println("Su saldo es de $"+saldo);
                } else {
                    ganancias -= 1;
                    saldo -= 1;
                    System.out.println("Acaba de perder $1");
                    System.out.println("Su saldo es de $"+saldo);
                }
            } else if (decision.toLowerCase().equals("mayor")) {
                if (7<dadototal&&dadototal<13) {
                    ganancias += 1;
                    saldo += 1;
                    System.out.println("Acaba de ganar $1");
                    System.out.println("Su saldo es de $"+saldo);
                } else {
                    ganancias -= 1;
                    saldo -= 1;
                    System.out.println("Acaba de perder $1");
                    System.out.println("Su saldo es de $"+saldo);
                }
            } else if (decision.toLowerCase().equals("7")) {
                if (dadototal==7) {
                    ganancias += 5;
                    saldo += 5;
                    System.out.println("Acaba de ganar $5");
                    System.out.println("Su saldo es de $"+saldo);
                } else {
                    ganancias -= 1;
                    saldo -= 1;
                    System.out.println("Acaba de perder $1");
                    System.out.println("Su saldo es de $"+saldo);
                }
            }

			if (saldo <= 0 || ganancias >= 10) {
				break;
			}
        }
		System.out.println("Ha terminado el juego");
		System.out.println("Su saldo final es de $"+saldo);

		input.close();
    }
}
