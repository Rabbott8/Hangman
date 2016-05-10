
/**
 * Write a description of class FileReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

