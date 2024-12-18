package Exercise6;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierEAcevedoN
 */
public class Nomina {
    public static void main(String[] args) {
        int valorhora = 20000;
        // en este caso el metodo showInputDialog se utiliza para poder ingresar datos por medio de la ventana emergente al igual que Scanner, claro haciendo la conversion correcta del input entrante.
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de horas trabajadas"));
        String resultado;
        
        int sueldoneto = valorhora*horas;
        int descuento = (int) (sueldoneto*0.04);
        int sueldobruto = (int) (sueldoneto-descuento-descuento);
        
        resultado = "El sueldo neto es de: "+sueldoneto;
        resultado += "\nEl sueldo bruto es de: "+sueldobruto;
        resultado += "\nEl descuento de la EPS y la pension es de: "+descuento;
        
        JOptionPane.showMessageDialog(null,resultado);
    }
}