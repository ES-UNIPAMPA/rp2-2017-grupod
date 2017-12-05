/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midias;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author SABRINA
 */
public abstract class Midia {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    private String caminho;
    private String titulo;
    private String descricao;
    private int ano;
    public static int idGeral = 0;
    private final int id;

    public Midia(String caminho, String titulo, String descricao, int ano, int id) {
        this.caminho = caminho;
        this.titulo = titulo;
        this.descricao = descricao;
        this.ano = ano;
        this.id = id;
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

    public static int atualizaId() {
        return Midia.idGeral++;

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

    public int getIdGeral() {
        return idGeral;
    }

    @Override
    public String toString() {
        return "Midia{" + "caminho=" + caminho + ", titulo=" + titulo + ", descricao=" + descricao + ", ano=" + ano + ", id=" + getId() + '}';
    }

    public String toFile() {
        return getId() + "\r\n" + caminho + "\r\n" + titulo + "\r\n" + ano + "\r\n" + descricao + "\r\n";
    }

    public static int obterIDGeral(String caminhoIDGeral, boolean atualizar) throws Exception {
        int idLido = 0;
        //Leitura
        try {
            FileInputStream inFile;
            BufferedReader buff;

            inFile = new FileInputStream(new File(caminhoIDGeral));
            buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));
            String linha = buff.readLine();
            idLido = Integer.parseInt(linha);

            buff.close();
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        // Gravação 
        idGeral = idLido + 1;
        //Gravar
        if (atualizar) {
            FileWriter arq = new FileWriter(caminhoIDGeral);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(String.valueOf(idGeral));
            arq.close();
        }
        return idGeral;
    }

    public boolean compararAno(Object obj) {
        Midia midia = (Midia) obj;
        if (this.ano >= midia.getAno()) {
            return true;
        }
        return false;
    }

    public boolean compararTitulo(Object obj) {
         Midia filme = (Midia) obj;
        if (this.getTitulo().compareToIgnoreCase(filme.getTitulo()) <= 0) {
            return true;
        }
        return false;
    }
}
