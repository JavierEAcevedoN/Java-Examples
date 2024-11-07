package Exercise8;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierEAcevedoN
 */
public class Curva8 {
    public static void main(String[] args) {
        double nota;
        DecimalFormat formato = new DecimalFormat("#.00");
        
        while (true) {            
            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu nota (0.0 a 5.0)"));
            if (0.0 > nota || nota > 5.0) {
                JOptionPane.showMessageDialog(null,"Esa nota no es valida");
            } else {
                break;
            }
        }
        
        double curva8 = (nota*0.8)+1;
        
        String resultado;
        
        resultado = "La curva de 8 de la nota es: "+formato.format(curva8);
        
        JOptionPane.showMessageDialog(null,resultado);
    }
}
