import java.util.Scanner;
class Replace
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n=sc.nextInt(),a[]=new int[n],i;
    System.out.println("Enter Elements:");
    for(i=0;i<n;i++)
     a[i]=sc.nextInt();
     System.out.println("Enter Element To Be Replaced:");
     int ele=sc.nextInt();
     System.out.println("Enter Replacing Element:");
     int rep=sc.nextInt();
     System.out.println("Array Before Replacement:");
      for(i=0;i<n;i++)
    System.out.println(a[i]);
    for(i=0;i<n;i++)
     {
      if(a[i]==ele)
       {
        a[i]=rep;
       }
     }
      System.out.println("Array After Replacement:");
       for(i=0;i<n;i++)
       System.out.println(a[i]);
  }
}
