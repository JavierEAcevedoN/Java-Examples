package Example13.DesignPatterns.Prototype;

public class Circle extends Shape{
    private double radio;

    public Circle(int x, int y, String color, double radio) {
        super(x, y, color);
        this.radio = radio;
    }

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            this.radio = circle.radio;
        }
    }

    @Override
    public Shape clone() {
        return (Circle) new Circle(this);
    }
}