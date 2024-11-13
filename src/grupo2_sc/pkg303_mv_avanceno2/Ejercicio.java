package grupo2_sc.pkg303_mv_avanceno2;

public class Ejercicio {
    private String nombre;
    private String descripcion;
    private TipoMaquina tipoMaquina;
    private TipoEjercicio tipoEjercicio;
    private int repeticiones;
    private int duracion;
    private boolean requierePeso;
    private double peso;

    // Constructor
    public Ejercicio(String nombre, String descripcion, TipoMaquina tipoMaquina, TipoEjercicio tipoEjercicio, int repeticiones, int duracion, boolean requierePeso, double peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoMaquina = tipoMaquina;
        this.tipoEjercicio = tipoEjercicio;
        this.repeticiones = repeticiones;
        this.duracion = duracion;
        this.requierePeso = requierePeso;
        this.peso = peso;
    }

    // Getters and setters for each property
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

}
