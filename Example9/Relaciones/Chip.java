package Example9.Relaciones;

public class Chip {
    private String empresa;
    private String numero;

    public Chip(String empresa, String numero) {
        this.empresa = empresa;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Fabricante: "+empresa+" Numero: "+numero;
    }
}