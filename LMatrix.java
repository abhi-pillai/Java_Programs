import java.util.Scanner;
class LMatrix
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
    int l=a[0][0],r=0,c=0;
    for(i=0;i<n;i++){
    for(j=0;j<n;j++){
     if(a[i][j]>l)
     {
       l=a[i][j];r=i;c=j;
     }
     }
    }
   System.out.println("Largest Element is: "+l+" at index("+r+","+c+")");
 }
}  
