package Example10.Exercises.Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Estudiante implements Comparable<Estudiante>{
    private int codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double definitiva;
    private String rango = "";

    public Estudiante(int codigo, String nombre, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        calcularDefinitiva();
        calcularRango();
    }

    public void calcularDefinitiva() {
        definitiva = ((nota1*0.3)+(nota2*0.3)+(nota3*0.4));
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDefinitiva() {
        return definitiva;
    }

    public void calcularRango() {
        double asteriscos;
        asteriscos = (definitiva * 100)/50;
        asteriscos = 20*(asteriscos/100);
        for (int i = 0; i < asteriscos; i++) {
            rango+= "*";
        }
    }

    public String getRango() {
        return rango;
    }

    @Override
    public int compareTo(Estudiante estudiante) {
        return (int) (estudiante.definitiva - this.definitiva);
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

        Map<Integer,Estudiante> estudiantes = new HashMap<>();
        ArrayList<Estudiante> mejoresEstudiantes = new ArrayList<>();

        while (true) {
            try {
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
                if (nota1 > 50.0 || nota2 > 50.0 || nota3 > 50.0) {
                    System.out.println("Esa(s) notas no son validadas");
                }
                estudiantes.put(codigo, new Estudiante(codigo, nombre, nota1, nota2, nota3));
            } catch (InputMismatchException e) {
                System.out.println("Numero muy grande");
            }


            input.nextLine();
            System.out.print("¿Quieres continuar agregando estudiantes? (S/N): ");
            decision = input.nextLine();
            if (decision.equals("N")) {
                System.out.println("Has terminado de agregar estudiantes");
                break;
            }
        }

        for (Estudiante estudiante : estudiantes.values()) {
            mejoresEstudiantes.add(estudiante);
        }

        Collections.sort(mejoresEstudiantes);

        System.out.println();
        System.out.println("Los mejores estudiantes son: ");
        for (Estudiante estudiante : mejoresEstudiantes) {
            System.out.println("Nombre: "+estudiante.getNombre()+" Definitiva: "+estudiante.getDefinitiva());
        }

        System.out.println();
        System.out.println("Codigo | Barras");
        for (Map.Entry<Integer,Estudiante> estudiante : estudiantes.entrySet()) {
            System.out.println(estudiante.getKey()+"|"+estudiante.getValue().getRango());
        }

        input.close();
    }
}