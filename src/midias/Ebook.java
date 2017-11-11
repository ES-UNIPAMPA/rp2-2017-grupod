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
    private String autor;
    private String local;
    private String editora;
    private int numeropaginas;

    public Ebook(String genero, String autor, String local, String editora, int numeropaginas, String caminho, String titulo, String descricao, int ano, int id) {
        super(caminho, titulo, descricao, ano, id);
        this.genero = genero;
        this.autor = autor;
        this.local = local;
        this.editora = editora;
        this.numeropaginas = numeropaginas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
