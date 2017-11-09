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

    /**
     *
     * @param id
     * @return Midia
     */
    public Midia consultar(int id);
    public boolean excluir();
    public boolean editar(int id, Midia novo);
    public List<Midia> exibir();
}
