package ar.edu.undef.fie.archivos.domain;

// record  ArchivoComprimido(String nombre, String contenido) {}

class ArchivoComprimido {
    private String contenido;
    private String nombre;
    private Long tamanio;

    public ArchivoComprimido(String contenido, String nombre, Long tamanio) {
        this.contenido = contenido;
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

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

    public Long getTamanio() {
        return tamanio;
    }

    public void setTamanio(Long tamanio) {
        this.tamanio = tamanio;
    }
}
