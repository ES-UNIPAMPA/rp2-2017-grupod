/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import bancoDeMidias.BancoDeMidias;
import midias.Midia;
import gerenciadores.GerenciadorDoSistema;
import java.util.List;
import midias.AudioLivro;
import midias.Ebook;
import midias.Filme;
import midias.PodCast;

/**
 *
 * @author SABRINA
 */
//Classe que gerencia o conjunto de Listas
public class SistemaGeral implements GerenciadorDoSistema {

    private BancoDeMidias colecaoDeFilmes;
    private BancoDeMidias colecaoDeAudioLivros;
    private BancoDeMidias colecaoDePodcasts;
    private BancoDeMidias colecaoDeEbooks;

    public SistemaGeral() {
        this.colecaoDeFilmes = new BancoDeMidias();
        this.colecaoDeAudioLivros = new BancoDeMidias();
        this.colecaoDePodcasts = new BancoDeMidias();
        this.colecaoDeEbooks = new BancoDeMidias();
//
    }

    public void setColecaoDeFilmes(BancoDeMidias colecaoDeFilmes) {
        this.colecaoDeFilmes = colecaoDeFilmes;
    }

    public void setColecaoDeAudioLivros(BancoDeMidias colecaoDeAudioLivros) {
        this.colecaoDeAudioLivros = colecaoDeAudioLivros;
    }

    public void setColecaoDePodcasts(BancoDeMidias colecaoDePodcasts) {
        this.colecaoDePodcasts = colecaoDePodcasts;
    }

    public BancoDeMidias getColecaoDeFilmes() {
        return colecaoDeFilmes;
    }

    public BancoDeMidias getColecaoDeAudioLivros() {
        return colecaoDeAudioLivros;
    }

    public BancoDeMidias getColecaoDePodcasts() {
        return colecaoDePodcasts;
    }

    @Override
    public String toString() {
        return "SistemaGeral{" + "colecaoDeFilmes=" + colecaoDeFilmes + ", colecaoDeAudioLivros=" + colecaoDeAudioLivros + ", colecaoDePodcasts=" + colecaoDePodcasts + '}';
    }
    @Override
    public Midia cadastrar(Midia midia) {
        
        if (midia instanceof Filme) {
//            this.sistemaAtual = escolherTipoDeMidia(tipo);
            this.colecaoDeFilmes.cadastrar(midia);
        } else if (midia instanceof PodCast) {
            String tipo = "PodCast";
            System.out.println("Cadastrado!");
//            this.sistemaAtual = escolherTipoDeMidia(tipo);
            this.colecaoDePodcasts.getMidias().add(midia);
        } else if (midia instanceof Ebook) {
            String tipo = "Ebook";
//            this.sistemaAtual = escolherTipoDeMidia(tipo);
            this.colecaoDeEbooks.getMidias().add(midia);
        } else if (midia instanceof AudioLivro) {
            String tipo = "AudioLivro";
//            this.sistemaAtual = escolherTipoDeMidia(tipo);
            this.colecaoDeAudioLivros.getMidias().add(midia);
        } else {
            System.out.println("Tipo desconhecido.");}
        return midia;
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
        String info = null;
        for(int i= 0; i<this.colecaoDeFilmes.getMidias().size(); i++){
            info = info + this.colecaoDeFilmes.getMidias().get(i).getTitulo() + "\n" + this.colecaoDeFilmes.getMidias().get(i).getAno() + "\n" ;
        }
        return  info + "\n "+this.colecaoDeFilmes.getMidias().toString() + "\n" ;
    }
    

    @Override
    public void ordenar(List<Midia> midias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the colecaoDeEbooks
     */
    public BancoDeMidias getColecaoDeEbooks() {
        return colecaoDeEbooks;
    }

    /**
     * @param colecaoDeEbooks the colecaoDeEbooks to set
     */
    public void setColecaoDeEbooks(BancoDeMidias colecaoDeEbooks) {
        this.colecaoDeEbooks = colecaoDeEbooks;
    }
}
