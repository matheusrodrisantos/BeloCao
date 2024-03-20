package ps;

/**
 *
 * @author iuri_
 */

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Produtos;
import model.dao.ProdutosDAO;
import java.text.DecimalFormat;


public class TelaVendas extends javax.swing.JInternalFrame {


    public TelaVendas() {
        initComponents();
       
        DefaultTableModel modelo = (DefaultTableModel) jTVendas.getModel();
        jTVendas.setRowSorter(new TableRowSorter(modelo));
        readJTable();
        txtSubTotal.setText("0");
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTVendas.getModel();
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
     
    public void readJTableParaNome(String NomePesquisa) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTVendas.getModel();
        ProdutosDAO pdao = new ProdutosDAO();
        modelo.setNumRows(0);

        for (Produtos p : pdao.readParaNome(NomePesquisa)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getPreco(),
                p.getTipo(),
                p.getQntd_produto()
            });

        }

    }
    
//    public void txtSubTotal (){
//        DefaultTableModel modelo = (DefaultTableModel) jTCarrinho.getModel();
//        float subtotal = 0;
//        
//        for(int i =0; i<modelo.getRowCount(); i++){
//        subtotal = Float.parseFloat((modelo.getValueAt(i, 4).toString()))+subtotal;
//        }
//        
//        txtSubTotal.setText(""+subtotal);
//    }
    
    //--------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------
    
//    public void readJTableCarrinho() {
//        
//        DefaultTableModel modelo = (DefaultTableModel) jTCarrinho.getModel();
//        ProdutosDAO pdao = new ProdutosDAO();
//        modelo.setNumRows(0);
//
//        for (Produtos p : pdao.read()) {
//            modelo.addRow(new Object[]{
//                p.getId(),
//                p.getNome(),
//                p.getPreco(),
//                p.getTipo(),
//                p.getQntd_produto()
//            });
//
//        }
//
//    }  
    
    //--------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPesquisaVendas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVendas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCarrinho = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Desconto:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        setClosable(true);
        setTitle("Vendas");
        setPreferredSize(new java.awt.Dimension(842, 494));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Pesquisar...:");

        jPesquisaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisaVendasActionPerformed(evt);
            }
        });
        jPesquisaVendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPesquisaVendasKeyReleased(evt);
            }
        });

        jTVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "PREÇO", "TIPO", "ESTOQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTVendas);
        if (jTVendas.getColumnModel().getColumnCount() > 0) {
            jTVendas.getColumnModel().getColumn(0).setMinWidth(40);
            jTVendas.getColumnModel().getColumn(0).setMaxWidth(40);
            jTVendas.getColumnModel().getColumn(2).setMinWidth(80);
            jTVendas.getColumnModel().getColumn(2).setMaxWidth(80);
            jTVendas.getColumnModel().getColumn(3).setMinWidth(100);
            jTVendas.getColumnModel().getColumn(3).setMaxWidth(100);
            jTVendas.getColumnModel().getColumn(4).setMinWidth(100);
            jTVendas.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jTCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "QTND VENDIDA", "PREÇO", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCarrinho.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTCarrinhoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCarrinhoMouseClicked(evt);
            }
        });
        jTCarrinho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTCarrinhoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTCarrinho);
        if (jTCarrinho.getColumnModel().getColumnCount() > 0) {
            jTCarrinho.getColumnModel().getColumn(0).setMinWidth(40);
            jTCarrinho.getColumnModel().getColumn(0).setMaxWidth(40);
            jTCarrinho.getColumnModel().getColumn(2).setMinWidth(110);
            jTCarrinho.getColumnModel().getColumn(2).setMaxWidth(110);
            jTCarrinho.getColumnModel().getColumn(3).setMinWidth(100);
            jTCarrinho.getColumnModel().getColumn(3).setMaxWidth(100);
            jTCarrinho.getColumnModel().getColumn(4).setMinWidth(80);
            jTCarrinho.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("SubTotal:");

        txtSubTotal.setEditable(false);
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("No Carrinho:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Desconto:");

        txtDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescontoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pago:");

        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Troco:");

        txtTroco.setEditable(false);
        txtTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrocoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addComponent(jPesquisaVendas))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPesquisaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPesquisaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisaVendasActionPerformed
        //Campo de pesquisa sobre produtos, irá ocorrer uma conexão com o Banco de Dados.
    }//GEN-LAST:event_jPesquisaVendasActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed

    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescontoActionPerformed
        // TODO add your handling code here:
        float subtotal = Float.parseFloat(txtSubTotal.getText());
        String desc = txtDesconto.getText();
        float descf = Float.parseFloat(desc);
        float total;
        
        total = subtotal-(subtotal*descf/100);
        
        txtTotal.setText(""+total);
        
    }//GEN-LAST:event_txtDescontoActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
        // TODO add your handling code here:
        float valorpago = Float.parseFloat(txtPago.getText());
        float troco;
        float total = Float.parseFloat(txtTotal.getText());
        
        troco = valorpago-total;
        DecimalFormat df = new DecimalFormat("0.00");
  
        txtTroco.setText(df.format(troco));
        
    }//GEN-LAST:event_txtPagoActionPerformed

    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrocoActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void jPesquisaVendasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPesquisaVendasKeyReleased
       
       readJTableParaNome(jPesquisaVendas.getText());
       
    }//GEN-LAST:event_jPesquisaVendasKeyReleased

    private void jTVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVendasMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo2 = (DefaultTableModel) jTCarrinho.getModel();
        String id, nome, qtnd_vendida,preco,total;
        float total2 = 0;
        int i = 0;
        
        if (jTVendas.getSelectedRow() != -1){
            id = jTVendas.getValueAt(jTVendas.getSelectedRow(), 0).toString();
            nome = jTVendas.getValueAt(jTVendas.getSelectedRow(), 1).toString();
            preco = jTVendas.getValueAt(jTVendas.getSelectedRow(), 2).toString();
            qtnd_vendida = "";
            
            modelo2.addRow(new String[]{id, nome, qtnd_vendida, preco});
           
        }
        
        
        
        
        
    }//GEN-LAST:event_jTVendasMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCarrinhoMouseClicked
       
    }//GEN-LAST:event_jTCarrinhoMouseClicked

    private void jTCarrinhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCarrinhoKeyReleased
        // TODO add your handling code here:
        DefaultTableModel modelo2 = (DefaultTableModel) jTCarrinho.getModel();
        String qtnd_vendida,preco;
        String qtnd;
        float qtnd2;
        float total2;
        float subtotal = Float.parseFloat(txtSubTotal.getText());
        
        
 
        if (jTCarrinho.getSelectedRow() != -1){
            
           qtnd = jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 2).toString();
           preco = jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 3).toString();
           qtnd2 = Float.parseFloat(qtnd);
           total2 = Float.parseFloat(preco)*qtnd2;
  
           modelo2.setValueAt(total2, jTCarrinho.getSelectedRow(), 4);

           subtotal = subtotal+total2;
  
        }
        txtSubTotal.setText(""+subtotal);
