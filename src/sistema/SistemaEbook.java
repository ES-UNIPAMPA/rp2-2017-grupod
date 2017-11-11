/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package sistema;

import bancoDeMidias.BancoDeMidias;
import gerenciadores.GerenciadorDoSistema;
import java.util.List;
import midias.Ebook;
import midias.Midia;

/**
 * @author Jarom Sambrana
 */
//Classe que gerencia os eBooks
public class SistemaEbook extends SistemaGeral implements GerenciadorDoSistema {
    
    BancoDeMidias listaEbook;
    String caminho;

    
    Ebook ebook;
  
    public SistemaEbook() {
        super();
    }
      public String getCaminho() {
        return caminho;
    }
    public void setCaminho(String absolutePath) {
        this.caminho = absolutePath;
    }

    @Override
    public Midia consultar(String titulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Midia excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editar(Midia midia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Midia exibir(String titulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ordenar(List<Midia> midias) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Midia cadastrar(Midia midia) {
        this.ebook = (Ebook) midia;
        listaEbook.cadastrar(this.ebook);
        return this.ebook;
    }
}
