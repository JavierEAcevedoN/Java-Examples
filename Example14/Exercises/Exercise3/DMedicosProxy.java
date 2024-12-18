package Example14.Exercises.Exercise3;

public class DMedicosProxy implements Datos{
    private DMedicos dMedicos;
    private String ruta;
    
    public DMedicosProxy(String ruta) {
        this.ruta = ruta;
    }

    public void acceder(String usuario, String contraseña) {
        if (usuario == "admin" && contraseña == "1234") {
            mostrar();
        } else {
            System.out.println("El ingreso no es valido");
        }
    }
    @Override
    public void mostrar() {
        if (dMedicos == null) {
            dMedicos = new DMedicos(ruta);
        }
        dMedicos.mostrar();
    }
}