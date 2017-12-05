/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewBancoDeMidias;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import midias.Podcast;
import bancoDeMidias.BancoDeMidias;
import bancoDeMidias.BancoPodcast;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import midias.Midia;
import static midias.Midia.idGeral;

/**
 *
 * @author vagne
 */
public class ViewPodcast extends javax.swing.JFrame {

    private BancoPodcast bancoPodcast;
    private String caminho;

    /**
     * Creates new form cadastrarPodCast
     *
     * @param bancoPodcast
     */
    public ViewPodcast(BancoPodcast bancoPodcast) {
        this.bancoPodcast = bancoPodcast;
        this.caminho = null;

        /**
         * LER DO ARQUIVO
         */
        initComponents();
        setSize(617, 571);

        try {
            int idGeral = Midia.obterIDGeral("IDGeral.txt", false); // false apenas recupera, sem atualizar
            campoId.setText(String.valueOf(idGeral));
        } catch (Exception ex) {
            Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            bancoPodcast.ler("BancoPodcasts.txt");
            bancoPodcast.atualizaTabela(bancoPodcast.getMidias(), tabelaPodCast);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
                getCampoCaminho().setText(caminho);
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
        botaoCaminho = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ordenarAno = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();

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
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel1.setText("Idioma:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 180, 70, 16);

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel2.setText("Autor:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 220, 70, 16);

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 30, 16);

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel4.setText("Título:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 140, 70, 16);

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel5.setText("Descrição:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 290, 90, 16);

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel6.setText("Ano:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 260, 60, 16);
        getContentPane().add(campoAutor);
        campoAutor.setBounds(90, 210, 282, 30);
        getContentPane().add(campoTitulo);
        campoTitulo.setBounds(90, 130, 282, 30);
        getContentPane().add(campoDescricao);
        campoDescricao.setBounds(90, 310, 282, 30);
        getContentPane().add(campoIdioma);
        campoIdioma.setBounds(90, 170, 282, 30);

        campoId.setEditable(false);
        campoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdActionPerformed(evt);
            }
        });
        getContentPane().add(campoId);
        campoId.setBounds(90, 90, 282, 30);
        getContentPane().add(campoAno);
        campoAno.setBounds(90, 250, 280, 30);

        botaoCadastrarPodCast.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        botaoCadastrarPodCast.setText("Cadastrar");
        botaoCadastrarPodCast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarPodCastActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrarPodCast);
        botaoCadastrarPodCast.setBounds(420, 160, 150, 40);

        botaoSairPodCast.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        botaoSairPodCast.setText("Sair");
        botaoSairPodCast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairPodCastActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSairPodCast);
        botaoSairPodCast.setBounds(420, 300, 150, 30);

        campoCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCaminhoActionPerformed(evt);
            }
        });
        getContentPane().add(campoCaminho);
        campoCaminho.setBounds(90, 350, 282, 20);

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel7.setText("Caminho:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 350, 90, 16);

        botaoBuscar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoBuscar);
        botaoBuscar.setBounds(460, 120, 80, 30);

        campoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(campoBusca);
        campoBusca.setBounds(410, 90, 170, 20);

        botaoSalvarAlteracoes.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        botaoSalvarAlteracoes.setText("Salvar Alterações");
        botaoSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarAlteracoesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvarAlteracoes);
        botaoSalvarAlteracoes.setBounds(420, 210, 150, 40);

        botaoExcluir.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(420, 260, 150, 30);

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

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 410, 590, 120);

        botaoCaminho.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        botaoCaminho.setText("Escolher");
        botaoCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCaminhoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCaminho);
        botaoCaminho.setBounds(380, 350, 91, 30);

        jLabel10.setFont(new java.awt.Font("The Blacklist", 0, 36)); // NOI18N
        jLabel10.setText("Podcast");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(430, 30, 150, 40);

        ordenarAno.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        ordenarAno.setText("Ordenar por ano");
        ordenarAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarAnoActionPerformed(evt);
            }
        });
        getContentPane().add(ordenarAno);
        ordenarAno.setBounds(10, 380, 170, 21);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/e.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-60, -10, 710, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarPodCastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarPodCastActionPerformed

        if (campoCaminho.getText() != null && campoTitulo.getText() != null && campoDescricao.getText() != null && this.campoAno != null && campoIdioma.getText() != null && campoAutor.getText() != null) {
            Podcast p;
            try {
                p = new Podcast(getCaminho(),
                        campoTitulo.getText(),
                        campoDescricao.getText(),
                        Integer.valueOf(campoAno.getText()),
                        campoIdioma.getText(),
                        campoAutor.getText(),
                        Midia.obterIDGeral("IDGeral.txt", true)
                );
                getBancoDeMidias().cadastrar(p);
                limpar();
            } catch (Exception ex) {
                Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não preencheu todos os campos de texto. \n Tente novamente preenchendo todos os campos!");
        }
        try {
            bancoPodcast.gravar("BancoPodcasts.txt");
        } catch (Exception ex) {
            Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        try {
            bancoPodcast.gravar("BancoPodcasts.txt");
        } catch (Exception ex) {
            Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpar();
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
            } catch (Exception e) {
                limpar();
                JOptionPane.showMessageDialog(null, "Não foi possível localizar o item. Tente novamente. ", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void campoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscaActionPerformed

    private void botaoSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarAlteracoesActionPerformed
        if (campoCaminho.getText() != null && campoTitulo.getText() != null && campoDescricao.getText() != null && this.campoAno != null && campoIdioma.getText() != null && campoAutor.getText() != null) {
            Podcast s;
            s = new Podcast(getCaminho(),
                    campoTitulo.getText(),
                    campoDescricao.getText(),
                    Integer.valueOf(campoAno.getText()),
                    campoIdioma.getText(),
                    campoAutor.getText(),
                    Integer.valueOf(campoId.getText())
            );
            bancoPodcast.editar(Integer.valueOf(campoId.getText()), s);
        }
        try {
            bancoPodcast.gravar("BancoPodcasts.txt");
        } catch (Exception ex) {
            Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpar();
        bancoPodcast.atualizaTabela(bancoPodcast.getMidias(), tabelaPodCast);
    }//GEN-LAST:event_botaoSalvarAlteracoesActionPerformed

    private void botaoCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCaminhoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            setCaminho(selectedFile.getAbsolutePath());
            campoCaminho.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_botaoCaminhoActionPerformed

    private void ordenarAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarAnoActionPerformed
        bancoPodcast.atualizaTabela(bancoPodcast.ordenar(bancoPodcast), tabelaPodCast);
    }//GEN-LAST:event_ordenarAnoActionPerformed

    private void campoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdActionPerformed

    private void campoCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCaminhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCaminhoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoCadastrarPodCast;
    private javax.swing.JButton botaoCaminho;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox ordenarAno;
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

    /**
     * @return the campoCaminho
     */
    public javax.swing.JTextField getCampoCaminho() {
        return campoCaminho;
    }

    public String getCaminho() {
        return caminho;
    }

    /**
     * @param caminho the caminho to set
     */
    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    /**
     * @param campoCaminho the campoCaminho to set
     */
    public void setCampoCaminho(javax.swing.JTextField campoCaminho) {
        this.campoCaminho = campoCaminho;
    }

    private void exibir(Podcast podcast) {
        campoId.setText(String.valueOf(podcast.getIdGeral()));
        campoTitulo.setText(podcast.getTitulo());
        campoDescricao.setText(podcast.getDescricao());
        campoIdioma.setText(podcast.getIdioma());
        campoAutor.setText(podcast.getAutor());
        campoAno.setText(String.valueOf(podcast.getAno()));
        getCampoCaminho().setText(podcast.getCaminho());
    }

    private void limpar() {
        try {
            campoId.setText(String.valueOf(Midia.obterIDGeral("IDGeral.txt", false)));
        } catch (Exception ex) {
            Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
        }
        campoTitulo.setText("");
        campoDescricao.setText("");
        campoIdioma.setText("");
        campoAutor.setText("");
        campoAno.setText("");
        getCampoCaminho().setText("");
    }

    public JTable atualizaTabela(List<Midia> midiaPodcast, JTable tabela) {

        String matriz[][] = new String[midiaPodcast.size()][7];
        for (int i = 0; i < midiaPodcast.size(); i++) {
            Podcast podcast = (Podcast) midiaPodcast.get(i);
            matriz[i][0] = String.valueOf(podcast.getIdGeral());
            matriz[i][1] = String.valueOf(podcast.getTitulo());
            matriz[i][2] = String.valueOf(podcast.getDescricao());
            matriz[i][3] = String.valueOf(podcast.getIdioma());
            matriz[i][4] = String.valueOf(podcast.getAutor());
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
    public void gerarBackground() {
        String pasta = System.getProperty("user.dir");
        jLabel9.setIcon(new ImageIcon(pasta + "/imagens/e.jpg"));

    }
}
