import java.util.*;
class ExceptionHandle
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("1.Display ArithmeticException Handling\n2. Display ArrayIndexOutOfBoundsException Handling\nEnter Choice:");
     int ch=sc.nextInt();int c=0;
     switch(ch)
     {
        case 1:
                System.out.println("Enter two numbers:");
                int x=sc.nextInt(),y=sc.nextInt();
                try{
                     float d=x/y;
                     System.out.println("x/y: "+d);
                    }
               catch(ArithmeticException e){
                      System.out.println(e);
                      c=1;}
                if(c==1)
                System.out.println("Exception Handled");
                else
 		System.out.println("Program Run Successfully");
                break;
	case 2:
  		System.out.println("Enter size of array:");
                int n=sc.nextInt(),a[]=new int[n],i=0;
        	System.out.println("Enter elements:");
                try{
                     while(true){
                     a[i]=sc.nextInt();i++;
                    }}
               catch(ArrayIndexOutOfBoundsException e){
		      System.out.println(e);
		      System.out.println("Elements Entered are:");
                      for(int j=0;j<i;j++)
                      System.out.println(a[j]);
                      }
                System.out.println("Exception Handled");
                break;
         default:System.out.println("Invalid Choice");
   }
 }
}
