/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewBancoDeMidias;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import midias.Midia;
import midias.Podcast;
import bancoDeMidias.BancoDeMidias;
import bancoDeMidias.BancoPodcast;

/**
 *
 * @author vagne
 */
public class ViewPodcast extends javax.swing.JFrame {

    private BancoPodcast bancoPodcast;

    /**
     * Creates new form cadastrarPodCast
     *
     * @param bancoPodcast
     */
    // precisa ter uma classe pra cada um, depois uma com cada lista, depois uma que junta tudo +- isso
    // Receber podcast em vez de bancoPodcast (preciso trabalhar só com podcast, sem ter opção de outras coleções
    public ViewPodcast(BancoPodcast bancoPodcast) {
        this.bancoPodcast = bancoPodcast;
        /**
         * LER DO ARQUIVO
         */
        initComponents();
        campoId.setText(String.valueOf(bancoPodcast.getMidias().size() + 1));
        tabelaPodCast.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JTable target = (JTable) e.getSource();
                int row = target.getSelectedRow();

                String id = String.valueOf(target.getValueAt(row, 0));
                String titulo = String.valueOf(target.getValueAt(row, 1));
                String descricao = String.valueOf(target.getValueAt(row, 2));
                String idioma = String.valueOf(target.getValueAt(row, 3));
                String autor = String.valueOf(target.getValueAt(row, 4));
                String ano = String.valueOf(target.getValueAt(row, 5));
                String caminho = String.valueOf(target.getValueAt(row, 6));

                campoId.setText(id);
                campoTitulo.setText(titulo);
                campoDescricao.setText(descricao);
                campoIdioma.setText(idioma);
                campoAutor.setText(autor);
                campoAno.setText(ano);
                campoCaminho.setText(caminho);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoAutor = new javax.swing.JTextField();
        campoTitulo = new javax.swing.JTextField();
        campoDescricao = new javax.swing.JTextField();
        campoIdioma = new javax.swing.JTextField();
        campoId = new javax.swing.JTextField();
        campoAno = new javax.swing.JTextField();
        botaoCadastrarPodCast = new javax.swing.JButton();
        botaoSairPodCast = new javax.swing.JButton();
        campoCaminho = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botaoBuscar = new javax.swing.JButton();
        campoBusca = new javax.swing.JTextField();
        botaoSalvarAlteracoes = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPodCast = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Idioma:");

        jLabel2.setText("Autor:");

        jLabel3.setText("ID:");

        jLabel4.setText("Título:");

        jLabel5.setText("Descrição:");

        jLabel6.setText("Ano:");

        campoId.setEditable(false);

        botaoCadastrarPodCast.setText("Cadastrar");
        botaoCadastrarPodCast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarPodCastActionPerformed(evt);
            }
        });

        botaoSairPodCast.setText("Sair");
        botaoSairPodCast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairPodCastActionPerformed(evt);
            }
        });

        jLabel7.setText("Caminho:");

        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        campoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscaActionPerformed(evt);
            }
        });

        botaoSalvarAlteracoes.setText("Salvar Alterações");
        botaoSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarAlteracoesActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        tabelaPodCast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaPodCast);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(campoBusca))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23))
                                            .addComponent(botaoCadastrarPodCast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botaoSalvarAlteracoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botaoExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botaoSairPodCast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoBuscar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(botaoCadastrarPodCast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSalvarAlteracoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSairPodCast))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarPodCastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarPodCastActionPerformed
        campoId.setText(String.valueOf(bancoPodcast.getMidias().size() + 1));
// dentro da midia ter um geral estático
        Podcast p;
        p = new Podcast(campoCaminho.getText(),
                campoTitulo.getText(),
                campoDescricao.getText(),
                Integer.valueOf(campoAno.getText()),
                campoIdioma.getText(),
                Integer.valueOf(campoId.getText()),
                campoAutor.getText()
        );
        getBancoDeMidias().cadastrar(p);

        bancoPodcast.atualizaTabela(bancoPodcast.getMidias(), tabelaPodCast);
    }//GEN-LAST:event_botaoCadastrarPodCastActionPerformed

    private void botaoSairPodCastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairPodCastActionPerformed

        JFrame frame = new JFrame();
        frame.setVisible(true);
        dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_botaoSairPodCastActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        bancoPodcast.excluir(Integer.valueOf(campoId.getText()));
        bancoPodcast.atualizaTabela(bancoPodcast.getMidias(), tabelaPodCast);
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        Podcast podcast;
        try {
            podcast = (Podcast) bancoPodcast.consultar(Integer.valueOf(campoBusca.getText()));
            exibir(podcast);
        } catch (Exception ex) {
            podcast = (Podcast) bancoPodcast.consultar(campoBusca.getText());
            try {
                exibir(podcast);
            } catch (NullPointerException e) {
                limpar();
                JOptionPane.showMessageDialog(null, "Não foi possível localizar o item. Tente novamente. ", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void campoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscaActionPerformed

    private void botaoSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarAlteracoesActionPerformed
        Podcast s;
        s = new Podcast(campoCaminho.getText(),
                campoTitulo.getText(),
                campoDescricao.getText(),
                Integer.valueOf(campoAno.getText()),
                campoIdioma.getText(),
                Integer.valueOf(campoId.getText()),
                campoAutor.getText()
        );
        bancoPodcast.editar(Integer.valueOf(campoId.getText()), s);
        bancoPodcast.atualizaTabela(bancoPodcast.getMidias(), tabelaPodCast);
    }//GEN-LAST:event_botaoSalvarAlteracoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoCadastrarPodCast;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoSairPodCast;
    private javax.swing.JButton botaoSalvarAlteracoes;
    private javax.swing.JTextField campoAno;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JTextField campoCaminho;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoIdioma;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaPodCast;
    // End of variables declaration//GEN-END:variables

    public BancoDeMidias getBancoDeMidias() {
        return bancoPodcast;
    }

    /**
     * @param bancoPodcast the bancoPodcast to set
     */
    public void setBancoDeMidias(BancoPodcast bancoPodcast) {
        this.bancoPodcast = bancoPodcast;
    }

    private void exibir(Podcast podcast) {
        campoId.setText(String.valueOf(podcast.getId()));
        campoTitulo.setText(podcast.getTitulo());
        campoDescricao.setText(podcast.getDescricao());
        campoIdioma.setText(podcast.getIdioma());
        campoAutor.setText(podcast.getAutores());
        campoAno.setText(String.valueOf(podcast.getAno()));
        campoCaminho.setText(podcast.getCaminho());
    }
    private void limpar() {
        campoId.setText("");
        campoTitulo.setText("");
        campoDescricao.setText("");
        campoIdioma.setText("");
        campoAutor.setText("");
        campoAno.setText("");
        campoCaminho.setText("");
    }
}
