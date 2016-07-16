/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.excecao;
import br.com.wfsistemas.sysbank.excecao.BancoException;

/**
 *
 * @author wff
 */
public class ClienteInvalidoException extends BancoException{
    
    public ClienteInvalidoException(String mensagem){
        super(mensagem);
    }
}
