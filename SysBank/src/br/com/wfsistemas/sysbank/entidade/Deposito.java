/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.entidade;

/**
 *
 * @author wff
 */
public class Deposito {
    private String agencia;
    private String numeroConta;
    private double ValorDeposito;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getValorDeposito() {
        return ValorDeposito;
    }

    public void setValorDeposito(double strValorDeposito) {
        this.ValorDeposito = strValorDeposito;
    }
    
}
