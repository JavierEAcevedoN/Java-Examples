package Example7.Polimorfismo;
/** Las interfaces sirven para usarse compleatamente como plantillas, ya que se implementan en subclases y despues se sobreescriben */
interface Animal {
    abstract void hacerSonido();
}

class Gato implements Animal {
    @Override
    public void hacerSonido () {
        System.out.println("Miau Miau");
    }
}

class Perro implements Animal {
    @Override
    public void hacerSonido () {
        System.out.println("Guau Guau");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();

        gato.hacerSonido();
        perro.hacerSonido();
    }
}