package Example14.Exercises.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Apartment implements IAPartment{
    List<IAPartment> employees = new ArrayList<IAPartment>();
    
    @Override
    public void obtenerInformacion() {
        for (IAPartment employee : employees) {
            System.out.println();
            System.out.println("Empleado del departamento");
            employee.obtenerInformacion();
        }
    }
    public void AddEmployee(Employee employee) {
        employees.add(employee);
    };
    public void RemoveEmployee(int employee) {
        employees.remove(employee);
    };
    public void GetChild(int employee) {
        employees.get(employee);
    };
}