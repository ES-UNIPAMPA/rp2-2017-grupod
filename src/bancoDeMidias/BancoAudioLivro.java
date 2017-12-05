/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeMidias;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import midias.AudioLivro;
import midias.Midia;

/**
 *
 * @author Rafae
 */
public class BancoAudioLivro extends BancoDeMidias{

    public BancoAudioLivro() {
        super();
    }
 
    
     public int getTamanhoLista() {
        return this.getMidias().size();
    }
     
    public void gravar(String bancoPodcasts) throws Exception {
        /**
         * Abre o arquivo para escrita
         */
        FileOutputStream outFile = new FileOutputStream(new File(bancoPodcasts));
        BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

        buff.write(getTamanhoLista() + "\r\n");
        for (Midia midia : super.getMidias()) {
            buff.write(midia.toFile() + "\r\n");
        }
        /**
         * Fecha o arquivo
         */
        buff.close();
        outFile.close();
    }
    
    public void ler(String filme) throws Exception {
        FileInputStream inFile;
        BufferedReader buff;
        AudioLivro audioLivroArquivo;
        String linha, caminho, titulo, descricao, idioma, autores, local, editora, genero;
        int ano, id, duracao;
       

         /*
         * Abre o arquivo para leitura
         */
         
        inFile = new FileInputStream(new File(filme));
        buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));

        linha = buff.readLine();
        int totalDeAudiolivros = Integer.parseInt(linha);

        for (int i = 0; i < totalDeAudiolivros; i++) {

            linha = buff.readLine();
            id = Integer.parseInt(linha);

            caminho = buff.readLine();

            titulo = buff.readLine();

            linha = buff.readLine();
            ano = Integer.parseInt(linha);

            descricao = buff.readLine();

            idioma = buff.readLine();

            genero = buff.readLine();
            
            autores = buff.readLine();
            
            local = buff.readLine();
            
            editora = buff.readLine();

            linha = buff.readLine();
            duracao = Integer.parseInt(linha);

            audioLivroArquivo = new AudioLivro(caminho, titulo, descricao, ano, id, genero, idioma, autores, local, editora, duracao);

            this.cadastrar(audioLivroArquivo);

            buff.readLine();
        }
        buff.close();
        inFile.close();

    }

    
     public List<Midia> ordenarOddEven(BancoAudioLivro bancoAudioLivro) {
    {
        boolean houveTroca = false; 
        List<Midia> midias = bancoAudioLivro.getMidias();
 
        while (!houveTroca)
        {
            houveTroca = true;
            int temp =0;
               for(int i = 1; i < bancoAudioLivro.getTamanhoLista()-2; i=i+2)
            {
                AudioLivro al1 = (AudioLivro) midias.get(i);
                AudioLivro al2 = (AudioLivro) midias.get(i + 1);
                if (al1.compararAno(al2)) {
                    midias.set(i, al2);
                    midias.set(i + 1, al1);
                    bancoAudioLivro.setMidias(midias);
                    houveTroca = true;
            }
            }
 
            // Perform Bubble sort on even indexed element
            for(int i = 0; i < bancoAudioLivro.getTamanhoLista()-1; i=i+1)
            {
                AudioLivro al1 = (AudioLivro) midias.get(i);
                AudioLivro al2 = (AudioLivro) midias.get(i + 1);
                if (al1.compararAno(al2)) {
                    midias.set(i, al2);
                    midias.set(i + 1, al1);
                    bancoAudioLivro.setMidias(midias);
                    houveTroca = true;
            }
            }
        }
 
        return midias;
     }
    }

}
    

