
/**
 * Reads and prints text from a file
 * @author rabbott8
 * @author vthanig8
 * @author dtarson8
 * @author akunche8

 */
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass
{
    public static void main(String[] args) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader("README.TXT")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
        //int random=(int)Math.random()*sCurrentLine.length-1;
    }
}

