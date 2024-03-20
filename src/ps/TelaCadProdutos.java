package ps;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Produtos;
import model.dao.ProdutosDAO;

public class TelaCadProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadProdutos
     */
    public TelaCadProdutos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        jTProdutos.setRowSorter(new TableRowSorter(modelo));
        readJTableProdutos();
    }

    public void readJTableProdutos() {

        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        ProdutosDAO pdao = new ProdutosDAO();
        modelo.setNumRows(0);

        for (Produtos p : pdao.read()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getPreco(),
                p.getTipo(),
                p.getQntd_produto()
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecoProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTipoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Cadastro de Produtos");
        setPreferredSize(new java.awt.Dimension(842, 494));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Preço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Quantidade:");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "PREÇO", "TIPO", "QTD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);
        if (jTProdutos.getColumnModel().getColumnCount() > 0) {
            jTProdutos.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(24, 24, 24)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecoProduto)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTipoProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantidadeProduto)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtPrecoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       // if(jTProdutos.getSelectedRow() != -1){
        
        Produtos p = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();

//        if ((txtNomeProduto.getText().equals("") && (txtPrecoProduto.getText().equals("") && (txtQuantidadeProduto.getText().equals("") && (txtTipoProduto.getText().equals("")))))) {
//            JOptionPane.showMessageDialog(null, "Preencha todos os campos acima.");
//        } else {

        if ((txtNomeProduto.getText().equals("")) || (txtPrecoProduto.getText().equals("")) || (txtQuantidadeProduto.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Os campos nome, preço e quantidade são obrigatório preencher.");
        } else {

            p.setNome(txtNomeProduto.getText());
            p.setPreco(Float.parseFloat(txtPrecoProduto.getText()));
            p.setTipo(txtTipoProduto.getText());
            p.setQntd_produto(Float.parseFloat(txtQuantidadeProduto.getText()));
            //p.setId((int)jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0));
            
            dao.create(p);

            txtNomeProduto.setText("");
            txtPrecoProduto.setText("");
            txtQuantidadeProduto.setText("");
            txtTipoProduto.setText("");

            readJTableProdutos();
//        }else{
//            JOptionPane.showMessageDialog(null, "Preencha os campos em branco!");
      //}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked

        if (jTProdutos.getSelectedRow() != -1) {
            txtNomeProduto.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());
            txtPrecoProduto.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 2).toString());
            txtTipoProduto.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 3).toString());
            txtQuantidadeProduto.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 4).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto.");
        }
    
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(jTProdutos.getSelectedRow() != -1){
        
        Produtos p = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();

        //if ((txtNomeProduto.getText().equals("") && (txtPrecoProduto.getText().equals("") && (txtQuantidadeProduto.getText().equals("") && (txtTipoProduto.getText().equals("")))))) {
        //    JOptionPane.showMessageDialog(null, "Preencha todos os campos acima.");
        //} else {

            p.setNome(txtNomeProduto.getText());
            p.setPreco(Float.parseFloat(txtPrecoProduto.getText()));
            p.setTipo(txtTipoProduto.getText());
            p.setQntd_produto(Float.parseFloat(txtQuantidadeProduto.getText()));
            p.setId((int)jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0));
            
            dao.update(p);
            
            txtNomeProduto.setText("");
            txtPrecoProduto.setText("");
            txtQuantidadeProduto.setText("");
            txtTipoProduto.setText("");

            readJTableProdutos();
        }                                       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Botão Excluir: 
        
        if(jTProdutos.getSelectedRow() != -1){
        
        Produtos p = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        
            p.setNome(txtNomeProduto.getText());
            p.setPreco(Float.parseFloat(txtPrecoProduto.getText()));
            p.setTipo(txtTipoProduto.getText());
            p.setQntd_produto(Float.parseFloat(txtQuantidadeProduto.getText()));
            p.setId((int)jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0));
            
            dao.delete(p);

            txtNomeProduto.setText("");
            txtPrecoProduto.setText("");
            txtQuantidadeProduto.setText("");
            txtTipoProduto.setText("");

            readJTableProdutos();
        
            JOptionPane.showMessageDialog(null, "Produto apagado com sucesso!");
        } else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JTextField txtTipoProduto;
    // End of variables declaration//GEN-END:variables
}