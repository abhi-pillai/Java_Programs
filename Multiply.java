import java.util.Scanner;
class Multiply
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter two numbers:");
    int a=sc.nextInt(),b=sc.nextInt();
    int c=a*b;
    System.out.println("Product of "+a+" and "+b+" is "+c);
  }
}
