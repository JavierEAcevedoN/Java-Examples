package Example13.DesignPatterns.Prototype;

public class PruebaShape {
    public static void main(String[] args) {
        Shape circle = new Circle(10, 10, "Rojo", 10);
        Shape circle2 = circle.clone();

        System.out.println(circle);
        System.out.println(circle2);
    }
}