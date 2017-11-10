/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import bancoDeMidias.BancoDeMidias;
import midias.Midia;
import gerenciadores.GerenciadorDoSistema;
import java.util.List;
import midias.AudioLivro;
import midias.Ebook;
import midias.Filme;
import midias.Podcast;

/*
 *
 * @author SABRINA
 */
//Classe que gerencia o conjunto de Listas
public class SistemaPodcast implements GerenciadorDoSistema {

    private BancoDeMidias colecaoDePodcasts;

    public SistemaPodcast() {

        this.colecaoDePodcasts = new BancoDeMidias();
    }

    public static void main(String[] args) {
    }

    public void setColecaoDePodcasts(BancoDeMidias colecaoDePodcasts) {
        this.colecaoDePodcasts = colecaoDePodcasts;
    }

    public BancoDeMidias getColecaoDePodcasts() {
        return colecaoDePodcasts;
    }

    @Override
    public Midia cadastrar(Midia midia) {
        if (midia instanceof Podcast) {
            String tipo = "PodCast";
            this.colecaoDePodcasts.cadastrar(midia);
        }
        return midia;
    }

    @Override
    public Midia consultar(String titulo
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Midia excluir(int id
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Midia midia
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Midia exibir(String titulo
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ordenar(List<Midia> midias
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
