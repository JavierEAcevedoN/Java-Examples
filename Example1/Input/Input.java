package Example1.Input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Scanner se utiliza para poder leer lo que se ponga en la terminal.
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.println("Bienvenido "+nombre+"!");

        input.close();
    }
}