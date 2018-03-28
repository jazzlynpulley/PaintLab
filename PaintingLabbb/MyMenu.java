/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintinglab;

/**
 *
 * @author Lucas & Jazzlyn
 */
import static com.sun.java.accessibility.util.SwingEventMonitor.addMenuListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MyMenu extends JMenuBar {
    
   JMenuBar bar;
   JMenu file;
   JMenu edit;
   JMenu choices;
   JMenu help;
   
   //JMenuItem exit;
   JMenuItem about;
    
   MenuSounds i;
   
   ImageIcon logo;
   File logoz;
   
   URL logolocat;
   
   String path;
   
   BufferedImage it;
   
   JLabel logolabel;
   
   
   
   
           
           
   public MyMenu()
   {
       bar = new JMenuBar();
       file = new JMenu("File");
       edit = new JMenu("Edit");
       choices = new JMenu("Choices");
       help = new JMenu("Help");
       
      // file.add(exit);
       //view.add(about);
       //exit = new JMenuItem("Exit");
       about = new JMenuItem("About");
       about.addActionListener(new menuListen());
       
       bar.add(file);
       bar.add(edit);
       bar.add(choices);
       bar.add(help);
       
       addMenuListener(i = new MenuSounds());
       help.addActionListener(new menuListen());
       
       
       
       
       //file.add(exit);
       help.add(about);
       
       //help.addMenuListener(i);
      // help.addActionListener(new menuListen());
       
       
       //logo = new ImageIcon();
       
       logolabel = new JLabel();
       
       //JFileChooser chooser = new JFileChooser();
       //chooser.setSelectedFile(Aerial04.jpg);
       
       
       
       
       
       
       it = null;
       
       
       try{
               
       path = "https://lh5.ggpht.com/4rWV3qQFONSkmyxanZB-E0dOstKbrZuJ-dSXpmHwnWvLdKIsR7cReJjM_UvjVW1b-KHq=w300";
       
       logolocat = new URL(path);
       
       it= ImageIO.read(logolocat);
       
       logo = new ImageIcon(it);
       
       logolabel.setIcon(logo);
       
       }
       catch(IOException x)
       {
           System.err.println("An error occured uploading the logo");
           System.err.println(x.getMessage());
       }
       
   }
       
       
       
       
     private class menuListen implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()== about)
            {
                JOptionPane.showMessageDialog(null,add(logolabel),"Logo of Champions",JOptionPane.PLAIN_MESSAGE);
                
            }
            
        }
         
         
     }  
       
       
       
       
     

       
       
       
       
       
     
       
       
       
       
       
       
       
       
       
       
   
    
   public class MenuSounds implements MenuListener{
  
       
       String a = "LOGO";
        @Override
        public void menuSelected(MenuEvent e) {
            
            if(e.getSource()== about)
            {
                
                
                
                JOptionPane.showMessageDialog(null,add(logolabel),"Logo of Champions",JOptionPane.PLAIN_MESSAGE);
            }
            
        }
        
           

        @Override
        public void menuDeselected(MenuEvent e) {}
            
        

        @Override
        public void menuCanceled(MenuEvent e) { }
    
    
    
}
}