/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewBancoDeMidias;

import bancoDeMidias.BancoAudioLivro;
import bancoDeMidias.BancoDeMidias;
import bancoDeMidias.BancoFilmes;
import bancoDeMidias.BancoPodcast;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SABRINA
 */
public class Geral extends javax.swing.JFrame {
    ViewPodcast podcast;
    ViewFilme filme;
    ViewAudioLivro audiolivro;
    Principal inicial;
    /**
     * Creates new form Geral
     */
    public Geral(Principal inicial, ViewPodcast podcast, ViewFilme filme, ViewAudioLivro audiol) {
        initComponents();
        this.podcast = podcast;
        this.filme = filme;
        this.audiolivro = audiol;
        this.inicial = inicial;
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
        sair = new javax.swing.JButton();
        btnAudioLivro = new javax.swing.JButton();
        btnFilme = new javax.swing.JButton();
        btnPodcast1 = new javax.swing.JButton();
        campoBuscar = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 500, 350));

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        btnAudioLivro.setText("AudioLivro");
        btnAudioLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioLivroActionPerformed(evt);
            }
        });
        getContentPane().add(btnAudioLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnFilme.setText("Filme");
        btnFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmeActionPerformed(evt);
            }
        });
        getContentPane().add(btnFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btnPodcast1.setText("Podcast");
        btnPodcast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPodcast1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPodcast1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        getContentPane().add(campoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 120, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAudioLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioLivroActionPerformed
        audiolivro.atualizaTabelaA(audiolivro.getBancoAudioLivro().getMidias(), jTable1);
    }//GEN-LAST:event_btnAudioLivroActionPerformed

    private void btnFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmeActionPerformed
        filme.atualizaTabela(filme.getBancoFilmes().getMidias(), jTable1);
    }//GEN-LAST:event_btnFilmeActionPerformed

    private void btnPodcast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPodcast1ActionPerformed
       podcast.atualizaTabela(podcast.getBancoDeMidias().getMidias(), jTable1);
    }//GEN-LAST:event_btnPodcast1ActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        setVisible(false);
        inicial.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try {
            //jTable1.setSelectionBackground(Color.BLUE);
            filme.getBancoFilmes().consultar(campoBuscar.getText()).toString();
            podcast.getBancoDeMidias().consultar(campoBuscar.getText()).toString();
            audiolivro.getBancoAudioLivro().consultar(campoBuscar.getText()).toString();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Esta Mídia não Existe!");
        }
    }//GEN-LAST:event_buscarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAudioLivro;
    private javax.swing.JButton btnFilme;
    private javax.swing.JButton btnPodcast1;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}