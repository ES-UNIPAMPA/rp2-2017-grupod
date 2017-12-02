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

    public List<Midia> ordenar(BancoPodcast bancoPodcast) {
        boolean houveTroca;
        List<Midia> midias = bancoPodcast.getMidias();
        do {
            /* quando começamos a avaliar o vetor, não há trocas */
            houveTroca = false;
            /* percorre toda a lista de podcasts */
            for (int i = 0; i < bancoPodcast.getTamanhoLista()-1; i++) {

                Podcast podcast1 = (Podcast) midias.get(i);
                Podcast podcast2 = (Podcast) midias.get(i + 1);
                if (podcast1.compareTo(podcast2)) { // True = Trocar
                    midias.set(i, podcast2);
                    midias.set(i + 1, podcast1);
                    bancoPodcast.setMidias(midias);
                    houveTroca = true;
                }
            }
        } while (houveTroca);
        return midias;
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
        }
        /**
         * Fecha o arquivo
         */
        buff.close();
        outFile.close();
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

            caminho = buff.readLine();

            titulo = buff.readLine();

            linha = buff.readLine();
            ano = Integer.parseInt(linha);

            descricao = buff.readLine();

            idioma = buff.readLine();

            autor = buff.readLine();

            buff.readLine();

            podcastArquivo = new Podcast(caminho, titulo, descricao, ano, idioma, id, autor);
            this.cadastrar(podcastArquivo);
        }
        /**
         * Fecha o arquivo para leitura
         */
        buff.close();
        inFile.close();
    }

    public JTable atualizaTabela(List<Midia> midiaPodcast, JTable tabela) {

        String matriz[][] = new String[midiaPodcast.size()][7];
        for (int i = 0; i < midiaPodcast.size(); i++) {
            Podcast podcast = (Podcast) midiaPodcast.get(i);
            matriz[i][0] = String.valueOf(podcast.getId());
            matriz[i][1] = String.valueOf(podcast.getTitulo());
            matriz[i][2] = String.valueOf(podcast.getDescricao());
            matriz[i][3] = String.valueOf(podcast.getIdioma());
            matriz[i][4] = String.valueOf(podcast.getAutor());
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
