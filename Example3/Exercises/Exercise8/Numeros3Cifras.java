package Exercise8;

public class Numeros3Cifras {
    public static void main(String[] args) {
        System.out.println("Números de tres cifras donde la suma de los cubos de las cifras es igual al número:");

        for (int num = 100; num <= 999; num++) {
            int centena = num / 100;
            int decena = (num / 10) % 10;
            int unidad = num % 10;

            int sumaCubos = (int) (Math.pow(centena, 3) + Math.pow(decena, 3) + Math.pow(unidad, 3));

            if (sumaCubos == num) {
                System.out.println(num);
            }
        }
    }
}