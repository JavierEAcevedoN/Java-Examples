public class POO {
    public static void main(String[] args) {
        MiClase.Saludo();
        MiClase ejemplo = new MiClase("a", 4, 0.2);
        System.out.println(ejemplo.metodo2());

        MiOtraClase.Despedida();
        MiOtraClase otroEjemplo = new MiOtraClase();
        System.out.println(otroEjemplo.metodo1());
        System.out.println(otroEjemplo.metodo2());
    }
}