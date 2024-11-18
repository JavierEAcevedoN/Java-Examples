package Example7.Herencia;
/** La herencia se utiliza para poder heredar atributos y metodos de otras clases */
public class Usuario {
    protected String nombre;
    protected String documento;
    
    public Usuario(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}