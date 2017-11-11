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
public class SistemaGeral {

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
    @Override
    public String toString() {
        return "SistemaGeral{" + "colecaoDeFilmes=" + colecaoDeFilmes + ", colecaoDeAudioLivros=" + colecaoDeAudioLivros + ", colecaoDePodcasts=" + colecaoDePodcasts + '}';
    }

}
