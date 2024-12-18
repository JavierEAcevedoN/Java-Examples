package Example14.Exercises.Exercise2;

public class Company {
    public static void main(String[] args) {
        System.out.println();
        Employee developer = new Developer("Javier", 20);
        developer.obtenerInformacion();

        System.out.println();
        Employee desinger = new Desinger("Mariana", 20);
        desinger.obtenerInformacion();

        System.out.println();
        Employee administrador = new Administrador("Edgan", 20);
        administrador.obtenerInformacion();

        Apartment apartment = new Apartment();
        apartment.AddEmployee(developer);
        apartment.AddEmployee(desinger);
        apartment.AddEmployee(administrador);
        apartment.obtenerInformacion();
    }
}