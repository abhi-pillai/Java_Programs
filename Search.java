import java.util.*;
class Search
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String a=sc.nextLine();
  System.out.println("Enter character to search");
  char ch= sc.next().charAt(0);
  int i=a.indexOf(ch);
  if(i==-1)
  System.out.println("Character Not Found");
  else
  System.out.println(ch+" Found at index "+i);
 }
}
