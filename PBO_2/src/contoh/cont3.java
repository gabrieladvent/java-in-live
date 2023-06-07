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
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class  cont3{//ctpPanel
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh JPanel");
        frame.setSize(new Dimension(300,200));
        frame.setLocation(100,100);
        Container contentPane = frame.getContentPane();

        JLabel label = new JLabel("Beberapa Tombol Tampil di sini",
                                  SwingConstants.CENTER);

        JButton button1 = new JButton("Tombol 1");
        JButton button2 = new JButton("Tombol 2");
        JButton button3 = new JButton("Tombol 3");
        
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        contentPane.add(label, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);

    }
}
