package Example15.Exercises.Exercise1;

public class CinemaFacade {
    private SistemaIluminacion iluminacion = new SistemaIluminacion();
    private SistemaProyeccion proyeccion = new SistemaProyeccion();
    private SistemaSonido sonido = new SistemaSonido();

    public void prepararPelicula(String pelicula) {
        System.out.println("Preparando el sistema para ver la pelicula...");
        iluminacion.atenuarLuces();
        sonido.configurarSonidoEnvolvente();
        proyeccion.encender();
        proyeccion.reproducirPelicula(pelicula);
    }
    public void apagarSistema() {
        System.out.println("Apagando sistema...");
        proyeccion.apagar();
        iluminacion.apagarLuces();
        sonido.silenciar();
    }
}