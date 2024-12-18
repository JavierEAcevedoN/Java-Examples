package Example15.DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {
    private double temperatura;
    private List<Dispositivos> dispositivos = new ArrayList<>();

    public EstacionMeteorologica(double temperatura) {
        System.out.println("La temperatura inicial de las estacion es de: "+temperatura);
        this.temperatura = temperatura;
    }

    public void cambiarTemperatura(double temperatura) {
        System.out.println("La temperatura se cambio a: "+temperatura);
        this.temperatura = temperatura;
        notificar();
    }

    public void notificar() {
        for (Dispositivos dispositivo : dispositivos) {
            dispositivo.notificar(temperatura);
        }
    }

    public void agregarDispositivo(Dispositivos dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void quitarDispositivo(Dispositivos dispositivo) {
        dispositivos.remove(dispositivo);
    }
}