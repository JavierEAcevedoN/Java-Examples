package Exercise18;
public class SstartsWith {
    public static void main(String[] args) {
        String ejemplo1 = "Ejercicio de metodos de String en Java";
        String ejemplo2 = "Ejercicio";
        
        // Devuelve verdadero o falso si la cadena empieza o no con otra cadena especificada.
        System.out.println(ejemplo1.startsWith(ejemplo2));
    }
}