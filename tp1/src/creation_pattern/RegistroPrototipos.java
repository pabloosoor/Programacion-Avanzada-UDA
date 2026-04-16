package creation_pattern;
import java.util.HashMap;
import java.util.Map;

// Registro de prototipos para el patrón Prototype para ser clonados

public class RegistroPrototipos {
    private final Map<String, Prototype> prototipos = new HashMap<>();

    //Guardado del prototipo
    public void guardarPrototipo(String clave, Prototype prototipo) {
        prototipos.put(clave, prototipo);
    }

    public Prototype obtenerPrototipo(String clave){
        Prototype prototipo = prototipos.get(clave);
        if (prototipo == null) {
            throw new IllegalArgumentException("Prototype no encontrado: " + clave);
        }
        return prototipo;
    }

    //Eliminar un prototipo
    public void eliminarPrototipo(String clave){
        prototipos.remove(clave);
    }

    //Listar todas las claves de prototipos
    public void listarPrototipos() {
        System.out.println("Prototipos disponibles: " + prototipos.keySet());
    }

}
