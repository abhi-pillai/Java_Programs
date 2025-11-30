import java.util.Scanner;
class Large
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a=sc.nextInt(),b=sc.nextInt();
    int c=(a>b)?a:b;
    System.out.println("Larger of "+a+" and "+b+" is "+c);
  }
}
