/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

/**
 *
 * @author ACER
 */
import java.awt.FlowLayout;
import javax.swing.*;

public class ctScrollPane {
    public static void main(String[] args) {
        String t = "Andreas\n Benedistus Herry Suharto dan Mahasiswa Universitas Sanata Dharma \n Matius\n Yakobus\n Markus\n Yohanes\n Filipus\n Tomas\n Bartolomeus\n Tadeus\n Paulus\n Yudas\n Simon\n";
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JTextArea tArea = new JTextArea(10,10);
        tArea.setText(t);
        JScrollPane scrollPane = new JScrollPane(tArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        panel.add(scrollPane);
        frame.setContentPane(panel);
        frame.setSize(500, 500);
        frame.setLocationByPlatform(true);
        frame.setTitle("Contoh ScrollPane");
        frame.setVisible(true);
    }    
}