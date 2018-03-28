/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintinglab;

/**
 *
 * @author Lucas Wilson-Seeley  and Jazzlyn Pulley
 */

    
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


public class PaintFrame extends JFrame {
    
    
	
	//constructor for frame
    public PaintFrame()
    {
        super("Paint Program");
        startup();
    }
    
    public void startup()
    {
        
        this.setLayout(new BorderLayout());
        //this.setContentPane().add();
        
        
      MyMenu theMenu = new MyMenu();
      this.setJMenuBar(theMenu.bar);
        
        //p1.setVisible(true);
        
        CanvasPanel c1 = new CanvasPanel();
        this.add(c1, BorderLayout.CENTER);
       
        
        
        PaintPanel p1 = new PaintPanel(c1);
        
        this.add(p1, BorderLayout.NORTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
        
        
        
        
        
    }
    
    
    //
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable(){
        public void run(){
            new PaintFrame().setVisible(true);
        }
        });
        
    }
     //   
        
        
        
		
		
		
	}
