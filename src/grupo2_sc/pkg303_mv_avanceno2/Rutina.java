public class Rutina {
    private String nombre;
    private String tipoEjercicio;
    private int duracion; // duración en minutos

    public Rutina(String nombre, String tipoEjercicio, int duracion) {
        this.nombre = nombre;
        this.tipoEjercicio = tipoEjercicio;
        this.duracion = duracion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(String tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Método para mostrar la información de la rutina
    @Override
    public String toString() {
        return "Rutina{" +
                "nombre='" + nombre + '\'' +
                ", tipoEjercicio='" + tipoEjercicio + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
