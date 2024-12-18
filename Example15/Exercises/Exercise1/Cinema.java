package Example15.Exercises.Exercise1;

public class Cinema {
    public static void main(String[] args) {
        CinemaFacade cinemaFacade = new CinemaFacade();

        cinemaFacade.prepararPelicula("Interstellar");

        System.out.println();

        cinemaFacade.apagarSistema();
    }
}