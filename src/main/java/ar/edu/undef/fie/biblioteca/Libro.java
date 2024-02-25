package ar.edu.undef.fie.biblioteca;

// Crear una clase Libro con atributos como idLibro, titulo, autor y cantidadDisponible.

public class Libro {

    private int idLibro;
    private String titulo;
    private String autor;
    private int cantidadDisponible;

    public Libro(int idLibro, String titulo, String autor, int cantidadDisponible) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "idLibro=" + idLibro + '\n' +
                "titulo=" + titulo + '\n' +
                "autor=" + autor + '\n' +
                "cantidadDisponible=" + cantidadDisponible;
    }
}