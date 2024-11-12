package Exercise10;
public class SindexOf {
    public static void main(String[] args) {
        String ejemplo1 = "Ejercicio de metodos de String en Java";
        String ejemplo2 = "Java";
        
        // Devuelve el index de la primera ocurrencia que cumpla con el caracter especificado.
        System.out.println(ejemplo1.indexOf('d'));

        // Devuelve el index de la primera ocurrencia que cumpla con el String especificado.
        System.out.println(ejemplo1.indexOf(ejemplo2));
    }
}