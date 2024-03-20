package ps;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Agenda;
import model.bean.Servico;
import model.dao.AgendaDAO;
import model.dao.ServicoDAO;

/**
 *
 * @author Juan Carlos
 */
public class TelaAtualizarAgenda extends javax.swing.JInternalFrame {


    public TelaAtualizarAgenda() {
        initComponents();
    
        DefaultTableModel modelo = (DefaultTableModel) jTAtualizarAgenda.getModel();
        jTAtualizarAgenda.setRowSorter(new TableRowSorter(modelo));
        readJTable();
        
//        ServicoDAO serdao = new ServicoDAO();
//        
//            for (Servico ser : serdao.read()) {
//             //   jComboAtualizarServicosAgenda.addItem(ser);
//                //jComboAtualizarServicosAgenda.addItem(new Object[]{
//                
//            //});
//
//        }

    }
    
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------

        public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTAtualizarAgenda.getModel();
        AgendaDAO agdao = new AgendaDAO();
        modelo.setNumRows(0);

        for (Agenda ag : agdao.read()) {
            modelo.addRow(new Object[]{
                ag.getId_agenda(),
                ag.getNome(),
                ag.getTipo(),
                ag.getValor(),
                ag.getData(),
                ag.getHora(),
                ag.getComentario()
            });

        }

    }
    
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
        
         public void readJTableParaData(String DataPesquisa) {
                
        DefaultTableModel modelo = (DefaultTableModel) jTAtualizarAgenda.getModel();
        AgendaDAO agdao = new AgendaDAO();
        modelo.setNumRows(0);

        for (Agenda ag : agdao.readParaData(DataPesquisa)) {
            modelo.addRow(new Object[]{
                ag.getId_agenda(),
                ag.getNome(),
                ag.getTipo(),
                ag.getValor(),
                ag.getData(),
                ag.getHora(),
                ag.getComentario()
            });

        }

    }

