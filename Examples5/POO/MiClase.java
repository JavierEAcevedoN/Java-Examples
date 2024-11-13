public class MiClase {
    // Atributos
    String atributo1;
    int atributo2;
    double atributo3;
    
    // Constructor
    public MiClase (String atributo1, int atributo2, double atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    // Metodos
    public void metodo1 () {
        return;
    }

    public String metodo2 () {
        return "Hola mundo";
    }

    // Metodo static (se puede utilizar sin necesidad de crear un objeto)
    public static Void Saludo() {
        System.out.println("Hola");
        return null;
    }
}