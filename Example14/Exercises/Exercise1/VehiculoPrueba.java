package Example14.Exercises.Exercise1;

public class VehiculoPrueba {
    public static void main(String[] args) {
        System.out.println();
        VehiculoCombustion vcc = new VehiculoCombustionComun();
        vcc.encender();
        vcc.acelerar();
        vcc.apagar();

        System.out.println();
        VehiculoElectrico vec = new VehiculoElectricoComun();
        vec.desconectar();
        vec.activar();
        vec.moverMasRapido();
        vec.detener();
        vec.conectar();

        System.out.println();
        VehiculoElectricoAdapter veca = new VehiculoElectricoAdapter();
        veca.encender();
        veca.acelerar();
        veca.apagar();
    }
}