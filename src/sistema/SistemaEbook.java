/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package sistema;

import bancoDeMidias.Midia;
import gerenciadores.GerenciadorDoSistema;
import java.util.List;
import javax.swing.JOptionPane;
import midias.Ebook;

/**
* @author Jarom Sambrana
*/
//Classe que gerencia os eBooks

public class SistemaEbook extends SistemaGeral implements GerenciadorDoSistema{
   private Ebook ebook;

   public SistemaEbook() {

       super();
   }

}

