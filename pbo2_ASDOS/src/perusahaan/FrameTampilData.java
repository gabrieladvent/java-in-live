/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Advent
 */
public class FrameTampilData extends javax.swing.JFrame {

    /**
     * Creates new form FrameTampilData
     */
    FrameTampilData(ArrayList<Karyawan> karyawan) {
        initComponents();
        DefaultTableModel model = (DefaultTableModel)this.tabelTampilData.getModel();
        int n = karyawan.size();
        for (int i = 0; i < n; i++) {
            String alamatlengkap = ((Karyawan)karyawan.get(i)).getAlmtLkp().getNamaJalan() + ", " + ((Karyawan)karyawan.get(i)).getAlmtLkp().getNamaJalan() + ", " + ((Karyawan)karyawan.get(i)).getAlmtLkp().getRTRWKec();
            model.addRow(new Object[] { ((Karyawan)karyawan.get(i)).getNPP(), ((Karyawan)karyawan.get(i)).getNama(), alamatlengkap, ((Karyawan)karyawan.get(i)).getJabatan() });
        } 
    }

    private FrameTampilData() {
        initComponents();
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
        tabelTampilData = new javax.swing.JTable();
        selesaiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelTampilData.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tabelTampilData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "NPP", "Nama", "Alamat", "Jabatan"
            }
        ));
        jScrollPane1.setViewportView(tabelTampilData);

        selesaiButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        selesaiButton.setText("SELESAI");
        selesaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selesaiButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selesaiButton)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selesaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiButtonActionPerformed
        dispose();
    }//GEN-LAST:event_selesaiButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTampilData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTampilData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTampilData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTampilData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                this.run();
                new FrameTampilData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selesaiButton;
    private javax.swing.JTable tabelTampilData;
    // End of variables declaration//GEN-END:variables
}
