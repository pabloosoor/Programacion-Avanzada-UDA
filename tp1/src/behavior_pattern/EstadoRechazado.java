package behavior_pattern;

// Estado: Rechazado
public class EstadoRechazado implements EstadoSolicitud {

    @Override
    public void procesar(SolicitudPermiso solicitud) {
        System.out.println("[Estado: RECHAZADO] No se puede procesar una solicitud rechazada");
    }

    @Override
    public void aprobar(SolicitudPermiso solicitud) {
        System.out.println("[Estado: RECHAZADO] No se puede aprobar una solicitud rechazada");
    }

    @Override
    public void rechazar(SolicitudPermiso solicitud) {
        System.out.println("[Estado: RECHAZADO] La solicitud ya ha sido rechazada");
    }

    @Override
    public String obtenerNombreEstado() {
        return "RECHAZADO";
    }
}