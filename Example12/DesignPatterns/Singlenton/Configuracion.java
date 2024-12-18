package Example12.DesignPatterns.Singlenton;

public class Configuracion {
    private String servidor;
    private String puerto;
    private String usuario;
    private String contraseña;

    private static Configuracion configuracion;

    private Configuracion(String servidor, String puerto, String usuario, String contraseña) {
        this.servidor = servidor;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public static Configuracion obtenerConfiguracion() {
        if (configuracion == null) {
            configuracion = new Configuracion("servidor1", "8080", "usuario1", "contraseña1");
        }
        return configuracion;
    }

    public void obtenerInformacion() {
        System.out.println("Servidor: "+servidor);
        System.out.println("Puerto: "+puerto);
        System.out.println("Usuario: "+usuario);
        System.out.println("Contraseña"+contraseña);
    }
}