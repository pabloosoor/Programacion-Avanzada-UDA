package creation_pattern;

public class Empleado implements Prototype {
    private String nombre;
    private String puesto;
    private double salario;
    private String departamento;

    public Empleado(String nombre, String puesto, double salario, String departamento) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.departamento = departamento;
    }
    //Constructor de copia
    public Empleado(Empleado original) {
        this.nombre = original.nombre;
        this.puesto = original.puesto;
        this.salario = original.salario;
        this.departamento = original.departamento;
    }
    //Implementacion Metodo Clon, Patron Prototype
    @Override
    public Empleado clone(){
        return new Empleado(this);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }

}

