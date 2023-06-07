package praktikum4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class cobaPassword extends JFrame {

    private JMenu gantiPasswd;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JMenuBar jMenuBar1;
    private JPasswordField password;
    private JTextField username;
    
    public cobaPassword() {
        initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.username = new JTextField();
        this.password = new JPasswordField();
        this.jButton1 = new JButton();
        this.jLabel3 = new JLabel();
        this.jMenuBar1 = new JMenuBar();
        this.gantiPasswd = new JMenu();
        setDefaultCloseOperation(3);
        this.jLabel1.setText("Username");
        this.jLabel2.setText("Password");
        this.username.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cobaPassword.this.usernameActionPerformed(evt);
            }
        });
        this.password.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                cobaPassword.this.passwordKeyPressed(evt);
            }
        });
        this.jButton1.setText("LOGIN");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cobaPassword.this.jButton1ActionPerformed(evt);
            }
        });
//        this.jLabel3.setText("(c) 2022 by Iwan Binanto");
        this.gantiPasswd.setText("Ganti Password");
        this.gantiPasswd.setEnabled(false);
        this.jMenuBar1.add(this.gantiPasswd);
        setJMenuBar(this.jMenuBar1);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(this.jLabel1)
                                        .addGap(21, 21, 21))
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(this.jLabel2)
                                        .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(this.username)
                                .addComponent(this.password)
                                .addComponent(this.jButton1, -2, 146, -2))
                        .addContainerGap(69, 32767))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(-1, 32767)
                        .addComponent(this.jLabel3)
                        .addGap(84, 84, 84)));
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
                        .addComponent(this.jButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, 32767)
                        .addComponent(this.jLabel3)
                        .addContainerGap()));
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        int i = 0;
        String pass1 = null;
        String data = null;
        Path currentRelativePath = Paths.get("", new String[0]);
        String dir = currentRelativePath.toAbsolutePath().toString();
        File myObj = new File(dir + "/password.txt");
        try {
            Scanner myReader = new Scanner(myObj);
            enkripsi en = new enkripsi();
            String usr1 = this.username.getText();
            String usr = en.bikinHash(usr1);
            pass1 = this.password.getText();
            String pass = en.bikinHash(pass1);
            String user = myReader.nextLine();
            String passwd = myReader.nextLine();
            if (usr.equals(user) && pass.equals(passwd)) {
                this.gantiPasswd.setEnabled(true);
                this.gantiPasswd.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent evt) {
                        cobaPassword.this.gantiPasswdMouseClicked(evt);
                    }
                });
            } else {
                JOptionPane.showMessageDialog(null, "Login GAGAL.!!", "GAGAL", 0);
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Tidak Ditemukan di " + dir, "File TIDAK ADA", 0);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(cobaPassword.class.getName()).log(Level.SEVERE, (String) null, ex);
        }
    }

    private void passwordKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            this.jButton1.doClick();
        }
    }

    private void usernameActionPerformed(ActionEvent evt) {
        this.password.requestFocusInWindow();
    }

    private void gantiPasswdMouseClicked(MouseEvent evt) {
        gantiPassword gp = new gantiPassword();
        gp.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cobaPassword.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(cobaPassword.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(cobaPassword.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(cobaPassword.class.getName()).log(Level.SEVERE, (String) null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new cobaPassword()).setVisible(true);
            }
        });
    }
}
