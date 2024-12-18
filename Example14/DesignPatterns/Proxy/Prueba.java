package Example14.DesignPatterns.Proxy;

public class Prueba {
    public static void main(String[] args) {
        Image image = new ProxyImage("screanShote.jpng");

        image.display();
        System.out.println();

        image.display();
    }
}