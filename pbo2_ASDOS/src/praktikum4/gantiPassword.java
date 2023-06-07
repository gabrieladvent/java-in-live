package praktikum4;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class gantiPassword extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPasswordField password;
    private JButton tombolGanti;
    private JTextField username;
    public gantiPassword() {
        initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.username = new JTextField();
        this.password = new JPasswordField();
        this.tombolGanti = new JButton();
        setDefaultCloseOperation(3);
        setTitle("Ganti Username & Password");
        setLocation(new Point(100, 230));
        this.jLabel1.setText("Username");
        this.jLabel2.setText("Password");
        this.username.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gantiPassword.this.usernameActionPerformed(evt);
            }
        });
        this.password.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                gantiPassword.this.passwordKeyPressed(evt);
            }
        });
        this.tombolGanti.setText("GANTI");
        this.tombolGanti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gantiPassword.this.tombolGantiActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(this.jLabel2)
                                        .addGap(24, 24, 24))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(this.jLabel1)
                                        .addGap(21, 21, 21)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(this.username)
                                .addComponent(this.password)
                                .addComponent(this.tombolGanti, -2, 146, -2))
                        .addContainerGap(69, 32767)));
        layout.setVerticalGroup(layout
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(this.jLabel1)
                                .addComponent(this.username, -2, -1, -2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(this.jLabel2)
                                .addComponent(this.password, -2, -1, -2))
                        .addGap(18, 18, 18)
                        .addComponent(this.tombolGanti)
                        .addContainerGap(36, 32767)));
        pack();
    }

    private void usernameActionPerformed(ActionEvent evt) {
        this.password.requestFocusInWindow();
    }

    private void passwordKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            this.tombolGanti.doClick();
        }
    }

    private void tombolGantiActionPerformed(ActionEvent evt) {
        Path currentRelativePath = Paths.get("", new String[0]);
        String dir = currentRelativePath.toAbsolutePath().toString();
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(dir + "/password.txt");
            enkripsi en = new enkripsi();
            String usr1 = this.username.getText();
            String usr = en.bikinHash(usr1);
            String pass1 = this.password.getText();
            String pass = en.bikinHash(pass1);
            myWriter.write(usr + "\n");
            myWriter.write(pass + "\n");
            myWriter.close();
            JOptionPane.showMessageDialog(null, "Username dan Password BERHASIL diganti.", "SUKSES", 1);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Tidak Ditemukan di " + dir, "File TIDAK ADA", 0);
        } catch (IOException ex) {
            Logger.getLogger(gantiPassword.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(gantiPassword.class.getName()).log(Level.SEVERE, (String) null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(gantiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gantiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gantiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gantiPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gantiPassword().setVisible(true);
            }
        });
    }
}
    