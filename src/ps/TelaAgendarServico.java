package ps;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Agenda;
import model.bean.Clientes;
import model.bean.Servico;
import model.dao.AgendaDAO;
import model.dao.ClientesDAO;
import model.dao.ServicoDAO;

/**
 *
 * @author juan_
 */
public class TelaAgendarServico extends javax.swing.JInternalFrame {

    public TelaAgendarServico() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jTListarCliente.getModel();
        jTListarCliente.setRowSorter(new TableRowSorter(modelo));
        readJTableCliente();
        
        ServicoDAO serdao = new ServicoDAO();
        
            for (Servico ser : serdao.read()) {
                jComboAgendarServico.addItem(ser);

        }

    }
    
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------

    
        public void readJTableCliente() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTListarCliente.getModel();
        ClientesDAO cdao = new ClientesDAO();
        modelo.setNumRows(0);

        for (Clientes c : cdao.read()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome()
            });

        }

    }

//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
        
        public void readJTableParaNome(String NomePesquisaCliente) {
                
        DefaultTableModel modelo = (DefaultTableModel) jTListarCliente.getModel();
        ClientesDAO cdao = new ClientesDAO();
        modelo.setNumRows(0);

        for (Clientes c : cdao.readParaClientes(NomePesquisaCliente)) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
            });

        }

    }

//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDataAgenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHoraAgenda = new javax.swing.JTextField();
        jCadastrarAgenda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTListarCliente = new javax.swing.JTable();
        jBuscaCliente = new javax.swing.JTextField();
        jComboAgendarServico = new javax.swing.JComboBox<Object>();
        txtComentarioAgServ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Número do Cliente:");

        txtId_cliente.setEditable(false);
        txtId_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId_clienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Serviço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Hora:");

        jCadastrarAgenda.setText("Cadastrar");
        jCadastrarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarAgendaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cliente...:");

        jTListarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTListarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTListarClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTListarCliente);
        if (jTListarCliente.getColumnModel().getColumnCount() > 0) {
            jTListarCliente.getColumnModel().getColumn(0).setMinWidth(100);
            jTListarCliente.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscaClienteActionPerformed(evt);
            }
        });
        jBuscaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBuscaClienteKeyReleased(evt);
            }
        });

        jComboAgendarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAgendarServicoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Comentaio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                                    .addComponent(jBuscaCliente)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtId_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .addComponent(jComboAgendarServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDataAgenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtHoraAgenda)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jCadastrarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComentarioAgServ)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBuscaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtHoraAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jComboAgendarServico))))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 131, Short.MAX_VALUE)
                        .addComponent(jCadastrarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtComentarioAgServ))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarAgendaActionPerformed
    
        Agenda ag = new Agenda();
        AgendaDAO dao = new AgendaDAO();
       
        
        String x = jComboAgendarServico.getSelectedItem().toString();
        Connection con = ConnectionFactory.getConnection();
        
        if ((txtId_cliente.getText().equals("")) || (jComboAgendarServico.getSelectedItem().equals("")) || (txtHoraAgenda.getText().equals("") || (txtDataAgenda.getText().equals("")))) {
                    JOptionPane.showMessageDialog(null, "Os campos serviço, data e hora são obrigatório preencher.");
                } else {

                    try {
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT id FROM servico WHERE tipo = '"+x+"'");
        
                    while(rs.next())
                        {
                            int i = rs.getInt("id");
                            ag.setId_cliente(Integer.parseInt(txtId_cliente.getText()));
                            ag.setData(txtDataAgenda.getText());
                            ag.setHora(txtHoraAgenda.getText()); 
                            ag.setId_servico(i);
                            ag.setComentario(txtComentarioAgServ.getText());

                            dao.createAgendaServ(ag);

                            txtId_cliente.setText("");
                            //jComboAgendarServico.setSelectedItem("");
                            txtDataAgenda.setText("");
                            txtHoraAgenda.setText("");
               
                        }
                        
                    } catch (Exception e){
                            JOptionPane.showMessageDialog(null, "deu pau");
                    }
                }
                
    }//GEN-LAST:event_jCadastrarAgendaActionPerformed

    private void jTListarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTListarClienteMouseClicked
        
         if (jTListarCliente.getSelectedRow() != -1) {
            txtId_cliente.setText(jTListarCliente.getValueAt(jTListarCliente.getSelectedRow(), 0).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto.");
        }
    }//GEN-LAST:event_jTListarClienteMouseClicked

    private void jBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscaClienteActionPerformed

    private void jBuscaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscaClienteKeyReleased

        readJTableParaNome(jBuscaCliente.getText());
    }//GEN-LAST:event_jBuscaClienteKeyReleased

    private void jComboAgendarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAgendarServicoActionPerformed
        
    }//GEN-LAST:event_jComboAgendarServicoActionPerformed

    private void txtId_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId_clienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jBuscaCliente;
    private javax.swing.JButton jCadastrarAgenda;
    private javax.swing.JComboBox<Object> jComboAgendarServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTListarCliente;
    private javax.swing.JTextField txtComentarioAgServ;
    private javax.swing.JTextField txtDataAgenda;
    private javax.swing.JTextField txtHoraAgenda;
    private javax.swing.JTextField txtId_cliente;
    // End of variables declaration//GEN-END:variables
}
