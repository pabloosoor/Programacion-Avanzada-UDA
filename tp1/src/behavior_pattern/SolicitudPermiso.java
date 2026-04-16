package behavior_pattern;

// Clase Contexto que usa el patrón State
public class SolicitudPermiso {
    private String id;
    private String empleado;
    private String tipo; // Vacaciones, Permiso, Licencia
    private EstadoSolicitud estado;
    private String fechaSolicitud;

    public SolicitudPermiso(String id, String empleado, String tipo, String fechaSolicitud) {
        this.id = id;
        this.empleado = empleado;
        this.tipo = tipo;
        this.fechaSolicitud = fechaSolicitud;
        // Estado inicial: PENDIENTE
        this.estado = new EstadoPendiente();
    }

    // Cambiar estado
    public void cambiarEstado(EstadoSolicitud nuevoEstado) {
        System.out.println("[Solicitud] Cambio de estado: " + this.estado.obtenerNombreEstado()
                + " → " + nuevoEstado.obtenerNombreEstado());
        this.estado = nuevoEstado;
    }

    // Delegar comportamiento al estado actual
    public void procesar() {
        estado.procesar(this);
    }

    public void aprobar() {
        estado.aprobar(this);
    }

    public void rechazar() {
        estado.rechazar(this);
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getEmpleado() {
        return empleado;
    }

    public String getTipo() {
        return tipo;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    @Override
    public String toString() {
        return "SolicitudPermiso{" +
                "id='" + id + '\'' +
                ", empleado='" + empleado + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado.obtenerNombreEstado() + '\'' +
                ", fechaSolicitud='" + fechaSolicitud + '\'' +
                '}';
    }
}