import java.util.*;
class Shapes
{
  static void area(double r)
  {
    double area=3.14*r*r;
    System.out.println("Area of Circle: "+area);
  }
  static void area(double base,double ht)
  {
   double area=0.5*base*ht;
    System.out.println("Area of Triangle: "+area);
  }
  static void area(int length,int width)
  {
   int area=length*width;
    System.out.println("Area of Rectangle: "+area);
  }
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
    System.out.println("1:Circle\n2:Rectangle\n3:Triangle\nEnter Choice");
   int ch=sc.nextInt();
    switch(ch)
    {
        case 1:
		System.out.println("Enter Radius:");
		area(sc.nextDouble());break;
        case 2:
		System.out.println("Enter Length and Width:");
  		area(sc.nextInt(),sc.nextInt());
	case 3:
		System.out.println("Enter Base and Height:");
  		area(sc.nextDouble(),sc.nextDouble());break;
	default : System.out.println("Invalid Choice");
     }
 }
}
