package Example5.POO;

public class MiOtraClase {
    // Atributos
    String atributo1;
    int atributo2;
    double atributo3;
    
    // Constructor (cuando no se le pasan parametros, se vuelven parametros default al llamar el constructor)
    public MiOtraClase (){
        this.atributo1 = "Nombre";
        this.atributo2 = 645;
        this.atributo3 = 5.333333;
    }

    // Metodos
    public int metodo1 () {
        return atributo2;
    }
    
    public double metodo2 () {
        return atributo3;
    }

    // Metodo static (se puede utilizar sin necesidad de crear un objeto)
    public static Void Despedida() {
        System.out.println("Adios");
        return null;
    }
}