package Example6.TipoClases;

public class Ejemplo {
    public static void main(String[] args) {
        TipoClase ejemplo = new TipoClase("Nombre", 23, 100.5);

        System.out.println(ejemplo.edad); // se puede acceder porque es publico
        ejemplo.edad = 43; //se puede cambiar porque es publico
        System.out.println(ejemplo.edad);

        System.out.println(ejemplo.nombre); //se puede accerder porque esta en el mismo paquete

        
    }
}
