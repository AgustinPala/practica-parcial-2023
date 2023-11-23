package ar.edu.undef.fie.productosFinancieros.utils;

import ar.edu.undef.fie.productosFinancieros.domain.Usuario;
import ar.edu.undef.fie.productosFinancieros.interfaces.ProductoFinanciero;

import java.util.ArrayList;
import java.util.List;
public class Sistema {

    private List<Usuario> usuarios;

    public Sistema() {
        usuarios = new ArrayList<Usuario>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }


    public void simularPasoDias(int dias) {
        for (int i = 0; i < dias; i++) {
            for (Usuario usuario : usuarios) {
                for (ProductoFinanciero prod : usuario.billetera.getHistorial()) {
                    prod.aplicarEfecto(usuario.billetera);
                }
            }
        }
    }
}

