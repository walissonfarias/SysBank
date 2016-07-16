/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.excecao;

/**
 *
 * @author wff
 */
public class CampoVazioException extends BancoException{
 
    public CampoVazioException(String mensagem){
        super(mensagem);
    }
}
