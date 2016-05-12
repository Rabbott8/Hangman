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
    ArrayList<Boolean> isFull = new ArrayList<Boolean>();
    /**
     * Constructor for objects of class SecretWord. Adds each letter in a randomly chosen string from
     * a text file to an ArrayList. Also intializes each position in isFull to false
     */
    public SecretWord() throws FileNotFoundException
    {
        String s = FileReader1.choose(new File("README.TXT"));
        for (int i = 0; i<s.length();i++)
        {
            letters.add(s.substring(i,i+1));
            isFull.add(false);
        }
    }
    
    /**
     * Returns the ArrayList form of the word; this will contain ALL letters, unlike toString
     */
    public ArrayList<String> getLetters()
    {
        return letters;
    }
    
    /**
     * Will check to see if string parameter is present in the SecretWord.
     * Returns an ArrayList<Integer> of the indexes of the string, null if the string is not present
     * Sets the corresponding position in isFull to true if string is present
     */
    public ArrayList<Integer> isLetter(String s)
    {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i<letters.size();i++)
            {
                if (s.equals(letters.get(i)))
                    {
                        indexes.add(i);
                        isFull.set(i,true);
                    }
            }
        
        if (indexes.size() == 0)    
            return null;
        else
            return indexes;
    }
    
    /**
     * This method will check if the word has been completely guessed
     * Returns true if complete, false if not
     */
    public boolean isComplete()
    {
        for ( boolean b : isFull)
            if (!b)
                return false;
        return true;
    }
    
    /**
     * toString method, returns completed word so far
     * Concatenates letter if it has been correctly guessed, otherwise concatenates "_"
     */
    public String toString()
    {
        String s = "";
        for (int i = 0;i<isFull.size();i++)
            {
                if (isFull.get(i))
                    {
                        s+=letters.get(i);
                    }
                else
                    {
                        s+="_";
                    }
            }
        return s;
    }
}
