package Exercise20;
public class StoCharArray {
    public static void main(String[] args) {
        String ejemplo1 = "Ejercicio de metodos de String en Java";
        
        // Devuelve una Array de caracteres de un String.
        char[] ejemplo2 = ejemplo1.toCharArray();
        for (char caracter : ejemplo2) {
            System.out.println(caracter);
        }
    }
}