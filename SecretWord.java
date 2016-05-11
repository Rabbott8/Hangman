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
    ArrayList<String> letters = new ArrayList<String>();
    List<Boolean> m;
    /**
     * Constructor for objects of class SecretWord
     */
    public SecretWord() throws FileNotFoundException
    {
        String s = FileReader1.choose(new File("README.TXT"));
        for (int i = 0; i<s.length();i++)
        {
            letters.add(s.substring(i,i+1));
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        return "";
    }
}
