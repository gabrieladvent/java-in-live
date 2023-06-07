/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desain_SI;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Tak Bertuan
 */
public class HU_admin extends javax.swing.JFrame {

    Koneksi kon;
    Connection conn;
    LocalDate waktu = LocalDate.now();
    Statement st;
    ResultSet rs;
    int indeks = 0;
    String idHapus;
    String idEdit;
    PreparedStatement ps;

    /**
     * Creates new form HU_admin
     */
    public HU_admin() throws SQLException {
        initComponents();
        kon = new Koneksi();
        conn = kon.getConnection();
        this.setLocationRelativeTo(null);
        setAwalInsert();
        Tampil(0, jTablePenghuniHapus, jTextFieldCariHapus);
        Tampil(0, jTablePenghuni, jTextFieldCariLihat);
        jTextFieldCariLihat.setEditable(false);
        HitungKamar("Tipe A", 10);
        setAwalHapus();
        setAwalEdit();

    }

    public void setAwalHapus() {
        jTextFieldIdHapus.setEnabled(false);
        jTextFieldNamaHapus.setEnabled(false);
        jTextFieldStatusBayarHapus.setEnabled(false);

    }

    public void setAwalEdit() throws SQLException {
        jComboBoxPilihItemEdit.setSelectedIndex(0);
        jTextFieldIdEdit.setEnabled(false);
        jLabelEditItem.setText("Silahkan Edit data Status Bayar!");
        jTextFieldIdEdit.setEnabled(false);
        jTextFieldNamaEdit.setEnabled(false);
        jComboBoxTipeKamarEdit.setEnabled(false);
        jRadioButtonBelumBayarEdit.setEnabled(true);
        jRadioButtonSudahBayarEdit.setEnabled(true);
        jTextFieldIdEdit.setText("");
        jTextFieldCariEdit.setText("Masukan Keyword. . . . .");
        Tampil(0, jTablePenghuniEdit, jTextFieldCariEdit);
        jTextFieldNamaEdit.setText("");
        jRadioButtonBelumBayarEdit.setSelected(false);
        jRadioButtonSudahBayarEdit.setSelected(false);
    }

    public void setAwalInsert() {
        jTextFieldNama.setText("Masukkan dengan huruf");
        jTextFieldNama.setFont(new Font("Zilla Slab Light", Font.ITALIC, 12));
        jTextFieldNama.setForeground(Color.GRAY);
        jRadioButtonSudah.setSelected(true);
        jRadioButtonBelum.setSelected(false);
        jTextFieldNama.setEditable(false);
        jComboBoxTipe.setSelectedIndex(0);
    }

    public void resetTableLihat(JTable tabel) {
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        model.setRowCount(0);
    }

