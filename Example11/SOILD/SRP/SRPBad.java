package Example11.SOILD.SRP;

public class SRPBad {
    
}

class Employee_ {
    private String id;
    private String name;
    private double salary;
    
    // creacion del empleado.
    public Employee_(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void obtenerInformacion() {
        System.out.println("ID: "+id+" Nombre: "+name+" Salario: "+salary);
    }

    // edicion de la imforamcion.
    public void save() {
        // Codigo para guardar el empleado.
    }

    public void update() {
        // Codigo para actualizar el empleado.
    }

    public void delete() {
        // Codigo para borrar el empleado.
    }
}