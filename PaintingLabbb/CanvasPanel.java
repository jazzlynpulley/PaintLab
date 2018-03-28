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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.* ;
import java.awt.event.MouseMotionListener;


public class CanvasPanel extends JPanel{
    
    private BufferedImage grid;
    public Graphics2D gc;
    public int sx,sy,fx,fy,flag,xd,yd,xc,yc;
    public MouseTouch i;
    public MouseMove j;
    
    JSlider strokeSelect = new JSlider(JSlider.HORIZONTAL,0,20,0);
    public int strokeVal;
    //add(strokeSelect) ;
    
    Color defal;
    Color curc;
    
    Color change;
    
    JLabel cpick;
    
    String scribble;
            
    
    
    
    
        
    
    
    public CanvasPanel()
    {
        sx = sy = 0;
        fx = 100;
        fy = 100;
        flag = 0;
        
        defal = Color.BLACK;
        change = defal;
        
        
        
        setPreferredSize(new Dimension(600,300));
        //setBackground(Color.cyan);
        //setVisible(true);
        
        //i = new MouseTouch;
        addMouseListener(i = new MouseTouch());
        
        addMouseMotionListener(j = new MouseMove());
    }
    
      //method for creating the buffered image
        public void paintComponent(Graphics g)
    { 
         super.paintComponent(g);  
         Graphics2D gc = (Graphics2D)g;
         if(grid == null){
            int w = this.getWidth();
            int h = this.getHeight();
            grid = (BufferedImage)(this.createImage(w,h));
            gc = grid.createGraphics();
           
         }
         gc.drawImage(grid, null, 0, 0);
         
         gc.setStroke(new BasicStroke(strokeVal));
         //gc.setStroke(strokeVal);
    }
        
        public void clear()
        {
            repaint();
        }
        
        public void frdraw()
        {
         
            
            Graphics2D gc = (Graphics2D)getGraphics();
            //addMouseListener(new MouseTouch());
            //i.mousePressed(MouseEvent e);
            //gc.fillRect(sx,sy,fx,fy) ;
            
             if(sx<fx && sy<fy )
            {int w = fx -sx;
            int h = fy -sy;
            
            gc.setColor(change);
            gc.setStroke(new BasicStroke(strokeVal));
            gc.fillRect(sx,sy,w,h);
            }
            else if(fx<sx && fy<sy)
            {
            int w = sx -fx;
            int h = sy -fy;
            
            gc.setColor(change);
            gc.setStroke(new BasicStroke(strokeVal));
            gc.fillRect(fx,fy,w,h);
                
            }
            else if(fx<sx && sy<fy)
            {
                int w = sx-fx;
                int h = fy-sy;
            
                gc.setColor(change);
                gc.setStroke(new BasicStroke(strokeVal));
                gc.fillRect(sx-w,sy,w,h);
            }
            else if (sx<fx && fy<sy)
            {
                int w = fx-sx;
                int h = sy-fy;
                
                //int px = fx-sx;
                //int py = sy-fy;
                
                gc.setColor(change);
                gc.setStroke(new BasicStroke(strokeVal));
                gc.fillRect(fx-w,fy,w,h);
            }
            
          
            
        }
        public void ldraw()
        {
            Graphics2D gc = (Graphics2D)getGraphics();
            //ev.mousePressed();
            
            gc.setColor(change);
            
            gc.setStroke(new BasicStroke(strokeVal));
            
            gc.drawLine(sx,sy,fx,fy);
            
        }
        
        public void erdraw()
        {
            Graphics2D gc = (Graphics2D)getGraphics();
            
            if(sx<fx && sy<fy )
            {int w = fx -sx;
            int h = fy -sy;
            
            gc.setColor(change);
            gc.setStroke(new BasicStroke(strokeVal));
            gc.drawRect(sx,sy,w,h);
            }
            else if(fx<sx && fy<sy)
            {
            int w = sx -fx;
            int h = sy -fy;
            
            gc.setColor(change);
            gc.setStroke(new BasicStroke(strokeVal));
            gc.drawRect(fx,fy,w,h);
                
            }
            else if(fx<sx && sy<fy)
            {
                int w = sx-fx;
                int h = fy-sy;
            
                gc.setColor(change);
                gc.setStroke(new BasicStroke(strokeVal));
                gc.drawRect(sx-w,sy,w,h);
            }
            else if (sx<fx && fy<sy)
            {
                int w = fx-sx;
                int h = sy-fy;
                
                //int px = fx-sx;
                //int py = sy-fy;
                
                gc.setColor(change);
                gc.setStroke(new BasicStroke(strokeVal));
                gc.drawRect(fx-w,fy,w,h);
            }
            
        }
        
