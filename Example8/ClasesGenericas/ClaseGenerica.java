package Example8.ClasesGenericas;

// Los 
public class ClaseGenerica<T> {
    private T contenido;

    ClaseGenerica(T contenido) {
        this.contenido = contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }
}

class Main {
    public static void main(String[] args) {
        ClaseGenerica<Integer> intObj = new ClaseGenerica<>(5);
        System.out.println("Clase generica retorna: " + intObj.getContenido());
        
        ClaseGenerica<String> stringObj = new ClaseGenerica<>("Java");
        System.out.println("Clase generica retorna: " + stringObj.getContenido());
    }
}