
package perpus;

// java import 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import perpus.Transaksi;

public class Perpus extends JFrame { // implementasi antar muka dengan mengextend jframe
    private JLabel labelIDTransaksi, labelTglpin, labelTglkem, labelDenda, labelJumKehadiran,labelKoleksi,labelPeminjam; //variable jlabel
    private JTextField fieldTglpin, fieldIDTransaksi, fieldTglkem, fieldDenda,fieldKoleksi,fieldPeminjam;// var text field
    private JButton checkButton;
    private JPanel panel;
    private Transaksi pr;

    public  Perpus () { // Deklarasi class
        this.setSize(400,500); // set size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Data Transaksi"); //set Title
        this.setResizable(false);
        panel = new JPanel(); // pengelompokan komponen jpanel
        panel.setLayout(null); // set layout

        // memberi keterangan ID-Transaksi pada perintah 
        labelIDTransaksi = new JLabel("ID-Transaksi");
        labelIDTransaksi.setBounds(10, 15, 70, 20);
        panel.add(labelIDTransaksi); // menambah komponen labelIDTransaksi

        fieldIDTransaksi = new JTextField();
        fieldIDTransaksi.setBounds(130, 15, 200, 20);
        panel.add(fieldIDTransaksi);// menambah komponen fieldIDTransaksi

        // memberi keterangan Tgl Peminjaman pada perintah
        labelTglpin = new JLabel("Tgl Peminjaman");
        labelTglpin.setBounds(10, 45, 70, 20);
        panel.add(labelTglpin);// menambah komponen labelTglpin

        fieldTglpin = new JTextField();
        fieldTglpin.setBounds(130, 45, 200, 20);
        panel.add(fieldTglpin);// menambah komponen fieldTglpin 
        
        // memberi keterangan Tgl Kembali pada perintah
        labelTglkem = new JLabel("Tgl Kembali");
        labelTglkem.setBounds(10, 105, 70, 20);
        panel.add(labelTglkem);// menambah komponen labelTglkem

        fieldTglkem = new JTextField();
        fieldTglkem.setBounds(130, 105, 200, 20);
        panel.add(fieldTglkem);// menambah komponen fieldTglkem
        
        // memberi keterangan Denda pada perintah
        labelDenda = new JLabel("Denda");
        labelDenda.setBounds(10, 135, 70, 20);
        panel.add(labelDenda);// menambah komponen labelDenda 

        fieldDenda = new JTextField();
        fieldDenda.setBounds(130, 135, 200, 20);
        panel.add(fieldDenda);// menambah komponen fieldDenda
        
        // memberi keterangan Koleksi pada perintah
        labelKoleksi = new JLabel("Koleksi");
        labelKoleksi .setBounds(10, 165, 70, 20);
        panel.add(labelKoleksi );// menambah komponen labelKoleksi

        fieldKoleksi = new JTextField();
        fieldKoleksi.setBounds(130, 165, 200, 20);
        panel.add(fieldKoleksi);// menambah komponen fieldKoleksi
        
        // memberi keterangan peminjam pada perintah
        labelPeminjam = new JLabel("peminjam");
        labelPeminjam .setBounds(10, 195, 70, 20);
        panel.add(labelPeminjam );// menambah komponen labelPeminjam

        fieldPeminjam = new JTextField();
        fieldPeminjam.setBounds(130, 195, 200, 20);
        panel.add(fieldPeminjam);// menambah komponen fieldPeminjam
        
      

        checkButton = new JButton("Check"); //button check 
        checkButton.setBounds(150, 250, 180, 20); //tataletak
        checkButton.addActionListener(new ActionListener() { // aksi setelah di klik
            @Override
            public void actionPerformed(ActionEvent ae) {
                pr = new Transaksi();
                pr.setIDTransaksi(fieldIDTransaksi.getText());
                pr.setTglPinjam(fieldTglpin.getText());
                pr.setTglKembali(fieldTglkem.getText());
                pr.setDenda(fieldDenda.getText());
                pr.setKoleksi(fieldKoleksi.getText());
                 pr.setPeminjam(fieldPeminjam.getText());
                
             
                JFrame frame = new JFrame();
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Tampilkan Data Transaksi");
                frame.setResizable(false);
                panel = new JPanel();
                panel.setLayout(null);

                labelIDTransaksi = new JLabel("ID-Transaksi");
                labelIDTransaksi.setBounds(10, 15, 70, 20);
                panel.add(labelIDTransaksi);

                JLabel tampilNim = new JLabel();
                tampilNim.setText(pr.getIDTransaksi());
                tampilNim.setBounds(165, 15, 200, 20);
                panel.add(tampilNim);

                labelTglpin = new JLabel("Tgl Peminjaman");
                labelTglpin.setBounds(10, 45, 70, 20);
                panel.add(labelTglpin);

                JLabel tampilNama = new JLabel();
                tampilNama.setText(pr.getTglPinjam());
                tampilNama.setBounds(165, 45, 250, 20);
                panel.add(tampilNama);

                labelTglkem = new JLabel("Tgl Kembali");
                labelTglkem.setBounds(10, 75, 70, 20);
                panel.add(labelTglkem);

                JLabel tampilMakul = new JLabel();
                tampilMakul.setText(pr.getTglKembali());
                tampilMakul.setBounds(165, 75, 250, 20);
                panel.add(tampilMakul);

                labelDenda = new JLabel("Denda");
                labelDenda.setBounds(10, 105, 120, 20);
                panel.add(labelDenda);

                JLabel tampilJumPertemuan = new JLabel();
                tampilJumPertemuan.setText(pr.getDenda());
                tampilJumPertemuan.setBounds(165, 105, 200, 20);
                panel.add(tampilJumPertemuan);

                labelJumKehadiran = new JLabel("Koleksi");
                labelJumKehadiran.setBounds(10, 135, 150, 20);
                panel.add(labelJumKehadiran);

                JLabel tampilJumKehadiran = new JLabel();
                tampilJumKehadiran.setText(pr.getKoleksi());
                tampilJumKehadiran.setBounds(165, 135, 200, 20);
                panel.add(tampilJumKehadiran);
                
                JLabel labelStatus = new JLabel("Peminjam");
                labelStatus.setBounds(10, 195, 150, 20);
                panel.add(labelStatus);
                
                JLabel tampilStatus = new JLabel();
                tampilStatus.setText(pr.getPeminjam());
                tampilStatus.setBounds(165, 195, 200, 20);
                panel.add(tampilStatus);
            
             
                
                frame.add(panel); //frame panel
                frame.setVisible(true); //eksekusi panel
            }
        });
        panel.add(checkButton);

        this.add(panel);
        this.setVisible(true);
    }

    
    
    
}
