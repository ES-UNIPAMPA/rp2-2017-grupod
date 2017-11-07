/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midias;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author SABRINA
 */
public class Filme extends Midia{
    private String  genero;
    private String  idioma;
    private String  diretor;
    private List<String>    atoresPrincipais;
    private int duracao;
        
    public Filme(String genero, String idioma, String diretor, List<String> atoresPrincipais, int duracao, String caminho, String titulo, String descricao, int ano, int id) {
        super(caminho, titulo, descricao, ano, id);
        this.genero = genero;
        this.idioma = idioma;
        this.diretor = diretor;
        this.atoresPrincipais = atoresPrincipais;
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAtoresPrincipais(List<String> atoresPrincipais) {
        this.atoresPrincipais = atoresPrincipais;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getDiretor() {
        return diretor;
    }

    public List<String> getAtoresPrincipais() {
        return atoresPrincipais;
    }

    public int getDuracao() {
        return duracao;
    }
    
    @Override
    public String toString() {
        return "Filme{" + "genero=" + genero + ", idioma=" + idioma + ", diretor=" + diretor + ", atoresPrincipais=" + atoresPrincipais + ", duracao=" + duracao + '}';
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.genero);
        hash = 19 * hash + Objects.hashCode(this.idioma);
        hash = 19 * hash + Objects.hashCode(this.diretor);
        hash = 19 * hash + Objects.hashCode(this.atoresPrincipais);
        hash = 19 * hash + this.duracao;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//comparar duas listas em outro método
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Filme)) {
            return false;
        }
        final Filme other = (Filme) obj;
        if (this.duracao == other.duracao &&(other.genero == null ||other.genero.equals(this.genero))&&(other.idioma == null||other.idioma.equals(this.idioma))&&(other.diretor == null || other.diretor.equals(this.diretor))&&(other.atoresPrincipais == null||other.atoresPrincipais.equals(this.atoresPrincipais))) {
            return true;
        }else{
            return false;
        }
    }
    public boolean compareTo(Object obj){
        Filme filme = (Filme) obj;
        if(this.duracao >= filme.getDuracao()){
            return true;
        }
        return false;
    }

}
