import java.util.Scanner;
class Transpose
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. of rows x no.of columns:");
    int r=sc.nextInt(),c=sc.nextInt(),a[][]=new int[r][c],t[][]=new int[c][r],i,j;
    System.out.println("Enter Elements:");
    for(i=0;i<r;i++)
    for(j=0;j<c;j++)
     a[i][j]=sc.nextInt();
    for(i=0;i<c;i++){
    for(j=0;j<r;j++){
     t[i][j]=a[j][i];
    }
    }
    System.out.println("Transpose");
    for(i=0;i<c;i++)
    {
    for(j=0;j<r;j++)
    {
     System.out.print(t[i][j]+"\t");
    }
     System.out.println();
    }
}  
}
