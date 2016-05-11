import java.io.*;
import java.util.*;
/**
 * Write a description of class SecretWord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecretWord
{
    String s;
    /**
     * Constructor for objects of class SecretWord
     */
    public SecretWord() throws FileNotFoundException
    {
        s = FileReader1.choose(new File("README.TXT"));
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        return y;
    }
}
