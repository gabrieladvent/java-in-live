/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasa_pencarian_kos;

import java.io.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author yayuchristy
 */
public class UpdateData extends javax.swing.JFrame {

    Koneksi kon;
    Connection conn;
    String id;
    LocalDate now = LocalDate.now();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form UpdateData
     */
    public UpdateData() throws SQLException, IOException {
        initComponents();
        jComboBoxPilihItem.setSelectedIndex(0);
        kon = new Koneksi();
        this.setLocationRelativeTo(null);
        Tampil(0);
    }

    public void setAwal() {
        jTextFieldItemUpdate.setEnabled(false);
        jTextFieldItemUpdate.setText("Pilih item dahulu");
    }

    public void updateData() throws IOException {
        conn = kon.getConnection();
        id = jTextFieldIDPenghuni.getText();
        String pilihan = (String) jComboBoxPilihItem.getSelectedItem();
        String tagihan = null;
        String tampung = jTextFieldItemUpdate.getText();

        try {

            if (jComboBoxPilihItem.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Harap pilih item terlebih dahulu!");
            } else {
                st = conn.createStatement();
                rs = st.executeQuery("SELECT * FROM PENGHUNI WHERE id_penghuni = " + id);
                if (rs.next()) {
                    if (pilihan == "Pindah Kamar") {
                        if (tampung.equalsIgnoreCase("Tipe a")) {
                            tagihan = "2000000";
                        } else if (tampung.equalsIgnoreCase("Tipe b")) {
                            tagihan = "1000000";
                        } else if (tampung.equalsIgnoreCase("Tipe c")) {
                            tagihan = "500000";
                        } else {
                            tagihan = null;
                            JOptionPane.showMessageDialog(null, "Tipe tidak cocok !");
                            jTextFieldItemUpdate.requestFocus();
                        }
                        ps = conn.prepareStatement("UPDATE PENGHUNI set tipe_kamar=UPPER(?)  , tagihan_perbulan=? WHERE id_penghuni=?");
                        ps.setString(1, tampung);
                        ps.setString(2, tagihan);
                        ps.setString(3, id);
                        ps.executeUpdate();
                        conn.commit();
                        JOptionPane.showMessageDialog(null, "Data sudah diperbaiki");
                    } else if (pilihan == "Transaksi Pembayaran") {
                        ps = conn.prepareStatement("UPDATE PENGHUNI set Status_bayar=UPPER(?), tanggal_bayar = ?  WHERE id_penghuni=?");
                        ps.setString(1, tampung);
                        ps.setDate(2, Date.valueOf(now));
                        ps.setString(3, id);
                        ps.executeUpdate();
                        conn.commit();
                        JOptionPane.showMessageDialog(null, "Data sudah diperbaiki");
                    } else if (pilihan == "Berhenti Sewa") {
                        String id = jTextFieldIDPenghuni.getText();
                        st = conn.createStatement();
                        rs = st.executeQuery("SELECT * FROM PENGHUNI WHERE id_penghuni=" + id);
                        while (rs.next()) {
                            String tam = rs.getString("status_bayar");
                            if (tam.equals("BELUM")) {
                                JOptionPane.showMessageDialog(null, rs.getString("nama").toLowerCase() + " belum membayar tagihan bulan ini, tidak bisa memproses permintaan!");
                            } else {
                                ps = conn.prepareStatement("delete from penghuni where id_penghuni = ?");
                                ps.setString(1, id);
                                ps.executeUpdate();
                                conn.commit();
                                JOptionPane.showMessageDialog(null, "Data penyewa telah dihapus");
                                System.out.println("Data sudah dihapus! ");
                                ps.close();
                                conn.close();
                            }
                        }
                    }
                } else {
                    jTextFieldIDPenghuni.setText("");
                    throw new SQLException();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Harap inputkan data yang valid");
        }
    }

    public void lebarKolom() {
        //sumber : https://top-ilmu.blogspot.com/2013/07/cara-mengatur-lebar-kolom-tabel-netbeans.html
        TableColumn column;
        jTablePenghuni.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = jTablePenghuni.getColumnModel().getColumn(0);
        column.setPreferredWidth(50);
        column = jTablePenghuni.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);
        column = jTablePenghuni.getColumnModel().getColumn(2);
        column.setPreferredWidth(80);
        column = jTablePenghuni.getColumnModel().getColumn(3);
        column.setPreferredWidth(80);
        column = jTablePenghuni.getColumnModel().getColumn(4);
        column.setPreferredWidth(100);
        column = jTablePenghuni.getColumnModel().getColumn(5);
        column.setPreferredWidth(80);
    }

    public void Tampil(int status) throws SQLException {
        String queryStr;
        String kunci = jTextFieldCari.getText().toUpperCase();
        String query2 = " ";
        if (status == 0) {
            queryStr = "SELECT * FROM PENGHUNI ORDER BY ID_PENGHUNI";
        } else {
            reset();
            queryStr = "SELECT * FROM PENGHUNI  WHERE nama like '%" + kunci + "%' ORDER BY ID_PENGHUNI";
        }
        conn = kon.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(queryStr);
        ArrayList id = new ArrayList();
        ArrayList nama = new ArrayList();
        ArrayList tipeKamar = new ArrayList();
        ArrayList tagihan = new ArrayList();
        ArrayList statusKamar = new ArrayList();
        ArrayList statusBayar = new ArrayList();
        lebarKolom();
        int count = 0;
        while (rs.next()) {
            id.add(rs.getString("id_penghuni"));
            nama.add(rs.getString("nama"));
            tipeKamar.add(rs.getString("tipe_kamar"));
            tagihan.add(rs.getString("tagihan_perbulan"));
            statusKamar.add(rs.getString("status_kamar"));
            statusBayar.add(rs.getString("status_bayar"));

            DefaultTableModel model = (DefaultTableModel) jTablePenghuni.getModel();
            model.addRow(new Object[]{id.get(count), nama.get(count), tipeKamar.get(count), tagihan.get(count), statusKamar.get(count), statusBayar.get(count)});
            count++;
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    public void reset() {
        DefaultTableModel model = (DefaultTableModel) jTablePenghuni.getModel();
        model.setRowCount(0);
    }

    public void tulis() throws IOException, SQLException {
        conn = kon.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(" SELECT * FROM PENGHUNI ");
        FileWriter fileWriter = new FileWriter("Data Pembayaran.txt");
        fileWriter.write("DATA PEMBAYARAN BULAN " + now.getMonth());
        fileWriter.write("\n===============================================================");
        fileWriter.write("\nNAMA\t\tTIPE KAMAR\tTAGIHAN\t\tTANGGAL BAYAR ");
        fileWriter.write("\n===============================================================");
        while (rs.next()) {
            try {
                Date tam = rs.getDate(7);
                if (tam == null) {
                    fileWriter.write("\n" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t\tBELUM BAYAR");
                } else {
                    fileWriter.write("\n" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t\t" + rs.getDate(7));
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        fileWriter.close();
        rs.close();
        st.close();
        conn.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelPilihanUpdate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIDPenghuni = new javax.swing.JTextField();
        jTextFieldItemUpdate = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jComboBoxPilihItem = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePenghuni = new javax.swing.JTable();
        jButtonCari = new javax.swing.JButton();
        jTextFieldCari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Data");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pilih Item yang mau di-update : ");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Masukan  ID Penghuni : ");

        jTextFieldItemUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldItemUpdateMouseClicked(evt);
            }
        });
        jTextFieldItemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldItemUpdateActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jComboBoxPilihItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---PILIH---", "Pindah Kamar", "Transaksi Pembayaran", "Berhenti Sewa" }));
        jComboBoxPilihItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPilihItemActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cari Data"));

        jTablePenghuni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "TIpe kamar", "Tagihan", "Status kamar", "Status bayar"
            }
        ));
        jTablePenghuni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePenghuniMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePenghuni);

        jButtonCari.setText("CARI");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCari)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCari)
                    .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabelPilihanUpdate))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldItemUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldIDPenghuni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonCancel)))))
                            .addComponent(jComboBoxPilihItem, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPilihItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldIDPenghuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPilihanUpdate)
                    .addComponent(jTextFieldItemUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        try {
            // TODO add your handling code here:
            Tampil(1);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCariActionPerformed

    private void jTablePenghuniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePenghuniMouseClicked
        // TODO add your handling code here:
        int baris = jTablePenghuni.getSelectedRow();
        id = jTablePenghuni.getModel().getValueAt(baris, 0).toString();
        jTextFieldIDPenghuni.setText(id);

    }//GEN-LAST:event_jTablePenghuniMouseClicked

    private void jComboBoxPilihItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPilihItemActionPerformed
        // TODO add your handling code here:
        String pilih = (String) jComboBoxPilihItem.getSelectedItem();
        if (pilih == "Pindah Kamar") {
            jLabelPilihanUpdate.setText("Masukan Tipe Kamar   : ");
            jTextFieldItemUpdate.setText("Tipe ");
            jTextFieldItemUpdate.setEnabled(true);
        } else if (pilih == "Transaksi Pembayaran") {
            jLabelPilihanUpdate.setText("Status Bayar : ");
            jTextFieldItemUpdate.setText("Sudah");
            jTextFieldItemUpdate.setEnabled(false);
        } else if (pilih == "Berhenti Sewa") {
            jLabelPilihanUpdate.setText("Status Kamar : ");
            jTextFieldItemUpdate.setText("Kosong");
            jTextFieldItemUpdate.setEnabled(false);
        } else {
            jLabelPilihanUpdate.setText("");
            jTextFieldItemUpdate.setText("Pilih item dahulu");
            jTextFieldItemUpdate.setEnabled(false);
        }

    }//GEN-LAST:event_jComboBoxPilihItemActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        new Pemilik_Kos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            // TODO add your handling code here:
            if (jTextFieldIDPenghuni.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Harap masukkan id !");
            } else {
                updateData();
                jComboBoxPilihItem.setSelectedIndex(0);
                setAwal();
                tulis();
                reset();
                Tampil(0);
            }

        } catch (IOException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldItemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldItemUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldItemUpdateActionPerformed

    private void jTextFieldItemUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldItemUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldItemUpdateMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UpdateData().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxPilihItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPilihanUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablePenghuni;
    private javax.swing.JTextField jTextFieldCari;
    private javax.swing.JTextField jTextFieldIDPenghuni;
    private javax.swing.JTextField jTextFieldItemUpdate;
    // End of variables declaration//GEN-END:variables
}
