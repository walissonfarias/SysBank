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
public class ContaSalario extends Conta{
    private String nomeEmpresa;
    private double valorSalario;

    public ContaSalario(String nomeEmpresa, double valorSalario, Cliente cliente, String tipoConta, String senha) {
        super(cliente, tipoConta, senha);
        this.nomeEmpresa = nomeEmpresa;
        this.valorSalario = valorSalario;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }
}
