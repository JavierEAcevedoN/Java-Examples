package Example17.Exercises.Exercise1;

import java.util.Scanner;

public class Matriz implements Runnable {
    private int[][] matrizPropia;
    private Matriz matrizExterna;
    private int[][] matrizResultado;

    Scanner input = new Scanner(System.in);

    public Matriz(int n, int l) {
        matrizPropia = new int[n][l];
        matrizResultado = new int[n][l];
    }

    public void setMatrizPropiaValor() {
        for (int i = 0; i < matrizPropia.length; i++) {
            for (int j = 0; j < matrizPropia[i].length; j++) {
                System.out.print("Ingresa el valor de la fila: " + (i+1) + " y la columna " + (j+1) + ": ");
                matrizPropia[i][j] = input.nextInt();
            }
        }
    }

    public int[][] getMatrizPropia() {
        return matrizPropia;
    }

    public void imprimirMatrizPropia() {
        String resultado = " ";
        for (int i = 0; i < matrizPropia.length; i++) {
            resultado += "\n";
            for (int j = 0; j < matrizPropia[i].length; j++) {
                resultado += matrizPropia[i][j]+" ";
            }
        }
        System.out.println(resultado);
    }

    public Matriz getMatrizExterna() {
        return matrizExterna;
    }

    public void setMatrizExterna(Matriz matrizExterna) {
        if (matrizExterna.getMatrizPropia().length == matrizPropia.length
                && matrizExterna.getMatrizPropia()[0].length == matrizPropia[0].length) {
                    this.matrizExterna = matrizExterna;
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

    @Override
    public void run() {
        for (int i = 0; i < matrizPropia.length; i++) {
            for (int j = 0; j < matrizPropia[i].length; j++) {
                for (int j2 = 0; j2 < matrizExterna.getMatrizPropia()[j].length; j2++) {
                    matrizResultado[i][j2] += matrizPropia[i][j] * matrizExterna.getMatrizPropia()[j][j2];
                }
            }
        }
        imprimirMatrizResultado();
    }
}