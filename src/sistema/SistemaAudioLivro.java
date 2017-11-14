/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import bancoDeMidias.BancoDeMidias;
import gerenciadores.GerenciadorDoSistema;
import midias.AudioLivro;
import midias.Midia;
import sistema.SistemaGeral;

/**
 *
 * @author Rafae
 */

public class SistemaAudioLivro extends SistemaGeral implements GerenciadorDoSistema{
  
    BancoDeMidias listaAudioLivro;
    AudioLivro audiolivro;
    String caminho;
    
    public SistemaAudioLivro(){
        super();
        this.listaAudioLivro = new BancoDeMidias();
    }
    
    

    public BancoDeMidias getListaAudioLivro() {
        return listaAudioLivro;
    }

    public void setListaAudioLivro(BancoDeMidias listaAudioLivro) {
        this.listaAudioLivro = listaAudioLivro;
    }

    public AudioLivro getAudiolivro() {
        return audiolivro;
    }

    public void setAudiolivro(AudioLivro audiolivro) {
        this.audiolivro = audiolivro;
    }
    
    
    public String getCaminho(){
        return caminho;
    }
    
    public void setCaminho(String absolutePath){
        this.caminho = absolutePath;
    }
   
  
    public Midia Cadastrar (Midia midia){
        this.audiolivro = (AudioLivro) midia;
        listaAudioLivro.cadastrar(this.audiolivro);
        return this.audiolivro;
        
        
    }

   
    
    
    
}
