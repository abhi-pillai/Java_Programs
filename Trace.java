import java.util.Scanner;
class Trace
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of Matrix:");
    int n=sc.nextInt(),a[][]=new int[n][n],i,j;
    System.out.println("Enter Elements:");
    for(i=0;i<n;i++)
    for(j=0;j<n;j++)
     a[i][j]=sc.nextInt();
    int sum=0;
    for(i=0;i<n;i++)
    {
    for(j=0;j<n;j++) 
    {
     if(i==j)
     sum=sum+a[i][j];
    }
    }
   System.out.println("Trace:"+sum);
 }
}  
