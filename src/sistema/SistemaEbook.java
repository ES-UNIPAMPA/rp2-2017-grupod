/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package sistema;

import gerenciadores.GerenciadorDoSistema;
import java.util.List;
import midias.Ebook;
import midias.Midia;

/**
* @author Jarom Sambrana
*/
//Classe que gerencia os eBooks

public class SistemaEbook extends SistemaGeral implements GerenciadorDoSistema {
    private Ebook ebook;
    
    public SistemaEbook() {
        super();
        }
    
    @Override
    public Midia consultar(String titulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
        
}