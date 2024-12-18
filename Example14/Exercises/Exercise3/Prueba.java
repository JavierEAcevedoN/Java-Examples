package Example14.Exercises.Exercise3;

public class Prueba {
    public static void main(String[] args) {
        DMedicosProxy dMedicosProxy = new DMedicosProxy("./medicos/data");

        dMedicosProxy.acceder("A", "a");
        System.err.println();

        dMedicosProxy.acceder("admin", "1234");
        System.err.println();

        dMedicosProxy.acceder("A", "a");
        System.err.println();
        
        dMedicosProxy.acceder("admin", "1234");
    }
}