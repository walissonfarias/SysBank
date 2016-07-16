/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.persistencia;

import br.com.wfsistemas.sysbank.entidade.Cliente;
import br.com.wfsistemas.sysbank.entidade.Conta;
import br.com.wfsistemas.sysbank.entidade.Usuario;
import br.com.wfsistemas.sysbank.entidade.ContaCorrente;
import br.com.wfsistemas.sysbank.entidade.ContaPoupanca;
import br.com.wfsistemas.sysbank.entidade.ContaSalario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wff
 */
public class ContaDAO {
    private static final String SQL_INSERT_CONTA = "INSERT INTO CONTA(NUMERO_CONTA, CPF_CLIENTE_FK, SALDO,SENHA, TIPO_CONTA) VALUES (  ?, ?, ? ,?, ? )";
    private static final String SQL_SELECT_BY_CPF = "SELECT * FROM CONTA WHERE CPF_CLIENTE_FK = ? AND F = TRUE";
    private static final String SQL_SELECT_BY_NUMERO_CONTA = "SELECT * FROM CONTA WHERE NUMERO_CONTA = ?";
    private static final String SQL_SELECT_TODOS = "SELECT * FROM CONTA WHERE F = TRUE";
    private static final String SQL_UPDATE_DADOS = "UPDATE CONTA SET WHERE AND ";
    private static final String SQL_DESATIVAR_POR_CPF = "UPDATE CONTA SET F = FALSE WHERE CPF = ?";
       
    public void criar(Conta conta) throws SQLException{
        ContaCorrenteDAO contaCorrenteDAO = null;
        ContaPoupancaDAO contaPoupancaDAO = null;
        ContaSalarioDAO contaSalarioDAO = null;
        PreparedStatement comando = null;
        Connection conexao = null; 
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_INSERT_CONTA);
            comando.setInt(1, conta.getNumeroConta());
            comando.setString(2, conta.cliente.getCpf());
            comando.setDouble(3, conta.getSaldo());
            comando.setString(4, conta.getSenha());
            comando.setString(5, conta.getTipoConta());
            comando.execute();
            conexao.commit();
            
        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
            throw new RuntimeException();
        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }
    
    public List<Conta> buscarTodos() throws SQLException{
        List<Conta> contas = new ArrayList<>();
        Conta conta = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_SELECT_TODOS);
            resultado = comando.executeQuery();
            
            while(resultado.next()){
                conta = new Conta();
                conta.setNumeroConta(resultado.getInt(1));
                conta.cliente.setCpf(resultado.getString(2));
                conta.setSaldo(resultado.getDouble(3));
                conta.setSenha(resultado.getString(4));
                conta.setTipoConta(resultado.getString(5));
                conta.setStatus(resultado.getBoolean("STATUS"));
                contas.add(conta);
            }
            
        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
            throw new RuntimeException();
        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        return contas;
    }
    public Conta buscarByCPF(String cpf) throws SQLException{
        Conta conta = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_SELECT_BY_CPF);
            comando.setString(1, cpf);
            resultado = comando.executeQuery();
           
            while(resultado.next()){
                conta = new Conta();
                conta.setNumeroConta(resultado.getInt(2));
                conta.cliente.setCpf(resultado.getString(2));
                conta.setSaldo(resultado.getDouble(3));
                conta.setSenha(resultado.getString(4));
                conta.setTipoConta(resultado.getString(5));
                conta.setStatus(resultado.getBoolean("STATUS"));
            }
            
        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
            throw new RuntimeException();
        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        
        return conta;
    }
    public Conta buscarByNumeroConta(int numeroConta) throws SQLException{
        Conta conta = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_SELECT_BY_NUMERO_CONTA);
            comando.setInt(1, numeroConta);
            resultado = comando.executeQuery();
           
            while(resultado.next()){
                conta = new Conta();
                conta.setNumeroConta(resultado.getInt(1));
                conta.cliente.setCpf(resultado.getString(2));
                conta.setSaldo(resultado.getDouble(3));
                conta.setSenha(resultado.getString(4));
                conta.setTipoConta(resultado.getString(6));
                conta.setStatus(resultado.getBoolean("STATUS"));
            }
            
        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
            throw new RuntimeException();
        } finally {
            if (comando != null && !comando.isClosed()) {
                comando.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        
        return conta;
    }
}
