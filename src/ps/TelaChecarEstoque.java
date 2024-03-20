package ps;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Produtos;
import model.dao.ProdutosDAO;

public class TelaChecarEstoque extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaChecarEstoque
     */
    public TelaChecarEstoque() {
        initComponents();
                
        DefaultTableModel modelo = (DefaultTableModel) jTPesquisas.getModel();
        jTPesquisas.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }

    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTPesquisas.getModel();
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
        
        DefaultTableModel modelo = (DefaultTableModel) jTPesquisas.getModel();
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
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProdutosPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPesquisas = new javax.swing.JTable();

        setClosable(true);
        setTitle("Consultar Produtos");
        setPreferredSize(new java.awt.Dimension(842, 494));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar...:");

        jProdutosPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jProdutosPesquisaKeyReleased(evt);
            }
        });

        jTPesquisas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTPesquisas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPesquisasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTPesquisas);
        if (jTPesquisas.getColumnModel().getColumnCount() > 0) {
            jTPesquisas.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                    .addComponent(jProdutosPesquisa))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProdutosPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPesquisasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPesquisasMouseClicked



    }//GEN-LAST:event_jTPesquisasMouseClicked

    private void jProdutosPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jProdutosPesquisaKeyReleased

        readJTableParaNome(jProdutosPesquisa.getText());
        //readJTableParaTipo(jProdutosPesquisa.getText());

    }//GEN-LAST:event_jProdutosPesquisaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jProdutosPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPesquisas;
    // End of variables declaration//GEN-END:variables
}
