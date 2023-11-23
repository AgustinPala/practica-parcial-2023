package ar.edu.undef.fie.productosFinancieros.domain;

import ar.edu.undef.fie.productosFinancieros.interfaces.ProductoFinanciero;

public class InversionSimple implements ProductoFinanciero {

    private double valor;
    private double retorno;
    private int plazoVencimiento;

    public InversionSimple(double valor, double retorno, int plazoVencimiento) {
        this.valor = valor;
        this.retorno = retorno;
        this.plazoVencimiento = plazoVencimiento;
    }

    //Getters y Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getRetorno() {
        return retorno;
    }

    public void setRetorno(double retorno) {
        this.retorno = retorno;
    }

    public int getDiasVencimiento() {
        return plazoVencimiento;
    }

    public void setDiasVencimiento(int diasVencimiento) {
        this.plazoVencimiento = diasVencimiento;
    }


    @Override
    public void aplicarEfecto(Billetera billetera) {

        // El interes simple se calcula como el capital inicial multiplicado por la tasa de interes y el tiempo expresado en anios
        // 30 dias lo pasamos a anios

        double factorInteres = (1 + 0.10 * ((double) 30/365));
        double retornoTotal = valor * factorInteres;
        billetera.incrementarSaldo(retornoTotal);
    }
}
