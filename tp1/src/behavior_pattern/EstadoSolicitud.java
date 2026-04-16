package behavior_pattern;

public interface EstadoSolicitud {
    void procesar(SolicitudPermiso solicitud);
    void aprobar(SolicitudPermiso solicitud);
    void rechazar(SolicitudPermiso solicitud);
    String obtenerNombreEstado();
}

