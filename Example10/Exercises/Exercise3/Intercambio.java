package Example10.Exercises.Exercise3;

public class Intercambio<generic>{
    public static <generic> Object[] intercambiar(generic generico1, generic generico2){
        generic obj = generico1;
        generico1 = generico2;
        generico2 = obj;
        return new Object[]{generico1,generico2};
    }
}
class InnerIntercambio {
    public static void main(String[] args) {
        Object[] rintercambio;

        // objeto Zapato
        Zapato zapato1 = new Zapato("Rojo", 9, "Nike");
        Zapato zapato2 = new Zapato("Azul", 8, "Adidas");

        System.out.println("Los atributos del zapato 1 son: ");
        zapato1.info();
        System.out.println();
        System.out.println("Los atributos del zapato 2 son: ");
        zapato2.info();

        System.out.println();
        System.out.println("-INTERCAMBIO REALIZADO -");
        rintercambio = Intercambio.<Zapato>intercambiar(zapato1, zapato2);
        zapato1 = (Zapato) rintercambio[0];
        zapato2 = (Zapato) rintercambio[1];
        System.out.println();

        System.out.println("Los atributos del zapato 1 son: ");
        zapato1.info();
        System.out.println();
        System.out.println("Los atributos del zapato 2 son: ");
        zapato2.info();

        // objeto Double
        double numero1 = 10.434;
        double numero2 = 20.43242;

        System.out.println("El numero 1 es: ");
        System.out.println(numero1);
        System.out.println();
        System.out.println("El numero 2 es: ");
        System.out.println(numero2);

        System.out.println();
        System.out.println("-INTERCAMBIO REALIZADO -");
        rintercambio = Intercambio.<Double>intercambiar(numero1, numero2);
        numero1 = (Double) rintercambio[0];
        numero2 = (Double) rintercambio[1];
        System.out.println();

        System.out.println("El numero 1 es: ");
        System.out.println(numero1);
        System.out.println();
        System.out.println("El numero 2 es: ");
        System.out.println(numero2);
    }
}