package ps;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author iuri_
 */
        
public class TelaLogin extends javax.swing.JFrame {
    
    
    
    public TelaLogin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordLogin = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Belo Cão");
        setMaximumSize(new java.awt.Dimension(500, 330));
        setMinimumSize(new java.awt.Dimension(500, 330));
        setPreferredSize(new java.awt.Dimension(500, 330));
        setResizable(false);
        getContentPane().setLayout(null);

        passwordLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        passwordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordLoginActionPerformed(evt);
            }
        });
        getContentPane().add(passwordLogin);
        passwordLogin.setBounds(120, 140, 260, 30);

        jButton1.setText("Entrar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 210, 160, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Sistema desenvolvido pela empresa Omni Smart");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 270, 220, 13);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login_att.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 510));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 510));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 510));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
/////////////////////////---TESTAR CONEXÃO---\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\        
        /*
        try {
            Connection connection = new ConnectionFactory().getConnection();
            System.out.print("Conectado!");
        } catch (Exception ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Falha na conexão!");
        }
        */
                
        if (!passwordLogin.getText().equals("1")) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha incorretos! \n "+
            "   Tente novamente!");
            passwordLogin.setText("");
           
        } else {
            TelaPrincipal obj = new TelaPrincipal();
            obj.setVisible(true);      
            dispose();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseMoved

    private void passwordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordLogin;
    // End of variables declaration//GEN-END:variables
}
