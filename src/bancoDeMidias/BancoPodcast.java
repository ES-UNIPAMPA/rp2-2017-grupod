/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeMidias;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import javax.swing.JTable;
import midias.Midia;
import midias.Podcast;

/**
 *
 * @author vagne
 */
public class BancoPodcast extends BancoDeMidias {

    public BancoPodcast() {
        super();
    }

    public boolean ordenar() {
        return false;
    }

    public void gravar(String bancoPodcasts) throws Exception {
        /**
         * Abre o arquivo para escrita
         */
        FileOutputStream outFile = new FileOutputStream(new File(bancoPodcasts));
        BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

        buff.write(getTamanhoLista() + "\r\n");
        for (Midia midia : super.getMidias()) {
            buff.write(midia.toFile() + "\r\n");

            /**
             * Fecha o arquivo
             */
            buff.close();
            outFile.close();
        }
    }

    public void ler(String podcast) throws Exception {
        FileInputStream inFile;
        BufferedReader buff;
        Podcast podcastArquivo;
        String linha, caminho, titulo, descricao, idioma, autor;
        int ano, id;

        /**
         * Abre o arquivo para leitura
         */
        inFile = new FileInputStream(new File(podcast));
        buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));

        linha = buff.readLine();
        int numeroDePodcasts = Integer.parseInt(linha);

        for (int i = 0; i < numeroDePodcasts; i++) {

            linha = buff.readLine();
            id = Integer.parseInt(linha);
            titulo = buff.readLine();
            descricao = buff.readLine();
            idioma = buff.readLine();
            autor = buff.readLine();
            ano = Integer.parseInt(linha);
            caminho = buff.readLine();

            podcastArquivo = new Podcast(caminho, titulo, descricao, ano, idioma, id, autor);
            this.cadastrar(podcastArquivo);

            buff.readLine();

            /**
             * Fecha o arquivo para leitura
             */
            buff.close();
            inFile.close();
        }
    }

    public JTable atualizaTabela(List<Midia> midiaPodcast, JTable tabela) {

        String matriz[][] = new String[midiaPodcast.size()][7];
        for (int i = 0; i < midiaPodcast.size(); i++) {
            Podcast podcast = (Podcast) midiaPodcast.get(i);
            matriz[i][0] = String.valueOf(podcast.getId());
            matriz[i][1] = String.valueOf(podcast.getTitulo());
            matriz[i][2] = String.valueOf(podcast.getDescricao());
            matriz[i][3] = String.valueOf(podcast.getIdioma());
            matriz[i][4] = String.valueOf(podcast.getAutores());
            matriz[i][5] = String.valueOf(podcast.getAno());
            matriz[i][6] = String.valueOf(podcast.getCaminho());
        }
        tabela.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Título", "Descrição", "Idioma", "Autores", "Ano", "Caminho"
                }
        ));
        return tabela;
    }

    public int getTamanhoLista() {
        return this.getMidias().size();
    }

}
