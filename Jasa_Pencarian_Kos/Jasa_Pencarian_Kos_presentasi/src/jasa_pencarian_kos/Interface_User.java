/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasa_pencarian_kos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author yayuchristy
 */
public class Interface_User extends javax.swing.JFrame {

    Koneksi kon;
    Connection conn;
    ResultSet rs;
    Statement st;

    /**
     * Creates new form Interface_User
     */
    public Interface_User() {
        initComponents();
        kon = new Koneksi();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonBerminat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelGambar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfoKamar = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabelKuota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User");
        setLocation(new java.awt.Point(380, 70));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Tipe Kamar : ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---PILIH---", "Kamar Tipe A", "Kamar Tipe B", "Kamar Tipe C" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Gambar : ");

        jLabel3.setText("Info Kamar :");

        jButtonBerminat.setText("Berminat");
        jButtonBerminat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBerminatActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Chaparral Pro Light", 1, 16)); // NOI18N
        jLabel4.setText("DETAIL KAMAR");

        jLabelGambar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Balis Creative\\Documents\\NetBeansProjects\\Jasa_Pencarian_Kos_presentasi\\pilih kamar.png")); // NOI18N
        jLabelGambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelGambar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelGambarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTextAreaInfoKamar.setColumns(20);
        jTextAreaInfoKamar.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInfoKamar);

        jLabel5.setText("Sisa Kuota Kamar :");

        jLabelKuota.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelKuota.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKuota.setText("     0");
        jLabelKuota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabelKuota, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonBerminat)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBerminat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelKuota, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        conn = kon.getConnection();
        int kuota=0;
        int jumlah = 0;
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Interface_User.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jComboBox1.getSelectedItem() == "Kamar Tipe A") {
            jLabelGambar.setIcon(new javax.swing.ImageIcon("kamar istimewa.jpg"));

            try {
                rs = st.executeQuery("SELECT COUNT (*) AS JUMLAH FROM PENGHUNI WHERE TIPE_KAMAR='Tipe A'");
                while (rs.next()) {
                    jumlah = Integer.parseInt(rs.getString("JUMLAH"));
                    kuota = 5-jumlah;
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Interface_User.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabelKuota.setText("     "+kuota);
            jTextAreaInfoKamar.setText("Fasilitasnya : \n-Kasur\n-Lemari\n-AC\n-Karpet\n-Kamar mandi dalam\n-Satu buah meja belajar dilengkapi kursinya"
                    + "\n-Lampu tidur\n-Uk. kamar = 4x4 meter\n-Tarif perbulannya Rp.2.000.000");
        } else if (jComboBox1.getSelectedItem() == "Kamar Tipe C") {
            jLabelGambar.setIcon(new javax.swing.ImageIcon("kamar biasa.jpg"));
            try {
                rs = st.executeQuery("SELECT COUNT (*) AS JUMLAH FROM PENGHUNI WHERE TIPE_KAMAR='Tipe C'");
                while (rs.next()) {
                    jumlah = Integer.parseInt(rs.getString("JUMLAH"));
                     kuota = 10-jumlah;
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Interface_User.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabelKuota.setText("     "+kuota);
            jTextAreaInfoKamar.setText("Fasilitasnya: \n-Kasur\n-Lemari\n-Satu buah meja belajar\n-Kamar mandi luar\n-Rak buku"
                    + "\n-Uk. kamar = 3x3 meter\n-Tarif perbulannya Rp.1.000.000");
        } else if (jComboBox1.getSelectedItem() == "Kamar Tipe B") {
            jLabelGambar.setIcon(new javax.swing.ImageIcon("kamar standar.jpg"));
            try {
                rs = st.executeQuery("SELECT COUNT (*) AS JUMLAH FROM PENGHUNI WHERE TIPE_KAMAR='Tipe B'");
                while (rs.next()) {
                    jumlah = Integer.parseInt(rs.getString("JUMLAH"));
                     kuota = 15-jumlah;
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Interface_User.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabelKuota.setText("     "+kuota);
            jTextAreaInfoKamar.setText("Fasilitasnya: \n-Kasur\n-Lemari\n-AC\n-Kamar mandi dalam\n-Satu buah meja belajar dilengkapi kursinya"
                    + "\n-Uk. kamar = 3x4 meter\n-Tarif perbulannya Rp. 1.500.000");
        } else {
            jLabelGambar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo X220\\Pictures\\Gambar untuk project UTS PBO\\pilih kamar.png"));
            jTextAreaInfoKamar.setText("");
            jLabelKuota.setText("     0");
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed
    public void setAwal() {
        jTextAreaInfoKamar.setText("");
        jComboBox1.setSelectedIndex(0);
    }
    private void jButtonBerminatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBerminatActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Silahkan hubungi :\nPak Rahmat (082211339870)\nTerima Kasih sudah mampir!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        setAwal();
    }//GEN-LAST:event_jButtonBerminatActionPerformed

    private void jLabelGambarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelGambarAncestorAdded

    }//GEN-LAST:event_jLabelGambarAncestorAdded

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
            java.util.logging.Logger.getLogger(Interface_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBerminat;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelGambar;
    private javax.swing.JLabel jLabelKuota;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInfoKamar;
    // End of variables declaration//GEN-END:variables
}
