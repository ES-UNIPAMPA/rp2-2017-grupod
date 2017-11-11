/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import midias.Midia;
import java.util.List;

/**
 *
 * @author SABRINA
 */
//Interface para conjuntos de mídias
public interface GerenciadorBancoDeMidias {
    public boolean cadastrar(Midia midia);
    public Midia consultar(String titulo);
    public Midia excluir(String titulo);
    public boolean editar(int indice, int ano, String titulo, String descricao, String caminho);
    public List<Midia> exibir();
}
