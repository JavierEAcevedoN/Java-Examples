package Example2.Condicionales;

public class Condicionales {
    public static void main(String[] args) {
        /** Condicionales IF ELSE */
        int numero = 5;
        if (numero<3) {
            /** Esto se ejecuta si la condicion se cumple */
            System.out.println("El numero es menor que 3");
        } else {
            /** Esto se ejecuta si la condicion no se cumple */
            System.out.println("El numero es mayor o igual que 3");
        }

        /** Condicional Switch */
        int numero2 = 6;
        switch (numero2) {
            case 1:
            /** Esto se ejecuta si el valor del numero es 1 */
                System.out.println("Lunes");
                break;
            case 2:
            /** Esto se ejecuta si el valor del numero es 2 */
                System.out.println("Martes");
                break;
            case 3:
            /** Esto se ejecuta si el valor del numero es 3 */
                System.out.println("Miercoles");
                break;
            case 4:
            /** Esto se ejecuta si el valor del numero es 4 */
                System.out.println("Jueves");
                break;
            case 5:
            /** Esto se ejecuta si el valor del numero es 5 */
                System.out.println("Viernes");
                break;
            case 6:
            /** Esto se ejecuta si el valor del numero es 6 */
                System.out.println("Sabado");
                break;
            case 7:
            /** Esto se ejecuta si el valor del numero es 7 */
                System.out.println("Domingo");
                break;
            default:
            /** Esto se ejecuta si el valor del numero no cumple ninguna de las condiciones anteriores */
            System.out.println("Ese dia no existe");
                break;
        }
    }
}