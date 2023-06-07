/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik2D;
  import java.awt.BorderLayout;
  import java.awt.Color;
  import java.awt.event.ActionEvent;
  import java.awt.event.ActionListener;
  import javax.swing.JButton;
  import javax.swing.JFrame;
  import javax.swing.JColorChooser;
  import javax.swing.JPanel;

/**
 *
 * @author Tak Bertuan
 */
public class CONTOH9 extends JFrame{
    private JButton changeColorJButton;
     private Color color = Color.LIGHT_GRAY;
     private JPanel colorJPanel;
     public CONTOH9(){
        super( "Using JColorChooser" );
        colorJPanel = new JPanel();
        colorJPanel.setBackground( color );
        changeColorJButton = new JButton( "Change Color" );
        changeColorJButton.addActionListener(
           new ActionListener() 
           {
              public void actionPerformed( ActionEvent event )
              {
                 color = JColorChooser.showDialog(                    
                    CONTOH9.this, "Choose a color", color );
                 if ( color == null )
                    color = Color.LIGHT_GRAY;
                 colorJPanel.setBackground( color );
              } 
           } 
        ); 
        add( colorJPanel, BorderLayout.CENTER ); 
        add( changeColorJButton, BorderLayout.SOUTH ); 
        setSize( 400, 130 ); 
        setVisible( true ); 
     } 
  } 

