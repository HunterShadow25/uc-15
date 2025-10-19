/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas.Cadastro;

import Beans.Livros;
import Beans.UsuariosDTO;
import Beans.Vendas;
import DAO.LivrosDAO;
import DAO.VendasDAO;
import Telas.Listagem.ListVendasView;
import Telas.MenuView;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * tela de cadastro de vendas
 *
 * @javadoc
 */
public class CadVendasView extends javax.swing.JFrame {

    /**
     * Creates new form CadVendasView
     */
    public CadVendasView() {
        initComponents();
        lblNivel.setText(UsuariosDTO.getUsuarios());
        DefaultTableModel tabelaVendas = (DefaultTableModel) tblVendas.getModel();
        tabelaVendas.setNumRows(0);
    }

    private void preencherTabela() {

        LivrosDAO ld = new LivrosDAO();
        String pesquisa = txtLivro.getText();
        try {
            List<Livros> lista = ld.getLivro(pesquisa);
            int i = 1;
            DefaultTableModel tabelaVendas = (DefaultTableModel) tblVendas.getModel();
            tblVendas.setRowSorter(new TableRowSorter(tabelaVendas));
           
            if (!txtQtd.getText().isEmpty()) {
                i = Integer.parseInt(txtQtd.getText());

            }
            for (Livros li : lista) {

                Object[] obj = new Object[]{
                    li.getNome(),
                    txtQtd.getText(),
                    li.getPreco(),
                    i * li.getPreco()

                };
                tabelaVendas.addRow(obj);
            }

        } catch (Exception e) {
            //System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbnAdicionar = new javax.swing.JButton();
        txtLivro = new javax.swing.JTextField();
        lblCliente1 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        lblCliente2 = new javax.swing.JLabel();
        lblPGTO = new javax.swing.JLabel();
        cbPgto = new javax.swing.JComboBox<>();
        lblDesconto = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbnSalvar = new javax.swing.JButton();
        jbnVoltar = new javax.swing.JButton();
        jbnList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 154, 103));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Vendas");

