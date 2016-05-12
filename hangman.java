
import java.awt.*;
import javax.swing.*;

/**
 * Class hangman - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
///<<<<<<< HEAD
public class hangman extends JApplet
{
    // instance variables - replace the example below with your own
    private int x;


   
   
  

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {

        //Post
        g.setColor(Color.blue);
        g.fillRect(50,300,40,10);
        g.fillRect(75,70,5,232);
        g.fillRect(75,70,75,5);
        g.fillRect(125,70,5,50);
       
        g.setColor(Color.red);
        //Head
        g.fillOval(100,100,50,50);
        
        //Body
        g.fillRect(125,125,3,100);
        
        //arms
        g.drawLine(125,175,160,150);
        g.drawLine(125,175,90,150);
        
        //legs
        g.drawLine(126,223,90,250);
        g.drawLine(126,223,160,250);
        
        //Eyes
        g.setColor(Color.black);
        g.drawLine(110,115,120,125);
        g.drawLine(120,115,110,125);
        g.drawLine(130,115,140,125);
        g.drawLine(140,115,130,125);
        //g.drawLine(110,135,140,135,10,10);
        g.drawArc(110,135,30,15,0,180);
    }
}

