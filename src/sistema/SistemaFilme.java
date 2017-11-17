/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import bancoDeMidias.BancoDeMidias;
import gerenciadores.GerenciadorBancoDeMidias;
import midias.Midia;
import java.util.ArrayList;
import java.util.List;
import midias.Filme;

/**
 *
 * @author SABRINA
 */
//Classe que gerencia os Filmes
public class SistemaFilme extends SistemaGeral implements GerenciadorBancoDeMidias {

    private Filme filme;
    private String caminho;
    private List<String> atores;
    private BancoDeMidias filmes;

    public SistemaFilme(BancoDeMidias filmes) {
        this.filmes = filmes;
        this.atores = new ArrayList<String>();
    }

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

    public SistemaFilme() {
        super();
        this.filme = null;
        this.caminho = null;
        this.atores = new ArrayList<String>();
    }

    public boolean adcionarAtores(String nome) {//Arrumar este método depois


            if (nome != null && nome != "" && this.atores.add(nome)) {

                return true;
            }
        
        return false;
    }

    @Override
    public Midia cadastrar(Midia midia) {
        this.filme = (Filme) midia;
        filmes.cadastrar(filme);
        return this.filme;
    }

    @Override
    public Midia consultar(String titulo) {
        Midia midia = filmes.consultar(titulo);
        return midia;
    }

    @Override
    public Midia excluir(String titulo) {
        Midia excluida = this.filmes.excluir(titulo);
        return excluida;
    }

    @Override
    public Midia editar(int id,Midia midia) {

        for (int i = 0; i < filmes.getMidias().size(); i++) {
            if (filmes.getMidias().get(i).equals(midia)) {
                filmes.getMidias().set(i, this.filme);
                return filmes.getMidias().get(i);
            }
        }
        return null;
    }

    public Midia substituir(int index, String genero, String idioma, String diretor, List<String> atoresPrincipais, int duracao, String caminho, String titulo, String descricao, int ano) {
        this.filme = (Filme)filmes.getMidias().get(index);
        filme.setDiretor(diretor);
        filme.setIdioma(idioma);
        filme.setAtoresPrincipais(atoresPrincipais);//Fazer um método para isto
        filme.setGenero(genero);
        filme.setDuracao(duracao);
        filmes.editar(index, filme);
        return filme;
    }

    @Override
    public String exibir(BancoDeMidias colecao) {

        String info = this.filmes.getMidias().get(0).getTitulo() + "\n" + this.filmes.getMidias().get(0).getAno() + "\n";

        for (int i = 1; i < this.filmes.getMidias().size(); i++) {
            info = info + this.filmes.getMidias().get(i).getTitulo() + "\n" + this.filmes.getMidias().get(i).getAno() + "\n";
        }
        return this.filmes.getMidias().size() + "\n " + this.filmes.getMidias().toString() + "\n";
    }
 
    @Override
    public Midia consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTamanhoLista(){
        return filmes.getMidias().size();
    }

   

}
