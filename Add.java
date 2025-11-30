import java.util.Scanner;
class Add
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a=sc.nextInt(),b=sc.nextInt();
    System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
  }
}
