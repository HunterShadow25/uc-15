
package Telas.Cadastro;

import Beans.Usuarios;
import Beans.UsuariosDTO;
import DAO.UsuariosDAO;
import Telas.Listagem.ListUsuariosView;
import Telas.MenuView;
import javax.swing.JOptionPane;

/**
 * tela de cadastro de usuarios
 *
 * @javadoc
 */
public class CadUsuariosView extends javax.swing.JFrame {

    public CadUsuariosView() {
        initComponents();
        lblNivel.setText(UsuariosDTO.getUsuarios());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbnVoltar = new javax.swing.JButton();
        jbnListagem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jbNivel = new javax.swing.JComboBox<>();
        jbnLimpar = new javax.swing.JButton();
        jbnSalvar = new javax.swing.JButton();
        lblNivel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 154, 103));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Usuarios");

        jbnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jbnVoltar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbnVoltar.setForeground(new java.awt.Color(255, 215, 0));
        jbnVoltar.setText("Voltar");
        jbnVoltar.setToolTipText("volta para o menu");
        jbnVoltar.setBorder(null);
        jbnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnVoltarActionPerformed(evt);
            }
        });

        jbnListagem.setBackground(new java.awt.Color(0, 0, 0));
        jbnListagem.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbnListagem.setForeground(new java.awt.Color(255, 215, 0));
        jbnListagem.setText("Listagem");
        jbnListagem.setToolTipText("vai para listagem de usuarios");
        jbnListagem.setBorder(null);
        jbnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnListagemActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(196, 136, 76));

        lblNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");

        txtNome.setBackground(new java.awt.Color(222, 222, 222));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSenha.setBackground(new java.awt.Color(222, 222, 222));
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCpf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(0, 0, 0));
        lblCpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCpf.setText("Senha");

        lblEmail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Nivel de Acesso");

        jbNivel.setBackground(new java.awt.Color(222, 222, 222));
        jbNivel.setForeground(new java.awt.Color(0, 0, 0));
        jbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Operador" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtSenha)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCpf)
                            .addComponent(lblEmail))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbNivel, 0, 272, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        jbnLimpar.setBackground(new java.awt.Color(255, 215, 0));
        jbnLimpar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        jbnLimpar.setText("Limpar");
        jbnLimpar.setToolTipText("limpa os campos de texto");
        jbnLimpar.setBorder(null);
        jbnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnLimparActionPerformed(evt);
            }
        });

        jbnSalvar.setBackground(new java.awt.Color(19, 249, 61));
        jbnSalvar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jbnSalvar.setText("Salvar");
        jbnSalvar.setToolTipText("salva todos os dados digitados");
        jbnSalvar.setBorder(null);
        jbnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalvarActionPerformed(evt);
            }
        });

        lblNivel.setForeground(new java.awt.Color(0, 0, 0));
        lblNivel.setText("Overwatch");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nivel de acesso:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNivel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblNivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jbnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jbnVoltar.getAccessibleContext().setAccessibleDescription("volta para o menu");
        jbnListagem.getAccessibleContext().setAccessibleDescription("vai para a listagem de livros");
        jbnLimpar.getAccessibleContext().setAccessibleDescription("clique aqui para limpar os campos");
        jbnSalvar.getAccessibleContext().setAccessibleDescription("clique aqui para salvar as informaçoes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnVoltarActionPerformed
        //troca de tela
        MenuView mv = new MenuView();
        mv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnVoltarActionPerformed

    private void jbnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnListagemActionPerformed
        //troca de tela
        ListUsuariosView lu = new ListUsuariosView();
        lu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnListagemActionPerformed

    private void jbnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnLimparActionPerformed
        txtNome.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_jbnLimparActionPerformed

    private void jbnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalvarActionPerformed

        if (txtNome.getText().isBlank() || txtSenha.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "preencha todos os campos antes de prosseguir");
        } else {
            try {
                Usuarios user = new Usuarios();
                UsuariosDAO ud = new UsuariosDAO();
                user.setNome(txtNome.getText());
                user.setSenha(txtSenha.getText());
                user.setNivel(jbNivel.getSelectedItem().toString());

                ud.inserir(user);
                txtNome.setText("");
                txtSenha.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "preencha todos os campos corretamente antes de proseguir", "AVISO", 2);
            }
        }
    }//GEN-LAST:event_jbnSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadUsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadUsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadUsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadUsuariosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadUsuariosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jbNivel;
    private javax.swing.JButton jbnLimpar;
    private javax.swing.JButton jbnListagem;
    private javax.swing.JButton jbnSalvar;
    private javax.swing.JButton jbnVoltar;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
