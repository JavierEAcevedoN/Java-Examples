package Example5.Exercises.Exercise2;

public class Animal {
    String tipo;
    int edad;

    public Animal (String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    public String getTipo() {
        return tipo;
    }
}