package Example6.Exercises.Exercise3;

public class CuentaDeAhorros {
    static private double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }
    
    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    static void modificarTasaInteres(double tasaInteresAnual) {
        CuentaDeAhorros.tasaInteresAnual = tasaInteresAnual/100;
    }

    public void calcularInteresMensual() {
        this.saldoAhorros += ((this.saldoAhorros + (this.saldoAhorros * CuentaDeAhorros.tasaInteresAnual))/12);
    }

    public void imprimirInteresMansual() {
        System.out.println("El saldo de este mes es: "+this.getSaldoAhorros());
    }
}
class PruevaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);
        CuentaDeAhorros.modificarTasaInteres(4.0);

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        ahorrador1.imprimirInteresMansual();
        ahorrador2.imprimirInteresMansual();

        CuentaDeAhorros.modificarTasaInteres(5.0);

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("El saldo de este mes es: "+ahorrador1.getSaldoAhorros());
        System.out.println("El saldo de este mes es: "+ahorrador2.getSaldoAhorros());
    }
}