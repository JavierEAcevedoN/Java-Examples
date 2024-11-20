package Example9.Exercises.Exercise1;

import java.util.ArrayList;

public class Universisdad {
    private String nombre;
    private ArrayList<Persona> integrantes = new ArrayList<>();
    private ArrayList<Actividad> actividades = new ArrayList<>();

    Universisdad(String nombre) {
        this.nombre = nombre;
    }

    public void asignarIntegrante(Persona integrante) {
        integrantes.add(integrante);
    }

    public void quitarIntegrante(String fechaDeNacimiento) {
        for (Persona integrante : integrantes) {
            if (integrante.getFechaDeNacimiento().equals(fechaDeNacimiento)) {
                integrantes.remove(integrante);
                break;
            }
        }
    }

    public void asignarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    public void quitarActividad() {
        for (Actividad actividad : actividades) {
            if (actividad.getNombre().equals(nombre)) {
                actividades.remove(actividad);
                break;
            }
        }
    }

    public void mostrarInformacion() {
        System.out.println("El nombre de la universidades: "+nombre);
        if (!actividades.isEmpty()) {
            System.out.println("La universidad tiene "+actividades.size()+" actividades");
        }
        if (!integrantes.isEmpty()) {
            System.out.println("La universidad tiene "+integrantes.size()+" integrantes");
        }
    }

    public void mostrarIntegrantes() {
        System.out.println("Los integrantes son: ");
        for (Persona integrante : integrantes) {
            integrante.mostrarInformacion();
        }
    }

    public void mostrarActividades() {
        System.out.println("Las actividades son: ");
        for (Actividad actividad : actividades) {
            actividad.mostrarInformacion();
        }
    }
}

class MainUniversidad {
    public static void main(String[] args) {
        Persona est1 = new Persona("Elkin", "Alvarez", "12-08-2000", "Estudiante");
        Persona est2 = new Persona("Edgan", "Quintero", "14-02-2004", "Estudiante");
        Persona est3 = new Persona("Robinson", "Escobar", "04-12-1998", "Estudiante");

        Persona pro1 = new Persona("Camilo", "Castañeda", "02-09-1989", "Profesor");
        Persona pro2 = new Persona("Dayana", "Calderon", "04-07-1992", "Profesor");

        Persona adm = new Persona("Ignacio", "Acevedo", "10-12-1970", "Administrativo");

        Actividad act1 = new Actividad("Celebracion Navidad", "Se selebra la navidad");
        Actividad act2 = new Actividad("Celebracion Halloween", "Se selebra el halloween");

        Universisdad uni = new Universisdad("Blanca Duran de Padilla");

        uni.asignarIntegrante(est1);
        uni.asignarIntegrante(est2);
        uni.asignarIntegrante(est3);
        uni.asignarIntegrante(pro1);
        uni.asignarIntegrante(pro2);
        uni.asignarIntegrante(adm);

        uni.asignarActividad(act1);
        uni.asignarActividad(act2);

        est1.asignarActividad(act2);
        est2.asignarActividad(act1);
        est3.asignarActividad(act2);
        pro1.asignarActividad(act1);

        act1.asignarParticipante(est1);
        act1.asignarParticipante(est2);
        act2.asignarParticipante(est3);
        act2.asignarParticipante(pro1);

        uni.mostrarInformacion();
        uni.mostrarIntegrantes();
        uni.mostrarActividades();

        act1.mostrarParticipantes();
        act2.mostrarParticipantes();
    }
}