package behavior_pattern;

// Estado: Pendiente
public class EstadoPendiente implements EstadoSolicitud {

    @Override
    public void procesar(SolicitudPermiso solicitud) {
        System.out.println("[Estado: PENDIENTE] La solicitud ya está siendo procesada...");
    }

    @Override
    public void aprobar(SolicitudPermiso solicitud) {
        System.out.println("[Estado: PENDIENTE] ✓ Solicitud APROBADA");
        solicitud.cambiarEstado(new EstadoAprobado());
    }

    @Override
    public void rechazar(SolicitudPermiso solicitud) {
        System.out.println("[Estado: PENDIENTE] ✗ Solicitud RECHAZADA");
        solicitud.cambiarEstado(new EstadoRechazado());
    }

    @Override
    public String obtenerNombreEstado() {
        return "PENDIENTE";
    }
}