/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik2D;
import java.awt.Color;
  import java.awt.Font;
  import java.awt.FontMetrics;
  import java.awt.Graphics;
  import javax.swing.JPanel;

/**
 *
 * @author Tak Bertuan
 */
public class CONTOH11  extends JPanel{
    
//    public void paint(Graphics g) {
//    int i;
//    int rval, gval, bval;
//    int posX, posY, wid, hit;
//    int radius = 10;
//    Color ranClr;
//    for (i = 0; i < 200; i++) {                                // Warna acak
//      rval = (int)Math.floor(Math.random() * 256);
//      gval = (int)Math.floor(Math.random() * 256);
//      bval = (int)Math.floor(Math.random() * 256);
//      wid = this.getWidth();		                     // Cari lebar dan tinggi
//      hit = this.getHeight();
//      posX = (int)Math.floor(Math.random() * wid); // Posisi acak
//      posY = (int)Math.floor(Math.random() * hit);
//      ranClr = new Color(rval, gval, bval); 	        // Buat warna acak !
//      g.setColor(ranClr); 		                    // Gambar lingkaran berwarna
//      g.fillOval(posX, posY, 2*radius, 2*radius);
//      g.setColor(Color.BLACK); 		       // Gambar lingkaran luar
//      g.drawOval(posX, posY, 2*radius, 2*radius);
//    }
//  }

    public void paint(Graphics g) {
    this.setBackground(Color.YELLOW);
    Font fn = new Font("TimesRoman", Font.PLAIN, 75);
    FontMetrics fnm = this.getFontMetrics(fn);
    g.setFont(fn);
    String str = "Gray fox jumps.";
    int strWid = fnm.stringWidth(str);
    int asc = fnm.getAscent();
    int des = fnm.getDescent();
    int maxAsc = fnm.getMaxAscent();
    int maxDes = fnm.getMaxDescent();
    int led = fnm.getLeading();
    int strHit = fnm.getHeight();
    int wid = this.getWidth();
    int hit = this.getHeight();
    int posX = (wid - strWid) / 2;
    int posY = hit / 2;
    g.drawString(str, posX, posY);
    int base = posY;
    int right1 = posX - 20;
    int right2 = posX + strWid + 20;
    g.drawLine(wid/2, 0, wid/2, hit);
    g.drawLine(0, hit/2, wid, hit/2);
    g.drawLine(right1, base-asc, right2, base-asc); //ascent
    g.drawLine(right1, base+des, right2, base+des); //descent
    g.drawLine(right1, base-maxAsc, right2, base-maxAsc); //max-as
    g.drawLine(right1, base+maxDes, right2, base+maxDes); //max-ds
    g.drawLine(right1, base+des+led, right2, base+des+led); //lead
    fn = new Font("Courier", Font.BOLD, 16);
    g.setFont(fn);
    g.drawString("Ascent   = " + asc + "\t\t - Max. = " + maxAsc, 10, 20);
    g.drawString("Descent  = " + des + "\t\t - Max. = " + maxDes, 10, 40);
    g.drawString("Baseline = " + base + "\t\t - Leading = " + led, 10, hit-60);
    g.drawString("Width    = " + strWid + "\t\t - Height = " + strHit, 10, hit-40);
  }

//         public void paintComponent( Graphics g ){
//        super.paintComponent( g ); 
//        g.setFont( new Font( "SansSerif", Font.BOLD, 12 ) );
//        FontMetrics metrics = g.getFontMetrics();
//        g.drawString( "Current font: " + g.getFont(), 10, 40 );
//        g.drawString( "Ascent: " + metrics.getAscent(), 10, 55 );
//        g.drawString( "Descent: " + metrics.getDescent(), 10, 70 );
//        g.drawString( "Height: " + metrics.getHeight(), 10, 85 );
//        g.drawString( "Leading: " + metrics.getLeading(), 10, 100 );
//        Font font = new Font( "Serif", Font.ITALIC, 14 );
//        metrics = g.getFontMetrics( font );
//        g.setFont( font );
//        g.drawString( "Current font: " + font, 10, 130 );
//        g.drawString( "Ascent: " + metrics.getAscent(), 10, 145 );
//        g.drawString( "Descent: " + metrics.getDescent(), 10, 160 );
//        g.drawString( "Height: " + metrics.getHeight(), 10, 175 );
//        g.drawString( "Leading: " + metrics.getLeading(), 10, 190 );
//     } 
  } 

