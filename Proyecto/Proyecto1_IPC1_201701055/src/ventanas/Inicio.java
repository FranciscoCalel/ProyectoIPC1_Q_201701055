/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.ImageIcon;

/**
 *
 * @author franc
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form INICIO
     */
    public Inicio() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INICIO = new javax.swing.JButton();
        TOP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        INICIO.setBackground(new java.awt.Color(0, 0, 0));
        INICIO.setForeground(new java.awt.Color(255, 255, 255));
        INICIO.setText("INICIAR");
        INICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIOActionPerformed(evt);
            }
        });
        getContentPane().add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        TOP.setBackground(new java.awt.Color(0, 0, 0));
        TOP.setForeground(new java.awt.Color(255, 255, 255));
        TOP.setText("TOP 10");
        getContentPane().add(TOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reja.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIOActionPerformed
        // TODO add your handling code here:
        Opciones op=new Opciones();
        op.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_INICIOActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INICIO;
    private javax.swing.JButton TOP;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
