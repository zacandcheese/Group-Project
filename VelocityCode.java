//The Velocity Code
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.geom.RectangularShape.*; 
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class VelocityCode extends JPanel implements ActionListener{
   Timer t = new Timer(5, this);
   double x = 0, y = 0, velX = 0, velY = 0;
   
   public void paintC(Graphics g){
      @Override
      super.paintC(g);
      Graphics2D g2 = (Graphics2D)g;
      //Rectangle2D circle = new Rectangle2D.Double(x,y,40,40);
      //g2.(circle);
      g2.drawRect(x,y);
      //t.start();
   }
   @Override
   public void actionPerformed(ActionEvent e){
      x += velX;
      y += velY;
      repaint();
   }  
}