import java.io.*; 
import java.util.*; 
class FileTokenizer
{
 public static void main(String args[]) throws IOException
 {
  FileReader f = new FileReader("file.txt");
  BufferedReader r = new BufferedReader(f);
  String s = "";
  int sum = 0;
  while ((s = r.readLine())!=null)
  {
   StringTokenizer st = new StringTokenizer(s, " ");
   while(st.hasMoreTokens())
   {
    int n = 0;
    n = Integer.parseInt(st.nextToken());
    System.out.println("Number is: "+n);
    sum += n;
   }
  }
  System.out.println("Sum of the numbers is: "+sum);
  r.close(); f.close();
 }
}