/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewBancoDeMidias;

import bancoDeMidias.BancoPodcast;
import sistema.SistemaEbook;

/**
 *
 * @author vagne
 */
public class Principal extends javax.swing.JFrame {

    private BancoPodcast bancoPodcast;
    private ViewPodcast telaDePodcast;
    
    public Principal() {
        initComponents();
        this.bancoPodcast = new BancoPodcast();
        this.telaDePodcast = new ViewPodcast(bancoPodcast);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoFilme = new javax.swing.JButton();
        botaoEbook = new javax.swing.JButton();
        botaoPodCast = new javax.swing.JButton();
        botaoAudioLivro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoFilme.setText("Filme");
        botaoFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFilmeActionPerformed(evt);
            }
        });

        botaoEbook.setText("Ebook");
        botaoEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEbookActionPerformed(evt);
            }
        });

        botaoPodCast.setText("PodCast");
        botaoPodCast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPodCastActionPerformed(evt);
            }
        });

        botaoAudioLivro.setText("AudioLivro");
        botaoAudioLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAudioLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAudioLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoEbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPodCast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(botaoFilme)
                .addGap(18, 18, 18)
                .addComponent(botaoEbook)
                .addGap(18, 18, 18)
                .addComponent(botaoPodCast)
                .addGap(18, 18, 18)
                .addComponent(botaoAudioLivro)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFilmeActionPerformed
        new ViewFilme().setVisible(true);
    }//GEN-LAST:event_botaoFilmeActionPerformed

    private void botaoEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEbookActionPerformed
        new ViewEbook(new SistemaEbook()).setVisible(true);
    }//GEN-LAST:event_botaoEbookActionPerformed

    private void botaoPodCastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPodCastActionPerformed
        telaDePodcast.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_botaoPodCastActionPerformed

    private void botaoAudioLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAudioLivroActionPerformed
        // new Opcoes().setVisible(true);
    }//GEN-LAST:event_botaoAudioLivroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAudioLivro;
    private javax.swing.JButton botaoEbook;
    private javax.swing.JButton botaoFilme;
    private javax.swing.JButton botaoPodCast;
    // End of variables declaration//GEN-END:variables
}
