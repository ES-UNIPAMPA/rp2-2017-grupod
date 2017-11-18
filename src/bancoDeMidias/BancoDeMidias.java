/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeMidias;

import midias.Midia;
import gerenciadores.GerenciadorBancoDeMidias;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;

/**
 *
 * @author SABRINA
 */
//Classe que Gerencia as Listas Individualmente
public class BancoDeMidias implements GerenciadorBancoDeMidias {

    private List<Midia> midias;

    public BancoDeMidias() {
        this.midias = new ArrayList<>();
    }

    public void setMidias(List<Midia> midias) {
        this.midias = midias;
    }

    public List<Midia> getMidias() {
        return midias;
    }

    @Override
    public boolean cadastrar(Midia midia) {
        return this.midias.add(midia);
    }

    @Override
    public Midia consultar(String titulo) {
        for (int i = 0; i < getMidias().size(); i++) {
            if (getMidias().get(i).getTitulo().equals(titulo)) {
                return getMidias().get(i);
            }
        }
        return null;
    }

    @Override
    public Midia consultar(int id) {
        for (int i = 0; i < getMidias().size(); i++) {
            if (getMidias().get(i).getId() == id) {
                return getMidias().get(i);
            }
        }
        return null;
    }

    @Override
    public boolean excluir(int id) {
        for (int i = 0; i < getMidias().size(); i++) {
            if (getMidias().get(i).getId() == id) {
                getMidias().remove(i);
                return true;
            }
        }
        return false;
    }
    public Midia excluir(String titulo) {
        Midia removida = null;
        for (int i = 0; i < midias.size(); i++) {
            if (midias.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                removida = midias.get(i);
                midias.remove(i);
                return removida;
            }
        }
        return removida;
    }
    @Override
    public boolean editar(int id, Midia novo) {
        for (int i = 0; i < getMidias().size(); i++) {
            if (getMidias().get(i).getId() == id) {
                getMidias().set(i, novo);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Midia> exibir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