        jPanel2.setBackground(new java.awt.Color(196, 136, 76));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jbnAdicionar.setBackground(new java.awt.Color(0, 0, 0));
        jbnAdicionar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbnAdicionar.setForeground(new java.awt.Color(255, 215, 0));
        jbnAdicionar.setText("Adicionar a lista");
        jbnAdicionar.setToolTipText("Adicione um livro e a quantidade a lista de compras");
        jbnAdicionar.setBorder(null);
        jbnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAdicionarActionPerformed(evt);
            }
        });

        txtLivro.setBackground(new java.awt.Color(222, 222, 222));
        txtLivro.setToolTipText("digite um livro ja cadastrado");
        txtLivro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLivroActionPerformed(evt);
            }
        });

        lblCliente1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCliente1.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente1.setText("Livro");

        txtQtd.setBackground(new java.awt.Color(222, 222, 222));
        txtQtd.setToolTipText("nao se esqueça da quantidade");
        txtQtd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCliente2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCliente2.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente2.setText("quantidade");

        lblPGTO.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPGTO.setForeground(new java.awt.Color(0, 0, 0));
        lblPGTO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPGTO.setText("Forma PGTO");

        cbPgto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dinheiro", "debito", "credito", "pix" }));

        lblDesconto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDesconto.setForeground(new java.awt.Color(0, 0, 0));
        lblDesconto.setText("Data");

        txtData.setBackground(new java.awt.Color(222, 222, 222));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setToolTipText("data da venda");

        lblCliente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setText("Cliente");

        txtCliente.setBackground(new java.awt.Color(222, 222, 222));
        txtCliente.setToolTipText("");
        txtCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPGTO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPgto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDesconto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCliente1)
                        .addGap(4, 4, 4)
                        .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCliente2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente1)
                    .addComponent(lblCliente2)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPGTO)
                    .addComponent(cbPgto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesconto)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbnAdicionar.getAccessibleContext().setAccessibleDescription("Adicione o livro e aquantidade a lista");

        tblVendas.setBackground(new java.awt.Color(222, 222, 222));
        tblVendas.setForeground(new java.awt.Color(0, 0, 0));
        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Livro", "Quantidade", "Valor unit", "total"
            }
        ));
        tblVendas.setGridColor(new java.awt.Color(0, 0, 0));
        tblVendas.setSelectionBackground(new java.awt.Color(222, 222, 222));
        tblVendas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblVendas);

        jPanel3.setBackground(new java.awt.Color(196, 136, 76));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jbnSalvar.setBackground(new java.awt.Color(19, 249, 61));
        jbnSalvar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jbnSalvar.setText("Salvar");
        jbnSalvar.setToolTipText("clique aqui após colocar todas as informaçoes da venda ");
        jbnSalvar.setBorder(null);
        jbnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalvarActionPerformed(evt);
            }
        });

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

        jbnList.setBackground(new java.awt.Color(0, 0, 0));
        jbnList.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbnList.setForeground(new java.awt.Color(255, 215, 0));
        jbnList.setText("Listagem");
        jbnList.setToolTipText("vai para listagem de vendas");
        jbnList.setBorder(null);
        jbnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbnList, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnList, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbnSalvar.getAccessibleContext().setAccessibleDescription("clique aqui para salvar toda a venda");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nivel de acesso:");

        lblNivel.setForeground(new java.awt.Color(0, 0, 0));
        lblNivel.setText("Overwatch");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNivel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblNivel))
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        //troca de tela
        MenuView mv = new MenuView();
        mv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnVoltarActionPerformed

    private void jbnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnListActionPerformed
        //troca de tela
        ListVendasView lv = new ListVendasView();
        lv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnListActionPerformed

    private void jbnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAdicionarActionPerformed
        //adicionando itens a tabela
        preencherTabela();
        txtLivro.setText("");
        txtQtd.setText("");
    }//GEN-LAST:event_jbnAdicionarActionPerformed

    private void jbnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalvarActionPerformed

        if (txtData.getText().isEmpty() || txtCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "preencha todos os campos corretamente antes de proseguir", "AVISO", 2);
        } else {

            try {
                Vendas ve = new Vendas();
                VendasDAO vd = new VendasDAO();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                for (int i = 0; i < tblVendas.getRowCount(); i++) {
                    ve.setCliente(txtCliente.getText());
                    ve.setPagamento(cbPgto.getSelectedItem().toString());
                    ve.setData(sdf.parse(txtData.getText()));
                    for (int j = 0; j < tblVendas.getColumnCount(); j++) {
                        Object obj = tblVendas.getValueAt(i, j);
                       //possiblitando a tabela ser interativa
                        switch (j) {

                            case 0:
                                ve.setDescricao(obj.toString());

                                break;

                            case 1:
                                ve.setQuantidade(Integer.parseInt(obj.toString()));
                                break;
                            case 3:
                                ve.setTotal(((Number) obj).doubleValue());
                                break;
                        }
                    }
                    vd.inserir(ve);

                }
                DefaultTableModel tabelaVendas = (DefaultTableModel) tblVendas.getModel();
                tabelaVendas.setNumRows(0);
                txtCliente.setText("");
                txtData.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "verifique se todos os estao inseridos corretamente", "AVISO", 2);
            } finally {
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
            }
        }

    }//GEN-LAST:event_jbnSalvarActionPerformed

    private void txtLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLivroActionPerformed

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
            java.util.logging.Logger.getLogger(CadVendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadVendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadVendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadVendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadVendasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPgto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnAdicionar;
    private javax.swing.JButton jbnList;
    private javax.swing.JButton jbnSalvar;
    private javax.swing.JButton jbnVoltar;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblDesconto;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblPGTO;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtLivro;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
