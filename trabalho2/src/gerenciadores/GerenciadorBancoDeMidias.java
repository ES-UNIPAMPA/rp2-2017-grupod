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
//Interface para conjuntos de mídias
public interface GerenciadorBancoDeMidias {
    public boolean cadastrar(Midia midia);
    public Midia consultar();
    public boolean excluir();
    public boolean editar();
    public List<Midia> exibir();
}
