package Example8.Exercises.Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Departtamentos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> departamentos = new ArrayList<>();
        departamentos.add("Amazonas");
        departamentos.add("Antioquia");
        departamentos.add("Arauca");
        departamentos.add("Atlántico");
        departamentos.add("Bolívar");
        departamentos.add("Boyacá");
        departamentos.add("Caldas");
        departamentos.add("Caquetá");
        departamentos.add("Casanare");
        departamentos.add("Cauca");
        departamentos.add("Cesar");
        departamentos.add("Chocó");
        departamentos.add("Córdoba");
        departamentos.add("Cundinamarca");
        departamentos.add("Guaviare");
        departamentos.add("Guainía");
        departamentos.add("Huila");
        departamentos.add("La Guajira");
        departamentos.add("Magdalena");
        departamentos.add("Meta");
        departamentos.add("Nariño");
        departamentos.add("Norte de Santander");
        departamentos.add("Putumayo");
        departamentos.add("Quindío");
        departamentos.add("Risaralda");
        departamentos.add("San Andrés y Providencia");
        departamentos.add("Santander");
        departamentos.add("Sucre");
        departamentos.add("Tolima");
        departamentos.add("Valle del Cauca");
        departamentos.add("Vaupés");
        departamentos.add("Vichada");
        while (true) {
            System.out.println();
            System.out.println("Ingresa 1 para mostrar el primer departamento del vector");
            System.out.println("Ingresa 2 para mostrar el ultimo departamento del vector");
            System.out.println("Ingresa 3 para eliminar un departamento");
            System.out.println("Ingresa 4 para mostrar todos los departamentos del vector");
            System.out.println("Ingresa otro para terminar");
            System.out.print("Ingresa una opcion: ");
            int choice = -1;
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Primer departamento del vector: "+departamentos.get(0));
            } else if (choice == 2) {
                System.out.println("Primer departamento del vector: "+departamentos.get(departamentos.size()-1));
            } else if (choice == 3) {
                input.nextLine();
                System.out.print("Ingresa el departamento: ");
                String departamento = input.nextLine();
                if (departamentos.contains(departamento)) {
                    departamentos.remove(departamento);
                    System.out.println("Departamento " + departamento + " eliminado.");
                } else {
                    System.out.println("El departamento no existe.");
                }
            } else if (choice == 4) {
                System.out.println("Departamentos de Colombia:");
                for (String departamento : departamentos) {
                    System.out.println(departamento);
                }   
            } else {
                System.out.println("Has terminado");
                break;
            }
        }
        input.close();
    }
}