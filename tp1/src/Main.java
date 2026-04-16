import behavior_pattern.BehaviorPatternMain;
import creation_pattern.CreationPatternMain;
import structure_pattern.StructurePatternMain;

public class Main {
    public static void main(String[] args) {
        System.out.println("   PROGRAMA PRINCIPAL - PATRONES DE DISEÑO (Design Patterns)");

        if (args.length > 0) {
            String patron = args[0].toLowerCase();
            switch (patron) {
                case "behavior":
                case "state":
                    System.out.println("\nPatrón de Comportamiento)\n");
                    BehaviorPatternMain.main(args);
                    break;
                case "creation":
                case "prototype":
                    System.out.println("\nPatrón de Creación\n");
                    CreationPatternMain.main(args);
                    break;
                case "structure":
                case "proxy":
                    System.out.println("\n Patrón Estructural \n");
                    StructurePatternMain.main(args);
                    break;
                case "all":
                    ejecutarTodos();
                    break;
                default:
                    mostrarAyuda();
            }
        } else {
            mostrarAyuda();
        }
    }

    private static void ejecutarTodos() {
        System.out.println("\n Corriendo todos los patrones \n");

        System.out.println("\n------- 1.Patron de Comportamiento -------");
        BehaviorPatternMain.main(new String[]{});

        System.out.println("\n\n------- 2.Patron de Creacion -------");
        CreationPatternMain.main(new String[]{});

        System.out.println("\n\n------- 3.Patron de Estructura -------");
        StructurePatternMain.main(new String[]{});

        System.out.println("                  Fin de la ejecucion");

    }

    private static void mostrarAyuda() {
        System.out.println("                      OPCIONES DE EJECUCION");
        System.out.println("Opciones disponibles:");
        System.out.println("  behavior, state     -> Ejecutar Patron State");
        System.out.println("  creation, prototype -> Ejecutar Patron Prototype");
        System.out.println("  structure, proxy    -> Ejecutar Patron Proxy");
        System.out.println("  all                 -> Ejecutar todos los patrones");

    }
}
