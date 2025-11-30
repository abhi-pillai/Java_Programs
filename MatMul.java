import java.util.Scanner;
class MatMul
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. of rows x no.of columns for A:");
    int r1=sc.nextInt(),c1=sc.nextInt(),a[][]=new int[r1][c1];
    System.out.println("Enter no. of rows x no.of columns for B:");
    int r2=sc.nextInt(),c2=sc.nextInt(),b[][]=new int[r2][c2];
    int c[][]=new int[r1][c2],i,j;
    if(c1!=r2)
    {
      System.out.println("Multiplication Not Possibe");
      System.exit(0);}
    System.out.println("Enter Elements for A:");
    for(i=0;i<r1;i++)
    for(j=0;j<c1;j++)
     a[i][j]=sc.nextInt();
    System.out.println("Enter Elements for B:");
    for(i=0;i<r2;i++){
    for(j=0;j<c2;j++){
     b[i][j]=sc.nextInt();
    }
    }
    for(i=0;i<r1;i++)
    {
    for(j=0;j<c2;j++)
    {
     c[i][j]=0;
    for(int k=0;k<c1;k++)
     c[i][j]+=a[i][k]*b[k][j];
    }
    }
    System.out.println("Product of Matices:");
    for(i=0;i<r1;i++)
    {
    for(j=0;j<c2;j++)
    {
     System.out.print(c[i][j]+"\t");
    }
     System.out.println();
    }
}  
}
