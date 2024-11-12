package Exercise5;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa tu salario: ");
        int salario = input.nextInt();
        int newsalario;

        if (0<=salario&&salario<=9000) {
            newsalario = (int) (salario + (salario * 0.2));
            System.out.println("Tu salario es de: "+salario);
            System.out.println("Y tu salario con aumento es de: "+newsalario);
        } else if (9001<=salario&&salario<=15000) {
            newsalario = (int) (salario + (salario * 0.1));
            System.out.println("Tu salario es de: "+salario);
            System.out.println("Y tu salario con aumento es de: "+newsalario);
        } else if (15001<=salario&&salario<=20000) {
            newsalario = (int) (salario + (salario * 0.05));
            System.out.println("Tu salario es de: "+salario);
            System.out.println("Y tu salario con aumento es de: "+newsalario);
        } else if (20000<salario) {
            System.out.println("Tu salario es de: "+salario);
            System.out.println("Tu salario no tiene beneficio de aumento");
        } else {
            System.out.println("Ese salaro no es valido");
        }

        input.close();
    }
}