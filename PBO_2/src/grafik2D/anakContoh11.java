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

  public class anakContoh11{
     public static void main( String args[] ){
        JFrame frame = new JFrame( "Demonstrating FontMetrics" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        CONTOH11 metricsJPanel = new CONTOH11();
        frame.add( metricsJPanel ); 
        frame.setSize( 510, 250 ); 
        frame.setVisible( true ); 
     } 
  } 

