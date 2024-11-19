package Example8.Exercises.Exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    private int codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double definitiva;

    public Estudiante(int codigo, String nombre, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularDefinitiva() {
        definitiva = ((nota1*0.3)+(nota2*0.3)+(nota3*0.4));
        System.out.println("El estudiante "+this.nombre+" con el codigo "+this.codigo+" saco como nota definitiva: "+definitiva);
        if (this.definitiva >= 3.0) {
            System.out.println("El estudiante aprobo!");
        } else {
            System.out.println("El estudiante reprobo!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;
        String nombre;
        double nota1;
        double nota2;
        double nota3;
        String decision;

        ArrayList<Estudiante> Estudiantes = new ArrayList<>();
        while (true) {
            System.out.print("Ingresa el codigo del estudiante: ");
            codigo = input.nextInt();
            input.nextLine();
            System.out.print("Ingresa el nombre del estudiante: ");
            nombre = input.nextLine();
            System.out.print("Ingresa la 1° nota del estudiante: ");
            nota1 = input.nextDouble();
            System.out.print("Ingresa la 2° nota del estudiante: ");
            nota2 = input.nextDouble();
            System.out.print("Ingresa la 3° nota del estudiante: ");
            nota3 = input.nextDouble();

            Estudiantes.add(new Estudiante(codigo, nombre, nota1, nota2, nota3));

            input.nextLine();
            System.out.print("¿Quieres continuar agregando estudiantes?: ");
            decision = input.nextLine();
            if (decision.toLowerCase().equals("no")) {
                System.out.println("Has terminado de agregar estudiantes");
                break;
            }
        }

        for (Estudiante estudiante : Estudiantes) {
            estudiante.calcularDefinitiva();
        }

        input.close();
    }
}