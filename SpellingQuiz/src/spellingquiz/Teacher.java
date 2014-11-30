
package spellingquiz;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class Teacher
{
   public Teacher()
   {
   
   }
   
   public void writePassword(){
      Scanner in = new Scanner(System.in);
      PrintWriter file = null;
      
      try
      {
         if (new File("password.txt").isFile())
             System.out.println("Are you sure you would like to overwrite?");
         file = new PrintWriter(new FileOutputStream("password.txt"));
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Could not create password file.");
         System.exit(0);
      }
      
      System.out.print("Enter password: ");
      String password = in.next();
      
      file.append(password);
      file.close();
   }
   
   public boolean isCorrectPW()
   {
      Scanner file = null;
      Scanner keyboard = new Scanner(System.in);
      boolean result;
      
      try
      {
         file = new Scanner(new FileInputStream("password.txt"));
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Can't open needed files.");
         System.exit(0);
      }
      
      System.out.print("Enter password: ");
      String password = keyboard.next();
      
      if (password.equals(file.next()))
         result = true;
      else
         result = false;
      
      file.close();
      return result;
   } 
   
   public void loadTest()
   {
      Scanner in = new Scanner(System.in);
      PrintWriter test = null;
      
      try
      {
         test = new PrintWriter(new FileOutputStream("Test.txt"));
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Can not create test file.");
         System.exit(0);
      }
      
      System.out.println("Load words one at a time followed by enter, if you are done loading words type -1.");
      
      while(true)
      {   
         String word = in.next();
         
         if (word.equals("-1"))
            break;
    
         test.println(word); 
      } 
      test.close();    
   }
}
