package Exercise8;
public class SequalsIgnoreCase {
    public static void main(String[] args) {
        String ejemplo1 = "Ejercicio de metodos de String en Java";
        String ejemplo2 = "Ejercicio de METODOS de String en Java";
        
        // Devuelve verdadero o falso si la cadena es igual o no con otra cadena especificada sin tener en cuenta si esta en minuscula o mayuscula.
        System.out.println(ejemplo1.equalsIgnoreCase(ejemplo2));
    }
}