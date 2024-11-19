package Example8.Exercises.Exercise2;

public class SweetCO {
    public static void main(String[] args) {
        int[][] ventas = {
            {100, 88, 92, 94, 85, 110, 118},
            {30, 42, 31, 32, 38, 40, 37},
            {23, 35, 39, 45, 55, 60, 61},
            {45, 50, 56, 65, 47, 57, 68},
            {18, 25, 33, 21, 22, 28, 32}
        };

        int[] valor = {1550, 5000, 6500, 2500, 22500};
        
        System.out.println("El producto que genera mas ingresos es: "+productoMasIngresos(ventas, valor));
        System.out.println("El dia que genera mas ingresos es: "+diasMasIngresos(ventas, valor));
    }
    private static int productoMasIngresos(int[][] ventas, int[] precio) {
        int[] precioventas = new int[ventas.length];

        int ventasmaximas = -1;
        int productomasvendido = 0;

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                precioventas[i] = ventas[i][j] * precio[i];
            }

            if (precioventas[i] > ventasmaximas) {
                ventasmaximas = precioventas[i];
                productomasvendido = i + 1;
            }
        }

        return productomasvendido;
    }

    private static int diasMasIngresos(int[][] ventas, int[] precio) {
        int[] precioventas = new int[ventas[0].length];

        int ventasmaximas = -1;
        int diamasvendido = 0;

        for (int j = 0; j < ventas[0].length; j++) {
            for (int i = 0; i < ventas.length; i++) {
                precioventas[j] = ventas[i][j] * precio[i];
            }

            if (precioventas[j] > ventasmaximas) {
                ventasmaximas = precioventas[j];
                diamasvendido = j + 1;
            }
        }

        return diamasvendido;
    }
}