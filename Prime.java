import java.util.Scanner;
class Prime
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int a=sc.nextInt(),f=0;
    for(int i=1;i<=a;i++)
    {
         if(a%i==0)
         f++; 
    }
      if(f==2)
      System.out.println(a+" is Prime Number");
      else
      System.out.println(a+" is not a Prime Number");
  }
}
