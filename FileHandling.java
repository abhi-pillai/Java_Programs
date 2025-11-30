import java.io.*;
public class FileHandling
{
 public static void main(String args[])throws IOException
{
    FileReader f=null;BufferedReader r=null;
 try{
    f = new FileReader("Handle.txt");
    r = new BufferedReader(f);
    int i = 1;
    String s = "";
    while ((s = r.readLine())!=null)
    {
      System.out.println("Line "+i+"  "+s);
      i++;
    }
   }catch(Exception e){System.out.println(e);}
   finally{
    r.close();f.close();
   }
}
}
