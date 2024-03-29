/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.apresentacao;

import br.com.wfsistemas.sysbank.apresentacao.ClassesUtil.Criptografia;
import br.com.wfsistemas.sysbank.excecao.CampoVazioException;
import br.com.wfsistemas.sysbank.excecao.SenhaInvalidaException;
import br.com.wfsistemas.sysbank.excecao.UsuarioLoginExistenteException;
import br.com.wfsistemas.sysbank.entidade.Usuario;
import br.com.wfsistemas.sysbank.negocio.UsuarioBO;
import java.awt.Cursor;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.LoginException;
import javax.swing.JOptionPane;
/**
 *
 * @author wff
 */
public class TelaAlterarSenha extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlterarSenha
     */
    
    private CadastroUsuarioForm telaAnterior;
    private Usuario usuario;
    
    public TelaAlterarSenha(Usuario usuario){
        initComponents();
        this.telaAnterior = telaAnterior;
        this.usuario = usuario;
        this.txtLogin.setText(usuario.getLogin());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        lblRepitaSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtRepitaSenha = new javax.swing.JPasswordField();
        lblDadosLogin = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCadastrar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblSenha.setText("Senha (*):");

        lblRepitaSenha.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblRepitaSenha.setText("Repita a senha (*): ");

        txtLogin.setEnabled(false);

        lblDadosLogin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblDadosLogin.setText("Preenchar os dados de login");
        lblDadosLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblLogin.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblLogin.setText("Login (*):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblDadosLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRepitaSenha))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRepitaSenha)
                            .addComponent(txtLogin)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblDadosLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRepitaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepitaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        try{
            lerDados();
            UsuarioBO  usuarioBO = new UsuarioBO();
            usuarioBO.atualizarDadosSenha(usuario);
            this.dispose();
            exibirMensagemSucesso("Senha alterada com sucesso!", "Alterar senha de usuário");
        }catch(CampoVazioException cve){
            exibirMensagemErro(cve.getMessage(), "Cadastrar login usuário");
        }catch(SenhaInvalidaException sie){
            exibirMensagemErro(sie.getMessage(), "Cadastrar login usuário");
        }catch(SQLException e){
            exibirMensagemErro("Erro desconhecido contate com administrador", "Cadastrar login usuário");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed
    private void exibirMensagemErro(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void exibirMensagemSucesso(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    public void lerDados(){
        String senha = txtSenha.getText();
        String senha2 = txtRepitaSenha.getText();
       
        String mensagem = "";
        
     
        if(senha.isEmpty()){
            mensagem ="\nCampo SENHA é obrigatório.";
        }
        
        if(senha2.isEmpty()){
            mensagem = mensagem + "\nCampo REPITA A SENHA é obrigatório.";
        }
       
        
       if(mensagem == "" || mensagem == null){
           if(senha.equals(senha2)){
               try {
                   this.usuario.setSenha(Criptografia.exemploMD5(senha));
               } catch (NoSuchAlgorithmException ex) {
                   Logger.getLogger(TelaAlterarSenha.class.getName()).log(Level.SEVERE, null, ex);
               } catch (UnsupportedEncodingException ex) {
                   Logger.getLogger(TelaAlterarSenha.class.getName()).log(Level.SEVERE, null, ex);
               }
           }else{
               throw new SenhaInvalidaException("As senhas são diferentes. \n Elas devem ser iguais");
           }
       }else{
           throw new CampoVazioException(mensagem);
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDadosLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblRepitaSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtRepitaSenha;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    void ToFront() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
