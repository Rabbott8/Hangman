
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
        // simple text displayed on applet
//<<<<<<< HEAD
        g.setColor(Color.green);
        g.fillRect(335, 20, 18, 180);
        g.fillRect(309,184,70,16);
        
        
         g.setColor(Color.blue);
        g.fillRect(50,300,40,10);
        g.fillRect(75,70,5,232);
        g.fillRect(75,70,75,5);
        g.fillRect(125,70,5,50);
        
        
        
        g.setColor(Color.red);
        g.fillOval(100,100,50,50);
        g.fillRect(125,125,3,100);
        g.drawLine(125,175,160,150);
        g.drawLine(125,175,90,150);
        g.drawLine(126,223,90,250);
        g.drawLine(126,223,160,250);
    }}

