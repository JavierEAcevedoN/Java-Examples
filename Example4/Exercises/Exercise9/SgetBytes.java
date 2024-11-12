package Exercise9;
public class SgetBytes {
    public static void main(String[] args) {
        String ejemplo1 = "Ejercicio de metodos de String en Java";
        
        // Devuelve un array de bytes de un String.
        byte[] ejemplo2 = ejemplo1.getBytes();
        for (byte Byte : ejemplo2) {
            System.out.println(Byte);
        }
    }
}