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
    private String autor;

    public Podcast(String caminho, String titulo, String descricao, int ano, String idioma, int id, String autor) {
        super(caminho, titulo, descricao, ano, id);
        this.idioma = idioma;
        this.autor = autor;
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
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        String dados = " ID: " + super.getId() + "\n" + " Título: " + super.getTitulo() + "\n Descrição: " + super.getDescricao() + "\n Idioma: " + idioma + "\n Autor: " + autor + "\n Ano: " + super.getAno();
        return dados;
    }

    @Override
    public String toFile() {
        String dados = super.toFile() + idioma +  "\r\n" + autor +  "\r\n";
        return dados;
    }

}
