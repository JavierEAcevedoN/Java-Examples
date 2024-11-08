package Example2.Exercises.Exercise6;

import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author JavierEAcevedoN
 */
public class CalculoDiaSiguiente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Dia;
        int Mes;
        int Año;

        System.out.print("ingresa un dia: ");
        Dia = input.nextInt();
        if (Dia<0||Dia>31) {
            System.out.println("Ingresa un dia valido");
            input.close();
            return;
        }

        System.out.print("ingresa un mes: ");
        Mes = input.nextInt();
        if (Mes<0||Mes>12) {
            System.out.println("Ingresa un mes valido");
            input.close();
            return;
        }

        System.out.print("ingresa año: ");
        Año = input.nextInt();
        if (Año<0) {
            System.out.println("Ingresa un año valido");
            input.close();
            return;
        }
        
        LocalDate fecha = LocalDate.of(Año, Mes, Dia);
        LocalDate diasiguiente = fecha.plusDays(1);

        System.out.println("El dia siguiente es: "+diasiguiente);

        input.close();
    }
}
