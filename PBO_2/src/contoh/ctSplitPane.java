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
import javax.swing.*;

public class ctSplitPane {
  public static void main(String[] a) {
    String t = "Andreas\n Herry\n Matius\n Yakobus\n Markus\n Yohanes\n Filipus\n Tomas\n Bartolomeus\n Tadeus\n Paulus\n Yudas\n Simon\n";
    String x = "Setan\n Iblis \n Genderuwo\n Tuyul\n Sundel Bolong\n BAbi Ngepet\n Pocong\n Walking Death\n Vampir\n Siluman Srigala\n Buaya Darat\n";
    JFrame horizontalFrame = new JFrame();
    horizontalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JComponent topArea = new JTextArea(t);
    JComponent botArea = new JTextArea(x);
    final JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);

    splitPane.setTopComponent(topArea);
    splitPane.setBottomComponent(botArea);

    
    horizontalFrame.setTitle("Contoh SplitPane");
    horizontalFrame.add(splitPane, BorderLayout.CENTER);
    horizontalFrame.setSize(250, 350);
    horizontalFrame.setVisible(true);

    splitPane.setDividerLocation(0.5);
  }
}

