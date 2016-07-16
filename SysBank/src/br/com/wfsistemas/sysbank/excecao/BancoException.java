/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wfsistemas.sysbank.excecao;

/**
 *
 * @author helder
 */
public class BancoException extends RuntimeException{
    
    public BancoException(String mensagem){
        super(mensagem);
    }
}
