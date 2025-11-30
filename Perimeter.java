
import java.util.*;
class Perimeter
{
  int l,b;double r,area;
  Perimeter(int length,int width)
  {
     l=length;b=width;
     area=2*(l+b);
  }
  Perimeter(double rad)
  {
    r=rad;area=3.14*2*r;
  }
  void display()
  {
     System.out.println("Area: "+area);
  }
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("1:Circle\n2:Rectangle\nEnter Choice");
    int ch=sc.nextInt();
    switch(ch)
    {
        case 1:
		System.out.println("Enter Radius:");
		Perimeter p=new Perimeter(sc.nextDouble());p.display();break;
        case 2:
		System.out.println("Enter Length and Width:");
  		Perimeter p1=new Perimeter(sc.nextInt(),sc.nextInt());p1.display();break;
	default : System.out.println("Invalid Choice");
     }
   }
}
