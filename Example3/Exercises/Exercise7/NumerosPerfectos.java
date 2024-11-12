package Exercise7;

public class NumerosPerfectos {
    public static void main(String[] args) {
        int numerosperfectospar = 0;
        int numerosperfectosimpar = 0;
        int numero = 2;

        while (numerosperfectospar < 3 && numerosperfectosimpar < 3) {
            int suma = 0;
            
            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    suma += i;
                }
            }
            
            if (suma == numero) {
                if (numero%2==0) {
                    System.out.println("Numero perfecto par: "+numero);
                    numerosperfectospar++;
                } else {
                    System.out.println("Numero perfecto impar: "+numero);
                    numerosperfectosimpar++;
                }
            }

            numero += 1;
        }
        System.out.println("Los numeros impares perfectos no existen");
    }
}