import java.util.*;
class Palindrome
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String a=sc.next(),rev="";
  for(int i=a.length()-1;i>=0;i--)
  {
    rev=rev+a.charAt(i);
  }
  if(a.equalsIgnoreCase(rev))
 System.out.println("Palindrome String");
 else
 System.out.println("Not a Palindrome String");
}
}
