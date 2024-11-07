package Example2.Exercises.Exercise2;

import javax.swing.JOptionPane;

public class TarifaBasica {
    public static void main(String[] args) {
        String resultado;
        int identificacion = 0;
        int estado = 0;
        int estrato = 0;

        JOptionPane.showMessageDialog(null, "Acontinuacion ingresa los valores requeridos", "Calculo de tarifa basica", -1);

        while (true) {
            identificacion = 0;
            identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu Documento de identidad", "Documento de Identidad", -1));
            if (identificacion > 0) {
                break;
            }
            JOptionPane.showMessageDialog(null, "El documento de identidad tiene que ser mayor a 0", "Error de dato", 0);
        }
        
        while (true) {
            estado = 0;
            estado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu estado Activo (1), Suspendido (0)", "Estado", -1));
            if (estado == 1 || estado == 0) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Elige las dos opciones disponibles (1 o 0)", "Error de dato", 0);
        }

        while (true) {
            estrato = 0;
            estrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu estrato (1,2,3,4,5)", "Estrato", -1));
            if (estrato == 1 || estrato == 2 || estrato == 3 || estrato == 4 || estrato == 5) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Elige las dos opciones disponibles (1, 2, 3, 4 o 5)", "Error de dato", 0);
        }

        
        resultado = "Tu tarifa basica es de: ";
        if (estado == 1) {
            switch (estrato) {
                case 1:
                    resultado += "$10.000";
                    break;

                case 2:
                    resultado += "$15.000";
                    break;

                case 3:
                    resultado += "$30.000";
                    break;

                case 4:
                    resultado += "$50.000";
                    break;

                case 5:
                    resultado += "$65.000";
                    break;
            }
        } else {
            resultado += "$0";
        }
            

        JOptionPane.showMessageDialog(null, resultado, "Tarifa basica", 1);
    }
}