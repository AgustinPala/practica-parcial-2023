package ar.edu.undef.fie.juegoDeRol.domain;

public abstract class Item {

    private String nombre;
    private boolean equipado;

    public Item(String nombre) {
        this.nombre = nombre;
        this.equipado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEquipado() {
        return equipado;
    }

    public void equipar() {
        this.equipado = true;
    }

    public void desequipar() {
        this.equipado = false;
    }

    public abstract void aplicarEfecto(Personaje personaje);
}
