package Examples5.Exercises.Exercise2;

public class AninalPOO {
    public static void main(String[] args) {
        Animal miAnimal = new Animal("Gato");
        miAnimal.setEdad(14);

        System.out.println("El tipo de animal es "+miAnimal.getTipo());
        System.out.println("La edad del animal es "+miAnimal.getEdad());
    }
}