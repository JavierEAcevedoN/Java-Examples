package Exercise17;
public class Ssplit {
    public static void main(String[] args) {
        String ejemplo1 = "Ejercicio de metodos de String en Java";
        
        // Separa el String por medio de la expresion regular especificada.
        String[] ejemplo2 = ejemplo1.split(" ");
        for (String string : ejemplo2) {
            System.out.println(string);
        }
    }
}