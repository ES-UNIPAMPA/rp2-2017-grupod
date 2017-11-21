/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midias;

import java.util.Objects;

/**
 *
 * @author SABRINA
 */
public abstract class  Midia {
    private String caminho;
    private String titulo;
    private String descricao;
    private int ano;
    private static int id;
    @Deprecated
    public Midia(String caminho, String titulo, String descricao, int ano, int id) {
        this.caminho = caminho;
        this.titulo = titulo;
        this.descricao = descricao;
        this.ano = ano;
        Midia.id = id;
    }
    public Midia(String caminho, String titulo, String descricao, int ano) {
        this.caminho = caminho;
        this.titulo = titulo;
        this.descricao = descricao;
        this.ano = ano;
        Midia.id += 0;
    }
    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaminho() {
        return caminho;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAno() {
        return ano;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Midia{" + "caminho=" + caminho + ", titulo=" + titulo + ", descricao=" + descricao + ", ano=" + ano + ", id=" + getId() + '}';
    }
     public String toFile(){
        return id + "\r\n"+caminho + "\r\n" + titulo + "\r\n" +  ano + "\r\n" +descricao+ "\r\n" ;
    }
     public boolean compareTo(Object obj){
        Midia midia = (Midia) obj;
        if(this.ano >= midia.getAno()){
            return true;
        }
        return false;
    }
}
