/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeMidias;

import bancoDeMidias.BancoDeMidias;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import midias.Midia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import midias.Filme;
import midias.Podcast;

/**
 *
 * @author SABRINA
 */
//Classe que gerencia os Filmes
public class BancoDeFilmes extends BancoDeMidias {

    private String caminho;
    private List<String> atores;

    public BancoDeFilmes() {
        super();
        this.atores = new ArrayList<String>();
        this.caminho = null;
        this.atores = new ArrayList<String>();
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getCaminho() {
        return caminho;
    }

    public boolean removerAtores(String nome) {
        if (this.atores.remove(nome)) {
            return true;
        }
        return false;
    }

    public boolean adcionarAtores(String nome) {//Arrumar este método depois

        if (nome != null && nome != "" && this.atores.add(nome)) {

            return true;
        }

        return false;
    }

    public int getTamanhoLista() {
        return this.getMidias().size();
    }

    public void gravar(String bancoFilme) throws Exception {
        /**
         * Abre o arquivo para escrita
         */
        FileOutputStream outFile = new FileOutputStream(new File(bancoFilme));
        BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

        buff.write(getTamanhoLista() + "\n");
        for (Midia midia : super.getMidias()) {
            Filme filme = (Filme) midia;
            buff.write(getTamanhoLista() + "\n" + filme.toString());
            buff.write("\n");
            /**
             * Fecha o arquivo
             */
            buff.close();
            outFile.close();

        }
    }

    public void ler(String filme) throws Exception {
        FileInputStream inFile;
        BufferedReader buff;
        Filme filmeArquivo;
        String linha, caminho, titulo, descricao, idioma, genero, diretor;
        int ano, id, duracao;
        List<String> atoresPrincipais = new ArrayList<String>();

        /**
         * Abre o arquivo para leitura
         */
        inFile = new FileInputStream(new File(filme));
        buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));

        linha = buff.readLine();
        int numeroDeFilmes = Integer.parseInt(linha);
        
        for (int i = 0; i < numeroDeFilmes; i++) {

            linha = buff.readLine();
            id = Integer.parseInt(linha);

            caminho = buff.readLine();
            
            titulo = buff.readLine();

            linha = buff.readLine();
            ano = Integer.parseInt(linha);

            descricao = buff.readLine();

            genero = buff.readLine();

            idioma = buff.readLine();

            diretor = buff.readLine();
            
            linha = buff.readLine();
            int numeroAtores = Integer.parseInt(linha);
            for(int j = 0; j< numeroAtores; j++){//pegar tamanho da lista de atores
                atoresPrincipais.set(j, buff.readLine());
            }
            
            linha = buff.readLine();
            duracao = Integer.parseInt(linha);
            
            filmeArquivo = new Filme(genero, idioma, diretor, atoresPrincipais, duracao, caminho, titulo, descricao, ano, 0);

            this.cadastrar(filmeArquivo);

            buff.readLine();
        } 
        buff.close();
        inFile.close();
    

}

public JTable atualizaTabela(List<Midia> bancoFilme, JTable tabela) {

        String matriz[][] = new String[bancoFilme.size()][10];
        for (int i = 0; i < bancoFilme.size(); i++) {
            Filme filme = (Filme) bancoFilme.get(i);
            matriz[i][0] = String.valueOf(filme.getId());
            matriz[i][1] = String.valueOf(filme.getTitulo());
            matriz[i][2] = String.valueOf(filme.getDescricao());
            matriz[i][3] = String.valueOf(filme.getIdioma());
            matriz[i][4] = String.valueOf(filme.getGenero());
            matriz[i][5] = String.valueOf(filme.getAno());
            matriz[i][6] = String.valueOf(filme.getCaminho());
            matriz[i][7] = String.valueOf(filme.getDiretor());
            matriz[i][8] = String.valueOf(filme.getDuracao());
            matriz[i][9] = String.valueOf(filme.getAtoresPrincipais());
        }
        tabela.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Título", "Descrição", "Idioma", "Gênero", "Ano", "Caminho", "Diretor", "Duração", "Atores Principais"
                }
        ));
        return tabela;
    }

}
