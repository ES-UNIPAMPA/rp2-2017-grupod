/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadores;

import bancoDeMidias.Midia;
import java.util.List;

/**
 *
 * @author SABRINA
 */
//Interface para cada Mídia
public interface GerenciadorDoSistema {
    public Midia cadastrar(Midia midia);
    public Midia consultar(String titulo);
    public Midia excluir(Midia midia);
    public void editar(Midia midia);
    public Midia exibir(String titulo);
    public void ordenar(List<Midia> midias);
}
