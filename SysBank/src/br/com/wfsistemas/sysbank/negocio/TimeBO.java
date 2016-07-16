/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
package br.com.wfsistemas.fifa.negocio;

import br.com.wfsistemas.fifa.entidade.Time;
import br.com.wfsistemas.fifa.persistencia.TimeDAO;
import br.com.wfsistemas.fifa.excecao.TimeDuplicadoException;
import br.com.wfsistemas.fifa.excecao.PaisInvalidoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wff
 */

/*
public class TimeBO {
    public void criar(Time time) throws SQLException{
        time.setPais(time.getPais().toUpperCase());
        this.validarNomePais(time);
        this.verificaTimeExistente(time);
        TimeDAO timeDAO = new TimeDAO();
        timeDAO.criar(time);
    }
    public List<Time> buscarTimes() throws SQLException{
        TimeDAO timeDAO = new TimeDAO();
        return timeDAO.buscarTimes();
    }
    public void verificaTimeExistente(Time time) throws SQLException{
        TimeDAO timeDAO = new TimeDAO();
        Time timeExiste = timeDAO.buscarTime(time.getNome());
        if(timeExiste != null){
            throw new TimeDuplicadoException(time.getNome());
        }
    }

    private void validarNomePais(Time time) {
        if(time.getPais().trim().length() > 3){
            throw new PaisInvalidoException();
        }
    }
}
*/