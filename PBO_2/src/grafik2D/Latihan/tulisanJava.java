/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik2D.Latihan;
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.font.*;
 import java.awt.geom.*;
 import javax.swing.*;

public class tulisanJava {
    public static void main(String[] args){
       JFrame frame = new ClipTestFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
 }

 class ClipTestFrame extends JFrame{
    public ClipTestFrame(){
       setTitle("Glyph and Clip");
       setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
       panel = new JPanel(){
             public void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D grafik = (Graphics2D)g;
                if (clipShape == null) clipShape = Tulisan(grafik);
                grafik.draw(clipShape);         
                             }
          };
       add(panel, BorderLayout.CENTER);
    }
    Shape Tulisan(Graphics2D grafik){
       FontRenderContext context = grafik.getFontRenderContext();
       Font f = new Font("Serif", Font.PLAIN, 100);
       GeneralPath clipShape = new GeneralPath();
       TextLayout layout = new TextLayout("Java", f, context);
       AffineTransform transform = AffineTransform.getTranslateInstance(0, 100);
       Shape outline = layout.getOutline(transform);
       clipShape.append(outline, false);
       return clipShape;
    }
    
    private JPanel panel;
    private Shape clipShape;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;
}