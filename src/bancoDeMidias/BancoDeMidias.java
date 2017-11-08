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
        for(int i = 0; i<midias.size() ; i++){
            dados = dados + "\n "+ midias.get(i).getTitulo() + "\n";
        }
        return "BancoDeMidias{" + "Filmes Cadastrados: " + dados +'}';
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
    public boolean cadastrar(Midia midia) {
            if(this.midias.isEmpty()){
                if(this.midias.add(midia)){
                    return true;
                }
            }
            for(int i = 0; i<midias.size(); i++){
                if(this.midias.add(midia)){
                    return true;
                }
            }
        return false;
    }

    @Override
    public Midia consultar(String titulo) {
        for(int i = 0; i< midias.size(); i++){
            if(midias.get(i).getTitulo().equalsIgnoreCase(titulo)){
                return midias.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Midia> exibir() {
        return this.midias;
    }
 
    
}
