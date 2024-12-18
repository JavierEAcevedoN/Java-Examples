package Example13.Exercises.Exercise1;

public class ClienteCuenta {
    public static void main(String[] args) {
        // Creacion de cuenta Estandar
        CuentaEstandarFactory cuentaEstandarFactory = new CuentaEstandarFactory();
        Cuenta cuentaEstandar = cuentaEstandarFactory.crearCuenta();
        cuentaEstandar.ingresar();
        cuentaEstandar.abrir();
        cuentaEstandar.retirar();
        cuentaEstandar.llegaRecibo();
        TarjetaDebito tarjetaDebitoEstandar = cuentaEstandarFactory.crearTarjetaDebito();
        tarjetaDebitoEstandar.ingresar();
        tarjetaDebitoEstandar.pagar();
        tarjetaDebitoEstandar.retirar();

        // Creacion de cuenta Joven
        System.out.println();
        CuentaJovenFactory cuentaJovenFactory = new CuentaJovenFactory();
        Cuenta cuentaJoven = cuentaJovenFactory.crearCuenta();
        cuentaJoven.ingresar();
        cuentaJoven.abrir();
        cuentaJoven.retirar();
        cuentaJoven.llegaRecibo();
        Regalo regaloJoven = cuentaJovenFactory.crearRegalo();
        regaloJoven.usar();
        TarjetaDebito tarjetaDebitoJoven = cuentaJovenFactory.crearTarjetaDebito();
        tarjetaDebitoJoven.ingresar();
        tarjetaDebitoJoven.pagar();
        tarjetaDebitoJoven.retirar();

        // Creacion de cuenta 10
        System.out.println();
        Cuenta10Factory cuenta10Factory = new Cuenta10Factory();
        Cuenta cuenta10 = cuenta10Factory.crearCuenta();
        cuenta10.ingresar();
        cuenta10.abrir();
        cuenta10.retirar();
        cuenta10.llegaRecibo();
        Regalo regalo10 = cuenta10Factory.crearRegalo();
        regalo10.usar();
        TarjetaCredito tarjetaCredito10 = cuenta10Factory.crearTarjetaCredito();
        tarjetaCredito10.ingresar();
        tarjetaCredito10.pagar();
        tarjetaCredito10.retirar();
        TarjetaDebito tarjetaDebito10 = cuenta10Factory.crearTarjetaDebito();
        tarjetaDebito10.ingresar();
        tarjetaDebito10.pagar();
        tarjetaDebito10.retirar();

        // Creacion de cuenta Oro
        System.out.println();
        CuentaOroFactory cuentaOroFactory = new CuentaOroFactory();
        Cuenta cuentaOro = cuentaOroFactory.crearCuenta();
        cuentaOro.ingresar();
        cuentaOro.abrir();
        cuentaOro.retirar();
        cuentaOro.llegaRecibo();
        Regalo regaloOro = cuentaOroFactory.crearRegalo();
        regaloOro.usar();
        TarjetaCredito tarjetaCreditoOro = cuentaOroFactory.crearTarjetaCredito();
        tarjetaCreditoOro.ingresar();
        tarjetaCreditoOro.pagar();
        tarjetaCreditoOro.retirar();
        TarjetaDebito tarjetaDebitoOro = cuentaOroFactory.crearTarjetaDebito();
        tarjetaDebitoOro.ingresar();
        tarjetaDebitoOro.pagar();
        tarjetaDebitoOro.retirar();
    }
}