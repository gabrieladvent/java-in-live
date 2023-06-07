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

  public class anakContoh8{
     public static void main( String args[] ){
        JFrame frame = new JFrame( "Using colors" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        CONTOH8 colorJPanel = new CONTOH8(); 
        frame.add( colorJPanel ); 
        frame.setSize( 400, 180 );
        frame.setVisible( true ); 
     } 
  } 

