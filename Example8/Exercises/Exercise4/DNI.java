package Example8.Exercises.Exercise4;

import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Character[] dni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        System.out.print("Ingresa un numero entero positivo");
        int numero = input.nextInt();
        
        if (numero<0) {
            System.out.print("Ese nuemero no es valido");
            input.close();
            return;
        }
        System.out.println("El DNI del numero introducido es: "+dni[numero%23]);
        input.close();
    }
}