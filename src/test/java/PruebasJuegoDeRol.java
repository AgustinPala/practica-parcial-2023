import ar.edu.undef.fie.juegoDeRol.domain.Arma;
import ar.edu.undef.fie.juegoDeRol.domain.ItemDeDefensa;
import ar.edu.undef.fie.juegoDeRol.domain.Personaje;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebasJuegoDeRol {

    @Test
    public void testCrearPersonaje() {
        Personaje personaje = new Personaje(100, 10);
        assertEquals(100, personaje.getVida());
        assertEquals(10, personaje.getFuerza());
    }

    @Test
    public void testAsignarItems() {
        Personaje personaje = new Personaje(100, 10);

        Arma arma1 = new Arma("Espada", 5, 10);
        Arma arma2 = new Arma("Daga", 1, 2);

        personaje.equipar(arma1);
        personaje.equipar(arma2);

        System.out.println(personaje.getInventario());

        personaje.desequipar(arma1);

        System.out.println(personaje.getInventario());
    }

    @Test
    public void testAtaque() {
        Personaje personaje = new Personaje(100, 10);
        Personaje oponente = new Personaje(10, 0);

        Arma arma1 = new Arma("Espada", 5, 10);
        personaje.equipar(arma1);

        System.out.println(oponente.getVida());
        ItemDeDefensa escudo = new ItemDeDefensa("Escudo", 10);
        oponente.equipar(escudo);
        System.out.println(oponente.getVida());

        personaje.atacar(oponente);

        System.out.println(oponente.getVida());
    }
}