package ar.edu.undef.fie.productosFinancieros.domain;

import ar.edu.undef.fie.productosFinancieros.interfaces.ProductoFinanciero;

public class RegaloInstantaneo implements ProductoFinanciero {

    private double valor;

    public RegaloInstantaneo(double valor) {
        this.valor = valor;
    }

    @Override
    public void aplicarEfecto(Billetera billetera){
        billetera.incrementarSaldo(valor);
    }
}
