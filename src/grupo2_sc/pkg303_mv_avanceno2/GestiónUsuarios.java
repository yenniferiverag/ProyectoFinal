import java.util.ArrayList;
import java.util.List;

public class GestionUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();

    // creamos un nuevo usuario
    public void crearUsuario(Usuario usuario) {
        if (usuarioExiste(usuario)) {
            System.out.println("El usuario ya existe");
        } else {
            usuarios.add(usuario);
            System.out.println("Usuario registrado exitosamente");
        }
    }

    // chequeamos si el usuario existe
    private boolean usuarioExiste(Usuario usuario) {
        return usuarios.stream().anyMatch(u -> u.getNombreUsuario().equals(usuario.getNombreUsuario()));
    }

    // actualizamos detalles de usuario
    public void actualizarUsuario(String nombreUsuario, String nuevoNombre, String nuevoCorreo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                usuario.setNombre(nuevoNombre);
                usuario.setCorreo(nuevoCorreo);
                System.out.println("Usuario actualizado exitosamente");
                return;
            }
        }
        System.out.println("No existe el usuario");
    }

    // encontrar y mostrar un usuario por nombre
    public Usuario leerUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        System.out.println("No existe el usuario");
        return null;
    }

    // eliminamos el usuario por nombre
    public void borrarUsuario(String nombreUsuario) {
        usuarios.removeIf(u -> u.getNombreUsuario().equals(nombreUsuario));
        System.out.println("Usuario eliminado correctamente");
    }
}
