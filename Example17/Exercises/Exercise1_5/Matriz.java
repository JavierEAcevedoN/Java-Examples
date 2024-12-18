package Example17.Exercises.Exercise1_5;

import java.util.Scanner;

public class Matriz {
    private int[][] matrizPropia;

    Scanner input = new Scanner(System.in);

    public Matriz(int n, int l) {
        matrizPropia = new int[n][l];
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
}