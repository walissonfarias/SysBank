/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.apresentacao.ClassesUtil;

/**
 *
 * @author wff
 */
public class NovoClass {
    /*
    Apresentação inicializar dados
    =>conversao Data para String 
    String dataNascimento = 
                formatador.format(alunoEmEdicao.getDataNascimento());
        txtDataNascimento.setText(dataNascimento);
    
    =>conversao Int para String
    String matricula = 
                Integer.toString(alunoEmEdicao.getMatricula());
        txtMatricula.setText(matricula);
    
    =>combobox
    int indexCursoAluno = 0;
        for (int i=0; i <  cursos.size(); i++){
            Curso curso = cursos.get(i);
            if(curso.getId() == alunoEmEdicao.getIdCurso()){
                indexCursoAluno = i;
                break;
            }
        }        
        cmbCurso.setSelectedIndex(indexCursoAluno);
    
    Apresentação ler dados
    =>conversao String para Data
    jogador.setDataNascimento(formatador.parse(txtDataNascimento.getText()));
    
    int posicaoSelecionada = cmbCurso.getSelectedIndex();
    Curso cursoSelecionado = cursos.get(posicaoSelecionada);
    alunoEmEdicao.setIdCurso(cursoSelecionado.getId());
    
    int matricula = Integer.parseInt(txtMatricula.getText());
    alunoEmEdicao.setMatricula(matricula);
    
    if (rdoFeminino.isSelected()) {
            alunoEmEdicao.setSexo('F');
        } else if (rdoMasculino.isSelected()) {
            alunoEmEdicao.setSexo('M');
        }
    
    private void carregarComboCurso() throws SQLException {
        CursoBO cursoBO = new CursoBO();
        cursos = cursoBO.buscarTodos();

        cmbCurso.removeAllItems();

        for (Curso curso : cursos) {
            cmbCurso.addItem(curso.getNome());
        }
    }
    Classe DAO
        java.sql.Date data = new java.sql.Date(aluno.getDataNascimento().getTime());
        comando.setDate(4, data);
    
        String sexo = String.valueOf(aluno.getSexo());
        //String sexo = Character.toString(aluno.getSexo());            
        //String sexo = ""+aluno.getSexo();
    */
}
