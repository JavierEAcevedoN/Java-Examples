package Exercise12;
public class SlastIndexOf {
    public static void main(String[] args) {
        String ejemplo1 = "Ejercicio de metodos de String en Java";
        String ejemplo2 = "de";
        
        // Devuelve el index de la ultima ocurrencia que cumpla con el caracter especificado.
        System.out.println(ejemplo1.indexOf('a'));

        // Devuelve el index de la ultima ocurrencia que cumpla con el String especificado.
        System.out.println(ejemplo1.indexOf(ejemplo2));
    }
}