package behavior_pattern;

public class BehaviorPatternMain {
    public static void main(String[] args) {
        System.out.println("=== PATRÓN STATE ===\n");

        // Crear solicitudes de permiso
        SolicitudPermiso solicitud1 = new SolicitudPermiso(
                "SOL-001",
                "Ana García",
                "Vacaciones",
                "2025-01-15"
        );

        SolicitudPermiso solicitud2 = new SolicitudPermiso(
                "SOL-002",
                "Roberto López",
                "Permiso",
                "2025-01-16"
        );

        // ========== Ejemplo 1: Flujo normal ==========
        System.out.println("--- Flujo Normal de una Solicitud ---");
        System.out.println(solicitud1);
        System.out.println("Estado actual: " + solicitud1.getEstado().obtenerNombreEstado());

        System.out.println("\n[Acción] Procesando solicitud...");
        solicitud1.procesar();

        System.out.println("\n[Acción] Aprobando solicitud...");
        solicitud1.aprobar();
        System.out.println("Estado actual: " + solicitud1.getEstado().obtenerNombreEstado());

        System.out.println("\n[Acción] Intentando rechazar solicitud aprobada...");
        solicitud1.rechazar();

        System.out.println("\n[Acción] Intentando aprobar solicitud ya aprobada...");
        solicitud1.aprobar();

        // ========== Ejemplo 2: Rechazo de solicitud ==========
        System.out.println("\n\n--- Flujo de Rechazo de una Solicitud ---");
        System.out.println(solicitud2);
        System.out.println("Estado actual: " + solicitud2.getEstado().obtenerNombreEstado());

        System.out.println("\n[Acción] Procesando solicitud...");
        solicitud2.procesar();

        System.out.println("\n[Acción] Rechazando solicitud...");
        solicitud2.rechazar();
        System.out.println("Estado actual: " + solicitud2.getEstado().obtenerNombreEstado());

        System.out.println("\n[Acción] Intentando aprobar solicitud rechazada...");
        solicitud2.aprobar();

        System.out.println("\n[Acción] Intentando procesar solicitud rechazada...");
        solicitud2.procesar();

        // ========== Ejemplo 3: Demostración de estados ==========
        System.out.println("\n\n--- Demostrando Transiciones de Estado ---");
        SolicitudPermiso solicitud3 = new SolicitudPermiso(
                "SOL-003",
                "Carlos Martínez",
                "Licencia",
                "2025-01-17"
        );

        System.out.println(solicitud3);
        System.out.println("Estado inicial: " + solicitud3.getEstado().obtenerNombreEstado());

        // Transición 1: Pendiente → Aprobado
        System.out.println("\n--- Transición 1: Pendiente → Aprobado ---");
        solicitud3.aprobar();

        // Intentar operaciones en estado Aprobado
        System.out.println("\nIntentando operaciones en estado APROBADO:");
        solicitud3.procesar();
        solicitud3.rechazar();
        solicitud3.aprobar();

        System.out.println("\n✓ Patrón State implementado correctamente");
        System.out.println("  El comportamiento cambia según el estado actual del objeto");
    }
}