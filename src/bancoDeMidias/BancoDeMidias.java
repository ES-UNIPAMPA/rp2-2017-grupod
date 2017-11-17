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

    @Override
    public String toString() {
        String dados = null;
        for (int i = 0; i < midias.size(); i++) {
            dados = dados + "\n " + midias.get(i).getTitulo() + "\n";
        }
        return "BancoDeMidias{" + "Filmes Cadastrados: " + dados + '}';
    }

    public BancoDeMidias() {
        this.midias = new ArrayList<Midia>();
    }

    public void setMidias(List<Midia> midias) {
        this.midias = midias;
    }

    public List<Midia> getMidias() {
        return midias;
    }

    @Override
    public Midia cadastrar(Midia midia) {
       
            if (this.midias.add(midia)) {
                return midia;
            }

        return null;
    }

    @Override
    public Midia consultar(String titulo) {
        for (int i = 0; i < midias.size(); i++) {
            if (midias.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return midias.get(i);
            }
        }
        return null;
    }
     public int consultarIndice(String titulo, List<Midia> midias) {
        for (int i = 0; i < midias.size(); i++) {
            if (midias.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return i;
            }
        }
        return -1;
    }

    @Override
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
    public Midia editar(int indice, Midia midia) {
         for (int i = 0; i < midias.size(); i++) {
            if (midias.get(indice).getId() == indice) {
                midias.set(indice, midia);
                return midias.get(indice);
            }
            
        }
        return null;
    }

    @Override
    public Midia consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String exibir(BancoDeMidias colecao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
