package Example2.Exercises.Exercise8;

import java.util.Scanner;
/**
 *
 * @author JavierEAcevedoN
 */
public class Hora2412 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hora;
        int minuto;
        
        System.out.print("Ingresa la hora (HH:MM): ");
        String Hora24 = input.nextLine();
        
        hora = Integer.parseInt(Hora24.substring(0, 2));
        minuto = Integer.parseInt(Hora24.substring(3, 5));
        
        if (hora<0 || hora>24) {
            System.out.println("Ingresa una hora valida");
            input.close();
            return;
        }
        
        if (minuto<0 || minuto>59) {
            System.out.println("Ingresa un minuto valido");
            input.close();
            return;
        }
        
        if (hora > 12) {
            hora -= 12;
            System.out.println(hora+":"+minuto+" PM");
        } else {
            if (hora==0) {
                System.out.println("12:"+minuto+" AM");
            } else {
                System.out.println(hora+":"+minuto+" AM");
            }
        }
        input.close();
    }
}
