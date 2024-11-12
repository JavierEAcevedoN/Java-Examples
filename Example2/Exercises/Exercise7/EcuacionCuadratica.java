package Example2.Exercises.Exercise7;

import java.util.Scanner;
/**
 *
 * @author JavierEAcevedoN
 */
public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double discriminante;

        System.out.println("Ingresa los siguientes valores (aX^2+bX+c=0)");
        System.out.print("ingresa el valor de a (real): ");
        a = input.nextDouble();
        System.out.print("ingresa el valor de b (real): ");
        b = input.nextDouble();
        System.out.print("ingresa el valor de c (real): ");
        c = input.nextDouble();

        discriminante = Math.pow(b, 2)-(4*a*c);


        if(discriminante > 0) {
            double x1 = (-b+Math.sqrt(discriminante))/(2*a);
            double x2 = (-b-Math.sqrt(discriminante))/(2*a);
            System.out.println("La ecuacion cuadratica tiene dos raíces reales en los puntos x1: "+x1+" y x2: "+x2);
        } else if (discriminante == 0) {
            double x = (-b+Math.sqrt(discriminante))/(2*a);
            System.out.println("La ecuacion cuadratica tiene una raíz real en el punto x: "+x);
        } else {
            System.out.println("La ecuacion cuadratica no tiene raíces en los reales");
        }
        input.close();
    }
}