/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midias;

/**
 *
 * @author vagne
 */
public class Podcast extends Midia {

    private String idioma;
    private String autores;

    public Podcast(String caminho, String titulo, String descricao, int ano, String idioma, int id, String autores) {
        super(caminho, titulo, descricao, ano, id);
        this.idioma = idioma;
        this.autores = autores;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the autores
     */
    public String getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }
    //fazer TO STRING
    
}