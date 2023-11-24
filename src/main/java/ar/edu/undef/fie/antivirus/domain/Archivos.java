package ar.edu.undef.fie.antivirus.domain;

public class Archivos {

    private String nombre;

    public Archivos(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

// record  Archivo(String nombre, String contenido, Long tamanio) {}
