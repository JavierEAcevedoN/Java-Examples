package Example2.Exercises.Exercise5;

import java.util.Scanner;
/**
 *
 * @author JavierEAcevedoN
 */
public class CondicionesIF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un angulo: ");
        double angulo = input.nextDouble();
        if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto");
        } else {
            System.out.println("El ángulo no es un ángulo recto");
        }

        System.out.print("Ingresa un grado de temperatura: ");
        double grado = input.nextDouble();
        if (grado>100) {
            System.out.println("Por encima del punto de ebullición del agua");
        } else {
            System.out.println("Por debajo del punto de ebullición del agua");
        }

        int positivo = 0;
        int negativo = 0;
        int numero = 0;

        while (true) {
            System.out.print("Ingresa un numero entero (0 para terminar): ");
            numero = input.nextInt();

            if (numero == 0) {
                break;
            } else if (numero > 0) {
                positivo += numero;
            } else {
                negativo += numero;
            }
        };

        System.out.println("El total de positivos es de: "+positivo);
        System.out.println("El total de negativos es de: "+negativo);

        System.out.print("Ingresa un numero entero (x): ");
        int x = input.nextInt();

        System.out.print("Ingresa un numero entero (y): ");
        int y = input.nextInt();

        System.out.print("Ingresa un numero entero (z): ");
        int z = input.nextInt();

        if (x>y&&z<20) {
            System.out.print("Ingresa un numero entero (p): ");
            int p = input.nextInt();
            System.out.println("El valor X es: "+x+" El valor Y es: "+y+" El valor de Z es: "+z+" Y el valor de P es: "+p);
        } else {
            System.out.println("El valor X es: "+x+" El valor Y es: "+y+" El valor de Z es: "+z);
        }

        System.out.print("Ingresa una distancia: ");
        double distancia = input.nextDouble();

        if (distancia > 20 && distancia < 35) {
            System.out.print("Ingresa un tiempo: ");
            double tiempo = input.nextDouble();
            System.out.println("La distancia total es de: "+(distancia*tiempo));
        } else {
            System.out.println("La distancia es de: "+distancia);
        }

        input.close();
    }
}
