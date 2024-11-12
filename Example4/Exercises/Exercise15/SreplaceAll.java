package Exercise15;
public class SreplaceAll {
    public static void main(String[] args) {
        String ejemplo = "Ejercicio de metodos de String en Java";
        
        // Remplaza todas las concurrencias de un subcadena especificada por otra especificada.
        System.out.println(ejemplo.replaceAll("(?i)E","E"));
    }
}