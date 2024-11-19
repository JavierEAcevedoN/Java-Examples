package Example8.Arreglos;

public class Arreglo {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.err.println(numeros[0]);
        System.err.println(numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}