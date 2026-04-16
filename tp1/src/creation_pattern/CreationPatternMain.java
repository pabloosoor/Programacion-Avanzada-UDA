package creation_pattern;

public class CreationPatternMain {
    public static void main(String[] args) {
        System.out.println("==Patron Prototype== \n");

        //Clonando Empleados
        System.out.println("--Clonando Empleados--");

        //Crear Empleado original
        Empleado empleadoOriginal = new Empleado("Pablo Osorio", "Desarrollador",5000, "IT");
        System.out.println("Empleado Original: " + empleadoOriginal);

        //Clonar el empleado
        Empleado empleadoClonado = empleadoOriginal.clone();
        System.out.println("Empleado Clonado: " + empleadoClonado);

        //Modificar el empleado Clonado
        empleadoClonado .setNombre("Pablo Osorio Zelada");
        empleadoClonado.setSalario(550000);
        empleadoClonado.setPuesto("Desarrollador Senior");

        System.out.println("Despues de la clonacion:");
        System.out.println("Empleado Original: " + empleadoOriginal);
        System.out.println("Empleado Clonado: " + empleadoClonado);


        //Clonando Documentos
        System.out.println("--Clonando Documentos--");

        //Crear documento
        Documento docOriginal = new Documento(
                "Reporte Anual",
                "Contenido del reporte anual...",
                "Pablo OSORIO",
                "PDF"
        );
        System.out.println("Documento Original: " + docOriginal);

        //Clonando el documento
        Documento docClonado = docOriginal.clone();
        System.out.println("Documento Clonado: " + docClonado);

        //Modificar documento clonado
        docClonado.setTitulo("Reporte Anual Modificado");
        docClonado.setFormato("PDF");
        docClonado.setAutor("Veronica Zelada ");

        System.out.println("Despues de la clonacion:");
        System.out.println("Documento Original: " + docOriginal);
        System.out.println("Documento Clonado: " + docClonado);

        //Registro de Prototipos
        System.out.println("--Registro de Prototipos--");

        RegistroPrototipos registroOriginal = new RegistroPrototipos();

        //Gurdar Protipos
        Empleado empleadoPlantilla = new Empleado("Empleado Plantilla", "Puesto Plantilla", 3000, "Departamento Plantilla");
        Documento docPlantilla = new Documento("Documento Plantilla", "Contenido Plantilla", "Autor Plantilla", "DOCX");

        registroOriginal.guardarPrototipo("EmpleadoPlantilla", empleadoPlantilla);
        registroOriginal.guardarPrototipo("DocumentoPlantilla", docPlantilla);

        //Clonar desde registro
        Empleado nuevoEmpleado = (Empleado) registroOriginal.obtenerPrototipo("EmpleadoPlantilla").clone();
        nuevoEmpleado.setNombre("Empleado Plantilla Pablo");

        Documento nuevoDoc = (Documento) registroOriginal.obtenerPrototipo("DocumentoPlantilla").clone();
        nuevoDoc.setTitulo("Documento Plantilla Pablo");

        System.out.println("Nuevo Empleado desde registro: " + nuevoEmpleado);
        System.out.println("Nuevo Documento desde registro: " + nuevoDoc);

    }
}
