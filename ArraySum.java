import java.util.Scanner;
class ArraySum
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n=sc.nextInt(),a[]=new int[n],i,sum=0;
    System.out.println("Enter Elements:");
    for(i=0;i<n;i++)
     a[i]=sc.nextInt();
    for(i=0;i<n;i++)
     sum+=a[i];
      System.out.println("Sum of elements of array: "+sum);
  }
}
