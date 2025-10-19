
package Telas.Listagem;

import Beans.Clientes;
import Beans.UsuariosDTO;
import DAO.ClientesDAO;
import Telas.Cadastro.CadClientesView;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * tela de listagem de clientes
 *
 * @javadoc
 */
public class ListClientesView extends javax.swing.JFrame {

    /**
     * Creates new form CadListView
     */
    public ListClientesView() {
        initComponents();
        preencherTabela();
        lblNivel.setText(UsuariosDTO.getUsuarios());
    }

    private void preencherTabela() {

        ClientesDAO cd = new ClientesDAO();

        String nomec = txtPesquisa.getText();

        List<Clientes> lista = cd.getClientes(nomec);

        DefaultTableModel tabelaClientes = (DefaultTableModel) tblClientes.getModel();
        tabelaClientes.setNumRows(0);
        tblClientes.setRowSorter(new TableRowSorter(tabelaClientes));

        for (Clientes c : lista) {
            //transformando os dados em obejtos e adicionando eles as linhas
            Object[] obj = new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getCpf()
            };

            tabelaClientes.addRow(obj);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbnExcluir = new javax.swing.JButton();
        jbnEditar = new javax.swing.JButton();
        jbnVoltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        lvlLivro = new javax.swing.JLabel();
        lvlLivro1 = new javax.swing.JLabel();
        lvlLivro4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 154, 103));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listagem de Clientes");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "E-mail", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setToolTipText("para editar um campo clique duas vezes nele. Após a ediçao aperte enter e confirme no botao editar ");
        jScrollPane1.setViewportView(tblClientes);

        jPanel2.setBackground(new java.awt.Color(196, 136, 76));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbnExcluir.setBackground(new java.awt.Color(207, 9, 9));
        jbnExcluir.setForeground(new java.awt.Color(255, 215, 0));
        jbnExcluir.setText("Excluir");
        jbnExcluir.setToolTipText("para excluir clique em uma linha e depois aqui ");
        jbnExcluir.setBorder(null);
        jbnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnExcluirActionPerformed(evt);
            }
        });

        jbnEditar.setBackground(new java.awt.Color(0, 0, 0));
        jbnEditar.setForeground(new java.awt.Color(255, 215, 0));
        jbnEditar.setText("Editar");
        jbnEditar.setToolTipText("clique aqui após mudar os campos na tabela ");
        jbnEditar.setBorder(null);
        jbnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEditarActionPerformed(evt);
            }
        });

        jbnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jbnVoltar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbnVoltar.setForeground(new java.awt.Color(255, 215, 0));
        jbnVoltar.setText("Voltar");
        jbnVoltar.setToolTipText("volta para o cadastro de clientes");
        jbnVoltar.setBorder(null);
        jbnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jbnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jbnVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(196, 136, 76));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPesquisa.setToolTipText("pesquise entre nome, email e cpf");
        txtPesquisa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPesquisaCaretUpdate(evt);
            }
        });
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        lvlLivro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lvlLivro.setForeground(new java.awt.Color(0, 0, 0));
        lvlLivro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lvlLivro1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lvlLivro1.setForeground(new java.awt.Color(0, 0, 0));
        lvlLivro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlLivro1.setText("Pesquisa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lvlLivro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287)
                .addComponent(lvlLivro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lvlLivro1))
                    .addComponent(lvlLivro))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        lvlLivro4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lvlLivro4.setForeground(new java.awt.Color(0, 0, 0));
        lvlLivro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlLivro4.setText("Ações ");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nivel de acesso:");

        lblNivel.setForeground(new java.awt.Color(0, 0, 0));
        lblNivel.setText("Overwatch");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlLivro4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNivel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblNivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lvlLivro4)
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        CadClientesView cc = new CadClientesView();
        cc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnVoltarActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesquisaCaretUpdate
        //prenchendo a tabela assim que a barra de pesquisa atualizar
        preencherTabela();
    }//GEN-LAST:event_txtPesquisaCaretUpdate

    private void jbnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEditarActionPerformed

        Clientes c = new Clientes();
        ClientesDAO cd = new ClientesDAO();
        //pegando o valor de cada coluna da linha selecionada e atualizando no banco de dados
        c.setNome(tblClientes.getValueAt(tblClientes.getSelectedRow(), 1).toString());
        c.setEmail(tblClientes.getValueAt(tblClientes.getSelectedRow(), 3).toString());
        c.setCpf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 2).toString());
        Object obj = tblClientes.getValueAt(tblClientes.getSelectedRow(), 0);

        c.setId((int) obj);

        cd.editar(c);
    }//GEN-LAST:event_jbnEditarActionPerformed

    private void jbnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnExcluirActionPerformed
        try {
            ClientesDAO cd = new ClientesDAO();
            Object obj = tblClientes.getValueAt(tblClientes.getSelectedRow(), 0);//pegando o numero da linha selecionada

            int num = (int) obj;

            cd.excluir(num); //excluindo com base na linha selecionada
            preencherTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO selecione uma linha para excluir", "AVISO", 2);
        }
    }//GEN-LAST:event_jbnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(ListClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListClientesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnEditar;
    private javax.swing.JButton jbnExcluir;
    private javax.swing.JButton jbnVoltar;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lvlLivro;
    private javax.swing.JLabel lvlLivro1;
    private javax.swing.JLabel lvlLivro4;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
