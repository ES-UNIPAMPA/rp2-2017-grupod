/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewBancoDeMidias;
import bancoDeMidias.BancoAudioLivro;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import midias.AudioLivro;
import midias.Midia;

/**
 *
 * @author Rafae
 */
public class ViewAudioLivro extends javax.swing.JFrame {
    private BancoAudioLivro bancoAudioLivro;
    private String caminho;

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    /**
     * Creates new form ViewAudioLivro
     * 
     * @param bancoAudioLivro
     */
    public ViewAudioLivro(BancoAudioLivro bancoAudioLivro) {
        initComponents();
        this.bancoAudioLivro = bancoAudioLivro;
        try {
            bancoAudioLivro.ler("BancoAudioLivro.txt");
            atualizaTabelaA(bancoAudioLivro.getMidias(), tabelaA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
         try {
            int idGeral = Midia.obterIDGeral("IDGeral.txt", false); // false apenas recupera, sem atualizar
            campoId.setText(String.valueOf(idGeral));
        } catch (Exception ex) {

        }
        tabelaA.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JTable target = (JTable) e.getSource();
                int row = target.getSelectedRow();

                String id = String.valueOf(target.getValueAt(row, 0));
                String titulo = String.valueOf(target.getValueAt(row, 1));
                String descricao = String.valueOf(target.getValueAt(row, 2));
                String ano = String.valueOf(target.getValueAt(row, 3));
                String genero = String.valueOf(target.getValueAt(row, 4));
                String autores = String.valueOf(target.getValueAt(row, 5));
                String editora = String.valueOf(target.getValueAt(row, 6));
                String idioma = String.valueOf(target.getValueAt(row, 7));
                String local = String.valueOf(target.getValueAt(row, 8));
                String duracao = String.valueOf(target.getValueAt(row, 9));
                String caminho = String.valueOf(target.getValueAt(row, 10));

                campoId.setText(id);
                campoTitulo.setText(titulo);
                campoDescricao.setText(descricao);
                campoAno.setText(ano);
                campoGenero.setText(genero);
                campoAutores.setText(autores);
                campoEditora.setText(editora);
                campoIdioma.setText(idioma);
                campoLocal.setText(local);
                campoDuracao.setText(duracao);
                campoCaminho.setText(caminho);
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoAno = new javax.swing.JTextField();
        campoGenero = new javax.swing.JTextField();
        campoAutores = new javax.swing.JTextField();
        campoEditora = new javax.swing.JTextField();
        campoIdioma = new javax.swing.JTextField();
        campoLocal = new javax.swing.JTextField();
        campoDuracao = new javax.swing.JTextField();
        campoCaminho = new javax.swing.JTextField();
        campoPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnCadastrarAudioLivro = new javax.swing.JButton();
        btnEditarAudioLivro = new javax.swing.JButton();
        btnExcluirAudioLivro = new javax.swing.JButton();
        btnVoltarAudioLivro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaA = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        campoId.setEditable(false);
        campoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdActionPerformed(evt);
            }
        });
        jPanel1.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 230, -1));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Título:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel1.add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 230, -1));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));
        jPanel1.add(campoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 230, 20));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ano:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genero:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Autores:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Editora:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Idioma:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Local:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Duração:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Caminho:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel1.add(campoAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 230, -1));
        jPanel1.add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 230, -1));
        jPanel1.add(campoAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 230, -1));
        jPanel1.add(campoEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 230, -1));
        jPanel1.add(campoIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 230, -1));

        campoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLocalActionPerformed(evt);
            }
        });
        jPanel1.add(campoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 230, -1));
        jPanel1.add(campoDuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 230, -1));

        campoCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCaminhoActionPerformed(evt);
            }
        });
        jPanel1.add(campoCaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 230, -1));

        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(campoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 160, -1));

        btnPesquisar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 120, 30));

        btnCadastrarAudioLivro.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnCadastrarAudioLivro.setText("Cadastrar");
        btnCadastrarAudioLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarAudioLivroMouseClicked(evt);
            }
        });
        btnCadastrarAudioLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAudioLivroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrarAudioLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 120, 30));

        btnEditarAudioLivro.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnEditarAudioLivro.setText("Editar");
        btnEditarAudioLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAudioLivroActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarAudioLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 120, 30));

        btnExcluirAudioLivro.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnExcluirAudioLivro.setText("Excluir");
        btnExcluirAudioLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAudioLivroActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluirAudioLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 120, 30));

        btnVoltarAudioLivro.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnVoltarAudioLivro.setText("Voltar");
        btnVoltarAudioLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAudioLivroActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarAudioLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 120, 30));

        tabelaA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Descrição", "Ano", "Gênero", "Autores", "Editora", "Idioma", "Local", "Duração", "Caminho"
            }
        ));
        tabelaA.setColumnSelectionAllowed(true);
        tabelaA.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaA);
        tabelaA.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 640, 123));

        jButton2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButton2.setText("Procurar Caminho");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 160, -1));

        jLabel12.setFont(new java.awt.Font("The Blacklist", 0, 36)); // NOI18N
        jLabel12.setText("AudioLivro");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/fundoAL.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -170, 700, 930));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void campoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLocalActionPerformed

    private void campoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
            AudioLivro audioLivro;
        try {
            audioLivro = (AudioLivro) bancoAudioLivro.consultar(Integer.valueOf(campoPesquisa.getText()));
            exibirAudioLivro(audioLivro);
        } catch (Exception ex) {
            audioLivro = (AudioLivro) bancoAudioLivro.consultar(campoPesquisa.getText());
            try {
                exibirAudioLivro(audioLivro);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Não foi possível localizar o item. Tente novamente. ", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastrarAudioLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarAudioLivroMouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarAudioLivroMouseClicked

    private void btnVoltarAudioLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarAudioLivroActionPerformed
        
        dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_btnVoltarAudioLivroActionPerformed

    private void btnCadastrarAudioLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAudioLivroActionPerformed
      
       if (campoCaminho.getText() != null && campoTitulo.getText() != null && campoDescricao.getText() != null && this.campoAno != null && campoIdioma.getText() == null || campoId.getText() != null
            && campoGenero.getText() != null && campoIdioma.getText() != null && campoAutores.getText() != null && campoLocal.getText() != null && campoEditora.getText() != null && campoDuracao.getText() != null) {
            AudioLivro audioLivroNovo;
            try {
                audioLivroNovo = new AudioLivro(campoCaminho.getText(),
                    campoTitulo.getText(),
                    campoDescricao.getText(),
                    Integer.parseInt(campoAno.getText()),
                    Midia.obterIDGeral("IDGeral.txt", true),
                    campoGenero.getText(),
                    campoIdioma.getText(),
                    campoAutores.getText(),
                    campoLocal.getText(),
                    campoEditora.getText(),
                    Integer.parseInt(campoDuracao.getText())
                );
                limparCampos();
                bancoAudioLivro.cadastrar(audioLivroNovo);
            } catch (Exception ex) {
                Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não preencheu todos os campos de texto. \n Tente novamente preenchendo todos os campos!");
        }

        try {
            bancoAudioLivro.gravar("BancoAudioLivro.txt");
        } catch (Exception ex) {
            Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        atualizaTabelaA(bancoAudioLivro.getMidias(), tabelaA);
       
    }//GEN-LAST:event_btnCadastrarAudioLivroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
      fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      int result = fileChooser.showOpenDialog(this);
      if (result == JFileChooser.APPROVE_OPTION){
       File selectedFile = fileChooser.getSelectedFile();   
       setCaminho(selectedFile.getAbsolutePath());
       campoCaminho.setText(selectedFile.getAbsolutePath());
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnExcluirAudioLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAudioLivroActionPerformed
         bancoAudioLivro.excluir(Integer.valueOf(campoId.getText()));
        try {
            bancoAudioLivro.gravar("BancoAudioLivro.txt");
        } catch (Exception ex) {
            Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
        }
        limparCampos();
        atualizaTabelaA(bancoAudioLivro.getMidias(), tabelaA);
    }//GEN-LAST:event_btnExcluirAudioLivroActionPerformed

    private void btnEditarAudioLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAudioLivroActionPerformed
       AudioLivro audioLivroEditado;

        audioLivroEditado = new AudioLivro(campoCaminho.getText(),
            campoTitulo.getText(),
            campoDescricao.getText(),
            Integer.parseInt(campoAno.getText()),
            Integer.parseInt(campoId.getText()),
            campoGenero.getText(),
            campoIdioma.getText(),
            campoAutores.getText(),
            campoLocal.getText(),
            campoEditora.getText(),
            Integer.parseInt(campoDuracao.getText())
        );

        bancoAudioLivro.editar(Integer.valueOf(campoId.getText()),audioLivroEditado);
        try {
            bancoAudioLivro.gravar("BancoAudioLivro.txt");
        } catch (Exception ex) {
            Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
        }
        limparCampos();
        atualizaTabelaA(bancoAudioLivro.getMidias(), tabelaA);

    }//GEN-LAST:event_btnEditarAudioLivroActionPerformed

    private void campoCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCaminhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCaminhoActionPerformed

    
       public BancoAudioLivro getBancoAudioLivro() {
        return bancoAudioLivro;
    }

    public void setBancoAudioLivro(BancoAudioLivro bancoAudioLivro) {
        this.bancoAudioLivro = bancoAudioLivro;
    }
    
    private void exibirAudioLivro(AudioLivro audioLivro) {
        campoCaminho.setText(audioLivro.getCaminho());
        campoTitulo.setText(audioLivro.getTitulo());
        campoDescricao.setText(audioLivro.getDescricao());
        campoAno.setText(String.valueOf(audioLivro.getAno()));
        campoId.setText(String.valueOf(audioLivro.getId()));
        campoGenero.setText(audioLivro.getGenero());
        campoIdioma.setText(audioLivro.getIdioma());
        campoAutores.setText(audioLivro.getAutores());
        campoLocal.setText(audioLivro.getLocal());
        campoEditora.setText(audioLivro.getEditora());
        campoDuracao.setText(String.valueOf(audioLivro.getDuracao()));
    }
     
    public void limparCampos(){
        campoCaminho.setText("");
        campoTitulo.setText("");
        campoDescricao.setText("");
        campoAno.setText("");
        try {
            campoId.setText(String.valueOf(Midia.obterIDGeral("IDGeral.txt", false)));
        } catch (Exception ex) {
            Logger.getLogger(ViewPodcast.class.getName()).log(Level.SEVERE, null, ex);
        }
        campoGenero.setText("");
        campoIdioma.setText("");
        campoAutores.setText("");
        campoLocal.setText("");
        campoEditora.setText("");
        campoDuracao.setText("");
    };
    
    public JTable atualizaTabelaA(List<Midia> midiaAudioLivro, JTable tabela) {

        String matriz[][] = new String[midiaAudioLivro.size()][11];
        for (int i = 0; i < midiaAudioLivro.size(); i++) {
            AudioLivro al = (AudioLivro) midiaAudioLivro.get(i);
            matriz[i][0] = String.valueOf(al.getId());
            matriz[i][1] = String.valueOf(al.getTitulo());
            matriz[i][2] = String.valueOf(al.getDescricao());
            matriz[i][3] = String.valueOf(al.getAno());
            matriz[i][4] = String.valueOf(al.getGenero());
            matriz[i][5] = String.valueOf(al.getAutores());
            matriz[i][6] = String.valueOf(al.getEditora());
            matriz[i][7] = String.valueOf(al.getIdioma());
            matriz[i][8] = String.valueOf(al.getLocal());
            matriz[i][9] = String.valueOf(al.getDuracao());
            matriz[i][10] = String.valueOf(al.getCaminho());
        }
        tabela.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Título", "Descrição", "Ano", "Genero", "Autores", "Editora", "Idioma", "Local", "Duracao", "Caminho"
                }
        ));
        return tabela;
    }
 
        public void gerarBackground() {
        String pasta = System.getProperty("user.dir");
        jLabel13.setIcon(new ImageIcon(pasta + "/imagens/fundoAL.jpg"));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAudioLivro;
    private javax.swing.JButton btnEditarAudioLivro;
    private javax.swing.JButton btnExcluirAudioLivro;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltarAudioLivro;
    private javax.swing.JTextField campoAno;
    private javax.swing.JTextField campoAutores;
    private javax.swing.JTextField campoCaminho;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoDuracao;
    private javax.swing.JTextField campoEditora;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoIdioma;
    private javax.swing.JTextField campoLocal;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaA;
    // End of variables declaration//GEN-END:variables
}
