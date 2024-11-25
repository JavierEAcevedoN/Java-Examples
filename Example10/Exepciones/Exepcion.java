package Example10.Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepcion {
    public static void main(String[] args) {
        double primerNumero, segundoNumero, resultado;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Introduce el primer numero: ");
            primerNumero = input.nextDouble();

            System.out.print("Introduce el segundo numero: ");
            segundoNumero = input.nextDouble();

            resultado = primerNumero/segundoNumero;

            System.out.println("El resultado es "+resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero");
        } catch (InputMismatchException e) {
            System.out.println("Ese valor no es valido");
        } catch (Exception e) {
            System.out.println("Se ha producio un error: "+e);
        }
        finally {
            input.close();
        }
    }
}