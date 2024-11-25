package Example10.Exercises.Exercise2;

public class Vehiculo {
    private String color;
    private String marca;

    Vehiculo() {
        this.color = "rojo";
        this.marca = "mercedez";
    }

    public void arrancar() {
        System.out.println("Encendiendo el motor");
    }

    public void parar() {
        System.out.println("Apagando motor");
    }

    public void repostar() {
        System.out.println("Llenando el tanque de combustible");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}