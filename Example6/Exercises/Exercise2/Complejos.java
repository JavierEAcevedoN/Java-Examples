package Example6.Exercises.Exercise2;

public class Complejos {
    private double ParteReal;
    private double ParteImaginaria;

    public Complejos() {
        ParteReal = 1.0;
        ParteImaginaria = 1.0;
    }

    public Complejos(double parteReal, double parteImaginaria) {
        ParteReal = parteReal;
        ParteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return ParteReal;
    }

    public void setParteReal(double parteReal) {
        ParteReal = parteReal;
    }

    public double getParteImaginaria() {
        return ParteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        ParteImaginaria = parteImaginaria;
    }

    public void sumar(Complejos obj) {
        this.ParteReal += obj.getParteReal();
        this.ParteImaginaria += obj.getParteImaginaria();
    }

    public void restar(Complejos obj) {
        this.ParteReal -= obj.getParteReal();
        this.ParteImaginaria -= obj.getParteImaginaria();
    }

    public void imprimirComplejo() {
        System.out.println(this.ParteReal + " + " + this.ParteImaginaria + "i");
    }
}

class PruevaComplejos {
    public static void main(String[] args) {
        Complejos complejo1 = new Complejos(3.0, 2.0);
        Complejos complejo2 = new Complejos(4.0, 1.0);

        complejo1.sumar(complejo2);
        complejo1.imprimirComplejo();
    }
} 