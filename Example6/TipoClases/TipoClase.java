package Example6.TipoClases;

public class TipoClase {
    public int edad; // atributo public (se puede accerder desde cualquier lugar)
    protected double saldo; // atributo protected (solo se puede acceder por medio de la misma clase o una subclase)
    String nombre; // atributo default (se puede accerder desde el mismo paquete)
    private boolean activo; // atributo private (solo se puede acceder por medio de la misma clase)

    public TipoClase(String nombre, int edad, double saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
}

class MainTipoClase {
    public static void main(String[] args) {
        TipoClase ejemplo = new TipoClase("Nombre", 23, 100.5);

        System.out.println(ejemplo.edad); // se puede acceder porque es publico
        System.out.println(ejemplo.nombre); //se puede accerder porque esta en el mismo paquete

        System.out.println(ejemplo.saldo); //se puede accerder porque hereda la clase

        System.out.println(ejemplo.getActivo()); //solo se puede accerder por edio de la misma clase, eso requiere metodos para conseguir el atributo
        ejemplo.setActivo(true); // para cambiar el valor se utiliza un metodo tambien
        System.out.println(ejemplo.getActivo());
    }
}