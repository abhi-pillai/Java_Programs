import java.util.Scanner;
class ArraySmall
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n=sc.nextInt(),a[]=new int[n],i;
    System.out.println("Enter Elements:");
    for(i=0;i<n;i++)
     a[i]=sc.nextInt();
     int small=a[0],ind=0;
    for(i=1;i<n;i++)
     {
      if(a[i]<small)
       {
        small=a[i];ind=i;
       }
     }
      System.out.println("Smallest element is "+small+" at index "+ind);
  }
}
