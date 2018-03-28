/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintinglab;

/**
 *
 * @author Lucas Wilson-Seeley & Jazzlyn Pulley
 */

    
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;



 class PaintPanel extends JPanel {
	
	private JButton lineButton ;
        private JButton clear;
        private JButton rectFill;
        private JButton ovalFill;
        private JButton rectEmpt;
        private JButton ovalEmpt;
        private CanvasPanel c1 ;
        
        private JButton fdraw;
        private JButton stroke;
        private JButton color;
        
       private JButton text;
        
        //Jslider to select the stroke thickness
        //JSlider strokeselect = new JSlider(JSlider.HORIZONTAL,0,20,0); 
        
        //private int strokeV;  //stores the value of the stroke thickness
        
        
        
        
        
        //coordinates
        
        
	public PaintPanel(CanvasPanel c1){
           
            
            this.c1=c1;
            
            
		setPreferredSize(new Dimension(600, 100)) ;
                //setBackground(Color.black);
	
		lineButton = new JButton("Line") ;
		
		lineButton.addActionListener(new buttonListen()) ;
		add(lineButton);
                
                clear = new JButton("Clear") ;
		
		clear.addActionListener(new buttonListen()) ;
		add(clear);
                
                rectFill = new JButton("Filled Rectangle") ;
		
		rectFill.addActionListener(new buttonListen()) ;
		add(rectFill);
                
                ovalFill = new JButton("Filled Oval") ;
		
		ovalFill.addActionListener(new buttonListen()) ;
		add(ovalFill);
                
                rectEmpt = new JButton("Empty Rectangle") ;
		
		rectEmpt.addActionListener(new buttonListen()) ;
		add(rectEmpt);
                //set enabled ...makes the button not useable
                //rectEmpt.setEnabled(false);
                
               // ImageIcon ovalEmpty = (new ImageIcon(getClass().getClassLoader().getResource("circle.jpg")));
                ovalEmpt = new JButton("oval Empty") ;
             //   ovalEmpt = new JButton("Empty Oval") ;
		
		ovalEmpt.addActionListener(new buttonListen()) ;
		add(ovalEmpt);
                
                setBackground(Color.green);
                
               //setVisible(true);
               
               fdraw = new JButton("Free Draw");
               fdraw.addActionListener(new buttonListen());
               add(fdraw);
               
               
               stroke = new JButton("Stroke");
               stroke.addActionListener(new buttonListen());
               add(stroke);
               
               
               color = new JButton("Color");
               color.addActionListener(new buttonListen());
               add(color);
               
               text = new JButton("Text");
               text.addActionListener(new buttonListen());
               add(text);
               
               
                    
                
                
                
            }
        
      
        
        
        
        
        
        
	//hears the action events
	private class buttonListen implements ActionListener
	{

	@Override
	public void actionPerformed(ActionEvent e) {
            
            //String a = e.getActionCommand();
            //JOptionPane.showMessageDialog(null, a, "The button pressed was", JOptionPane.PLAIN_MESSAGE);
            //paintComponent();
            
            if(e.getSource() == clear)
            {
                c1.flag = 0;
                c1.clear();
            }
            else if(e.getSource() == rectFill)
            {
               //int a = 1;
               c1.flag = 1;

                // c1.addMouseListener(new MouseTouch);
                
                //c1.frdraw();       
            }
            else if(e.getSource() == ovalFill)
            {
                c1.flag = 2;
                //c1.fodraw();
            }
            else if(e.getSource() == rectEmpt)
            {
                c1.flag = 3;
                //c1.erdraw();
            }
            else if(e.getSource()== ovalEmpt)
            {
                c1.flag=4;
                //c1.eodraw(); 
            }
            else if(e.getSource()== lineButton)
            {
               c1.flag = 5;
                //c1.ldraw() ; 
            }
            else if(e.getSource()==fdraw)
            {
                c1.flag=6;
            }
            else if(e.getSource()== stroke)
            {
                c1.flag=7;
            }
            else if(e.getSource()== color)
            {
                c1.flag=8;
                        
            }
            else if(e.getSource() == text)
            {
                c1.flag = 9;
            }
            
            
            
            
	}
		
		
	} 


    
}