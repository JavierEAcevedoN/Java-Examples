package Example2.Exercises.Exercise1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalculoParalelo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Acontinuacion ingresa 3 valores de resistencias (positivo)", "Calculo de resistencias en paralelo", -1);

        double resintencia1;
        double resintencia2;
        double resintencia3;
        String resultado;
        DecimalFormat formato = new DecimalFormat("#.00");

        while (true) {
            resintencia1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor", "Resistencia Nº1", -1));
            resintencia2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor", "Resistencia Nº2", -1));
            resintencia3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor", "Resistencia Nº3", -1));
            if (resintencia1 > 0 && resintencia2 > 0 && resintencia3 > 0) {
                break;
            }
        JOptionPane.showMessageDialog(null, "El valor de las resistencias tiene que ser mayor a 0", "Error de dato", 0);
        }
        resultado = "El resultado de las resistencias en paralelo es de: "+formato.format(1/((1/resintencia1)+(1/resintencia2)+(1/resintencia3)));
        JOptionPane.showMessageDialog(null, resultado, "Resultado", 1);
    }
}