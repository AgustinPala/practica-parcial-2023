package ar.edu.undef.fie.juegoDeRol.domain;

public class ItemDeDefensa extends Item {

    private int aumentoDeVida;

    public ItemDeDefensa(String nombre, int aumentoDeVida) {
        super(nombre);
        this.aumentoDeVida = aumentoDeVida;
    }

    @Override
    public void aplicarEfecto(Personaje personaje) {
        personaje.setVida(personaje.getVida() + aumentoDeVida);
    }
}