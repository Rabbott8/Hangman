
import java.awt.*;
import javax.swing.*;

/**
 * Class hangman - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class hangman extends JApplet
{
   
   
  

    
    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
        // simple text displayed on applet
        
        
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
    }


    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }


}