        public void fodraw()
        {
            Graphics2D gc = (Graphics2D)getGraphics();
            //gc.fillOval(sx,sy,fx,fy);
            
             if(sx<fx && sy<fy )
            {int w = fx -sx;
            int h = fy -sy;
            
            gc.setColor(change);
            gc.setStroke(new BasicStroke(strokeVal));
            gc.fillOval(sx,sy,w,h);
            }
            else if(fx<sx && fy<sy)
            {
            int w = sx -fx;
            int h = sy -fy;
            
            gc.setColor(change);
            gc.setStroke(new BasicStroke(strokeVal));
            gc.fillOval(fx,fy,w,h);
                
            }
             else if(fx<sx && sy<fy)
            {
                int w = sx-fx;
                int h = fy-sy;
            
                gc.setColor(change);
                gc.setStroke(new BasicStroke(strokeVal));
                gc.fillOval(sx-w,sy,w,h);
            }
            else if (sx<fx && fy<sy)
            {
                int w = fx-sx;
                int h = sy-fy;
                
                //int px = fx-sx;
                //int py = sy-fy;
                
                gc.setColor(change);
                gc.setStroke(new BasicStroke(strokeVal));
                gc.fillOval(fx-w,fy,w,h);
            }
         
        }
        
        public void eodraw()
        {
            Graphics2D gc = (Graphics2D)getGraphics();
            //gc.drawOval(sx,sy,fx,fy);
            
             if(sx<fx && sy<fy )
            {int w = fx -sx;
            int h = fy -sy;
            
            gc.setColor(change);
            gc.setStroke(new BasicStroke(strokeVal));
            gc.drawOval(sx,sy,w,h);
            }
            else if(fx<sx && fy<sy)
            {
            int w = sx -fx;
            int h = sy -fy;
            
            gc.setColor(change);
            gc.setStroke(new BasicStroke(strokeVal));
            gc.drawOval(fx,fy,w,h);
                
            }
             else if(fx<sx && sy<fy)
            {
                int w = sx-fx;
                int h = fy-sy;
            
                gc.setColor(change);
                gc.setStroke(new BasicStroke(strokeVal));
                gc.drawOval(sx-w,sy,w,h);
            }
            else if (sx<fx && fy<sy)
            {
                int w = fx-sx;
                int h = sy-fy;
                
                //int px = fx-sx;
                //int py = sy-fy;
                
                gc.setColor(change);
                gc.setStroke(new BasicStroke(strokeVal));
                gc.drawOval(fx-w,fy,w,h);
            }
            
        }
        //method to free draw
        public void fdraw()
        {
            
            Graphics2D gc = (Graphics2D)getGraphics();
            //ev.mousePressed();
            
            gc.setColor(change);
            
            gc.setStroke(new BasicStroke(strokeVal));
            
            gc.drawLine(xd,yd,xd,yd);
          
        }
          
            
        

            
            
        

        
        //method to change the stroke the lines
        public void stroker()
        {
            
            strokeSelect.setMajorTickSpacing(5);
            strokeSelect.setMinorTickSpacing(1);
            strokeSelect.setPaintTicks(true);
            strokeSelect.setPaintLabels(true);
            strokeSelect.getSnapToTicks();
            
            JOptionPane.showMessageDialog(null,add(strokeSelect),"Stroke Thickness",JOptionPane.PLAIN_MESSAGE);
            
            strokeVal = strokeSelect.getValue();
            
            
            
            
        }
        
        //method to change the color 
        public void colorer()
        {
            
            
            
            curc = JColorChooser.showDialog(null,"Choose your Color", defal);
            
            if(curc==null)
            {
                change = defal;
            }
            else 
            {
                change = curc;
            }
            
            
        }
        
        //method to put text on the panel
        public void scribe()
        {
            scribble = JOptionPane.showInputDialog(null,"What would you like to print on the screen");
            
            //JOptionPane.showMessageDialog(null, "Click where you want the text to go", "Warning", JOptionPane.PLAIN_MESSAGE);
            
             Graphics2D gc = (Graphics2D)getGraphics();
             gc.setColor(change);
             gc.drawString(scribble,sx,sy);
            
            
        }
        
        public class MouseMove implements MouseMotionListener
        {

        @Override
        public void mouseDragged(MouseEvent e) {
            
           xd = e.getX();
           yd = e.getY();
           
            
            if(flag == 6)
            {
               fdraw(); 
            }

            

            
            
            
        }

        @Override
        public void mouseMoved(MouseEvent e) {
           
        }
            
        }

       
        











        //mouse listener
        public class MouseTouch implements MouseListener
        {
       
        
        public void mouseClicked(MouseEvent ev) {
            
        }

        
        public void mousePressed(MouseEvent ev) {
            
            sx = ev.getX();
            sy = ev.getY();
            //ldraw();
            
            
            
        }

        
          public void mouseReleased(MouseEvent ev) {
            
            fx = ev.getX();
            fy = ev.getY();
            //ldraw();
            
            switch(flag)
            {
                case 0: clear();
                        break;
                case 1: frdraw();
                         break;
                case 2: fodraw();
                         break;
                case 3: erdraw();
                        break;
                case 4: eodraw();
                        break;
                case 5: ldraw();
                         break;
                //case 6: fdraw();
                        // break;
                case 7: stroker();
                         break;
                case 8: colorer();
                        break;
                case 9: scribe();
                        break;
                default: break;
            }
        }

        
        public void mouseEntered(MouseEvent ev) {}
            

        
        public void mouseExited(MouseEvent ev) {
            
        }
                    
            
        }
    
    
}