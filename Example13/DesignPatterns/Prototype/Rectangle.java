package Example13.DesignPatterns.Prototype;

public class Rectangle extends Shape{
    private int ancho,alto;

    public Rectangle(int x, int y, String color, int ancho, int alto) {
        super(x, y, color);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        if (rectangle != null) {
            this.ancho = rectangle.ancho;
            this.alto = rectangle.alto;
        }
    }

    @Override
    public Shape clone() {
        return (Rectangle) new Rectangle(this);
    }
}