package behavior_pattern;

// Estado: Aprobado
public class EstadoAprobado implements EstadoSolicitud {

    @Override
    public void procesar(SolicitudPermiso solicitud) {
        System.out.println("[Estado: APROBADO] No se puede procesar una solicitud ya aprobada");
    }

    @Override
    public void aprobar(SolicitudPermiso solicitud) {
        System.out.println("[Estado: APROBADO] La solicitud ya ha sido aprobada");
    }

    @Override
    public void rechazar(SolicitudPermiso solicitud) {
        System.out.println("[Estado: APROBADO] No se puede rechazar una solicitud aprobada");
    }

    @Override
    public String obtenerNombreEstado() {
        return "APROBADO";
    }
}