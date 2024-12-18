package Example14.Exercises.Exercise1;

public class VehiculoElectricoAdapter implements VehiculoCombustion {
    protected VehiculoElectrico vehiculoElectrico;

    public VehiculoElectricoAdapter() {
        System.out.println("Se creo un vehiculo electrico adaptado");
        vehiculoElectrico = new VehiculoElectricoComun();
    }
    
    @Override
    public void acelerar() {
        vehiculoElectrico.moverMasRapido();
        System.out.println("Se esta acelerando el vehiculo electrico adaptado");
    }
    @Override
    public void apagar() {
        vehiculoElectrico.detener();
        vehiculoElectrico.conectar();
        System.out.println("Se apago el vehiculo electrico adaptado");
    }
    @Override
    public void encender() {
        vehiculoElectrico.desconectar();
        vehiculoElectrico.activar();
        System.out.println("Se encendio el vehiculo electrico adaptado");
    }
}