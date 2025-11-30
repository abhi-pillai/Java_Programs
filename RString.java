import java.util.*;
class RString
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String a=sc.nextLine();
  System.out.println("Enter character to be replaced");
  char ch= sc.next().charAt(0);
  System.out.println("Enter replacing character");
  char c= sc.next().charAt(0);
  System.out.println("Before Replacing:"+a);
  String rep=a.replace(ch,c);
  System.out.println("After Replacing:"+rep);
 }
}
