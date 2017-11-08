/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import bancoDeMidias.BancoDeMidias;
import midias.Midia;
import gerenciadores.GerenciadorDoSistema;
import java.util.ArrayList;
import java.util.List;
import midias.Filme;

/**
 *
 * @author SABRINA
 */
//Classe que gerencia os Filmes
public class SistemaFilme extends SistemaGeral implements GerenciadorDoSistema{
    private Filme filme;
    private String caminho;
    private List<String> atores;

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getCaminho() {
        return caminho;
    }
    public SistemaFilme(){
        super();
        this.filme = null;
        this.caminho = null;
        this.atores = new ArrayList<String>();
    }
   public boolean adcionarAtores(String nome){
       if(this.atores.isEmpty()){
             if(nome != null && nome != "" && this.atores.add(nome)){
                //filme.setAtoresPrincipais(atores);
                return true;
            }
        }
        for(int i = 0; i<this.atores.size(); i++){
                 if(nome != null && nome != "" && this.atores.add(nome)){
                    //filme.setAtoresPrincipais(atores);
                    return true;
                 }
        }
       return false;
   }
    @Override
    public Midia cadastrar(Midia midia) {
        Filme atual = (Filme) midia;
        this.filme = new Filme(atual.getGenero(), atual.getIdioma(), atual.getDiretor(),atual.getAtoresPrincipais(), atual.getDuracao(), atual.getCaminho(), atual.getTitulo(), atual.getDescricao(), atual.getAno(), atual.getId());
        return this.filme;
    }

    @Override
    public Midia consultar(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Midia excluir(Midia midia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Midia midia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Midia exibir(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String exibir(BancoDeMidias colecao){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void ordenar(List<Midia> midias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
