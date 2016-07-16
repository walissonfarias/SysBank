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
public class ContaCorrente extends Conta{
    protected double taxaServicos;
    protected double limite; 

    public ContaCorrente(double taxaServicos, double limite, 
            Cliente cliente, String tipoConta, String senha) {
        super(cliente, tipoConta, senha);
        this.taxaServicos = taxaServicos;
        this.limite = limite;
    }

    public double getTaxaServicos() {
        return taxaServicos;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setTaxaServicos(double taxaServiços) {
        this.taxaServicos = taxaServiços;
    }
}
