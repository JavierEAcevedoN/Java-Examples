package Example2.Operadores;

import javax.swing.JOptionPane;

public class Operadores {
    public static void main(String[] args) {
        String resultado;
        /** Operador de asignacion */
        resultado = """
            int valor = 24;
            boolean flag = true;
            String cadena = "Cadena";
            Los operador de asignacion (=) sirve para asignar datos a una variable.
                """;
        JOptionPane.showMessageDialog(null, resultado, "Operadores de asignacion", -1);

        /** Operadores aritmeticos */
        resultado = """
            10 + 20 = 30; (suma)
            10 - 20 = -10; (resta)
            10 * 20 = 200; (multiplicacion)
            20 / 10 = 2; (division)
            20 % 10 = 0; (modulo)
            Los operadores aritmeticos sirven para hacer operaciones matamaticas.
                """;
        JOptionPane.showMessageDialog(null, resultado, "Operadores aritmeticos", -1);

        /** Operadores de asignacion (2.0) */
        resultado = """
            A += B equivale A = A + B; (suma)
            A -= B equivale A = A - B; (resta)
            A *= B equivale A = A * B; (multiplicacion)
            A /= B equivale A = A / B; (division)
            A %= B equivale A = A % B; (modulo)
            Los operadores de asignacion (2.0) sirven para hacer operaciones matamaticas y asignarla a la variable.
                """;
        JOptionPane.showMessageDialog(null, resultado, "Operadores de asignacion (2.0)", -1);

        /** Operadores unitarios */
        resultado = """
            20++ = 21; (incremento +1)
            20-- = 19; (disminucion -1)
            Los operadores unitarios sirven para asignar aumentar o disminuir el dato de una variable en 1.
                """;
        JOptionPane.showMessageDialog(null, resultado, "Operadores unitarios", -1);

        /** Operadores relacionales */
        resultado = """
            A > B (mayor que)
            A < B (menor que)
            A <= B (mayor o igual que)
            A >= B (menor o igual que)
            A == B (igual que)
            A != B (distinto que)
            Los operadores relacionales sirven para relacionar dos datos.
                """;
        JOptionPane.showMessageDialog(null, resultado, "Operadores relacionales", -1);

        /** Operadores logicos */
        resultado = """
            true && false; (false)
            true || false; (true)
            !true; (false)
            Los operadores logicos sirven para comparar condiciones.
                """;
        JOptionPane.showMessageDialog(null, resultado, "Operadores logicos", -1);
    }
}