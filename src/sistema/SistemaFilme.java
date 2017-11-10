/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import midias.Midia;
import gerenciadores.GerenciadorDoSistema;
import java.util.List;
import javax.swing.JOptionPane;
import midias.Filme;

/**
 *
 * @author SABRINA
 */
//Classe que gerencia os Filmes
public class SistemaFilme extends SistemaGeral implements GerenciadorDoSistema{
    Filme filme;
    public SistemaFilme(){
        super();
    }
    public static void escolherAcao(String acao){
        if(acao.equalsIgnoreCase("cadastrar")){
            String genero = JOptionPane.showInputDialog("Qual o genero do filme?");
            String diretor = JOptionPane.showInputDialog("Qual o diretor do filme?");
            String ator = JOptionPane.showInputDialog("Qual o ator Principal do filme?");
            String duracao = JOptionPane.showInputDialog("Qual o tempo de duracao do filme?");
            int tempo ;
           
            //this.cadastrar();
        }
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
    public Midia excluir(int id) {
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
    public void ordenar(List<Midia> midias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
