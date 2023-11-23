import ar.edu.undef.fie.juegoDeRol.domain.Arma;
import ar.edu.undef.fie.juegoDeRol.domain.Personaje;
import ar.edu.undef.fie.productosFinancieros.domain.*;
import ar.edu.undef.fie.productosFinancieros.interfaces.ProductoFinanciero;
import ar.edu.undef.fie.productosFinancieros.utils.Sistema;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoFinancieroTest {

    @Test
    @DisplayName("El producto financiero debe poder comprar un producto")
    void test(){

        Billetera billetera = new Billetera();
        Usuario user = new Usuario(billetera);

        RegaloInstantaneo regaloInstantaneo = new RegaloInstantaneo(100);
        RegaloDiferido regaloDiferido = new RegaloDiferido(100, 30);
        InversionSimple inversionSimple = new InversionSimple(100, 10, 30);

        user.billetera.realizarCompra(regaloDiferido);
        user.billetera.realizarCompra(regaloInstantaneo);
        user.billetera.realizarCompra(inversionSimple);

        Sistema test = new Sistema();
        test.agregarUsuario(user);

        test.simularPasoDias(2);
    }
}
