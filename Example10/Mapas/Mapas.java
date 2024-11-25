package Example10.Mapas;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        // Hay tres tipos de Map:
        // El HashMap guarda los elementos que se insertan sin un 'orden logico'.
        Map<Integer, String> diccionario = new HashMap<>();
        // El TreeMap guarda los elementos de una 'forma natural'.
        // Map<Integer, String> diccionario = new TreeMap<>();
        // El LinkedHashMap guarda los elementos en el mismo orden en el que se van insertando .
        // Map<Integer, String> diccionario = new LinkedHashMap<>();

        // Put se utiliza para meter los datos, se pone la llave y el valor de cada uno;
        diccionario.put(18, "Edgan");
        diccionario.put(44, "Hola");
        diccionario.put(13, "Cosa");
        diccionario.put(90, "Algo");

        // Recorrer un Map con while
        Iterator<Map.Entry<Integer, String>> recorrer = diccionario.entrySet().iterator();
        while (recorrer.hasNext()) {
            Map.Entry<Integer, String> elemento = recorrer.next();
            Integer llave = elemento.getKey();
            String valor = elemento.getValue();
            System.out.println("Llave: "+llave+", Valor: "+valor);
        }
        
        System.out.println();
        // Recorrer un Map con ForEach
        for (Map.Entry<Integer, String> elemento : diccionario.entrySet()) {
            System.out.println("Llave: "+elemento.getKey()+", Valor: "+elemento.getValue());
        }

        System.out.println();
        // Recorrer un Map con ForEach por las llaves
        for (Integer llave : diccionario.keySet()) {
            System.out.println("Llave: "+llave);
        }

        System.out.println();
        // Recorrer un Map con ForEach por los valores
        for (String valor : diccionario.values()) {
            System.out.println("Valor: "+valor);
        }

        System.out.println();
        System.out.println("El largo del Map es: "+diccionario.size());
        
        System.out.println();
        System.out.println("El Map esta vacio: "+diccionario.isEmpty());

        System.out.println();
        // devuelve el valor de la llave que se le pasa si existe.
        System.out.println("El valor de la llave 90 es: "+diccionario.get(90));

        System.out.println();
        diccionario.remove(44);
        System.out.println("Se elimino el elemento con la llave 44");
        for (Map.Entry<Integer, String> elemento : diccionario.entrySet()) {
            System.out.println("Llave: "+elemento.getKey()+", Valor: "+elemento.getValue());
        }

        System.out.println();
        System.out.println("El Map contiene la llave 18: "+diccionario.containsKey(18));

        System.out.println();
        System.out.println("El Map contiene el valor 'Edgan': "+diccionario.containsValue("Edgan"));

        System.out.println();
        diccionario.replace(90, "Algo", "Algo nuevo");
        System.out.println("Se elimino el elemento con la llave 44");
        for (Map.Entry<Integer, String> elemento : diccionario.entrySet()) {
            System.out.println("Llave: "+elemento.getKey()+", Valor: "+elemento.getValue());
        }

        System.out.println();
        diccionario.clear();
        System.out.println("Se elimino todo el contenido del Map");
    }
}