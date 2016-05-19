import java.io.*;
import java.util.*;
/*
 * Help from Matt on catching and trying exceptions
 * 
 */
public class FileReader1 {

  public static void main(String[] args)  {
        String s = choose(new File("README.TXT"));
        System.out.println(s);
     }

     
  

  public static String choose(File f) 
  {
     String result = null;
     Random rand = new Random();
     int n = 0;
     
     try{
     
     for(Scanner sc = new Scanner(f); sc.hasNext(); )
     {
        ++n;
        String line = sc.nextLine();
        if(rand.nextInt(n) == 0)
           result = line;         
     }

     
    }   
    
    catch ( java.io.FileNotFoundException e)
        {
            result = null;
        }
        
    return result;
  }
}