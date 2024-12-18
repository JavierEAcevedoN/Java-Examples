package Example17.Exercises.Exercise1_5;

public class CalcularMatriz{
    private int[][] matriz1;
    private int[][] matriz2;
    private int[][] matrizResultado;

    public CalcularMatriz(Matriz matriz1, Matriz matriz2) {
        this.matriz1 = matriz1.getMatrizPropia();
        this.matrizResultado = new int[this.matriz1.length][this.matriz1[0].length];
        if (matriz2.getMatrizPropia().length == matriz1.getMatrizPropia().length
                && matriz2.getMatrizPropia()[0].length == matriz1.getMatrizPropia()[0].length) {
                    this.matriz2 = matriz2.getMatrizPropia();
        } else {
            System.out.println("la matrices tienen que ser del mismo tamaño (1*1)");
            this.matriz2 = matriz1.getMatrizPropia();
        }
    }

    public int[][] getMatriz1() {
        return matriz1;
    }

    public void setMatriz1(int[][] matriz1) {
        this.matriz1 = matriz1;
    }

    public int[][] getMatriz2() {
        return matriz2;
    }

    public void setMatriz2(Matriz matriz2) {
        if (matriz2.getMatrizPropia().length == matriz1.length
                && matriz2.getMatrizPropia()[0].length == matriz1[0].length) {
                    this.matriz2 = matriz2.getMatrizPropia();
        } else {
            System.out.println("la matrices tienen que ser del mismo tamaño (1*1)");
            this.matriz2 = matriz1;
        }
    }

    public void imprimirMatrizResultado() {
        String resultado = " ";
        for (int i = 0; i < matrizResultado.length; i++) {
            resultado += "\n";
            for (int j = 0; j < matrizResultado[i].length; j++) {
                resultado += matrizResultado[i][j]+" ";
            }
        }
        System.out.println(resultado);
    }

    public void calcularMatriz() {
        CalcularMatrizHilos[] filas = new CalcularMatrizHilos[this.matriz1.length];
        Thread[] hilos = new Thread[this.matriz1.length];
        for (int i = 0; i < matriz1.length; i++) {
            filas[i] = new CalcularMatrizHilos(matriz1[i],matriz2);
            hilos[i] = new Thread(filas[i]);
            hilos[i].start();
        }
        for (int i = 0; i < hilos.length; i++) {
            try {
                hilos[i].join();
            } catch (Exception e) {
                System.out.println("Hilo interrumpido: "+hilos[i].getName());
                System.out.println(e);
            }
        }
        for (int i = 0; i < filas.length; i++) {
            matrizResultado[i] = filas[i].getFilaResulltado();
        }
        imprimirMatrizResultado();
    }
}