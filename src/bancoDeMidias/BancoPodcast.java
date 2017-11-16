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
import viewBancoDeMidias.ViewPodcast;

/**
 *
 * @author vagne
 */
public class BancoPodcast extends BancoDeMidias {
    
    public BancoPodcast() {
    }

    public boolean ordenar() {
        return false;
    }

    public void gravar (String podcast) throws Exception {
        /** Abre o arquivo para escrita */
        FileOutputStream outFile = new FileOutputStream(new File(podcast));
        BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));
        
        // buff.write();  
        
        /** Deixa uma linha em branca */
        buff.write("\n");
        /** Fecha o arquivo */
        buff.close(); outFile.close();

    }
    
    public void ler (String podcast) throws Exception {
        FileInputStream inFile;
        BufferedReader buff;
        Podcast podcastArquivo;
        String linha, caminho, titulo, descricao, idioma, autores;
        int ano, id;
        
        /** Abre o arquivo para leitura */
        inFile = new FileInputStream(new File(podcast));
        buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));
        
        // for(int i=0; i < bancoPodcast; i++){ }
   
        /* Lê o ID */
        linha = buff.readLine();
        id = Integer.parseInt(linha);
        
        /* Lê o título */
        titulo = buff.readLine();  
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

}
