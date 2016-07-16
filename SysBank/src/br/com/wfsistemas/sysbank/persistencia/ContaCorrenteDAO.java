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
public class ContaCorrenteDAO extends ContaDAO{
    
    private static final String SQL_INSERT_CONTA_CORRENTE = "INSERT INTO CONTA_CORRENTE(NUMERO_CONTA_FK, CPF_CLIENTE_FK,TAXA_SERVICOS,LIMITE) VALUES (?, ?, ?, ?,)";
    
    public void criar(ContaCorrente contaCorrente) throws SQLException{
        PreparedStatement comando = null;
        Connection conexao = null;  
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_INSERT_CONTA_CORRENTE);     
            comando.setInt(1, contaCorrente.getNumeroConta());
            comando.setString(2, contaCorrente.getCliente().getCpf());
            comando.setDouble(3, contaCorrente.getTaxaServicos());           
            comando.setDouble(4, contaCorrente.getLimite());  
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
