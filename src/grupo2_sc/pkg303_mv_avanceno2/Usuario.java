import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
    private String nombre;
    private String nombreUsuario;
    private String contrasena;
    private int edad;
    private double altura;
    private double peso;
    private String correo;
    private int idUsuario;
    
    // Constructor
    public Usuario(String nombre, String nombreUsuario, String contrasena, int edad, double altura, double peso, String correo) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        setCorreo(correo);  // setter para validat el formato de email
    }

    // Getters and setters para cada propiedad
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    
    public String getCorreo() { return correo; }
    
    public void setCorreo(String correo) {
        if (validateEmail(correo)) {
            this.correo = correo;
        } else {
            System.out.println("Formato de Correo inválido");
        }
    }

    private boolean validateEmail(String correo) {
        String regex = "[a-zA-Z0-9]+@bncr\\.fi\\.cr";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
}
