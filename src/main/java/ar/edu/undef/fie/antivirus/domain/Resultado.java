package ar.edu.undef.fie.antivirus.domain;

public class Resultado {

    private Integer criticidad;
    private Archivos archivo;

    // Constructor
    public Resultado(Integer criticidad, Archivos archivo) {
        this.criticidad = criticidad;
        this.archivo = archivo;
    }

    // Getters y Setters
    public Integer getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(Integer criticidad) {
        this.criticidad = criticidad;
    }

    public Archivos getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivos archivo) {
        this.archivo = archivo;
    }


}