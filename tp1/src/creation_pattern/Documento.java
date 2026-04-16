package creation_pattern;

// Clase Documento que implementa Prototype
public class Documento implements Prototype {
    private String titulo;
    private String contenido;
    private String autor;
    private String formato; // PDF, DOCX, etc.

    // Constructor
    public Documento(String titulo, String contenido, String autor, String formato) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.formato = formato;
    }

    // Constructor copia (para clone)
    public Documento(Documento original) {
        this.titulo = original.titulo;
        this.contenido = original.contenido;
        this.autor = original.autor;
        this.formato = original.formato;
    }

    // Implementar el método clone del patrón Prototype
    @Override
    public Documento clone() {
        return new Documento(this);
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}