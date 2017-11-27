/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewBancoDeMidias;

import midias.Midia;
import java.io.File;
import javax.swing.JFileChooser;
import bancoDeMidias.BancoFilmes;
import excecao.ExceptionEmptySpace;
import java.awt.Button;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import midias.Filme;

/**
 *
 * @author jaromsambrana
 */
public class ViewFilme extends javax.swing.JFrame {

    private BancoFilmes bancoFilmes;
    private Principal viewInicial;

    private String caminho;
    private List<String> atores;

    /**
     * Creates new form ViewCadastroFilme
     */
    public ViewFilme(BancoFilmes filmes, Principal view) {
        initComponents();
        this.bancoFilmes = filmes;
        this.viewInicial = view;
        this.atores = new ArrayList<String>();
        this.caminho = null;
        gerarBackground();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanelFundo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        campoDiretor = new javax.swing.JTextField();
        campoCaminho = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        campoGenero = new javax.swing.JTextField();
        campoAno = new javax.swing.JTextField();
        campoIdioma = new javax.swing.JTextField();
        campoBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnSalvarAlteracoes = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        campoAtores = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoDuracao = new javax.swing.JTextField();
        btnEscolherCaminho = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        exibir = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFundo.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("BadlyStamped", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filme");
        jPanelFundo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 130, 40));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Título:");
        jPanelFundo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, 20));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Diretor:");
        jPanelFundo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 23));

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gênero:");
        jPanelFundo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Idioma:");
        jPanelFundo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ano:");
        jPanelFundo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 66, -1, 30));

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Caminho:");
        jPanelFundo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 20));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descrição:");
        jPanelFundo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));
        jPanelFundo.add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 270, -1));
        jPanelFundo.add(campoDiretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 270, -1));

        campoCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCaminhoActionPerformed(evt);
            }
        });
        jPanelFundo.add(campoCaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 270, -1));

        campoDescricao.setColumns(20);
        campoDescricao.setRows(5);
        jScrollPane2.setViewportView(campoDescricao);

        jPanelFundo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 270, 60));
        jPanelFundo.add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 270, -1));

        campoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAnoActionPerformed(evt);
            }
        });
        jPanelFundo.add(campoAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, -1));
        jPanelFundo.add(campoIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 270, -1));
        jPanelFundo.add(campoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 40, 190, -1));

        btnBuscar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanelFundo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 80, 30));

        btnCadastrar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseDragged(evt);
            }
        });
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanelFundo.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 150, 180, 30));

        btnSalvarAlteracoes.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnSalvarAlteracoes.setText("Salvar Alterações");
        btnSalvarAlteracoes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnSalvarAlteracoesMouseDragged(evt);
            }
        });
        btnSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracoesActionPerformed(evt);
            }
        });
        jPanelFundo.add(btnSalvarAlteracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 190, 180, 30));

        btnExcluir.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanelFundo.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 80, 30));

        sair.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        sair.setText("Sair");
        sair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sairMouseDragged(evt);
            }
        });
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanelFundo.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 180, 30));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        jPanelFundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 598, 120));

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Atores:");
        jPanelFundo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanelFundo.add(campoAtores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 270, -1));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Duração:");
        jPanelFundo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 74, -1, -1));
        jPanelFundo.add(campoDuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 90, -1));

        btnEscolherCaminho.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btnEscolherCaminho.setText("Escolher");
        btnEscolherCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolherCaminhoActionPerformed(evt);
            }
        });
        jPanelFundo.add(btnEscolherCaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        adicionar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        jPanelFundo.add(adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, 30));

        remover.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });
        jPanelFundo.add(remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 90, 30));

        exibir.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        exibir.setText("Exibir");
        exibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirActionPerformed(evt);
            }
        });
        jPanelFundo.add(exibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 80, 30));

        editar.setBackground(new java.awt.Color(255, 255, 255));
        editar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        editar.setText("Editar");
        editar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                editarMouseDragged(evt);
            }
        });
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanelFundo.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 110, 180, 30));
        jPanelFundo.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 672));

        getContentPane().add(jPanelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCaminhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCaminhoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        try {
            ExceptionEmptySpace.informaDado(campoCaminho.getText());
            ExceptionEmptySpace.informaDado(campoTitulo.getText());
            ExceptionEmptySpace.informaDado(campoAno.getText());
            ExceptionEmptySpace.informaDado(campoDiretor.getText());
            ExceptionEmptySpace.informaDado(campoDescricao.getText());
            ExceptionEmptySpace.informaDado(campoDuracao.getText());
            ExceptionEmptySpace.informaDado(campoIdioma.getText());
            ExceptionEmptySpace.informaDado(campoGenero.getText());
            ExceptionEmptySpace.informaDado(getAtores().get(0));
            int time = Integer.parseInt(campoDuracao.getText());
            int year = Integer.parseInt(campoAno.getText());
            int id = Midia.atualizaId();
            List<String> atoresPrincipais = new ArrayList();
            for (int i = 0; i < this.atores.size(); i++) {
                atoresPrincipais.add(atores.get(i));
            }
            Midia midia = new Filme(campoGenero.getText(), campoIdioma.getText(), campoDiretor.getText(), this.atores.size(), atoresPrincipais, time, campoCaminho.getText(), campoTitulo.getText(), campoDescricao.getText(), year, id);//id não deve ser passado pelo construtor

            bancoFilmes.cadastrar(midia);

            JOptionPane.showMessageDialog(null, "\n" + midia.getTitulo() + "\n Filme Cadastrado!");
            esvaziarCampos();

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Por favor insira todas as informações");
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Por favor insira todas as informações");
        }
        try {
            bancoFilmes.gravar("BancoFilmes.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("Erro: Banco.txt não encontrado");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        atualizaTabela(bancoFilmes.getMidias(), tabela);

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEscolherCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolherCaminhoActionPerformed
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
    }//GEN-LAST:event_btnEscolherCaminhoActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        try {
            ExceptionEmptySpace.informaDado(campoAtores.getText());
            if (adcionarAtores(campoAtores.getText())) {
                campoAtores.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_adicionarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        try {
            if (removerAtores(campoAtores.getText())) {
                JOptionPane.showMessageDialog(null, "Ator " + campoAtores.getText() + " Removido!");
                campoAtores.setText("");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Este ator não foi adicionado!");
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Nenhum ator foi adicionado!");
        }

    }//GEN-LAST:event_removerActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Midia midia = bancoFilmes.consultar(campoBuscar.getText());
            JOptionPane.showMessageDialog(rootPane, midia.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Este filme não Existe!");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        try {
            bancoFilmes.gravar("BancoFilmes.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("Erro: Banco.txt não encontrado");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        setVisible(false);
        viewInicial.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    private void exibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirActionPerformed

        JOptionPane.showMessageDialog(rootPane, "Atores Principais: \n" + this.atores.toString());
    }//GEN-LAST:event_exibirActionPerformed

    private void btnSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesActionPerformed
        try {
            ExceptionEmptySpace.informaDado(campoCaminho.getText());
            ExceptionEmptySpace.informaDado(campoTitulo.getText());
            ExceptionEmptySpace.informaDado(campoAno.getText());
            ExceptionEmptySpace.informaDado(campoDiretor.getText());
            ExceptionEmptySpace.informaDado(campoDescricao.getText());
            ExceptionEmptySpace.informaDado(campoDuracao.getText());
            ExceptionEmptySpace.informaDado(campoIdioma.getText());
            ExceptionEmptySpace.informaDado(campoGenero.getText());
            ExceptionEmptySpace.informaDado(getAtores().get(0));
            int time = Integer.parseInt(campoDuracao.getText());
            int year = Integer.parseInt(campoAno.getText());
            List<String> atoresPrincipais = new ArrayList();
            for (int i = 0; i < this.atores.size(); i++) {
                atoresPrincipais.add(atores.get(i));
            }
            Midia midiaEditada = new Filme(campoGenero.getText(), campoIdioma.getText(), campoDiretor.getText(), this.atores.size(), atoresPrincipais, time, campoCaminho.getText(), campoTitulo.getText(), campoDescricao.getText(), year, Midia.atualizaId());//id não deve ser passado pelo construtor
            bancoFilmes.editar(0, midiaEditada);
            JOptionPane.showMessageDialog(null, "\n" + midiaEditada.getTitulo() + "\n Filme Editado!");
            esvaziarCampos();

        } catch (NullPointerException | IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Por favor insira todas as informações!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor insira todas as informações!");
        }
        try {
            bancoFilmes.gravar("BancoFilmes.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("Erro: Banco.txt não encontrado");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        atualizaTabela(bancoFilmes.getMidias(), tabela);


    }//GEN-LAST:event_btnSalvarAlteracoesActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try{
        Midia excluida = bancoFilmes.excluir(campoBuscar.getText());
        JOptionPane.showMessageDialog(rootPane, "O Filme excluido foi: \n \n" + excluida.toString());
        atualizaTabela(bancoFilmes.getMidias(), tabela);   
        }catch(Exception e){
             System.out.println("Erro: " + e.getMessage());
        }// TODO add your handling code here:
        try {
            bancoFilmes.gravar("BancoFilmes.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("Erro: Banco.txt não encontrado");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try {
            String filmeEdit = JOptionPane.showInputDialog(rootPane, "Qual filme você deseja Editar?");
            Filme midia = (Filme) bancoFilmes.consultar(filmeEdit);
            setarCampos(midia);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Operação Cancelada!");
        }

    }//GEN-LAST:event_editarActionPerformed

    private void campoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAnoActionPerformed

    private void editarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseDragged
        editar.setBackground(Color.blue);
    }//GEN-LAST:event_editarMouseDragged

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btnCadastrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseDragged
        btnCadastrar.setBackground(Color.blue);
    }//GEN-LAST:event_btnCadastrarMouseDragged

    private void btnSalvarAlteracoesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesMouseDragged
        btnSalvarAlteracoes.setBackground(Color.blue);
    }//GEN-LAST:event_btnSalvarAlteracoesMouseDragged

    private void sairMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseDragged
        sair.setBackground(Color.blue);        // TODO add your handling code here:
    }//GEN-LAST:event_sairMouseDragged
    public void esvaziarCampos() {
        campoTitulo.setText("");
        campoAno.setText("");
        campoDescricao.setText("");
        campoIdioma.setText("");
        campoGenero.setText("");
        campoCaminho.setText("");
        setCaminho("");
        getAtores().clear();
        campoDuracao.setText("");
        campoDiretor.setText("");

    }

    public void setarCampos(Filme filme) {
        campoTitulo.setText(filme.getTitulo());
        campoAno.setText(String.valueOf(filme.getAno()));
        campoDescricao.setText(filme.getDescricao());
        campoIdioma.setText(filme.getIdioma());
        campoGenero.setText(filme.getGenero());
        campoCaminho.setText(filme.getCaminho());
        campoDuracao.setText(String.valueOf(filme.getDuracao()));
        campoDiretor.setText(filme.getDiretor());
        this.atores.clear();
        this.atores.addAll(filme.getAtoresPrincipais());

    }

    public JTable atualizaTabela(List<Midia> bancoFilme, JTable tabela) {

        String matriz[][] = new String[bancoFilme.size()][9];
        for (int i = 0; i < bancoFilme.size(); i++) {
            Filme filme = (Filme) bancoFilme.get(i);
            matriz[i][0] = String.valueOf(filme.getTitulo());
            matriz[i][1] = String.valueOf(filme.getDescricao());
            matriz[i][2] = String.valueOf(filme.getIdioma());
            matriz[i][3] = String.valueOf(filme.getGenero());
            matriz[i][4] = String.valueOf(filme.getAno());
            matriz[i][5] = String.valueOf(filme.getCaminho());
            matriz[i][6] = String.valueOf(filme.getDiretor());
            matriz[i][7] = String.valueOf(filme.getDuracao());
            matriz[i][8] = String.valueOf(filme.getAtoresPrincipais());
        }
        tabela.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Título", "Descrição", "Idioma", "Gênero", "Ano", "Caminho", "Diretor", "Duração", "Atores Principais"
                }
        ));
        return tabela;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getCaminho() {
        return caminho;
    }

    public boolean removerAtores(String nome) {
        if (this.atores.remove(nome)) {
            return true;
        }
        return false;
    }

    public boolean adcionarAtores(String nome) {//Arrumar este método depois

        if (nome != null && nome != "" && this.atores.add(nome)) {

            return true;
        }

        return false;
    }

    public void gerarBackground() {
        String pasta = System.getProperty("user.dir");
        fundo.setIcon(new ImageIcon(pasta + "/imagens/filme.jpg"));

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEscolherCaminho;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvarAlteracoes;
    private javax.swing.JTextField campoAno;
    private javax.swing.JTextField campoAtores;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JTextField campoCaminho;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoDiretor;
    private javax.swing.JTextField campoDuracao;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoIdioma;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton editar;
    private javax.swing.JButton exibir;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton remover;
    private javax.swing.JButton sair;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
