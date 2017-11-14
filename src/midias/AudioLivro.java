/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
66666666666 */
package midias;

import midias.Midia;

/**
 *
 * @author vagne
 */
public class AudioLivro extends Midia {
    private String genero;
    private String idioma;
    private String autores;
    private String local;
    private String editora;
    private int duracao;

    
    public AudioLivro(String caminho, String titulo, String descricao, int ano, int id, String genero, String idioma,
            String autores, String local, String editora, int duracao) {
        super(caminho, titulo, descricao, ano, id);
        this.genero = genero;
        this.idioma = idioma;
        this.autores = autores;
        this.local = local;
        this.editora = editora;
        this.duracao = duracao;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public String toString(){
        return "AudioLivro{" + "genero=" +genero +", idioma=" +idioma +", autores=" +autores +", local=" +local +", editora=" +editora +", duracao=" +duracao;
                }
    
    }

 