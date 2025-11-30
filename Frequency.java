import java.util.*;
class Frequency
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String a=sc.nextLine();
  System.out.println("Enter a character whose frequency is to be checked:");
  char ch=sc.next().charAt(0);
  int l=a.length(),i,f=0;
  for(i=0;i<l;i++)
  { 
   if(a.charAt(i)==ch)
    f++;
   }
  System.out.println("Frequency of "+ch+" is "+f);
 }
}
