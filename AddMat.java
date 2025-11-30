import java.util.Scanner;
class AddMat
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. of rows x no.of columns:");
    int r=sc.nextInt(),c=sc.nextInt(),a[][]=new int[r][c],b[][]=new int[r][c];
    int s[][]=new int[r][c],i,j;
    System.out.println("Enter Elementsfor A:");
    for(i=0;i<r;i++)
    for(j=0;j<c;j++)
     a[i][j]=sc.nextInt();
    System.out.println("Enter Elementsfor B:");
    for(i=0;i<r;i++){
    for(j=0;j<c;j++){
     b[i][j]=sc.nextInt();s[i][j]=a[i][j]+b[i][j];
    }
    }
    System.out.println("Sum of Matices:");
    for(i=0;i<r;i++)
    {
    for(j=0;j<c;j++)
    {
     System.out.print(s[i][j]+"\t");
    }
     System.out.println();
    }
}  
}
