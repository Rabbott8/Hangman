import java.io.*;
import java.util.*;
/**
 * Help from Matt on catching and trying exceptions
 * Reads text from a file and randomly chooses a string and prints it.
 * @author rabbott8
 * @author vthanig8
 * @author dtarson8
 * @author akunche8
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