//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeAgenda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        txtDataAgenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHoraAgenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jAtualizarAgenda = new javax.swing.JButton();
        jExcluirAgenda = new javax.swing.JButton();
        txtNomeAgenda1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        txtDataAgenda1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHoraAgenda1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jAtualizarAgenda1 = new javax.swing.JButton();
        jExcluirAgenda1 = new javax.swing.JButton();
        jAtualizarPesquisasAgenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAtualizarAgenda = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtAtualizarClienteAgenda = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAtualizarHoraAgenda = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jBAtualizarAgenda = new javax.swing.JButton();
        jBExcluirAgenda = new javax.swing.JButton();
        txtAtualizarDataAgenda = new javax.swing.JTextField();
        txtAtualizarComenAgenda = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        txtNomeAgenda.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Serviço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Hora:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cliente:");

        jAtualizarAgenda.setText("Atualizar");
        jAtualizarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarAgendaActionPerformed(evt);
            }
        });

        jExcluirAgenda.setText("Excluir");
        jExcluirAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirAgendaActionPerformed(evt);
            }
        });

        txtNomeAgenda1.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Serviço:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Data:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Hora:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Cliente:");

        jAtualizarAgenda1.setText("Atualizar");
        jAtualizarAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarAgenda1ActionPerformed(evt);
            }
        });

        jExcluirAgenda1.setText("Excluir");
        jExcluirAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirAgenda1ActionPerformed(evt);
            }
        });

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(842, 498));
        setMinimumSize(new java.awt.Dimension(842, 498));
        setPreferredSize(new java.awt.Dimension(842, 498));

        jAtualizarPesquisasAgenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jAtualizarPesquisasAgendaKeyReleased(evt);
            }
        });

        jTAtualizarAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "SERVIÇO", "PREÇO", "DATA", "HORA", "COMENTÁRIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAtualizarAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAtualizarAgendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTAtualizarAgenda);
        if (jTAtualizarAgenda.getColumnModel().getColumnCount() > 0) {
            jTAtualizarAgenda.getColumnModel().getColumn(0).setMinWidth(50);
            jTAtualizarAgenda.getColumnModel().getColumn(0).setMaxWidth(50);
            jTAtualizarAgenda.getColumnModel().getColumn(2).setMinWidth(100);
            jTAtualizarAgenda.getColumnModel().getColumn(2).setMaxWidth(100);
            jTAtualizarAgenda.getColumnModel().getColumn(3).setMinWidth(80);
            jTAtualizarAgenda.getColumnModel().getColumn(3).setMaxWidth(80);
            jTAtualizarAgenda.getColumnModel().getColumn(4).setMinWidth(80);
            jTAtualizarAgenda.getColumnModel().getColumn(4).setMaxWidth(80);
            jTAtualizarAgenda.getColumnModel().getColumn(5).setMinWidth(80);
            jTAtualizarAgenda.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar...:");

        txtAtualizarClienteAgenda.setEditable(false);
        txtAtualizarClienteAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarClienteAgendaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Data:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Hora:");

        txtAtualizarHoraAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarHoraAgendaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Cliente:");

        jBAtualizarAgenda.setText("Atualizar");
        jBAtualizarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarAgendaActionPerformed(evt);
            }
        });

        jBExcluirAgenda.setText("Excluir");
        jBExcluirAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirAgendaActionPerformed(evt);
            }
        });

        txtAtualizarDataAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarDataAgendaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Comentário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jAtualizarPesquisasAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAtualizarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBExcluirAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAtualizarClienteAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAtualizarDataAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAtualizarHoraAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAtualizarComenAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtualizarClienteAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtualizarDataAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtualizarHoraAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtualizarComenAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(jAtualizarPesquisasAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jBAtualizarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jBExcluirAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAtualizarPesquisasAgendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAtualizarPesquisasAgendaKeyReleased

        readJTableParaData(jAtualizarPesquisasAgenda.getText());
        //readJTableParaTipo(jProdutosPesquisa.getText());
    }//GEN-LAST:event_jAtualizarPesquisasAgendaKeyReleased

    private void jTAtualizarAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAtualizarAgendaMouseClicked
        
        if (jTAtualizarAgenda.getSelectedRow() != -1) {
            txtAtualizarClienteAgenda.setText(jTAtualizarAgenda.getValueAt(jTAtualizarAgenda.getSelectedRow(), 1).toString());
            txtAtualizarDataAgenda.setText(jTAtualizarAgenda.getValueAt(jTAtualizarAgenda.getSelectedRow(), 4).toString());
            txtAtualizarHoraAgenda.setText(jTAtualizarAgenda.getValueAt(jTAtualizarAgenda.getSelectedRow(), 5).toString());
            txtAtualizarComenAgenda.setText(jTAtualizarAgenda.getValueAt(jTAtualizarAgenda.getSelectedRow(), 6).toString());
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.");
        }
        
    }//GEN-LAST:event_jTAtualizarAgendaMouseClicked

    private void jAtualizarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarAgendaActionPerformed

