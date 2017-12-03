/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeMidias;

import midias.Midia;
import gerenciadores.GerenciadorBancoDeMidias;
import java.util.ArrayList;
import java.util.List;

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
            if (getMidias().get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return getMidias().get(i);
            }

        }
        for (int i = 0; i < getMidias().size(); i++) {
            if (getMidias().get(i).getTitulo().contains(titulo)) {
                return getMidias().get(i);
            }
        }
        return null;
    }

    @Override
    public Midia consultar(int id) {
        for (int i = 0; i < getMidias().size(); i++) {
            if (getMidias().get(i).getIdGeral() == id) {
                return getMidias().get(i);
            }
        }
        return null;
    }

    public List<Midia> consultarTudo(String midia) {
        List<Midia> midias = new ArrayList<Midia>();
        Midia midiaEncontrada = null;
        if (!midias.isEmpty()) {
            midiaEncontrada = consultar(midia);
            
            midias.add(midiaEncontrada);
            System.out.println(midias.get(0));
            for (int i = 0; i < getMidias().size(); i++) {
                midiaEncontrada = consultar(midia);
                midias.add(midiaEncontrada);
            }
        }
        return midias;
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
    public boolean editar(Midia antiga, Midia novo) {
        for (int i = 0; i < getMidias().size(); i++) {
            if (getMidias().get(i).equals(antiga)) {
                getMidias().set(i, novo);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean editar(int id, Midia novo) {
        for (int i = 0; i < getMidias().size(); i++) {
            if (getMidias().get(i).getId() == (id)) {
                getMidias().set(i, novo);
                return true;
            }
        }
        return false;
    }

    @Override
    public String exibir(List<Midia> midiasRecebidas) {
        String dados = "";
        if (!midiasRecebidas.isEmpty()) {
            dados += midiasRecebidas.get(0).toString() + "\n";
            for (int i = 0; i < midiasRecebidas.size(); i++) {
                dados += midiasRecebidas.get(i).toString() + "\n";
            }
        }
        return dados;
    }

    public void esvaziarLista() {
        this.midias = new ArrayList<>();
    }
}