    public void Tampil(int status, JTable tabel, JTextField key) throws SQLException {
        int countBaru = 0;
        String queryStr;
        String kunci = key.getText().toUpperCase();
        if (status == 0) {
            queryStr = "SELECT * FROM PENGHUNI ORDER BY ID_PENGHUNI";
        } else {
            resetTableLihat(tabel);
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
        ArrayList tglBayar = new ArrayList();

        while (rs.next()) {
            id.add(rs.getString("id_penghuni"));
            nama.add(rs.getString("nama"));
            tipeKamar.add(rs.getString("tipe_kamar"));
            tagihan.add(rs.getString("tagihan_perbulan"));
            statusKamar.add(rs.getString("status_kamar"));
            statusBayar.add(rs.getString("status_bayar"));
            tglBayar.add(rs.getDate("tanggal_bayar"));
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            model.addRow(new Object[]{id.get(countBaru), nama.get(countBaru), tipeKamar.get(countBaru), tagihan.get(countBaru), statusKamar.get(countBaru), statusBayar.get(countBaru), tglBayar.get(countBaru)});
            countBaru++;
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    public void review(String status_bayar) {
        jTableReview.setValueAt(jTextFieldNama.getText(), indeks, 0);
        jTableReview.setValueAt(jComboBoxTipe.getSelectedItem(), indeks, 1);
        jTableReview.setValueAt(status_bayar, indeks, 2);
        indeks++;

    }

    public void Edit() {
        conn = kon.getConnection();
        String pilih = (String) jComboBoxPilihItemEdit.getSelectedItem();
        String tagihan = null;
        String tampung = null;

        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM PENGHUNI WHERE id_penghuni =" + idEdit);
            if (rs.next()) {
                if (pilih.equalsIgnoreCase("Tipe Kamar")) {
                    if (rs.getString("status_bayar").equals("BELUM")) {
                        JOptionPane.showMessageDialog(null, rs.getString("nama").toLowerCase() + " belum membayar tagihan bulan ini, tidak bisa memproses permintaan!", "Gagal", JOptionPane.ERROR_MESSAGE);
                    } else {
                        tampung = jComboBoxTipeKamarEdit.getSelectedItem().toString();
                        if (tampung.equalsIgnoreCase("Tipe a")) {
                            tagihan = "2000000";
                        } else if (tampung.equalsIgnoreCase("Tipe b")) {
                            tagihan = "1000000";
                        } else if (tampung.equalsIgnoreCase("Tipe c")) {
                            tagihan = "500000";
                        }
                        ps = conn.prepareStatement("UPDATE PENGHUNI set tipe_kamar=UPPER(?)  , tagihan_perbulan=? WHERE id_penghuni=?");
                        ps.setString(1, tampung);
                        ps.setString(2, tagihan);
                        ps.setString(3, idEdit);
                        ps.executeUpdate();
                        conn.commit();
                        JOptionPane.showMessageDialog(null, "Data sudah diperbaiki");
                    }

                } else if (pilih.equalsIgnoreCase("Status Bayar")) {
                    if (jRadioButtonSudahBayarEdit.isSelected()) {
                        tampung = "SUDAH";
                    } else {
                        tampung = "BELUM";
                    }
                    ps = conn.prepareStatement("UPDATE PENGHUNI set status_bayar=UPPER(?), tanggal_bayar = ?  WHERE id_penghuni=?");
                    ps.setString(1, tampung);
                    ps.setDate(2, Date.valueOf(waktu));
                    ps.setString(3, idEdit);
                    ps.executeUpdate();
                    conn.commit();
                    JOptionPane.showMessageDialog(null, "Data sudah diperbaiki");
                } else if (pilih.equalsIgnoreCase("Nama")) {
                    tampung = jTextFieldNamaEdit.getText().toUpperCase();
                    ps = conn.prepareStatement("UPDATE PENGHUNI set nama=UPPER(?)  WHERE id_penghuni=?");
                    ps.setString(1, tampung);
                    ps.setString(2, idEdit);
                    ps.executeUpdate();
                    conn.commit();
                    JOptionPane.showMessageDialog(null, "Data sudah diperbaiki");
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Harap inputkan data yang valid");
        }
    }

    public void HitungKamar(String select, int total) {
        int kuota = 0;
        int jumlah = 0;
        try {
            conn = kon.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT COUNT (*) AS JUMLAH FROM PENGHUNI WHERE TIPE_KAMAR='" + select + "'");
            while (rs.next()) {
                jumlah = Integer.parseInt(rs.getString("JUMLAH"));
                kuota = total - jumlah;
            }
            jLabelTotal.setText(total + "");
            jLabelKamarTerisi.setText(jumlah + "");
            jLabelKamarKosong.setText(kuota + "");
            rs.close();

            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jRadioButtonSudah = new javax.swing.JRadioButton();
        jRadioButtonBelum = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxTipe = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButtonReset = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReview = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jTextFieldCariEdit = new javax.swing.JTextField();
        jButtonCariEdit = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTablePenghuniEdit = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jButtonResetEdit = new javax.swing.JButton();
        jButtonSimpanEdit = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPilihItemEdit = new javax.swing.JComboBox<>();
        jButtonLoginEdit = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldIdEdit = new javax.swing.JTextField();
        jTextFieldNamaEdit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTipeKamarEdit = new javax.swing.JComboBox<>();
        jRadioButtonSudahBayarEdit = new javax.swing.JRadioButton();
        jRadioButtonBelumBayarEdit = new javax.swing.JRadioButton();
        jLabelEditItem = new javax.swing.JLabel();
        jTabbedPaneLihatDataKost = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jTextFieldCariLihat = new javax.swing.JTextField();
        jButtonCariLihat = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePenghuni = new javax.swing.JTable();
        jButtonLogoutLihat = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxTipeDataKost = new javax.swing.JComboBox<>();
        jPanel27 = new javax.swing.JPanel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelKamarTerisi = new javax.swing.JLabel();
        jLabelKamarKosong = new javax.swing.JLabel();
        jButtonLogoutLihatKost = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButtonLogoutHapus = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButtonCariHapus = new javax.swing.JButton();
        jTextFieldCariHapus = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTablePenghuniHapus = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldIdHapus = new javax.swing.JTextField();
        jTextFieldNamaHapus = new javax.swing.JTextField();
        jTextFieldStatusBayarHapus = new javax.swing.JTextField();
        jButtonHapusPeyewa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Admin");
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseEntered(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Insert Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama                     : ");

        jLabel4.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Status Bayar         : ");

        jTextFieldNama.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTextFieldNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNamaMouseClicked(evt);
            }
        });

        jRadioButtonSudah.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jRadioButtonSudah.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonSudah.setText("Sudah Bayar");
        jRadioButtonSudah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSudahActionPerformed(evt);
            }
        });

        jRadioButtonBelum.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jRadioButtonBelum.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonBelum.setText("Belum Bayar");
        jRadioButtonBelum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBelumActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Tipe Kamar           : ");

        jComboBoxTipe.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jComboBoxTipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipe A", "Tipe B", "Tipe C" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonSudah)
                        .addGap(50, 50, 50)
                        .addComponent(jRadioButtonBelum))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonSudah)
                        .addComponent(jRadioButtonBelum))
                    .addComponent(jLabel4))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MASUKAN DATA PENYEWA KOS");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Operator", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jButtonReset.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(0, 0, 0));
        jButtonReset.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-reset-20.png")); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.setToolTipText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonSimpan.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonSimpan.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSimpan.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-save-20.png")); // NOI18N
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.setToolTipText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSimpan)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSimpan)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Review Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTableReview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Tipe Kamar", "Status Bayar"
            }
        ));
        jScrollPane1.setViewportView(jTableReview);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton2.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-logout-25.png")); // NOI18N
        jButton2.setText("Logout");
        jButton2.setToolTipText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Penyewa Kos", jPanel2);

        jTabbedPane2.addTab("Insert", jTabbedPane3);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EDIT DATA PENYEWA KOS");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cari Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextFieldCariEdit.setFont(new java.awt.Font("Zilla Slab Light", 2, 12)); // NOI18N
        jTextFieldCariEdit.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCariEdit.setText("Masukan Keyword. . . . .");
        jTextFieldCariEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCariEditMouseClicked(evt);
            }
        });

        jButtonCariEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonCariEdit.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-search-20.png")); // NOI18N
        jButtonCariEdit.setText("Cari Data");
        jButtonCariEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldCariEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCariEdit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jTextFieldCariEdit)
                        .addGap(2, 2, 2))
                    .addComponent(jButtonCariEdit, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Keterangan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel19.setToolTipText("");

        jTablePenghuniEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTablePenghuniEdit.setForeground(new java.awt.Color(0, 0, 0));
        jTablePenghuniEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Tipe Kamar", "Tagihan/bln", "Status Kamar", "Status Bayar", "Tgl Bayar"
            }
        ));
        jTablePenghuniEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePenghuniEditMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTablePenghuniEdit);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Operator", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jButtonResetEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonResetEdit.setForeground(new java.awt.Color(0, 0, 0));
        jButtonResetEdit.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-reset-20.png")); // NOI18N
        jButtonResetEdit.setText("Reset");
        jButtonResetEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetEditActionPerformed(evt);
            }
        });

        jButtonSimpanEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonSimpanEdit.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSimpanEdit.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-save-20.png")); // NOI18N
        jButtonSimpanEdit.setText("Simpan");
        jButtonSimpanEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSimpanEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jButtonResetEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonResetEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButtonSimpanEdit)
                .addContainerGap())
        );

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Edit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pilih item yang mau di edit : ");

        jComboBoxPilihItemEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jComboBoxPilihItemEdit.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxPilihItemEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status Bayar", "Nama", "Tipe Kamar" }));
        jComboBoxPilihItemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPilihItemEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxPilihItemEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxPilihItemEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonLoginEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonLoginEdit.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLoginEdit.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-logout-25.png")); // NOI18N
        jButtonLoginEdit.setText("Logout");
        jButtonLoginEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginEditActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ubah  Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Id Penyewa :");

        jLabel11.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nama :");

        jLabel16.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Status Bayar :");

        jTextFieldIdEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N

        jTextFieldNamaEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTextFieldNamaEdit.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipe Kamar : ");

        jComboBoxTipeKamarEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jComboBoxTipeKamarEdit.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxTipeKamarEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipe A", "Tipe B", "Tipe C" }));

        jRadioButtonSudahBayarEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jRadioButtonSudahBayarEdit.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonSudahBayarEdit.setText("Sudah Bayar");
        jRadioButtonSudahBayarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSudahBayarEditActionPerformed(evt);
            }
        });

        jRadioButtonBelumBayarEdit.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jRadioButtonBelumBayarEdit.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonBelumBayarEdit.setText("Belum Bayar");
        jRadioButtonBelumBayarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBelumBayarEditActionPerformed(evt);
            }
        });

        jLabelEditItem.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabelEditItem.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEditItem.setText("Masukan");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonSudahBayarEdit)
                .addGap(36, 36, 36)
                .addComponent(jRadioButtonBelumBayarEdit)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipeKamarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelEditItem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEditItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldNamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTipeKamarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jRadioButtonSudahBayarEdit)
                    .addComponent(jRadioButtonBelumBayarEdit))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jButtonLoginEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLoginEdit)
                        .addGap(172, 172, 172))))
        );

        jTabbedPane4.addTab("Data Penyewa Kos", jPanel9);

        jTabbedPane2.addTab("Edit", jTabbedPane4);

        jPanel25.setBackground(new java.awt.Color(204, 204, 204));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("LIHAT DATA PENYEWA KOS");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel15)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(204, 204, 204));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cari Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextFieldCariLihat.setFont(new java.awt.Font("Zilla Slab Light", 2, 12)); // NOI18N
        jTextFieldCariLihat.setForeground(java.awt.Color.gray);
        jTextFieldCariLihat.setText("Masukan Keyword");
        jTextFieldCariLihat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCariLihatMouseClicked(evt);
            }
        });

        jButtonCariLihat.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonCariLihat.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCariLihat.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-search-20.png")); // NOI18N
        jButtonCariLihat.setText("Cari");
        jButtonCariLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariLihatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCariLihat, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCariLihat)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jTextFieldCariLihat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCariLihat))
        );

        jPanel32.setBackground(new java.awt.Color(204, 204, 204));
        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hasil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTablePenghuni.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTablePenghuni.setForeground(new java.awt.Color(0, 0, 0));
        jTablePenghuni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Tipe Kamar", "Tagihan/bln", "Status Kamar", "Status Bayar", "Tgl Bayar"
            }
        ));
        jScrollPane2.setViewportView(jTablePenghuni);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)))
        );

        jButtonLogoutLihat.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonLogoutLihat.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogoutLihat.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-logout-25.png")); // NOI18N
        jButtonLogoutLihat.setText("Logout");
        jButtonLogoutLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutLihatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(383, 383, 383)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogoutLihat)
                .addGap(413, 413, 413))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLogoutLihat)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPaneLihatDataKost.addTab("Data Penyewa Kos", jPanel24);

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("LIHAT DATA KOS");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cari Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Tipe");

        jComboBoxTipeDataKost.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jComboBoxTipeDataKost.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxTipeDataKost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipe A", "Tipe B", "Tipe C" }));
        jComboBoxTipeDataKost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipeDataKostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxTipeDataKost, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBoxTipeDataKost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(204, 204, 204));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTotal.setBackground(new java.awt.Color(204, 204, 204));
        jLabelTotal.setFont(new java.awt.Font("Goudy Stout", 0, 24)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Total Kamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabelKamarTerisi.setBackground(new java.awt.Color(204, 204, 204));
        jLabelKamarTerisi.setFont(new java.awt.Font("Goudy Stout", 0, 24)); // NOI18N
        jLabelKamarTerisi.setForeground(new java.awt.Color(0, 0, 0));
        jLabelKamarTerisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelKamarTerisi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kamar yang Terisi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabelKamarKosong.setBackground(new java.awt.Color(204, 204, 204));
        jLabelKamarKosong.setFont(new java.awt.Font("Goudy Stout", 0, 24)); // NOI18N
        jLabelKamarKosong.setForeground(new java.awt.Color(0, 0, 0));
        jLabelKamarKosong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelKamarKosong.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kamar yang Belum Terisi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelKamarTerisi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelKamarKosong, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelKamarKosong, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKamarTerisi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jButtonLogoutLihatKost.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonLogoutLihatKost.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogoutLihatKost.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-logout-25.png")); // NOI18N
        jButtonLogoutLihatKost.setText("Logout");
        jButtonLogoutLihatKost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutLihatKostActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Keterangan Kos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Nama Kos        : Kos Anak Muda\nAlamat Kos     : Gang Rambutan, Jln. Kanigoro 212, \n                             Maguwohardjo, Depok, Sleman\n                             Yogyakarta, 55281\nNama Pemilik : Bpk. Joko Sutedjo.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonLogoutLihatKost)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonLogoutLihatKost)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneLihatDataKost.addTab("Data Kos", jPanel22);

        jTabbedPane2.addTab("Lihat", jTabbedPaneLihatDataKost);

        jPanel37.setBackground(new java.awt.Color(204, 204, 204));
        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("HAPUS DATA PENYEWA");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButtonLogoutHapus.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonLogoutHapus.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogoutHapus.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-logout-25.png")); // NOI18N
        jButtonLogoutHapus.setText("Logout");
        jButtonLogoutHapus.setToolTipText("");
        jButtonLogoutHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutHapusActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cari Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jButtonCariHapus.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonCariHapus.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCariHapus.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-search-20.png")); // NOI18N
        jButtonCariHapus.setText("Cari");
        jButtonCariHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariHapusActionPerformed(evt);
            }
        });

        jTextFieldCariHapus.setFont(new java.awt.Font("Zilla Slab Light", 2, 12)); // NOI18N
        jTextFieldCariHapus.setForeground(java.awt.Color.gray);
        jTextFieldCariHapus.setText("Masukan nama");
        jTextFieldCariHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCariHapusMouseClicked(evt);
            }
        });

        jTablePenghuniHapus.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTablePenghuniHapus.setForeground(new java.awt.Color(0, 0, 0));
        jTablePenghuniHapus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Tipe Kamar", "Tagihan/bln", "Status Kamar", "Status Bayar", "Tgl Bayar"
            }
        ));
        jTablePenghuniHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePenghuniHapusMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTablePenghuniHapus);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextFieldCariHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCariHapus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addGap(15, 15, 15))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCariHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCariHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Rincian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Zilla Slab Light", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Id Penyewa :");

        jLabel7.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nama :");

        jLabel8.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Status Bayar :");

        jTextFieldIdHapus.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTextFieldIdHapus.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldNamaHapus.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTextFieldNamaHapus.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldStatusBayarHapus.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jTextFieldStatusBayarHapus.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNamaHapus))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldStatusBayarHapus)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldIdHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNamaHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldStatusBayarHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonHapusPeyewa.setFont(new java.awt.Font("Zilla Slab Light", 0, 12)); // NOI18N
        jButtonHapusPeyewa.setForeground(new java.awt.Color(0, 0, 0));
        jButtonHapusPeyewa.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\icons8-delete-20.png")); // NOI18N
        jButtonHapusPeyewa.setText("Hapus");
        jButtonHapusPeyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusPeyewaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonHapusPeyewa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLogoutHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButtonHapusPeyewa)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogoutHapus)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Data Penyewa Kos", jPanel36);

        jTabbedPane2.addTab("Hapus", jTabbedPane6);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setFont(new java.awt.Font("Imprint MT Shadow", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("LAMAN ADMIN");

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\Document\\CODING\\SI_Kos\\src\\SI_Kos\\desain\\images\\my-project--2-1.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(289, 289, 289))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)))
                .addComponent(jLabel33)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void inputData() throws SQLException, IOException {
        conn = null;
        PreparedStatement ps = null;
        conn = kon.getConnection();
        String nama = jTextFieldNama.getText();
        String tipeKamar = (String) jComboBoxTipe.getSelectedItem();
        String statusBayar = "BELUM";
        String tagihan = "";
        int maxKamar = 0;
        if (tipeKamar.equals("Tipe A")) {
            tagihan = "2000000";
            maxKamar = 10;

        } else if (tipeKamar.equals("Tipe B")) {
            tagihan = "1500000";
            maxKamar = 15;
        } else {
            tagihan = "1000000";
            maxKamar = 25;
        }
        if (jRadioButtonBelum.isSelected() == false) {
            statusBayar = "SUDAH";
        }
        String statusKamar = "TERISI";
        if (statusBayar == "SUDAH") {
        }
        int jumlah = 0;
        conn = kon.getConnection();
        st = conn.createStatement();
        rs = st.executeQuery("SELECT COUNT (*) AS JUMLAH FROM PENGHUNI WHERE TIPE_KAMAR='" + tipeKamar + "'");
        while (rs.next()) {
            jumlah = Integer.parseInt(rs.getString("JUMLAH"));
        }
        try {
            if (jumlah + 1 <= maxKamar) {
                ps = conn.prepareStatement("Insert into penghuni values(DEPT_SE.NEXTVAL,UPPER(?),?,?,?,?,?)");
                ps.setString(1, nama);
                ps.setString(2, tipeKamar);
                ps.setString(3, tagihan);
                ps.setString(4, statusKamar);
                ps.setString(5, statusBayar);
                if (statusBayar == "BELUM") {
                    ps.setDate(6, null);
                } else {
                    ps.setDate(6, Date.valueOf(waktu));

                }
                ps.executeUpdate();
                conn.commit();
                JOptionPane.showMessageDialog(null, "Data sudah ditambahkan!");
                review(statusBayar);
            } else {
                JOptionPane.showMessageDialog(null, "Kuota kamar " + tipeKamar + " sudah penuh!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void jTextFieldCariEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCariEditMouseClicked
        jTextFieldCariEdit.setText("");
        jTextFieldCariEdit.setFont(new Font("Zilla Slab Light", Font.PLAIN, 12));
        jTextFieldCariEdit.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldCariEditMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int j = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (j == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void hapusData() throws SQLException {
        conn = kon.getConnection();
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM PENGHUNI WHERE id_penghuni=" + idHapus);
        if (rs.next()) {
            String tam = rs.getString("status_bayar");
            if (tam.equals("BELUM")) {
                JOptionPane.showMessageDialog(null, rs.getString("nama").toLowerCase() + " belum membayar tagihan bulan ini, tidak bisa memproses permintaan!", "Gagal", JOptionPane.ERROR_MESSAGE);
                idHapus = null;
            } else {
                ps = conn.prepareStatement("delete from penghuni where id_penghuni = ?");
                ps.setString(1, idHapus);
                ps.executeUpdate();
                conn.commit();
                JOptionPane.showMessageDialog(null, "Data penyewa telah dihapus");
                ps.close();
                conn.close();
                st.close();
                rs.close();

            }
        }
    }
    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        try {
            if (jTextFieldNama.getText().equals("Masukkan dengan huruf") || jTextFieldNama.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Silahkan isi kolom nama terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                jTextFieldNama.requestFocus();
            } else {
                inputData();
                setAwalInsert();
            }

        } catch (SQLException ex) {
            Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        setAwalInsert();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jRadioButtonBelumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBelumActionPerformed
        if (jRadioButtonBelum.isSelected() == true) {
            jRadioButtonSudah.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonBelumActionPerformed

    private void jRadioButtonSudahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSudahActionPerformed
        if (jRadioButtonSudah.isSelected() == true) {
            jRadioButtonBelum.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonSudahActionPerformed

    private void jTextFieldNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNamaMouseClicked
        // TODO add your handling code here:
        if (jTextFieldNama.getText().equals("Masukkan dengan huruf")) {
            jTextFieldNama.setEditable(true);
            jTextFieldNama.setText("");
            jTextFieldNama.setFont(new Font("Zilla Slab Light", Font.PLAIN, 12));
            jTextFieldNama.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldNamaMouseClicked

    private void jButtonLogoutLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutLihatActionPerformed
        // TODO add your handling code here:
        int j = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (j == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButtonLogoutLihatActionPerformed

    private void jButtonCariLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariLihatActionPerformed
        try {
            Tampil(1, jTablePenghuni, jTextFieldCariLihat);
        } catch (SQLException ex) {
            Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCariLihatActionPerformed

    private void jTextFieldCariLihatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCariLihatMouseClicked
        if (jTextFieldCariLihat.getText().equals("Masukan Keyword")) {
            jTextFieldCariLihat.setEditable(true);
            jTextFieldCariLihat.setText("");
            jTextFieldCariLihat.setFont(new Font("Zilla Slab Light", Font.PLAIN, 12));
            jTextFieldCariLihat.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldCariLihatMouseClicked

    private void jComboBoxTipeDataKostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipeDataKostActionPerformed
        if (jComboBoxTipeDataKost.getSelectedIndex() == 0) {
            HitungKamar("Tipe A", 10);
        } else if (jComboBoxTipeDataKost.getSelectedIndex() == 1) {
            HitungKamar("Tipe B", 15);
        } else {
            HitungKamar("Tipe C", 25);
        }
    }//GEN-LAST:event_jComboBoxTipeDataKostActionPerformed

    private void jButtonCariHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariHapusActionPerformed
        try {
            Tampil(1, jTablePenghuniHapus, jTextFieldCariHapus);
        } catch (SQLException ex) {
            Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCariHapusActionPerformed

    private void jTablePenghuniHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePenghuniHapusMouseClicked
        int baris = jTablePenghuniHapus.getSelectedRow();
        idHapus = jTablePenghuniHapus.getModel().getValueAt(baris, 0).toString();
        jTextFieldIdHapus.setText(idHapus);
        jTextFieldNamaHapus.setText(jTablePenghuniHapus.getModel().getValueAt(baris, 1).toString());
        jTextFieldStatusBayarHapus.setText(jTablePenghuniHapus.getModel().getValueAt(baris, 5).toString());

    }//GEN-LAST:event_jTablePenghuniHapusMouseClicked

    private void jTextFieldCariHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCariHapusMouseClicked
        jTextFieldCariHapus.setText("");
        jTextFieldCariHapus.setFont(new Font("Zilla Slab Light", Font.PLAIN, 12));
        jTextFieldCariHapus.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldCariHapusMouseClicked

    private void jButtonHapusPeyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusPeyewaActionPerformed
        try {
            hapusData();
            resetTableLihat(jTablePenghuniHapus);
            Tampil(0, jTablePenghuniHapus, jTextFieldNamaHapus);
            jTextFieldNamaHapus.setText("");
            jTextFieldIdHapus.setText("");
            jTextFieldStatusBayarHapus.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonHapusPeyewaActionPerformed

    private void jButtonLogoutHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutHapusActionPerformed
        int j = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (j == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButtonLogoutHapusActionPerformed

    private void jButtonCariEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariEditActionPerformed
        try {
            Tampil(1, jTablePenghuniEdit, jTextFieldCariEdit);
        } catch (SQLException ex) {
            Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCariEditActionPerformed

    private void jTablePenghuniEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePenghuniEditMouseClicked
        int baris = jTablePenghuniEdit.getSelectedRow();
        idEdit = jTablePenghuniEdit.getModel().getValueAt(baris, 0).toString();
        jTextFieldIdEdit.setText(idEdit);
        jTextFieldNamaEdit.setText(jTablePenghuniEdit.getModel().getValueAt(baris, 1).toString());
        jComboBoxTipeKamarEdit.setSelectedItem(jTablePenghuniEdit.getModel().getValueAt(baris, 2).toString());
        if (jTablePenghuniEdit.getModel().getValueAt(baris, 5).toString().equals("BELUM")) {
            jRadioButtonBelumBayarEdit.setSelected(true);
            jRadioButtonSudahBayarEdit.setSelected(false);
        } else {
            jRadioButtonBelumBayarEdit.setSelected(false);
            jRadioButtonSudahBayarEdit.setSelected(true);
        }


    }//GEN-LAST:event_jTablePenghuniEditMouseClicked

    private void jComboBoxPilihItemEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPilihItemEditActionPerformed
        String pilih = (String) jComboBoxPilihItemEdit.getSelectedItem();
        if (pilih == "Status Bayar") {
            jLabelEditItem.setText("Silahkan Edit data Status Bayar!");
            jTextFieldIdEdit.setEnabled(false);
            jTextFieldNamaEdit.setEnabled(false);
            jComboBoxTipeKamarEdit.setEnabled(false);
            jRadioButtonBelumBayarEdit.setEnabled(true);
            jRadioButtonSudahBayarEdit.setEnabled(true);
        } else if (pilih == "Nama") {
            jLabelEditItem.setText("Silahkan Edit data Nama!");
            jTextFieldIdEdit.setEnabled(false);
            jComboBoxTipeKamarEdit.setEnabled(false);
            jRadioButtonBelumBayarEdit.setEnabled(false);
            jRadioButtonSudahBayarEdit.setEnabled(false);
            jTextFieldNamaEdit.setEnabled(true);
        } else if (pilih == "Tipe Kamar") {
            jLabelEditItem.setText("Silahkan Edit data Tipe Kamar!");
            jTextFieldIdEdit.setEnabled(false);
            jTextFieldNamaEdit.setEnabled(false);
            jRadioButtonBelumBayarEdit.setEnabled(false);
            jRadioButtonSudahBayarEdit.setEnabled(false);
            jComboBoxTipeKamarEdit.setEnabled(true);

        }
    }//GEN-LAST:event_jComboBoxPilihItemEditActionPerformed

    private void jRadioButtonSudahBayarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSudahBayarEditActionPerformed
        if (jRadioButtonSudahBayarEdit.isSelected() == true) {
            jRadioButtonBelumBayarEdit.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonSudahBayarEditActionPerformed

    private void jRadioButtonBelumBayarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBelumBayarEditActionPerformed
        if (jRadioButtonBelumBayarEdit.isSelected() == true) {
            jRadioButtonSudahBayarEdit.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonBelumBayarEditActionPerformed

    private void jButtonSimpanEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanEditActionPerformed
        Edit();
        resetTableLihat(jTablePenghuniEdit);
        try {
            Tampil(0, jTablePenghuniEdit, jTextFieldCariEdit);
        } catch (SQLException ex) {
            Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSimpanEditActionPerformed

    private void jButtonResetEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetEditActionPerformed
        try {
            resetTableLihat(jTablePenghuniEdit);
            setAwalEdit();
        } catch (SQLException ex) {
            Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonResetEditActionPerformed

    private void jButtonLoginEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginEditActionPerformed
        int j = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (j == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButtonLoginEditActionPerformed

    private void jButtonLogoutLihatKostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutLihatKostActionPerformed
        int j = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (j == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButtonLogoutLihatKostActionPerformed

    private void jTabbedPane2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseEntered
        HitungKamar("Tipe A", 10);
        if (jComboBoxTipeDataKost.getSelectedIndex() == 0) {
            HitungKamar("Tipe A", 10);
        } else if (jComboBoxTipeDataKost.getSelectedIndex() == 1) {
            HitungKamar("Tipe B", 15);
        } else {
            HitungKamar("Tipe C", 25);
        }
    }//GEN-LAST:event_jTabbedPane2MouseEntered

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
            java.util.logging.Logger.getLogger(HU_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HU_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HU_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HU_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HU_admin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(HU_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCariEdit;
    private javax.swing.JButton jButtonCariHapus;
    private javax.swing.JButton jButtonCariLihat;
    private javax.swing.JButton jButtonHapusPeyewa;
    private javax.swing.JButton jButtonLoginEdit;
    private javax.swing.JButton jButtonLogoutHapus;
    private javax.swing.JButton jButtonLogoutLihat;
    private javax.swing.JButton jButtonLogoutLihatKost;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonResetEdit;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonSimpanEdit;
    private javax.swing.JComboBox<String> jComboBoxPilihItemEdit;
    private javax.swing.JComboBox<String> jComboBoxTipe;
    private javax.swing.JComboBox<String> jComboBoxTipeDataKost;
    private javax.swing.JComboBox<String> jComboBoxTipeKamarEdit;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEditItem;
    private javax.swing.JLabel jLabelKamarKosong;
    private javax.swing.JLabel jLabelKamarTerisi;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButtonBelum;
    private javax.swing.JRadioButton jRadioButtonBelumBayarEdit;
    private javax.swing.JRadioButton jRadioButtonSudah;
    private javax.swing.JRadioButton jRadioButtonSudahBayarEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPaneLihatDataKost;
    private javax.swing.JTable jTablePenghuni;
    private javax.swing.JTable jTablePenghuniEdit;
    private javax.swing.JTable jTablePenghuniHapus;
    private javax.swing.JTable jTableReview;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCariEdit;
    private javax.swing.JTextField jTextFieldCariHapus;
    private javax.swing.JTextField jTextFieldCariLihat;
    private javax.swing.JTextField jTextFieldIdEdit;
    private javax.swing.JTextField jTextFieldIdHapus;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNamaEdit;
    private javax.swing.JTextField jTextFieldNamaHapus;
    private javax.swing.JTextField jTextFieldStatusBayarHapus;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
