package Example14.DesignPatterns.Composite;

public class Tienda {
    public static void main(String[] args) {
        Producto refresco1 = new Refresco("Sodagua", 44.99);
        System.out.println("valor refresco: "+refresco1.getValor());
        Producto refresco2 = new Refresco("Sodasucar", 22.99);
        System.out.println("valor refresco: "+refresco2.getValor());

        PaqueteRefresco paqueteRefresco = new PaqueteRefresco();

        paqueteRefresco.add(refresco1,refresco2);
        System.out.println("valor total caja refresco: "+paqueteRefresco.getValor());
    }
}