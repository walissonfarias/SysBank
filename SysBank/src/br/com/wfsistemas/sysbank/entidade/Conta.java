/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.entidade;

import br.com.wfsistemas.sysbank.entidade.Cliente;
import br.com.wfsistemas.sysbank.entidade.Usuario;
import java.util.Random;

/**
 *
 * @author wff
 */
public class Conta {
    protected int numeroConta;
    public Cliente cliente = new Cliente();
    protected double saldo;
    protected String tipoConta;
    protected String senha;
    protected boolean status;
    
    public Conta( Cliente cliente,String tipoConta, String senha) {
        Random ra = new Random();
        this.numeroConta = ra.nextInt(99999);
        this.cliente = cliente;
        this.saldo = 0.0;
        this.tipoConta = tipoConta;
        this.senha = senha;
    }

    public Conta() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
