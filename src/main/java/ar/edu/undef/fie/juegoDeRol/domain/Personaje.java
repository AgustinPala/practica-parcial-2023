package ar.edu.undef.fie.juegoDeRol.domain;

import ar.edu.undef.fie.juegoDeRol.utils.ListaLimitada;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private int vida;
    private int fuerza;
    private List<Item> inventario;

    public Personaje(int vida, int fuerza) {
        this.vida = vida;
        this.fuerza = fuerza;
        this.inventario = new ListaLimitada<>(8);
    }

    // Getters y Setters

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public List<Item> getInventario() {
        return inventario;
    }

    public void setInventario(List<Item> inventario) {
        this.inventario = inventario;
    }

    public void equipar(Item item) {
        for (Item itemEquipado : inventario) {
            if (itemEquipado.getNombre().equals(item.getNombre())) {
                return;
            }
        }

        item.equipar();
        inventario.add(item);
        System.out.println("Item equipado");
    }

    public void desequipar(Item item) {
        for (Item itemEquipado : inventario) {
            if (itemEquipado.getNombre().equals(item.getNombre())) {
                System.out.println("Se desequipa el item " + item.getNombre());
                inventario.remove(item);
            }
        }
    }

    public void atacar(Personaje oponente) {

        // Si el personaje no tiene vida, no puede atacar
        if (oponente.vida <= 0) {
            System.out.println("El oponente que intenta atacar esta muerto D:");
            return;
        }

        int dano = this.fuerza;

        for (Item item : inventario) {
            if (item instanceof Arma) {
                dano += ((Arma) item).getDano();
            }
        }

        // Realizamos el ataque
        oponente.setVida(oponente.getVida() - dano);
        if (oponente.vida < 0) {
            System.out.println("El oponente ha muerto!");
        }
    }
}
