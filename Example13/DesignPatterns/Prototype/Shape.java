package Example13.DesignPatterns.Prototype;

public abstract class Shape {
    protected int x,y;
    protected String color;
    
    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color; 
    }

    public Shape(Shape shape) {
        if (shape != null) {
            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color; 
        }
    }

    public abstract Shape clone();
}