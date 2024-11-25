package Example10.Enumeraciones;

public enum Enumeracion {
    // Los Enum limitan los valores en la creacion de una clase.
    Hola,
    Edgan,
    AlgoOtraVez,
    Nada
}

enum LenguajesProgramacion {
    // Como los Enum son clases, se pueden agregar atributos metodos y contructor.
    // Los enum acontinuacion se utilizan para ejecutar el contructor y asignar lso valores como se quiere.
    Python("Python",400000),
    JavaScript("JavaScript",7324721),
    Java("Java",94828377);

    private String nombre;
    private int npersonas;

    // En este caso el constructor tiene que ser privado para que al invocar la clase no se pueda poner otra cosa.
    private LenguajesProgramacion(String nombre, int npersonas) {
        this.nombre = nombre;
        this.npersonas = npersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNpersonas() {
        return npersonas;
    }
}

class EjemploEnum {
    // El uso del enum seria para poder tener atributos en clases que solo funcionen con clases enum, para que asi al llamar el constructor de esta clase solo se puedan usar las opciones que le da el enum.
    private Enumeracion enumeracion;
    private LenguajesProgramacion lenguaje;

    public EjemploEnum(Enumeracion enumeracion, LenguajesProgramacion lenguaje) {
        this.enumeracion = enumeracion;
        this.lenguaje = lenguaje;
    }

    public void imprimirEjemplo() {
        System.out.println("Este el valor de la clase Enumeacion pasada: "+enumeracion.toString()+", este es el nombre del lenguaje seleccionado: "+lenguaje.getNombre()+" y este es el numero de personas: "+lenguaje.getNpersonas());
    }
}

class InnerEnumeracion {
    public static void main(String[] args) {
        // Devuelve el nombre del enum seleccionado
        System.out.println(Enumeracion.AlgoOtraVez.name());

        // Devuelve un string del enum seleccionado
        System.out.println();
        System.out.println(Enumeracion.AlgoOtraVez.toString());

        // Devuelve la posicion en la que se encuentra el enum seleccionado
        System.out.println();
        System.out.println(Enumeracion.AlgoOtraVez.ordinal());

        System.out.println();
        // Recorrer un Map con ForEach
        for (Enumeracion enumeracion: Enumeracion.values()) {
            System.out.println(enumeracion.toString());
        }

        EjemploEnum ejm1 = new EjemploEnum(Enumeracion.Edgan,LenguajesProgramacion.Python);
        ejm1.imprimirEjemplo();

        EjemploEnum ejm2 = new EjemploEnum(Enumeracion.Edgan,LenguajesProgramacion.JavaScript);
        ejm2.imprimirEjemplo();

        EjemploEnum ejm3 = new EjemploEnum(Enumeracion.Edgan,LenguajesProgramacion.Java);
        ejm3.imprimirEjemplo();
    }
}