package ar.edu.undef.fie.criptomonedas.interfaces;

import ar.edu.undef.fie.criptomonedas.domain.CriptoCurrency;

public interface CriptoCurrencyObserver {
    void update(CriptoCurrency currency);

}
