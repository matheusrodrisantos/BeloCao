package ps;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Servico;
import model.dao.ServicoDAO;
        
public class TelaCadServicos extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaServicos
     */
    public TelaCadServicos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTServico.getModel();
        jTServico.setRowSorter(new TableRowSorter(modelo));
        readJTableServico();
    }

   public void readJTableServico() {

        DefaultTableModel modelo = (DefaultTableModel) jTServico.getModel();
        ServicoDAO serdao = new ServicoDAO();
        modelo.setNumRows(0);

        for (Servico ser : serdao.read()) {
            modelo.addRow(new Object[]{
                ser.getId(),
                ser.getTipo(),
                ser.getValor(),
                ser.getDescricao()
            });

        }

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDescricaoServico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValorServico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTServico = new javax.swing.JTable();
        jExcluirServico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jAtualizarServico = new javax.swing.JButton();
        txtTipoServico = new javax.swing.JTextField();
        jCadastrarServico = new javax.swing.JButton();

        setClosable(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Preço:");

        jTServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO", "PREÇO", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTServicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTServico);
        if (jTServico.getColumnModel().getColumnCount() > 0) {
            jTServico.getColumnModel().getColumn(0).setMinWidth(50);
            jTServico.getColumnModel().getColumn(0).setMaxWidth(50);
            jTServico.getColumnModel().getColumn(1).setMinWidth(120);
            jTServico.getColumnModel().getColumn(1).setMaxWidth(120);
            jTServico.getColumnModel().getColumn(2).setMinWidth(100);
            jTServico.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jExcluirServico.setText("Excluir");
        jExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirServicoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tipo:");

        jAtualizarServico.setText("Atualizar");
        jAtualizarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarServicoActionPerformed(evt);
            }
        });

        jCadastrarServico.setText("Cadastrar");
        jCadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCadastrarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoServico, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jAtualizarServico)
                        .addGap(24, 24, 24)
                        .addComponent(jExcluirServico, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValorServico)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDescricaoServico)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
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
                                .addComponent(txtTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtValorServico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAtualizarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jExcluirServico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jCadastrarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void jTServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTServicoMouseClicked

        if (jTServico.getSelectedRow() != -1) {
            txtTipoServico.setText(jTServico.getValueAt(jTServico.getSelectedRow(), 1).toString());
            txtValorServico.setText(jTServico.getValueAt(jTServico.getSelectedRow(), 2).toString());
            txtDescricaoServico.setText(jTServico.getValueAt(jTServico.getSelectedRow(), 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um serviço.");
        }

    }//GEN-LAST:event_jTServicoMouseClicked

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirServicoActionPerformed
        //Botão Excluir:

        if(jTServico.getSelectedRow() != -1){

            Servico ser = new Servico();
            ServicoDAO dao = new ServicoDAO();

            ser.setTipo(txtTipoServico.getText());
            ser.setValor(Float.parseFloat(txtValorServico.getText()));
            ser.setDescricao(txtDescricaoServico.getText());
            ser.setId((int)jTServico.getValueAt(jTServico.getSelectedRow(), 0));

            dao.delete(ser);

            txtTipoServico.setText("");
            txtValorServico.setText("");
            txtDescricaoServico.setText("");

            readJTableServico();

            JOptionPane.showMessageDialog(null, "Serviço apagado com sucesso!");
        } else{
            JOptionPane.showMessageDialog(null, "Selecione um serviço para excluir!");
        }
    }//GEN-LAST:event_jExcluirServicoActionPerformed

    
    
    
    
    
    
    
    
    
    private void jAtualizarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarServicoActionPerformed

        if(jTServico.getSelectedRow() != -1){

            Servico ser = new Servico();
            ServicoDAO dao = new ServicoDAO();

            //if ((txtNomeProduto.getText().equals("") && (txtPrecoProduto.getText().equals("") && (txtQuantidadeProduto.getText().equals("") && (txtTipoProduto.getText().equals("")))))) {
                //    JOptionPane.showMessageDialog(null, "Preencha todos os campos acima.");
                //} else {

                ser.setTipo(txtTipoServico.getText());
                ser.setValor(Float.parseFloat(txtValorServico.getText()));
                ser.setDescricao(txtDescricaoServico.getText());
                ser.setId((int)jTServico.getValueAt(jTServico.getSelectedRow(), 0));

                dao.update(ser);

                txtTipoServico.setText("");
                txtValorServico.setText("");
                txtDescricaoServico.setText("");

                readJTableServico();
            }
    }//GEN-LAST:event_jAtualizarServicoActionPerformed

    
    
    
    
    
    
    
    private void jCadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarServicoActionPerformed

        Servico ser = new Servico();
        ServicoDAO dao = new ServicoDAO();

//        if ((txtNomeProduto.getText().equals("") && (txtPrecoProduto.getText().equals("") && (txtQuantidadeProduto.getText().equals("") && (txtTipoProduto.getText().equals("")))))) {
//            JOptionPane.showMessageDialog(null, "Preencha todos os campos acima.");
//        } else {

        if ((txtTipoServico.getText().equals("")) || (txtValorServico.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Os campos tipo e valor são obrigatório preencher.");
        } else {

            ser.setTipo(txtTipoServico.getText());
            ser.setValor(Float.parseFloat(txtValorServico.getText()));
            ser.setDescricao(txtDescricaoServico.getText());
            //p.setId((int)jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0));
            
            dao.create(ser);

            txtTipoServico.setText("");
            txtValorServico.setText("");
            txtDescricaoServico.setText("");

            readJTableServico();
//        }else{
//            JOptionPane.showMessageDialog(null, "Preencha os campos em branco!");
      //}
        }
    }//GEN-LAST:event_jCadastrarServicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAtualizarServico;
    private javax.swing.JButton jCadastrarServico;
    private javax.swing.JButton jExcluirServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTServico;
    private javax.swing.JTextField txtDescricaoServico;
    private javax.swing.JTextField txtTipoServico;
    private javax.swing.JTextField txtValorServico;
    // End of variables declaration//GEN-END:variables
}
