
package perpus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Koleksikita extends JFrame  {
    private JLabel labelIDKoleksi, labelJudul, labelPenerbit, labelStatus;
    private JTextField fieldIDKoleksi, fieldJudul, fieldPenerbit, fieldStatus;
    private JButton checkButton;
    private JPanel panel;
    private Koleksi pr;

    public  Koleksikita() {
        this.setSize(400,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Data Koleksi");
        this.setResizable(false);
        panel = new JPanel();
        panel.setLayout(null);

        labelIDKoleksi = new JLabel("IDKoleksi");
        labelIDKoleksi.setBounds(10, 15, 70, 20);
        panel.add(labelIDKoleksi);

        fieldIDKoleksi = new JTextField();
        fieldIDKoleksi.setBounds(130, 15, 200, 20);
        panel.add(fieldIDKoleksi);

        labelJudul= new JLabel("Judul");
        labelJudul.setBounds(10, 45, 70, 20);
        panel.add(labelJudul);

        fieldJudul = new JTextField();
        fieldJudul.setBounds(130, 45, 200, 20);
        panel.add(fieldJudul);

        labelPenerbit = new JLabel("Penerbit");
        labelPenerbit.setBounds(10, 105, 70, 20);
        panel.add(labelPenerbit);

        fieldPenerbit= new JTextField();
        fieldPenerbit.setBounds(130, 105, 200, 20);
        panel.add(fieldPenerbit);

        labelStatus = new JLabel("Status");
        labelStatus.setBounds(10, 135, 70, 20);
        panel.add(labelStatus);

        fieldStatus = new JTextField();
        fieldStatus.setBounds(130, 135, 200, 20);
        panel.add(fieldStatus);
        
        
        checkButton = new JButton("Disk");
        checkButton.setBounds(10, 250, 180, 20);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
            
        });
        
        checkButton = new JButton("Majalah");
        checkButton.setBounds(50, 280, 180, 20);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
            
        });
        
        checkButton = new JButton("Disk");
        checkButton.setBounds(100, 300, 180, 20);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
            
        });
        

        checkButton = new JButton("check");
        checkButton.setBounds(150, 190, 180, 20);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pr = new Koleksi();
                pr.setIDKoleksi(fieldIDKoleksi.getText());
                pr.setJudul(fieldJudul.getText());
                pr.setPenerbit(fieldPenerbit.getText());
                pr.setStatus(fieldStatus.getText());
           JFrame frame = new JFrame();
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Tampilkan Data Koleksi");
                frame.setResizable(false);
                panel = new JPanel();
                panel.setLayout(null);

                labelIDKoleksi = new JLabel("ID-Koleksi");
                labelIDKoleksi.setBounds(10, 15, 70, 20);
                panel.add(labelIDKoleksi);

                JLabel tampilNim = new JLabel();
                tampilNim.setText(pr.getIDKoleksi());
                tampilNim.setBounds(165, 15, 200, 20);
                panel.add(tampilNim);

                labelJudul = new JLabel("Judul ");
                labelJudul.setBounds(10, 45, 70, 20);
                panel.add(labelJudul);

                JLabel tampilNama = new JLabel();
                tampilNama.setText(pr.getJudul());
                tampilNama.setBounds(165, 45, 250, 20);
                panel.add(tampilNama);

                labelPenerbit = new JLabel("Penerbit");
                labelPenerbit.setBounds(10, 75, 70, 20);
                panel.add(labelPenerbit);

                JLabel tampilMakul = new JLabel();
                tampilMakul.setText(pr.getPenerbit());
                tampilMakul.setBounds(165, 75, 250, 20);
                panel.add(tampilMakul);

              

                labelStatus = new JLabel("Status");
                labelStatus.setBounds(10, 135, 150, 20);
                panel.add(labelStatus);

                JLabel tampilJumKehadiran = new JLabel();
                tampilJumKehadiran.setText(pr.getStatus());
                tampilJumKehadiran.setBounds(165, 135, 200, 20);
                panel.add(tampilJumKehadiran);
                
          
                 
                frame.add(panel); //frame panel
                frame.setVisible(true); //eksekusi panel
            }
        });
        panel.add(checkButton);

        this.add(panel);
        this.setVisible(true);
                
             
}
}
        
