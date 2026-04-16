package creation_pattern;

/**
 * OBSOLETO: Esta clase ha sido reemplazada por la interfaz Prototype en Prototype.java
 * Use directamente: import creation_pattern.Prototype;
 * 
 * El patrón Prototype ahora se implementa de forma más clara con la interfaz Prototype independiente.
 */
@Deprecated
public class PrototypePattern {
    /**
     * @deprecated Usar la interfaz creation_pattern.Prototype en su lugar
     */
    @Deprecated
    public interface Prototype extends Cloneable {
        Prototype clone();
    }
}