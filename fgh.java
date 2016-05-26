
import java.awt.*;
import javax.swing.*;

/**
 * Runner Class that calls JFrame and Sound; Also initializes variables
 * This version of hangman only uses one-word words
 * @author rabbott8
 * @author vthanig8
 * @author dtarson8
 * @author akunche8

 */
public class fgh
{
    
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

        // Commented out is test code for methods in SecretWord. Tests all necessary methods
        // Very simple methods that do not need testing are not tested - also, if these methods work
        // then the other methods in SecretWord do as well.
        //System.out.print(w.numLetters());

        //System.out.print(w);

        //w.isLetter("e");
        //w.isLetter("i");
        //w.isLetter("a");
        //w.isLetter("o");

        //System.out.print(w);

       
    }
}

