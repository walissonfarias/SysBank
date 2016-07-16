/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.negocio;
import br.com.wfsistemas.sysbank.excecao.NumeroContaExistenteException;
import br.com.wfsistemas.sysbank.excecao.ClienteCpfExistenteException;
import br.com.wfsistemas.sysbank.entidade.Cliente;
import br.com.wfsistemas.sysbank.entidade.Conta;
import br.com.wfsistemas.sysbank.entidade.ContaCorrente;
import br.com.wfsistemas.sysbank.entidade.ContaPoupanca;
import br.com.wfsistemas.sysbank.entidade.ContaSalario;
import br.com.wfsistemas.sysbank.entidade.Usuario;
import br.com.wfsistemas.sysbank.persistencia.ContaCorrenteDAO;
import br.com.wfsistemas.sysbank.persistencia.ContaDAO;
import br.com.wfsistemas.sysbank.persistencia.ContaPoupancaDAO;
import br.com.wfsistemas.sysbank.persistencia.ContaSalarioDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author wff
 */
public class ContaBO {
    ContaDAO contaDAO = new ContaDAO();
    public void criarContaCorrente(ContaCorrente contaCorrente) throws SQLException{
       contaDAO.criar((Conta)contaCorrente);
        ContaCorrenteDAO contaCorrenteDAO = new ContaCorrenteDAO();
        contaCorrenteDAO.criar(contaCorrente);
        
    }
    public void criarContaPoupanca(ContaPoupanca contaPoupanca) throws SQLException{
        contaDAO.criar((Conta)contaPoupanca);
        ContaPoupancaDAO contaPoupancaDAO = new ContaPoupancaDAO();
        contaPoupancaDAO.criar(contaPoupanca);
        
    }
    public void criarContaSalario(ContaSalario contaSalario) throws SQLException{
        contaDAO.criar((Conta)contaSalario);
        ContaSalarioDAO contaSalarioDAO = new ContaSalarioDAO();
        contaSalarioDAO.criar(contaSalario);
        
    }
    public static boolean verificarNumeroConta(int numeroConta,boolean status) throws SQLException{
        Conta numeroContaExistente = null;
        ContaDAO contaDAO = new ContaDAO();
        numeroContaExistente = contaDAO.buscarByNumeroConta(numeroConta);
        if(numeroContaExistente != null){
            throw new NumeroContaExistenteException("Existe uma conta cadastrada com esse numero.");
        }else{
            status = true;
            return status;
        }
    }
    
    public List<Conta> buscarTodos() throws SQLException{
        List<Conta> contas = null;
        ContaDAO contaDAO = new ContaDAO();
        contas = contaDAO.buscarTodos();
        return contas;
    }
    /*public void depositar(Conta conta,double valorDeposito){
        if(valorDeposito > 0.0){
            ContaDAO contaDAO = new ContaDAO();
            this.saldo += valorDeposito;
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Operção não realizada. Valor depósito inválido!");
        }	
    }
    public void sacar(Conta conta,double valorSaque){
        if(valorSaque>0){
            ContaDAO contaDAO = new ContaDAO();
            if(this.saldo >= valorSaque){
                contaDAO.sacar();
		System.out.println("Saque realizado com sucesso!\n");
            }
            else{
		System.out.println("Saque não realizado, saldo insuficiente!\n");
            }
	}else{
            System.out.println("Saque não realizado, valor inválido!\n");
	}
    }*/
    
}
