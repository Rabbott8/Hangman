
import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class fgh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fgh
{
    // instance variables - replace the example below with your own
    private int x;
    private Graphics g;
    /**
     * Constructor for objects of class fgh
     */
    public static void main(String args[])
    {
        
        SecretWord w = new SecretWord();
       
       NewJFrame.numSpaces(w.numLetters());
       NewJFrame.setArray(w);
        
                    NewJFrame dogescreaming = new NewJFrame();
                    dogescreaming.setVisible(true);
                    dogescreaming.setResizable(false);
                    dogescreaming.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   Sound doge = new Sound();
                   doge.play();
       
       System.out.print(w.numLetters());
       
       System.out.print(w);
       
       w.isLetter("e");
       w.isLetter("i");
       w.isLetter("a");
       w.isLetter("o");

       System.out.print(w);
       
       
       
    }
    }

