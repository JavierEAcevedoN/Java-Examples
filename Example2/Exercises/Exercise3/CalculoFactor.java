package Example2.Exercises.Exercise3;

import javax.swing.JOptionPane;

public class CalculoFactor {
    public static void main(String[] args) {
        String resultado;
        String caracter;
        double numero;

        JOptionPane.showMessageDialog(null, "Acontinuacion ingresa los valores requeridos", "Calculo de numero por factor", -1);
        
        numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa un numero Real", "Numero", -1));

        caracter = "";
        caracter = JOptionPane.showInputDialog(null, "Ingresa un Caracter (n,u,m,K,M,G)", "Caracter factor", -1);
        resultado = "El numero por el factor ";
        
        switch (caracter) {
            case "n":
                resultado += "n es de: "+numero*0.000000001;
                break;
            case "u":
                resultado += "u es de: "+numero*0.000001;
                break;
            case "m":
                resultado += "m es de: "+numero*0.001;
                break;
            case "K":
                resultado += "K es de: "+numero*1000.0;
                break;
            case "M":
                resultado += "M es de: "+numero*1000000.0;
                break;
            case "G":
                resultado += "G es de: "+numero*1000000000.0;
                break;
            default:
                JOptionPane.showMessageDialog(null, Double.NaN, "Error de dato", 0);
                return;
        }
        
        JOptionPane.showMessageDialog(null, resultado, "Numero multiplicado por factor", 1);
    }
}