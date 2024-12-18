package Example14.DesignPatterns.Composite;

public class Refresco implements Producto {
    private String name;
    private double valor;
    
    public Refresco(String name, double valor) {
        this.name = name;
        this.valor = valor;
    }
    public String getName() {
        return name;
    }
    @Override
    public double getValor() {
        return valor;
    }
}