/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.negocio;

import br.com.wfsistemas.sysbank.excecao.ArgumentInvalidExeception;
import br.com.wfsistemas.sysbank.excecao.AgenciaExistenteException;
import br.com.wfsistemas.sysbank.persistencia.AgenciaDAO;
import br.com.wfsistemas.sysbank.entidade.Agencia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author wff
 */
public class AgenciaBO {

/**
 *
 * @author wff
 */

    public void criar(Agencia agencia) throws SQLException {
        this.verificaAgenciaExistente(agencia);
        AgenciaDAO agenciaDAO = new AgenciaDAO();
        agenciaDAO.criar(agencia);
    }

    public List<Agencia> buscarTodos() throws SQLException {
        List<Agencia> agencias =  new ArrayList<>();
        AgenciaDAO agenciaDAO = new AgenciaDAO();
        agencias = agenciaDAO.buscarTodos();
        return agencias;
    }
    
    public void verificaAgenciaExistente(Agencia agencia) throws SQLException {
        Agencia agenciaExistente = null;
        AgenciaDAO agenciaDAO = new AgenciaDAO();
        agenciaExistente = agenciaDAO.buscarByNumeroAgencia(agencia.getNumeroAgencia());
        if (agenciaExistente != null) {
            throw new AgenciaExistenteException("Existe uma agencia cadastrado com esse nome");
        }
    }
    public void atualizarDados(Agencia agencia) throws SQLException {
        AgenciaDAO agenciaDAO = new AgenciaDAO();
        agenciaDAO.atualizarDados(agencia);
    }
    public void deletarAgencia(Agencia agencia) throws SQLException {
        AgenciaDAO agenciaDAO = new AgenciaDAO();
        Agencia agenciaExiste = null;
        agenciaExiste = agenciaDAO.buscarByNumeroAgencia(agencia.getNumeroAgencia());
        if (agenciaExiste != null) {
            agenciaDAO.desativarAgencia(agencia);
        } else {
            throw new ArgumentInvalidExeception("Impossível excluir usuário. Este não se encontra em nossa base de dados");
        }
    }
}

