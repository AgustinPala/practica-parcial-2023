package ar.edu.undef.fie.juegoDeRol.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Arma extends Item {

    private final int danoMinimo;
    private final int danoMaximo;

    public Arma(String nombre, int danoMinimo, int danoMaximo) {
        super(nombre);
        this.danoMinimo = danoMinimo;
        this.danoMaximo = danoMaximo;
    }

    public Integer getDano() {
        return ThreadLocalRandom.current().nextInt(danoMinimo, danoMaximo + 1); // el +1 es para sumar el limite superior
    }
}

