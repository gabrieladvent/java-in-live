/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik2D;

/**
 *
 * @author Tak Bertuan
 */
import java.awt.*;
 import java.awt.event.*;
 import java.awt.geom.*;
 import java.util.*;
 import javax.swing.*;
 /**
    Program mendemostrasikan operasi constructive area geometry
*/
 public class contoh2 {//AreaTest{
    public static void main (String[] args){
       JFrame frame = new AreaTestFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
 }
class AreaTestFrame extends JFrame{
    public AreaTestFrame(){
       setTitle("AreaTest");
       setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
       area1 = new Area(new Ellipse2D.Double(100, 100, 150, 100));
       area2 = new Area(new Rectangle2D.Double(150, 150, 150, 100));
       panel = new JPanel(){
             public void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D)g;
                g2.draw(area1);
                g2.draw(area2);
                if (area != null) g2.fill(area);
             }
          };
        add(panel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
       ButtonGroup group = new ButtonGroup();
       JRadioButton addButton = new JRadioButton("Add", false);
       buttonPanel.add(addButton);
       group.add(addButton);
       addButton.addActionListener(new  ActionListener(){
             public void actionPerformed(ActionEvent event){
                area = new Area();
                area.add(area1);
                area.add(area2);
                panel.repaint();
             }
          });
       JRadioButton subtractButton = new JRadioButton("Subtract", false);
       buttonPanel.add(subtractButton);
       group.add(subtractButton);
       subtractButton.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent event){
                area = new Area();
                area.add(area1);
                area.subtract(area2);
                panel.repaint();
             }
          });
       JRadioButton intersectButton = new JRadioButton("Intersect", false);
       buttonPanel.add(intersectButton);
       group.add(intersectButton);
       intersectButton.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent event){
                area = new Area();
                area.add(area1);
                area.intersect(area2);
                panel.repaint();
             }
          });
       JRadioButton exclusiveOrButton = new JRadioButton("Exclusive Or", false);
       buttonPanel.add(exclusiveOrButton);
       group.add(exclusiveOrButton);
       exclusiveOrButton.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent event){
                area = new Area();
                area.add(area1);
                area.exclusiveOr(area2);
                panel.repaint();
             }
          });
       add(buttonPanel, BorderLayout.NORTH);
    }
    private JPanel panel;
    private Area area;
    private Area area1;
    private Area area2;
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;
}

