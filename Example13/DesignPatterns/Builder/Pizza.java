package Example13.DesignPatterns.Builder;

public class Pizza {
    private String masa = "";
    private String salsa = "";
    private String relleno = "";
    private String tipo = "";

    public void setMasa(String masa) {
        this.masa = masa;
    }
    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void obtenerInformacion() {
        System.out.println("Masa: "+masa+" Relleno: "+relleno+" Salsa: "+salsa+" Tipo: "+tipo);
    }
}