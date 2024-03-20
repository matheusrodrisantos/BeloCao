package ps;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Agenda;
import model.dao.AgendaDAO;


/**
 *
 * @author Juan Carlos
 */
public class TelaChecarAgenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaChecarAgenda
     */
    public TelaChecarAgenda() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) jTChecarAgenda.getModel();
        jTChecarAgenda.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }

  
     public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTChecarAgenda.getModel();
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

        public void readJTableParaData(String DataPesquisa) {
                
        DefaultTableModel modelo = (DefaultTableModel) jTChecarAgenda.getModel();
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
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupComentario = new javax.swing.JPopupMenu();
        jComentario = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextoComentario = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jAgendaPesquisas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTChecarAgenda = new javax.swing.JTable();

        jComentario.setText("Checar Comentario");
        jComentario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComentarioMouseClicked(evt);
            }
        });
        jPopupComentario.add(jComentario);

        jTextoComentario.setColumns(20);
        jTextoComentario.setRows(5);
        jScrollPane2.setViewportView(jTextoComentario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar data...:");

        jAgendaPesquisas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jAgendaPesquisasKeyReleased(evt);
            }
        });

        jTChecarAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "SERVIÇO", "PREÇO", "DATA", "HORA", "COMENTARIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTChecarAgenda.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTChecarAgendaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTChecarAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTChecarAgendaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTChecarAgendaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTChecarAgenda);
        if (jTChecarAgenda.getColumnModel().getColumnCount() > 0) {
            jTChecarAgenda.getColumnModel().getColumn(0).setMinWidth(50);
            jTChecarAgenda.getColumnModel().getColumn(0).setMaxWidth(50);
            jTChecarAgenda.getColumnModel().getColumn(2).setMinWidth(100);
            jTChecarAgenda.getColumnModel().getColumn(2).setMaxWidth(100);
            jTChecarAgenda.getColumnModel().getColumn(3).setMinWidth(80);
            jTChecarAgenda.getColumnModel().getColumn(3).setMaxWidth(80);
            jTChecarAgenda.getColumnModel().getColumn(4).setMinWidth(80);
            jTChecarAgenda.getColumnModel().getColumn(4).setMaxWidth(80);
            jTChecarAgenda.getColumnModel().getColumn(5).setMinWidth(80);
            jTChecarAgenda.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jAgendaPesquisas, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAgendaPesquisas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgendaPesquisasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAgendaPesquisasKeyReleased
        readJTableParaData(jAgendaPesquisas.getText());
    }//GEN-LAST:event_jAgendaPesquisasKeyReleased

    private void jTChecarAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTChecarAgendaMouseClicked
        
    }//GEN-LAST:event_jTChecarAgendaMouseClicked

    private void jTChecarAgendaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTChecarAgendaMouseReleased

//        if (evt.isPopupTrigger()) {
//            jPopupComentario.show(this, evt.getX(), evt.getY());
//            jTabbedPane1.setVisible(true);
//            
//        }

    }//GEN-LAST:event_jTChecarAgendaMouseReleased

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased

    }//GEN-LAST:event_formMouseReleased

    private void jComentarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComentarioMouseClicked

    }//GEN-LAST:event_jComentarioMouseClicked

    private void jTChecarAgendaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTChecarAgendaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTChecarAgendaAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAgendaPesquisas;
    private javax.swing.JMenuItem jComentario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupComentario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTChecarAgenda;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextoComentario;
    // End of variables declaration//GEN-END:variables
}
