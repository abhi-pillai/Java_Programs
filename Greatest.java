import java.util.Scanner;
class Greatest
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int a=sc.nextInt(),b=sc.nextInt();
    int c=sc.nextInt(),d=(a>b)?(a>c)?a:c:(b>c)?b:c;
    System.out.println("Largest of three is "+d);
  }
}
