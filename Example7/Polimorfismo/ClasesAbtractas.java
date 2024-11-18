package Example7.Polimorfismo;
/** Los elementos/clases abtractas sirve para usarse como plantillas, ya que se heredan en subclases y despues se sobreescriben */
abstract class Animal {
    abstract void hacerSonido();
}

class Gato extends Animal {
    @Override
    public void hacerSonido () {
        System.out.println("Miau Miau");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido () {
        System.out.println("Guau Guau");
    }
}

public class ClasesAbtractas {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();

        gato.hacerSonido();
        perro.hacerSonido();
    }
}