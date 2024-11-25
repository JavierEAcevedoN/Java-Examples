package Example10.Exercises.Exercise3;

public class Zapato{
    private String color;
    private int talla;
    private String marca;

    Zapato(String color, int talla, String marca){
        this.color = color;
        this.talla = talla;
        this.marca = marca;
    }

    public void info(){
        System.out.println("El color del zapato es: "+ this.color);
        System.out.println("La marca del zapato es: "+ this.marca);
        System.out.println("La talla del zapatos es: "+ this.talla);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}