package Example7.Polimorfismo;
/** El polimorfismo es es cuando se varias subclases heredan metodos y atributos de una clase padre, pero despues dependiendo de la clase el metodo/atributo puede ser cambiado */
class Animal {
    public void hacerSonido () {
        System.out.println("Sonido desconocido");
    }
}

class Gato extends Animal {
    /** override se utiliza para sobre escribir los metodos al heredar de otras clases */
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

public class Polimorfismo {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();

        gato.hacerSonido();
        perro.hacerSonido();
    }
}