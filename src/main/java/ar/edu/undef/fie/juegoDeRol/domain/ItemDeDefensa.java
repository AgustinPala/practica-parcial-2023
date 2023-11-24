package ar.edu.undef.fie.juegoDeRol.domain;

public class ItemDeDefensa extends Item {

    private final int aumentoDeVida;

    public ItemDeDefensa(String nombre, int aumentoDeVida) {
        super(nombre);
        this.aumentoDeVida = aumentoDeVida;
    }

    public int obtenerAumentoVida() {
        return aumentoDeVida;
    }
}