package Exercise19;
public class Ssubtring {
    public static void main(String[] args) {
        String ejemplo = "Ejercicio de metodos de String en Java";
        
        // Devuelve un subString del String especificado desde el index pasado hasta el final.
        System.out.println(ejemplo.substring(24));
        
        // Devuelve un subString del String especificado desde el index pasado hasta el otro index pasado.
        System.out.println(ejemplo.substring(10,30));
    }
}