package ar.edu.undef.fie.juegoDeRol.domain;

public class Arma extends Item {

        private int danoMinimo;
        private int danoMaximo;

        public Arma(String nombre, int danoMinimo, int danoMaximo) {
            super(nombre);
            this.danoMinimo = danoMinimo;
            this.danoMaximo = danoMaximo;
        }

        @Override
        public void aplicarEfecto(Personaje personaje) {
            personaje.setFuerza(personaje.getFuerza() + danoMaximo);
        }

    public Integer getDano() {
        return danoMinimo;
    }
}

