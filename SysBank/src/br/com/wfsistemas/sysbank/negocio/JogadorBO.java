/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package br.com.wfsistemas.fifa.negocio;

import br.com.wfsistemas.fifa.entidade.Jogador;
import br.com.wfsistemas.fifa.excecao.ConsultaSemResultadoException;
import br.com.wfsistemas.fifa.excecao.JogadorDuplicadoException;
import br.com.wfsistemas.fifa.persistencia.JogadorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wff
 */
/*
public class JogadorBO {
    public void criar(Jogador jogador) throws SQLException{
        this.verificarJogadorExistente(jogador);
        JogadorDAO jogadorDAO = new JogadorDAO();
        jogadorDAO.criar(jogador);
    }
    public List<Jogador> buscarTodos() throws SQLException{
        JogadorDAO jogadorDAO = new JogadorDAO();
        return jogadorDAO.buscarTodos();
    }
    public void verificarJogadorExistente(Jogador jogador) throws SQLException{
        JogadorDAO jogadorDAO = new JogadorDAO();
        try{
            Jogador jogadorExiste = jogadorDAO.buscarJogador(jogador.getNome());
            if(jogadorExiste != null){
                throw new JogadorDuplicadoException(jogadorExiste.getNome(),jogadorExiste.getNomeTime());
            }
        }catch( ConsultaSemResultadoException e){
            
        }
        
    }
    public void verificarNumeroCamisa(Jogador jogador){
        
    }
}
*/