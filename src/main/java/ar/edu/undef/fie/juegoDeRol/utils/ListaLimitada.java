package ar.edu.undef.fie.juegoDeRol.utils;

import java.util.ArrayList;

public class ListaLimitada<E> extends ArrayList<E> {
    private final int maxSize;

    public ListaLimitada(int size) {
        super();
        this.maxSize = size;
    }

    @Override
    public boolean add(E elemento) {           //Sobreescribo el metodo add
        boolean added = super.add(elemento);
        while (size() > maxSize) {
            remove(0); // Remove elements from the beginning if size exceeds maxSize
        }
        return added;
    }
}

/* Diccionario Limitado

public class Diccionario {

    private List<String> claves;
    private List<Object> valores;

    public Diccionario() {
        claves = new ArrayList<>();
        valores = new ArrayList<>();
    }

    public void agregar(String clave, Object valor) {
        if (claves.size() == 8) {
            claves.remove(0);
            valores.remove(0);
        }

        claves.add(clave);
        valores.add(valor);
        if (claves.size() > 8) {
            claves.remove(0);
            valores.remove(0);
        }
    }

    public Object get(String clave) {
        for (int i = 0; i < claves.size(); i++) {
            if (claves.get(i).equals(clave)) {
                return valores.get(i);
            }
        }
        return null;
    }
}
 */