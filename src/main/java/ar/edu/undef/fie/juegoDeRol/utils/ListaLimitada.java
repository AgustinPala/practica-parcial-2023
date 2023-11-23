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