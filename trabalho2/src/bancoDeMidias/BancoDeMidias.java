/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeMidias;

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
        for(int i = 0; i< midias.size(); i++){
            
        }
        this.midias.add(midia);
        return false;
    }

    @Override
    public Midia consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
