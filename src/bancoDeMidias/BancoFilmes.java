/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeMidias;

import bancoDeMidias.BancoDeMidias;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import midias.Midia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import midias.Filme;
import midias.Podcast;

/**
 *
 * @author SABRINA
 */
//Classe que gerencia os Filmes
public class BancoFilmes extends BancoDeMidias {

    public BancoFilmes() {
        super();
    }

    public int getTamanhoLista() {
        return this.getMidias().size();
    }

    public void gravar(String bancoFilme) throws Exception {
        /**
         * Abre o arquivo para escrita
         */
        FileOutputStream outFile = new FileOutputStream(new File(bancoFilme));
        BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

        buff.write(getTamanhoLista() + "\r\n");
        for (Midia midia : super.getMidias()) {
            buff.write(midia.toFile() + "\r\n");

            /**
             * Fecha o arquivo
             */
        }
        buff.close();
        outFile.close();
    }

    public void ler(String filme) throws Exception {
        FileInputStream inFile;
        BufferedReader buff;
        Filme filmeArquivo;
        String linha, caminho, titulo, descricao, idioma, genero, diretor, duracao;
        int ano, id, numeroDeFilmes, numeroAtores;
        

        /**
         * Abre o arquivo para leitura
         */
        inFile = new FileInputStream(new File(filme));
        buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));

        linha = buff.readLine();
        numeroDeFilmes = Integer.parseInt(linha);

        for (int i = 0; i < numeroDeFilmes; i++) {

            linha = buff.readLine();
            id = Integer.parseInt(linha);

            caminho = buff.readLine();

            titulo = buff.readLine();

            linha = buff.readLine();
            ano = Integer.parseInt(linha);

            descricao = buff.readLine();

            genero = buff.readLine();

            idioma = buff.readLine();

            diretor = buff.readLine();

            linha = buff.readLine();
            numeroAtores = Integer.parseInt(linha);
            List<String> atoresPrincipais = new ArrayList<String>();
            for (int j = 0; j < numeroAtores; j++) {
                atoresPrincipais.add(buff.readLine());
            }

            duracao = buff.readLine();

            filmeArquivo = new Filme(genero, idioma, diretor, numeroAtores, atoresPrincipais, duracao, caminho, titulo, descricao, ano, id);

            this.cadastrar(filmeArquivo);

            buff.readLine();
        }
        buff.close();
        inFile.close();

    }

    public static void gnomeSort(List<Midia> filmes, String comparador) {
        if (!filmes.isEmpty() && filmes.size() > 0) {

            int i = 1;
            Filme troca = (Filme) filmes.get(0);
            while (i < filmes.size()) {
                if (comparador.equalsIgnoreCase("Ano")) {
                    if (i == 0 || filmes.get(i - 1).compararAno(filmes.get(i))) {
                        i++;
                    } else {
                        troca = (Filme) filmes.get(i - 1);
                        filmes.set(i - 1, filmes.get(i));
                        filmes.set(i, troca);
                        i--;
                    }
                } else if (comparador.equalsIgnoreCase("Titulo")) {
                    if (i == 0 || filmes.get(i - 1).compararTitulo(filmes.get(i))) {
                        i++;
                    } else {
                        troca = (Filme) filmes.get(i - 1);
                        filmes.set(i - 1, filmes.get(i));
                        filmes.set(i, troca);
                        i--;
                    }
                }
            }
        }
    }

}

