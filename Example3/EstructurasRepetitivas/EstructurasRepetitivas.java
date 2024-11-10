package Example3.EstructurasRepetitivas;

import javax.swing.JOptionPane;

public class EstructurasRepetitivas {
    public static void main(String[] args) {
        /** Ciclo For */
        for (int i = 0; i < 5; i++) {
            /** El ciclo for sirve para repetir un bloque de datos por una cantidad de veces definida */
            JOptionPane.showMessageDialog(null, i, "Ciclo For", -1);
        }

        /** Ciclo While */
        int j = 0;
        while (j<10) {
            /** Sirve para ejecutar un bloque de datos mientras se cumple una condicion */
            JOptionPane.showMessageDialog(null, j, "Ciclo While", -1);
            j++;
        }

        /** Ciclo DoWhile */
        int k = 0;
        do {
            /** Sirve para ejecutar un bloque de datos mientras se cumple una condicion, asegura que el bloque de codigo se ejecute almenos una vez */
            JOptionPane.showMessageDialog(null, k, "Ciclo DoWhile", -1);
            k++;
        } while (k<15);

        for (int l = 0; l < 5; l++) {
            if (l<3) {
                JOptionPane.showMessageDialog(null, "Este mensaje se muestra antes", "Ciclo For con Continue", -1);
                /** Continue sirve para repetir el bloque de codigo desde ahi */
                continue;
            }
            JOptionPane.showMessageDialog(null, l, "Ciclo For con Continue", -1);
        }
    }
}