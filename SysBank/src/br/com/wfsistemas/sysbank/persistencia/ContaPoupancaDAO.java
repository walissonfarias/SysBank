/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.persistencia;

import br.com.wfsistemas.sysbank.entidade.Cliente;
import br.com.wfsistemas.sysbank.entidade.Conta;
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
public class ContaPoupancaDAO extends ContaDAO {
    private static final String SQL_INSERT_CONTA_POUPANCA = "INSERT INTO CONTA_POUPANCA(NUMERO_CONTA_FK, CPF_CLIENTE_FK,TAXA_JUROS) VALUES (?, ?, ?)";
    
    public void criar(ContaPoupanca contaPoupanca) throws SQLException{
        PreparedStatement comando = null;
        Connection conexao = null;  
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_INSERT_CONTA_POUPANCA);              
            comando.setInt(1, contaPoupanca.getNumeroConta());
            comando.setString(2, contaPoupanca.cliente.getCpf());
            comando.setDouble(3, contaPoupanca.getTaxaJuros());
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
}