//        if(jTAtualizarAgenda.getSelectedRow() != -1){
//
//            Agenda ag = new Agenda();
//            AgendaDAO dao = new AgendaDAO();
//
//                ag.setNome(txtNomeAgenda.getText());
//                ag.setId_agenda((int)jTAtualizarAgenda.getValueAt(jTAtualizarAgenda.getSelectedRow(), 0));
//
//                dao.update(ag);
//
//                txtNomeAgenda.setText("");
//                txtHoraAgenda.setText("");
//                txtDataAgenda.setText("");
//
//                readJTable();
//            }
    }//GEN-LAST:event_jAtualizarAgendaActionPerformed

    private void jExcluirAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirAgendaActionPerformed
 
    }//GEN-LAST:event_jExcluirAgendaActionPerformed

    private void jAtualizarAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarAgenda1ActionPerformed
          
    }//GEN-LAST:event_jAtualizarAgenda1ActionPerformed

    private void jExcluirAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirAgenda1ActionPerformed
      
    }//GEN-LAST:event_jExcluirAgenda1ActionPerformed

    private void jBAtualizarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarAgendaActionPerformed

        if(jTAtualizarAgenda.getSelectedRow() != -1){

            Agenda ag = new Agenda();
            AgendaDAO agdao = new AgendaDAO();

            //if ((txtNomeProduto.getText().equals("") && (txtPrecoProduto.getText().equals("") && (txtQuantidadeProduto.getText().equals("") && (txtTipoProduto.getText().equals("")))))) {
                //    JOptionPane.showMessageDialog(null, "Preencha todos os campos acima.");
                //} else {
                 
                ag.setData(txtAtualizarDataAgenda.getText());
                ag.setHora(txtAtualizarHoraAgenda.getText());
                ag.setComentario(txtAtualizarComenAgenda.getText());
                ag.setId_agenda((int)jTAtualizarAgenda.getValueAt(jTAtualizarAgenda.getSelectedRow(), 0));

                agdao.update(ag);

                txtAtualizarClienteAgenda.setText("");
                txtAtualizarComenAgenda.setText("");
                txtAtualizarDataAgenda.setText("");
                txtAtualizarHoraAgenda.setText("");
                

                readJTable();
            }
    }//GEN-LAST:event_jBAtualizarAgendaActionPerformed

    private void jBExcluirAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirAgendaActionPerformed
        //Botão Excluir:

        if(jTAtualizarAgenda.getSelectedRow() != -1){

            Agenda ag = new Agenda();
            AgendaDAO agdao = new AgendaDAO();

                
                ag.setData(txtAtualizarDataAgenda.getText());
                ag.setHora(txtAtualizarHoraAgenda.getText());
                ag.setComentario(txtAtualizarComenAgenda.getText());
                ag.setId_agenda((int)jTAtualizarAgenda.getValueAt(jTAtualizarAgenda.getSelectedRow(), 0));

                agdao.delete(ag);

                txtAtualizarClienteAgenda.setText("");
                txtAtualizarComenAgenda.setText("");
                txtAtualizarDataAgenda.setText("");
                txtAtualizarHoraAgenda.setText("");

            readJTable();

            JOptionPane.showMessageDialog(null, "Horario apagado com sucesso!");
        } else{
            JOptionPane.showMessageDialog(null, "Selecione um horario para excluir!");
        }
    }//GEN-LAST:event_jBExcluirAgendaActionPerformed

    private void txtAtualizarDataAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarDataAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtualizarDataAgendaActionPerformed

    private void txtAtualizarClienteAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarClienteAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtualizarClienteAgendaActionPerformed

    private void txtAtualizarHoraAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarHoraAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtualizarHoraAgendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAtualizarAgenda;
    private javax.swing.JButton jAtualizarAgenda1;
    private javax.swing.JTextField jAtualizarPesquisasAgenda;
    private javax.swing.JButton jBAtualizarAgenda;
    private javax.swing.JButton jBExcluirAgenda;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JButton jExcluirAgenda;
    private javax.swing.JButton jExcluirAgenda1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAtualizarAgenda;
    private javax.swing.JTextField txtAtualizarClienteAgenda;
    private javax.swing.JTextField txtAtualizarComenAgenda;
    private javax.swing.JTextField txtAtualizarDataAgenda;
    private javax.swing.JTextField txtAtualizarHoraAgenda;
    private javax.swing.JTextField txtDataAgenda;
    private javax.swing.JTextField txtDataAgenda1;
    private javax.swing.JTextField txtHoraAgenda;
    private javax.swing.JTextField txtHoraAgenda1;
    private javax.swing.JTextField txtNomeAgenda;
    private javax.swing.JTextField txtNomeAgenda1;
    // End of variables declaration//GEN-END:variables
}
