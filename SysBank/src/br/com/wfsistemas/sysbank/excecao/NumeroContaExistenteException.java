/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.excecao;

import java.sql.SQLException;

/**
 *
 * @author wff
 */
public class NumeroContaExistenteException extends SQLException{

    public NumeroContaExistenteException(String message) {
        super(message);
    }

}
