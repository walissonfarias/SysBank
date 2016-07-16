/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package br.com.wfsistemas.hospitalelite.negocio;

import br.com.wfsistemas.hospitalelite.entidade.Paciente;
import br.com.wfsistemas.hospitalelite.persistencia.PacienteDAO;
import br.com.wfsistemas.hospitalelite.excecao.RendaInferiorException;
import br.com.wfsistemas.hospitalelite.excecao.IdadeInvalidaException;
import br.com.wfsistemas.hospitalelite.excecao.PacienteCpfExistenteException;
import java.sql.SQLException;
*/
/**
 *
 * @author wff
 */
/*
public class PacienteBO {

    public void criar(Paciente paciente) throws SQLException {
        //this.verificaPacienteDuplicado(paciente);
       // this.verificaIdade(paciente);
        //this.verificaRenda(paciente);
        PacienteDAO pacienteDAO = new PacienteDAO();
        pacienteDAO.criar(paciente);
    }
    private void verificaPacienteDuplicado(Paciente paciente) throws SQLException{
        PacienteDAO pacienteDAO = new PacienteDAO();
        Paciente pacienteExiste = pacienteDAO.buscarByCpf(paciente.getCpf());
        if(pacienteExiste !=null){
            throw new PacienteCpfExistenteException("Ja existe um paciente cadastrado com esse CPF");
        }  
    }
    private void verificaIdade(Paciente paciente){
        if(paciente.getIdade() < 12){
            throw new IdadeInvalidaException("Cadastro nao pertimito para menores de 12 anos");
        }else if( paciente.getIdade() > 65){
            throw new IdadeInvalidaException("Cadastro nao pertimito para idosos acima de 65 anos");
        }
    }
    private void verificaRenda(Paciente paciente){
        if(paciente.getRenda() <= 5000.00){
            throw new RendaInferiorException("Paciente possui renda abaixo do permitido");
        }
    }
    
    
}
*/