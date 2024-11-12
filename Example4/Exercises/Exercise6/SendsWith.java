package Exercise6;
public class SendsWith {
    public static void main(String[] args) {
        String ejemplo1 = "Ejercicio de metodos de String en Java";
        String ejemplo2 = "Java";
        
        // Devuelve verdadero o falso si la cadena termina o no con otra cadena especificada.
        System.out.println(ejemplo1.endsWith(ejemplo2));
    }
}