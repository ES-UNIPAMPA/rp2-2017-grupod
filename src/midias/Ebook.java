/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midias;

/**
 *
 * @author Jarom Sambrana
 */
public class Ebook extends Midia {
    private String  genero;
    private String autores;
    private String local;
    private String editora;
    private int numeropaginas;

    public Ebook(String genero, String autores, String local, String editora, int numeropaginas, String caminho, String titulo, String descricao, int ano, int id) {
        super(caminho, titulo, descricao, ano, id);
        this.genero = genero;
        this.autores = autores;
        this.local = local;
        this.editora = editora;
        this.numeropaginas = numeropaginas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    public String getGenero() {
        return genero;
    }

    public String getLocal() {
        return local;
    }

    public String getEditora() {
        return editora;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }
    
    }
