import java.util.Scanner;
class SecondLargest
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n=sc.nextInt(),a[]=new int[n],i;
    System.out.println("Enter Elements:");
    for(i=0;i<n;i++)
     a[i]=sc.nextInt();
     int l=a[0],ind=0;
    for(i=1;i<n;i++)
     {
      if(a[i]>l)
       {
       l=a[i];ind=i;
       }
     }
      int sl=a[0],in=0;
      for(i=1;i<n;i++)
     {
      if(a[i]>sl && i!=ind)
       {
       sl=a[i];in=i;
       }
     }
      System.out.println("Second Largest element is "+sl+" at index "+in);
  }
}
