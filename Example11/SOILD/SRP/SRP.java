package Example11.SOILD.SRP;

public class SRP {
    // Single Responsibility Principle se refiere a que cada clase debe tener su proposito unico y no hacer varias cosas.
    public static void main(String[] args) {
        Employee employee = new Employee("1", "John Doe", 50000);
        EmployeeRepository repository = new EmployeeRepository();

        repository.save(employee);
    }
}

class Employee {
    private String id;
    private String name;
    private double salary;
    // crecion del empleado
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void obtenerInformacion() {
        System.out.println("ID: "+id+" Nombre: "+name+" Salario: "+salary);
    }
}

class EmployeeRepository {
    // Edicion de la imformacion del emplado en otra clase
    public void save(Employee employee) {
        System.out.println("Empleado guardado");
    }

    public void update() {
        System.out.println("Empleado actualizado");
    }

    public void delete() {
        System.out.println("Empleado eliminado");
    }
}