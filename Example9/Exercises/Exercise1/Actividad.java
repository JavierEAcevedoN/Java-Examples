package Example9.Exercises.Exercise1;

import java.util.ArrayList;

public class Actividad {
    private String nombre;
    private String descripcion;
    private ArrayList<Persona> participantes = new ArrayList<>();

    public Actividad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void asignarParticipante(Persona persona) {
        participantes.add(persona);
    }

    public void quitarParticipante(String fechaDeNacimiento) {
        for (Persona participante : participantes) {
            if (participante.getFechaDeNacimiento().equals(fechaDeNacimiento)) {
                participantes.remove(participante);
                break;
            }
        }
    }

    public void mostrarInformacion() {
        System.out.println("El nombre de la actividad es: "+this.nombre);
        System.out.println("Descripcion de la actividad: "+this.descripcion);
        if (!participantes.isEmpty()) {
            System.out.println("Cantidad de personas que participan en la actividad: "+this.participantes.size());
        }
        System.out.println();
    }

    public void mostrarParticipantes() {
        System.out.println("Nombre de los participantes de la actividad "+nombre+": ");
        for (Persona participante : participantes) {
            System.out.println(participante.nombreCompleto());
        }
    }
}