package Example9.Exercises.Exercise1;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String tipo;
    private ArrayList<Actividad> actividadesAsociadas = new ArrayList<>();

    public Persona(String nombre, String apellido, String fechaDeNacimiento, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.tipo = tipo;
    }

    public String nombreCompleto() {
        return this.nombre+" "+this.apellido;
    }

    public String getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void asignarActividad(Actividad actividad) {
        this.actividadesAsociadas.add(actividad);
    }

    public void quitarActividad(String nombre) {
        for (Actividad actividad : actividadesAsociadas) {
            if (actividad.getNombre().equals(nombre)) {
                actividadesAsociadas.remove(actividad);
                break;
            }
        }
    }

    public void mostrarInformacion() {
        System.out.println("El nombre completo del "+this.tipo+" es: "+this.nombre+" "+this.apellido);
        System.out.println("La fecha de nacimiento del "+this.tipo+" es: "+this.fechaDeNacimiento);
        if (!actividadesAsociadas.isEmpty()) {
            System.out.println("El "+this.tipo+" participa en "+actividadesAsociadas.size()+" actividades");
        }
        System.out.println();
    }

    public void mostrarActividades() {
        System.out.println("Las actividades son: ");
        for (Actividad actividad : actividadesAsociadas) {
            System.out.println(actividad);
        }
    }
}
