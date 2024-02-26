package ar.edu.undef.fie.remiseria;

public class Remis {
    private String patente;
    private String marca;
    private String modelo;
    private int kilometraje;
    private boolean disponible; // true si está disponible, false si está en el taller

    public Remis(String patente, String marca, String modelo, int kilometraje) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.disponible = true;
    }

    public boolean necesitaServicio() {
        return this.kilometraje >= 15000;
    }

    public void realizarServicio() {
        this.kilometraje = 0;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
