import java.util.ArrayList;
import java.util.List;

public class GestionRutinas {
    private List<Rutina> rutinas = new ArrayList<>();

    // creamos una rutina
    public void crearRutina(Rutina rutina) {
        rutinas.add(rutina);
        System.out.println("Rutina registrada exitosamente");
    }

    // leemos rutina
    public Rutina leerRutina(String nombre) {
        for (Rutina rutina : rutinas) {
            if (rutina.getNombre().equals(nombre)) {
                return rutina;
            }
        }
        System.out.println("No existe la rutina");
        return null;
    }

    // actualizamos rutina
    public void actualizarRutina(String nombre, Rutina rutinaActualizada) {
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getNombre().equals(nombre)) {
                rutinas.set(i, rutinaActualizada);
                System.out.println("Rutina actualizada correctamente");
                return;
            }
        }
        System.out.println("No existe la rutina");
    }

    // se elimina la rutina por nombre
    public void borrarRutina(String nombre) {
        rutinas.removeIf(r -> r.getNombre().equals(nombre));
        System.out.println("Rutina eliminada correctamente");
    }
}
