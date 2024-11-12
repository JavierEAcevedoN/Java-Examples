package Exercise3;
public class ScompareToIgnoreCase {
    public static void main(String[] args) {
        String ejemplo1 = "Ejercicio de metodos de String en Java";
        String ejemplo2 = "Otro ejercicio de metodos de String";
        
        // Devuelve en un valor int la cantidad de caracteres diferentes de un String a otro sin tener en cuenta si esta en minuscula o mayuscula.
        System.out.println(ejemplo1.compareToIgnoreCase(ejemplo2));
    }
}