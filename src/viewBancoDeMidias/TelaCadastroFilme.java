/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package viewBancoDeMidias;

/**
 *
 * @author SABRINA
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import midias.Filme;
import midias.Midia;
import sistema.SistemaFilme;
import sistema.SistemaGeral;

/**
 *
 * @author SABRINA
 */
public class TelaCadastroFilme extends javax.swing.JFrame {

    private SistemaFilme sisFilme;
    private JButton cancelar;
    private JButton remover;
    ViewFilme view;
    private JButton exibirAtores;
    private JButton salvar;

    public SistemaFilme getSisFilme() {
        return sisFilme;
    }

    /**
     * Creates new form TelaCadastroFilme
     */
    public TelaCadastroFilme(SistemaFilme filmes, ViewFilme view) {
        initComponents();
        this.sisFilme = filmes;
        this.view = view;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        titulo = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        genero = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        idioma = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        diretor = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        ano = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        duracao = new javax.swing.JTextPane();
        caminho = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        atores = new javax.swing.JTextPane();
        adcionar = new javax.swing.JButton();
        concluir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        exibirAtores = new javax.swing.JButton();
        salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(titulo);

        jScrollPane2.setViewportView(genero);

        jScrollPane3.setViewportView(idioma);

        jScrollPane4.setViewportView(diretor);

        jScrollPane5.setViewportView(ano);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel1.setText("Ano");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel2.setText("Título");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel3.setText("Novo Filme:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setText("Gênero");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setText("Idioma");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setText("Diretor");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel7.setText("Duração");

        jScrollPane6.setViewportView(duracao);

        caminho.setText("Selecionar Pasta");
        caminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminhoActionPerformed(evt);
            }
        });

        jScrollPane7.setViewportView(descricao);

        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel8.setText("Descrição");

        jLabel9.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel9.setText("Atores Principais");

        jScrollPane8.setViewportView(atores);

        adcionar.setText("Adicionar");
        adcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcionarActionPerformed(evt);
            }
        });
        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }

        });

        concluir.setText("Concluir");
        concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirActionPerformed(evt);
            }

        });
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }

        });
        exibirAtores.setText("Exibir");
        exibirAtores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirAtoresActionPerformed(evt);
            }

        });
        salvar.setText("Salvar Alterações");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }

        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(131, 131, 131)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(caminho, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(jLabel7))
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(50, 50, 50)
                                                                                                .addComponent(jLabel1)))
                                                                                .addGap(17, 17, 17)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel9)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(adcionar)
                                                                .addComponent(remover)
                                                                .addComponent(exibirAtores)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                                .addComponent(salvar)
                                                .addComponent(concluir)
                                                .addComponent(cancelar))
                                        )
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(concluir)
                                        .addComponent(cancelar)
                                        .addComponent(salvar)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(7, 7, 7)
                                                                .addComponent(jLabel3)
                                                                .addGap(23, 23, 23))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(caminho)
                                                                .addGap(18, 18, 18)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(3, 3, 3)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel7)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(adcionar)
                                                        .addComponent(remover)
                                                        .addComponent(exibirAtores))
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void caminhoActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            sisFilme.setCaminho(selectedFile.getAbsolutePath());
        }
    }

    private void adcionarActionPerformed(java.awt.event.ActionEvent evt) {//Está substituindo toda a lista a cada execução
        if (sisFilme.adcionarAtores(atores.getText())) {
            atores.setText("");
        }

    }

    private void removerActionPerformed(ActionEvent evt) {//Fazer método 
        JOptionPane.showMessageDialog(null, "Ator Removido!");
    }

    private void concluirActionPerformed(ActionEvent evt) {//Try cat para IndexOutOfBounds
        if (titulo.getText() != null && ano.getText() != null && this.caminho != null && diretor.getText() != null && descricao.getText() != null && duracao.getText() != null && idioma.getText() != null && genero.getText() != null && sisFilme.getAtores().get(0) != null) {
            int time = Integer.parseInt(duracao.getText());
            int year = Integer.parseInt(ano.getText());
            Midia midia = new Filme(genero.getText(), idioma.getText(), diretor.getText(), sisFilme.getAtores(), time, sisFilme.getCaminho(), titulo.getText(), descricao.getText(), year, 0);
            sisFilme.cadastrar(midia);
            JOptionPane.showMessageDialog(null, "\n" + midia.getTitulo() + "\n Filme Cadastrado!");
            setVisible(false);
            esvaziarCampos();
            view.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Você esqueceu de informar algum dado do Filme. \n Por Favor, preencha-o e tente novamente.");
        }

    }

    private void cancelarActionPerformed(ActionEvent evt) {
        setVisible(false);
        view.setVisible(true);
    }

    private void exibirAtoresActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(rootPane, "Atores Principais: \n" + sisFilme.getAtores().toString());
    }

    private void salvarActionPerformed(ActionEvent evt) {
        
        if (titulo.getText() != null && ano.getText() != null && this.caminho != null && diretor.getText() != null && descricao.getText() != null && duracao.getText() != null && idioma.getText() != null && genero.getText() != null && sisFilme.getAtores().get(0) != null) {
            int time = Integer.parseInt(duracao.getText());
            int year = Integer.parseInt(ano.getText());
            int indice = sisFilme.getColecaoDeFilmes().consultarIndice(titulo.getText(), sisFilme.getColecaoDeFilmes().getMidias());
            Midia midiaEditar = sisFilme.substituir(indice,genero.getText(), idioma.getText(), diretor.getText(), sisFilme.getAtores(), time, sisFilme.getCaminho(), titulo.getText(), descricao.getText(), year);
            Midia midiaEditada = sisFilme.editar(sisFilme.getColecaoDeFilmes().getMidias().get(indice));
            JOptionPane.showMessageDialog(rootPane, "Filme editado com sucesso! \n " + midiaEditada.toString());
            setVisible(false);
            view.setVisible(true);
        }
    }

    public void setarCampos(int indice) {
        Filme filme = (Filme) sisFilme.getColecaoDeFilmes().getMidias().get(indice);
        titulo.setText(filme.getTitulo());
        //String year = sisFilme.getColecaoDeFilmes().getMidias().get(indice).getAno();// Perguntar como fazer parse para string
        descricao.setText(filme.getDescricao());
        idioma.setText(filme.getIdioma());
        genero.setText(filme.getGenero());
        caminho.setText(filme.getCaminho());
        //duracao.setText(filme.getDuracao());
        diretor.setText(filme.getDiretor());

    }

    public void esvaziarCampos() {
        titulo.setText("");
        ano.setText("");
        descricao.setText("");
        idioma.setText("");
        genero.setText("");
        sisFilme.setCaminho("");
        atores.removeAll();//sisFilme.getAtores(); esvaziar lista
        duracao.setText("");
        diretor.setText("");

    }
    // Variables declaration - do not modify                     
    private javax.swing.JTextPane ano;
    private javax.swing.JTextPane atores;
    private javax.swing.JButton caminho;
    private javax.swing.JButton concluir;
    private javax.swing.JTextPane descricao;
    private javax.swing.JTextPane diretor;
    private javax.swing.JTextPane duracao;
    private javax.swing.JTextPane genero;
    private javax.swing.JTextPane idioma;
    private javax.swing.JButton adcionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextPane titulo;
    // End of variables declaration                   
}