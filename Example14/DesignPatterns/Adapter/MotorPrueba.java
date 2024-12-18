package Example14.DesignPatterns.Adapter;

public class MotorPrueba {
    public static void main(String[] args) {
        Motor mc = new MotorComun();
        mc.encender();
        mc.acelerar();
        mc.apagar();

        System.out.println();
        MotorElectrico me = new MotorElectricoComun();
        me.desconectar();
        me.activar();
        me.moverMasRapido();
        me.detener();
        me.conectar();

        System.out.println();
        MotorElectricoAdapter mea = new MotorElectricoAdapter();
        mea.encender();
        mea.acelerar();
        mea.apagar();
    }
}