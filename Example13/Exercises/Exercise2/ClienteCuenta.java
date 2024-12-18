package Example13.Exercises.Exercise2;

public class ClienteCuenta {
    public static void main(String[] args) {
        // Creacion del Director
        ClienteDirector clienteDirector = new ClienteDirector();

        // Creacion de cuenta Estandar
        CuentaEstandarBuilder cuentaEstandarBuilder = new CuentaEstandarBuilder();
        clienteDirector.setCuentaBuilder(cuentaEstandarBuilder);
        clienteDirector.construirCuenta();
        CuentaBuild cuentaEstandarBuild = clienteDirector.getCuenta().getCuentaBuild();
        Cuenta cuentaEstandar = cuentaEstandarBuild.getCuenta();
        cuentaEstandar.ingresar();
        cuentaEstandar.abrir();
        cuentaEstandar.retirar();
        cuentaEstandar.llegaRecibo();
        TarjetaDebito tarjetaDebitoEstandar = cuentaEstandarBuild.getTarjetaDebito();
        tarjetaDebitoEstandar.ingresar();
        tarjetaDebitoEstandar.pagar();
        tarjetaDebitoEstandar.retirar();
        
        // Creacion de cuenta Joven
        System.out.println();
        CuentaJovenBuilder cuentaJovenBuilder = new CuentaJovenBuilder();
        clienteDirector.setCuentaBuilder(cuentaJovenBuilder);
        clienteDirector.construirCuenta();
        CuentaBuild cuentaJovenBuild = clienteDirector.getCuenta().getCuentaBuild();
        Cuenta cuentaJoven = cuentaJovenBuild.getCuenta();
        cuentaJoven.ingresar();
        cuentaJoven.abrir();
        cuentaJoven.retirar();
        cuentaJoven.llegaRecibo();
        Regalo regaloJoven = cuentaJovenBuild.getRegalo();
        regaloJoven.usar();
        TarjetaDebito tarjetaDebitoJoven = cuentaJovenBuild.getTarjetaDebito();
        tarjetaDebitoJoven.ingresar();
        tarjetaDebitoJoven.pagar();
        tarjetaDebitoJoven.retirar();

        // Creacion de cuenta 10
        System.out.println();
        Cuenta10Builder cuenta10Factory = new Cuenta10Builder();
        clienteDirector.setCuentaBuilder(cuenta10Factory);
        clienteDirector.construirCuenta();
        CuentaBuild cuenta10Build = clienteDirector.getCuenta().getCuentaBuild();
        Cuenta cuenta10 = cuenta10Build.getCuenta();
        cuenta10.ingresar();
        cuenta10.abrir();
        cuenta10.retirar();
        cuenta10.llegaRecibo();
        Regalo regalo10 = cuenta10Build.getRegalo();
        regalo10.usar();
        TarjetaCredito tarjetaCredito10 = cuenta10Build.getTarjetaCredito();
        tarjetaCredito10.ingresar();
        tarjetaCredito10.pagar();
        tarjetaCredito10.retirar();
        TarjetaDebito tarjetaDebito10 = cuenta10Build.getTarjetaDebito();
        tarjetaDebito10.ingresar();
        tarjetaDebito10.pagar();
        tarjetaDebito10.retirar();

        // Creacion de cuenta Oro
        System.out.println();
        CuentaOroBuilder cuentaOroBuilder = new CuentaOroBuilder();
        clienteDirector.setCuentaBuilder(cuentaOroBuilder);
        clienteDirector.construirCuenta();
        CuentaBuild cuentaOroBuild = clienteDirector.getCuenta().getCuentaBuild();
        Cuenta cuentaOro = cuentaOroBuild.getCuenta();
        cuentaOro.ingresar();
        cuentaOro.abrir();
        cuentaOro.retirar();
        cuentaOro.llegaRecibo();
        Regalo regaloOro = cuentaOroBuild.getRegalo();
        regaloOro.usar();
        TarjetaCredito tarjetaCreditoOro = cuentaOroBuild.getTarjetaCredito();
        tarjetaCreditoOro.ingresar();
        tarjetaCreditoOro.pagar();
        tarjetaCreditoOro.retirar();
        TarjetaDebito tarjetaDebitoOro = cuentaOroBuild.getTarjetaDebito();
        tarjetaDebitoOro.ingresar();
        tarjetaDebitoOro.pagar();
        tarjetaDebitoOro.retirar();
    }
}