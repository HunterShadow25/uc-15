package Telas.Cadastro;

import Beans.Livros;
import Beans.UsuariosDTO;
import DAO.LivrosDAO;
import Telas.Listagem.ListLivrosView;
import Telas.MenuView;
import javax.swing.JOptionPane;

public class CadLivrosView extends javax.swing.JFrame {

    public CadLivrosView() {
        initComponents();
          lblNivel.setText(UsuariosDTO.getUsuarios());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JbnVoltar = new javax.swing.JButton();
        jbnListagem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPreço = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtDescriçao = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        lblPreço = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblDescriçao = new javax.swing.JLabel();
        jbnLimpar = new javax.swing.JButton();
        jbnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 154, 103));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Cadastro de Livros");

        JbnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        JbnVoltar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JbnVoltar.setForeground(new java.awt.Color(255, 215, 0));
        JbnVoltar.setText("Voltar");
        JbnVoltar.setToolTipText("volta pro menu");
        JbnVoltar.setBorder(null);
        JbnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbnVoltarActionPerformed(evt);
            }
        });

        jbnListagem.setBackground(new java.awt.Color(0, 0, 0));
        jbnListagem.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbnListagem.setForeground(new java.awt.Color(255, 215, 0));
        jbnListagem.setText("Listagem");
        jbnListagem.setToolTipText("vai para a listagem de livros");
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

        txtPreço.setBackground(new java.awt.Color(222, 222, 222));
        txtPreço.setToolTipText("o preço esta no formato 00.00");
        txtPreço.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtAutor.setBackground(new java.awt.Color(222, 222, 222));
        txtAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDescriçao.setBackground(new java.awt.Color(222, 222, 222));
        txtDescriçao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtGenero.setBackground(new java.awt.Color(222, 222, 222));
        txtGenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAutor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(0, 0, 0));
        lblAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAutor.setText("Autor");

        lblPreço.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPreço.setForeground(new java.awt.Color(0, 0, 0));
        lblPreço.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreço.setText("Preço");

        lblGenero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(0, 0, 0));
        lblGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenero.setText("Genero");

        lblDescriçao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblDescriçao.setForeground(new java.awt.Color(0, 0, 0));
        lblDescriçao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescriçao.setText("Descrição");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtPreço, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescriçao)
                    .addComponent(txtGenero)
                    .addComponent(txtAutor)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblAutor)
                            .addComponent(lblPreço)
                            .addComponent(lblGenero)
                            .addComponent(lblDescriçao))
                        .addGap(0, 214, Short.MAX_VALUE)))
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
                .addComponent(lblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblPreço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblDescriçao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescriçao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nivel de acesso:");

        lblNivel.setForeground(new java.awt.Color(0, 0, 0));
        lblNivel.setText("Overwatch");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 137, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNivel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblNivel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(JbnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        JbnVoltar.getAccessibleContext().setAccessibleDescription("volta para o menu");
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

    private void JbnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbnVoltarActionPerformed
        MenuView mv = new MenuView();
        mv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JbnVoltarActionPerformed

    private void jbnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnListagemActionPerformed

        ListLivrosView lv = new ListLivrosView();
        lv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnListagemActionPerformed

    private void jbnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnLimparActionPerformed
        limpar();

    }//GEN-LAST:event_jbnLimparActionPerformed

    private void jbnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalvarActionPerformed

        try{
        Livros li = new Livros();
        LivrosDAO ld = new LivrosDAO();
        
        li.setNome(txtNome.getText());
        li.setGenero(txtGenero.getText());
        li.setAutor(txtAutor.getText());
        li.setDescricao(txtDescriçao.getText());
        li.setPreco(Double.parseDouble(txtPreço.getText()));
        
        ld.inserir(li);
        limpar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "preencha todos os campos corretamente antes de proseguir","AVISO", 2);
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
            java.util.logging.Logger.getLogger(CadLivrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadLivrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadLivrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadLivrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadLivrosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbnLimpar;
    private javax.swing.JButton jbnListagem;
    private javax.swing.JButton jbnSalvar;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblDescriçao;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreço;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDescriçao;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreço;
    // End of variables declaration//GEN-END:variables
public void limpar() {
        txtNome.setText("");
        txtAutor.setText("");
        txtPreço.setText("");
        txtDescriçao.setText("");
        txtGenero.setText("");

    }

}
