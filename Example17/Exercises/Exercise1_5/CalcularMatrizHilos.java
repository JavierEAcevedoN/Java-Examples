package Example17.Exercises.Exercise1_5;

public class CalcularMatrizHilos implements Runnable{
    private int[] fila;
    private int[][] matrizACalcular;
    private int[] filaResulltado;

    public CalcularMatrizHilos(int[] fila, int[][] matrizACalcular) {
        this.fila = fila;
        this.matrizACalcular = matrizACalcular;
        this.filaResulltado = new int[fila.length];
    }

    public int[] getFilaResulltado() {
        return filaResulltado;
    }

    @Override
    public void run() {
        filaResulltado = new int[fila.length];
        for (int j = 0; j < fila.length; j++) {
            for (int j2 = 0; j2 < matrizACalcular[j].length; j2++) {
                filaResulltado[j2] += fila[j] * matrizACalcular[j][j2];
            }
        }
    }
}