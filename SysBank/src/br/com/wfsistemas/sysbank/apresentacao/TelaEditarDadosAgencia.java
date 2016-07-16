/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.apresentacao;

import br.com.wfsistemas.sysbank.entidade.Agencia;
import br.com.wfsistemas.sysbank.excecao.CampoVazioException;
import br.com.wfsistemas.sysbank.negocio.AgenciaBO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wff
 */
public class TelaEditarDadosAgencia extends javax.swing.JFrame {

    private Agencia agencia = null;
    TelaConsultaAgencia telaConsultaAgencia = null;
    
    public TelaEditarDadosAgencia(TelaConsultaAgencia telaConsultaAgencia, Agencia agencia) {
        initComponents();
        this.agencia = agencia;
        this.setValoresCampos();
        this.telaConsultaAgencia = telaConsultaAgencia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPainelCadastro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        btnAlterarDados = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCamposObrigatorios = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroAgencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPainelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Agencias Bancarias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome.setText("* Nome:");

        lblTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTelefone.setText("*Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEndereco.setText("* Endereço:");

        btnAlterarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wfsistemas/sysbank/apresentacao/icones/business133.png"))); // NOI18N
        btnAlterarDados.setText("Alterar Dados");
        btnAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wfsistemas/sysbank/apresentacao/icones/cross79.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCamposObrigatorios.setForeground(new java.awt.Color(255, 51, 51));
        lblCamposObrigatorios.setText("Campos Obrigatoriso (*)");

        lblCidade.setText("* Cidade:");

        lblEstado.setText("* Estado:");

        jLabel1.setText("Numero Agencia:");

        javax.swing.GroupLayout pnlPainelCadastroLayout = new javax.swing.GroupLayout(pnlPainelCadastro);
        pnlPainelCadastro.setLayout(pnlPainelCadastroLayout);
        pnlPainelCadastroLayout.setHorizontalGroup(
            pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainelCadastroLayout.createSequentialGroup()
                        .addGroup(pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEndereco)
                            .addGroup(pnlPainelCadastroLayout.createSequentialGroup()
                                .addGroup(pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCidade)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCamposObrigatorios)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPainelCadastroLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(txtNumeroAgencia)))
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(pnlPainelCadastroLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(pnlPainelCadastroLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(149, 149, 149))))
        );
        pnlPainelCadastroLayout.setVerticalGroup(
            pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(lblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(pnlPainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarDados)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(lblCamposObrigatorios)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPainelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPainelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosActionPerformed
        try{
            lerDadosTela();
            AgenciaBO agenciaBO = new AgenciaBO();
            agenciaBO.atualizarDados(this.agencia);
            limparDadosTela();
            exibirMensagemSucesso("Agencia Alterada com sucesso!", "Editar Dados de Agencia");
        }catch(CampoVazioException cve){
            exibirMensagemErro(cve.getMessage(), "Editar Dados ");
        }catch(SQLException e){
            exibirMensagemErro("Erro desconhecido. Contate com o administrador", "Editar Dados ");
        }
        this.dispose();
    }//GEN-LAST:event_btnAlterarDadosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void setValoresCampos(){
        txtNumeroAgencia.setText(String.valueOf(agencia.getNumeroAgencia()));
        txtNumeroAgencia.setEnabled(false);
        txtNome.setText(agencia.getNome());
        txtTelefone.setText(agencia.getTelefone());
        txtEndereco.setText(agencia.getEndereco());
        txtCidade.setText(String.valueOf(agencia.getCidade()));
        txtEstado.setText(agencia.getEstado());
    }
    public void lerDadosTela(){
        String nome = txtNome.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String endereco = txtEndereco.getText().trim();
        String cidade = txtCidade.getText().trim();
        String estado = txtEstado.getText().trim();
        
        String mensagem = "";
        
        if(nome.isEmpty()){
            mensagem = mensagem + "\nCampo nome é obrigatório.";
        }
        if(endereco.isEmpty()){
            mensagem = mensagem + "\nCampo endereço é obrigatório.";
        }
        if(telefone.isEmpty()){
            mensagem = mensagem + "\nCampo telefone é obrigatório.";
        }
        if(cidade.isEmpty()){
            mensagem = mensagem + "\nCampo cidade é obrigatório.";
        }
        if(estado.isEmpty()){
            mensagem = mensagem + "\nCampo estado é obrigatório.";
        }
        
        if(mensagem == "" || mensagem == null){
           agencia.setNome(nome);
           agencia.setCidade(cidade);
           agencia.setEstado(estado);
           agencia.setTelefone(telefone);
           agencia.setEndereco(endereco);
        }else{
           throw new CampoVazioException(mensagem);
        }
    }

    private void limparDadosTela(){
        txtNome.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");

    }
    private void exibirMensagemErro(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void exibirMensagemSucesso(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDados;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCamposObrigatorios;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlPainelCadastro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroAgencia;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}