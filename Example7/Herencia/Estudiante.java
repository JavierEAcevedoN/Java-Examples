package Example7.Herencia;
/** extends se utiliza para poder heredar las propiedades o metodos de otra clase */
public class Estudiante extends Usuario {
    private String codigoEstudiante;

    public Estudiante(String nombre, String documento, String codigoEstudiante) {
        /** super se utiliza para referise a la clase directa a la que se esta heredando */
        super(nombre, documento);
        /** this se utiliza para referirse a la clase en si misma */
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
}