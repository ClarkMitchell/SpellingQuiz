
package spellingquiz;

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Student
{
   public Student()
   {
   
   }
   
   public boolean isTest()
   {
      File f1 = new File("test.txt");
      
      if (f1.exists())
         return true;
      else
         return false;      
   }
}