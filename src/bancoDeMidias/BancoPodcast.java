/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeMidias;

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
    }

    public boolean ordenar() {
        return false;
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
