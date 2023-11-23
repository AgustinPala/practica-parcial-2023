package ar.edu.undef.fie.productosFinancieros.domain;

import ar.edu.undef.fie.productosFinancieros.interfaces.ProductoFinanciero;

public class RegaloDiferido implements ProductoFinanciero {

    private double valor;
    private int diasVencimiento;

    public RegaloDiferido(double valor, int diasVencimiento) {
        this.valor = valor;
        this.diasVencimiento = diasVencimiento;
    }

    public double getValor() {
        return valor;
    }

    public int getDiasVencimiento() {
        return diasVencimiento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDiasVencimiento(int diasVencimiento) {
        this.diasVencimiento = diasVencimiento;
    }

    @Override
    public void aplicarEfecto(Billetera billetera) {
        double retornoTotal = valor * (1 + ((double) diasVencimiento /365));
        billetera.incrementarSaldo(retornoTotal);
    }


}
