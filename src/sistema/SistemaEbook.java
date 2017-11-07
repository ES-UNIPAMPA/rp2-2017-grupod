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

public class SistemaEbook extends SistemaGeral implements GerenciadorDoSistema {
   private Ebook ebook;

   public SistemaEbook() {

       super();
   }
   public static void escolherAcao(String acao) {
       if (acao.equalsIgnoreCase ("cadastrar")) {
           String genero = JOptionPane.showInputDialog("Qual o gênero do livro?");
           String escritor = JOptionPane.showInputDialog("Qual o nome do escritor?");

       }
   }

   @Override
   public Midia cadastrar(Midia midia) {

   }

   @Override
   public Midia consultar(String titulo) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public Midia excluir(Midia midia) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public void editar(Midia midia) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public Midia exibir(String titulo) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public void ordenar(List<Midia> midias) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

}

