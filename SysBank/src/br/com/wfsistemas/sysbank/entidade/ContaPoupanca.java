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
public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca(double taxaJuros, Cliente cliente,
         String tipoConta, String senha) {
        super( cliente, tipoConta, senha);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
