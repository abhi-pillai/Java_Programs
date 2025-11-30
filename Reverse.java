import java.util.*;
class Reverse
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int a=sc.nextInt();
  int b=a,num=0,d;
  while(a!=0)
  {
    d=a%10;
    num=num*10+d;
    a=a/10;
  }
 System.out.println("Reverse of "+b+" is "+num);
}
}
