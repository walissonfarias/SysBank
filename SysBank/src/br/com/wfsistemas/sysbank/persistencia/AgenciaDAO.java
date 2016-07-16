/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.persistencia;


import br.com.wfsistemas.sysbank.entidade.Agencia;
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
public class AgenciaDAO {
    private static final String SQL_INSERT = "INSERT INTO AGENCIA(NUMERO_AGENCIA,NOME,ENDERECO, CIDADE, ESTADO, TELEFONE) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT_TODOS = "SELECT*FROM AGENCIA WHERE F = TRUE";
    private static final String SQL_UPDATE_DADOS = "UPDATE AGENCIA SET NOME =?,ENDERECO = ?, CIDADE =?, ESTADO =?, TELEFONE =?  WHERE NUMERO_AGENCIA = ?";
    private static final String SQL_DESATIVAR_POR_ID = "UPDATE AGENCIA SET F = FALSE WHERE NUMERO_AGENCIA = ?";
    private static final String SQL_SELECT_BY_NUMERO_AGENCIA = "SELECT * FROM AGENCIA WHERE NOME = ? AND F = TRUE";
    
    public void criar(Agencia agencia) throws SQLException{
        PreparedStatement comando = null;
        Connection conexao = null;    
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_INSERT);
            comando.setInt(1, agencia.getNumeroAgencia());
            comando.setString(2, agencia.getNome());
            comando.setString(3, agencia.getEndereco());
            comando.setString(4, agencia.getCidade());
            comando.setString(5, agencia.getEstado());
            comando.setString(6, agencia.getTelefone());
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
    
    public List<Agencia> buscarTodos() throws SQLException{
        List<Agencia> agencias = new ArrayList<>();
        Agencia agencia = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_SELECT_TODOS);
            resultado = comando.executeQuery();
            
            while(resultado.next()){
                agencia = new Agencia();
                agencia.setNumeroAgencia(resultado.getInt(1));
                agencia.setNome(resultado.getString(2));
                agencia.setEndereco(resultado.getString(3));
                agencia.setCidade(resultado.getString(4));
                agencia.setEstado(resultado.getString(5));
                agencia.setTelefone(resultado.getString(6));            
                agencia.setPermissao(resultado.getInt(7));
                
                agencias.add(agencia);

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
        return agencias;
    }
    public Agencia buscarByNumeroAgencia(int numeroAgencia) throws SQLException{
        Agencia agencia = null;
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_SELECT_BY_NUMERO_AGENCIA);
            comando.setInt(1, numeroAgencia);
            resultado = comando.executeQuery();
            
            while(resultado.next()){
                agencia = new Agencia();
                agencia.setNome(resultado.getString(2));
                agencia.setEndereco(resultado.getString(3));
                agencia.setCidade(resultado.getString(4));
                agencia.setEstado(resultado.getString(5));
                agencia.setTelefone(resultado.getString(6));
                agencia.setPermissao(resultado.getInt(7));
                agencia.setStatus(resultado.getBoolean("STATUS"));
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
        return agencia;
    }
    
    
    public void atualizarDados(Agencia agencia) throws SQLException{
        PreparedStatement comando = null;
        Connection conexao = null;    
        try{
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_UPDATE_DADOS);
            comando.setInt(6, agencia.getNumeroAgencia());
            comando.setString(1, agencia.getNome());
            comando.setString(2, agencia.getEndereco());
            comando.setString(3, agencia.getCidade());
            comando.setString(4, agencia.getEstado());
            comando.setString(5, agencia.getTelefone());
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
    public void desativarAgencia(Agencia agencia) throws SQLException{
        Connection conexao = null;
        PreparedStatement comando = null;
        
        try {
            conexao = BancoDadosUtil.getConnection();
            comando = conexao.prepareStatement(SQL_DESATIVAR_POR_ID);
            comando.setInt(1, agencia.getNumeroAgencia());
            comando.execute();
            conexao.commit();
        } catch (Exception e) {
            if (conexao != null) {
                conexao.rollback();
            }
            throw new RuntimeException(e);
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
