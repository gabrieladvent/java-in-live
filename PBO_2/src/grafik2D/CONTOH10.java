/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik2D;
import java.awt.Font;
  import java.awt.Color;
  import java.awt.Graphics;
  import javax.swing.JPanel;

/**
 *
 * @author Tak Bertuan
 */
public class CONTOH10 extends JPanel{
    public void paint(Graphics g) {
    int y;
    Font fnPlain = new Font("TimesRoman", Font.PLAIN, 20);
    Font fnBold = new Font("TimesRoman", Font.BOLD, 20);
    Font fnItalic = new Font("TimesRoman", Font.ITALIC, 20);
    Font fnBoldItalic = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 20);
    y = 0;
    g.setFont(fnPlain);
    g.drawString("History is written by the winning general.", 5, y+=20);
    g.setFont(fnBold);
    g.drawString("History is written by the winning general.", 5, y+=20);
    g.setFont(fnItalic);
    g.drawString("History is written by the winning general.", 5, y+=20);
    g.setFont(fnBoldItalic);
    g.drawString("History is written by the winning general.", 5, y+=20);
    fnPlain = new Font("Arial", Font.PLAIN, 75);
    g.setFont(fnPlain);
    g.drawString("Arial 75pt", 5, y+=75);
    fnItalic = new Font("Papyrus", Font.ITALIC, 48);
    g.setFont(fnItalic);
    g.drawString("Papyrus Italic 48pt", 5, y+=48);
}

//    public void paintComponent( Graphics g ){
//        super.paintComponent( g ); 
//        g.setFont( new Font( "Serif", Font.BOLD, 12 ) );
//        g.drawString( "Serif 12 point bold.", 20, 50 );
//        g.setFont( new Font( "Monospaced", Font.ITALIC, 24 ) );
//        g.drawString( "Monospaced 24 point italic.", 20, 70 );
//        g.setFont( new Font( "SansSerif", Font.PLAIN, 14 ) );
//        g.drawString( "SansSerif 14 point plain.", 20, 90 );
//        g.setColor( Color.RED );
//        g.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 18 ) );
//        g.drawString( g.getFont().getName() + " " + g.getFont().getSize() +
//           " point bold italic.", 20, 110 );
//     }
  }

