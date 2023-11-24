package ar.edu.undef.fie.archivos.domain;

record  Archivo(String nombre, String contenido, Long tamanio) {}

/*
public class Archivo {

    private String contenido;
    private String nombre;

    public Archivo(String contenido, String nombre) {
        this.contenido = contenido;
        this.nombre = nombre;
    }

    // Por un cuestion de encapsulacion y seguridad. Defino getters y setters

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
*/