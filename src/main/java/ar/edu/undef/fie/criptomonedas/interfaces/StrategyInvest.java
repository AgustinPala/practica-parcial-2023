package ar.edu.undef.fie.criptomonedas.interfaces;


import ar.edu.undef.fie.criptomonedas.domain.CriptoCurrency;
import ar.edu.undef.fie.criptomonedas.domain.Investor;

public interface StrategyInvest {
    void downInvest(Investor investor, CriptoCurrency criptoCurrency);
    void highInvest(Investor investor, CriptoCurrency criptoCurrency);
}
