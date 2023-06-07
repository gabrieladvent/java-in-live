package desain_SI;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tak Bertuan
 */
public class infoKos extends javax.swing.JDialog {

    Koneksi kon;
    Connection conn;
    ResultSet rs;
    Statement st;
    int kuota = 0;
    int jumlah = 0;

    public infoKos(java.awt.Frame parent, boolean modal) throws SQLException {
        initComponents();
        kon = new Koneksi();
        setAwal();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxpilihTipe = new javax.swing.JComboBox<>();
        jLabelkuota = new javax.swing.JLabel();
        jLabelharga = new javax.swing.JLabel();
        minat = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreafasilitas = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabelGambar = new javax.swing.JLabel();
        home = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Info Kos");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));

        jLabel1.setFont(new java.awt.Font("Exotc350 Bd BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFO KAMAR KOS");

        jLabel3.setFont(new java.awt.Font("Exotc350 Bd BT", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SESUAI TIPE YANG DIPILIH");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\infoFix.png")); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icon_room-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(111, 111, 111)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail Kamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setToolTipText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipe Kamar    :");

        jComboBoxpilihTipe.setBackground(new java.awt.Color(153, 153, 153));
        jComboBoxpilihTipe.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jComboBoxpilihTipe.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxpilihTipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipe A", "Tipe B", "Tipe C" }));
        jComboBoxpilihTipe.setToolTipText("Tipe Kos");
        jComboBoxpilihTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxpilihTipeActionPerformed(evt);
            }
        });

        jLabelkuota.setFont(new java.awt.Font("Goudy Stout", 1, 18)); // NOI18N
        jLabelkuota.setForeground(new java.awt.Color(0, 0, 0));
        jLabelkuota.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stok Kamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabelharga.setFont(new java.awt.Font("Zilla Slab Light", 1, 14)); // NOI18N
        jLabelharga.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Harga Kamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        minat.setBackground(new java.awt.Color(153, 153, 153));
        minat.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        minat.setForeground(new java.awt.Color(0, 0, 0));
        minat.setText("Berminat");
        minat.setToolTipText("Berminat");
        minat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minatMouseExited(evt);
            }
        });
        minat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minatActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fasilitas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        jTextAreafasilitas.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreafasilitas.setColumns(20);
        jTextAreafasilitas.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTextAreafasilitas.setRows(5);
        jTextAreafasilitas.setBorder(null);
        jScrollPane1.setViewportView(jTextAreafasilitas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gambar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabelGambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGambar, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\home_icon-icons.com_73532.png")); // NOI18N
        home.setToolTipText("Back Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxpilihTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelharga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelkuota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(home)
                        .addGap(18, 18, 18))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxpilihTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelkuota, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelharga, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(67, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minatMouseEntered
        minat.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_minatMouseEntered

    private void minatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minatMouseExited
        minat.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_minatMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        HalamanUtama back = new HalamanUtama();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void minatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minatActionPerformed
        JOptionPane.showMessageDialog(null, "Silahkan hubungi kontak dibawah ini"
                + "\nPak Joko : 082281543741", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_minatActionPerformed

    private void jComboBoxpilihTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxpilihTipeActionPerformed
        // TODO add your handling code here:
        conn = kon.getConnection();
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(infoKos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jComboBoxpilihTipe.getSelectedItem() == "Tipe A") {
            jLabelGambar.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\kamar istimewa.jpg"));

            try {
                rs = st.executeQuery("SELECT COUNT (*) AS JUMLAH FROM PENGHUNI WHERE TIPE_KAMAR='Tipe A'");
                while (rs.next()) {
                    jumlah = Integer.parseInt(rs.getString("JUMLAH"));
                    kuota = 10 - jumlah;
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(infoKos.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabelkuota.setText("     " + kuota);
            jTextAreafasilitas.setText("Fasilitasnya : "
                    + "\n- Kasur"
                    + "\n- Lemari"
                    + "\n- AC"
                    + "\n- Karpet"
                    + "\n- Kamar mandi dalam"
                    + "\n- Satu buah meja belajar dilengkapi kursinya"
                    + "\n- Lampu tidur"
                    + "\n- Ukuran kamar 4 x 4 meter");
            jLabelharga.setText("Rp.2.000.000");
        } else if (jComboBoxpilihTipe.getSelectedItem() == "Tipe C") {
            jLabelGambar.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\kamar biasa.jpg"));
            try {
                rs = st.executeQuery("SELECT COUNT (*) AS JUMLAH FROM PENGHUNI WHERE TIPE_KAMAR='Tipe C'");
                while (rs.next()) {
                    jumlah = Integer.parseInt(rs.getString("JUMLAH"));
                    kuota = 25 - jumlah;
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(infoKos.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabelkuota.setText("     " + kuota);
            jTextAreafasilitas.setText("Fasilitasnya: "
                    + "\n- Kasur"
                    + "\n- Lemari"
                    + "\n- Satu buah meja belajar"
                    + "\n- Kamar mandi luar"
                    + "\n- Rak buku"
                    + "\n- Ukuran kamar 3 x 3 meter");
            jLabelharga.setText("Rp.1.000.000");
        } else if (jComboBoxpilihTipe.getSelectedItem() == "Tipe B") {
            jLabelGambar.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\kamar standar.jpg"));
            try {
                rs = st.executeQuery("SELECT COUNT (*) AS JUMLAH FROM PENGHUNI WHERE TIPE_KAMAR='Tipe B'");
                while (rs.next()) {
                    jumlah = Integer.parseInt(rs.getString("JUMLAH"));
                    kuota = 15 - jumlah;
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(infoKos.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabelkuota.setText("     " + kuota);
            jTextAreafasilitas.setText("Fasilitasnya: "
                    + "\n- Kasur"
                    + "\n- Lemari"
                    + "\n- AC"
                    + "\n- Kamar mandi dalam"
                    + "\n- Satu buah meja belajar dilengkapi kursinya"
                    + "\n- Ukuran kamar 3 x 4 meter");
            jLabelharga.setText("Rp.1.500.000");
        }
    }//GEN-LAST:event_jComboBoxpilihTipeActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        int pilihan = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin kembali?",
                        "Batal", JOptionPane.YES_NO_OPTION);
        if (pilihan == JOptionPane.YES_OPTION){
            HalamanUtama back = new HalamanUtama();
            back.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_homeMouseClicked

    public void setAwal() throws SQLException {
         conn = kon.getConnection();
        try {
            st = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(infoKos.class.getName()).log(Level.SEVERE, null, ex);
        }
            jLabelGambar.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\kamar istimewa.jpg"));

            try {
                rs = st.executeQuery("SELECT COUNT (*) AS JUMLAH FROM PENGHUNI WHERE TIPE_KAMAR='Tipe A'");
                while (rs.next()) {
                    jumlah = Integer.parseInt(rs.getString("JUMLAH"));
                    kuota = 10 - jumlah;
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(infoKos.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabelkuota.setText("     " + kuota);
            jTextAreafasilitas.setText("Fasilitasnya : "
                    + "\n- Kasur"
                    + "\n- Lemari"
                    + "\n- AC"
                    + "\n- Karpet"
                    + "\n- Kamar mandi dalam"
                    + "\n- Satu buah meja belajar dilengkapi kursinya"
                    + "\n- Lampu tidur"
                    + "\n- Ukuran kamar 4 x 4 meter");
            jLabelharga.setText("Rp.2.000.000");
    }

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
            java.util.logging.Logger.getLogger(infoKos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoKos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoKos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoKos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                infoKos dialog = null;
                try {
                    dialog = new infoKos(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(infoKos.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel home;
    private javax.swing.JComboBox<String> jComboBoxpilihTipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelGambar;
    private javax.swing.JLabel jLabelharga;
    private javax.swing.JLabel jLabelkuota;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreafasilitas;
    private javax.swing.JButton minat;
    // End of variables declaration//GEN-END:variables
}
