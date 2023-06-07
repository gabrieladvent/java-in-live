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
  import javax.swing.JFrame;

  public class anakContoh10{
     public static void main( String args[] )
     {
        JFrame frame = new JFrame( "Using fonts" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        CONTOH10 fontJPanel = new CONTOH10(); 
        frame.add( fontJPanel ); 
        frame.setSize( 420, 170 ); 
        frame.setVisible( true ); 
     }
  }
