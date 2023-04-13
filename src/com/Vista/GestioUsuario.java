
package com.Vista;

import SQL.ConexionSQL;
import SQL.crudsql;
import com.clases.Usuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestioUsuario extends javax.swing.JFrame {
    DefaultTableModel dtmU = new DefaultTableModel();
    /**
     * Creates new form GestioUsuario
     */
    public GestioUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarTabla();
        
        //Llenar tabla Usuarios
        dtmU.addColumn("ID");
        dtmU.addColumn("NOMBRE");
        dtmU.addColumn("CORREO");
        dtmU.addColumn("USUARIO");
        this.tblGestionU.setModel(dtmU);
    }
    
    crudsql crud =new crudsql();
    Usuarios usua = new Usuarios();
    ConexionSQL con = new ConexionSQL();
    java.sql.Statement st;
    ResultSet rs;
    public void llenarTabla(){

            Object[] info=new Object[5];
            dtmU.setRowCount(0);
                crud.buscarUsua();
                info[0]= usua.getUsuario();
                info[1]= usua.getContraseña();
                dtmU.addRow(info);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGestionU = new javax.swing.JTable();
        btmEliminar1 = new javax.swing.JButton();
        SalidaContraseña = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SalidaNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 34, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gurmukhi MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PARQUEO INTELIGENTE ULTRA 4K SMART");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 380, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/cubo-en-la-antartica_3840x2160_xtrafondos.com 2.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/home_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jButton3.setText("VOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 100, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 20));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion de usuarios");
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 540, 30));

        tblGestionU.setBackground(new java.awt.Color(255, 255, 255));
        tblGestionU.setForeground(new java.awt.Color(255, 255, 255));
        tblGestionU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblGestionU);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 470, 270));

        btmEliminar1.setBackground(new java.awt.Color(255, 255, 255));
        btmEliminar1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btmEliminar1.setForeground(new java.awt.Color(0, 0, 0));
        btmEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Vista/imagen/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        btmEliminar1.setText("ELIMINAR");
        btmEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btmEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 110, 40));

        SalidaContraseña.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        SalidaContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SalidaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 110, 20));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        SalidaNombre.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        SalidaNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SalidaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btmEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEliminar1ActionPerformed
        
    }//GEN-LAST:event_btmEliminar1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SalidaContraseña;
    private javax.swing.JLabel SalidaNombre;
    private javax.swing.JButton btmEliminar1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGestionU;
    // End of variables declaration//GEN-END:variables
}