//        DefaultTableModel modelo2 = (DefaultTableModel) jTCarrinho.getModel();
//        float subtotal = 0;
//        
//        for(int i =0; i<modelo2.getRowCount(); i++){
//        subtotal = Float.parseFloat((modelo2.getValueAt(i, 4).toString()))+subtotal;
//        }
//        
//        txtSubTotal.setText(""+subtotal);
//        
        
    }//GEN-LAST:event_jTCarrinhoKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo2 = (DefaultTableModel) jTCarrinho.getModel();
        float subtotal = Float.parseFloat(txtSubTotal.getText());
        String aux;
        
        if (jTCarrinho.getSelectedRow() != -1) {
 
            aux = jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 4).toString();
            subtotal = subtotal - Float.parseFloat(aux);
            modelo2.removeRow(jTCarrinho.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto.");
        }
        txtSubTotal.setText(""+subtotal);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTCarrinhoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTCarrinhoAncestorAdded
        // TODO add your handling code here:
        
//        DefaultTableModel modelo2 = (DefaultTableModel) jTCarrinho.getModel();
//        float subtotal = 0;
//        
//        for(int i =0; i<modelo2.getRowCount(); i++){
//        subtotal = Float.parseFloat((modelo2.getValueAt(i, 4).toString()))+subtotal;
//        }
//        
//        txtSubTotal.setText(""+subtotal);
        
    }//GEN-LAST:event_jTCarrinhoAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPesquisaVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTCarrinho;
    private javax.swing.JTable jTVendas;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
