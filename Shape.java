import java.util.*;
abstract class Shape
{
  abstract void numberOfSides();
}
class Rectangle extends Shape
{
  void numberOfSides()
    {
     System.out.println("Number of sides: 4");
    }
 }
class Triangle extends Shape
{
   void numberOfSides()
    {
     System.out.println("Number of sides: 3");
    }
 }
class Hexagon extends Shape
{
  void numberOfSides()
    {
     System.out.println("Number of sides: 6");
    }
 }
class Executer
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("1:Rectange\n2:Triangle\n3:Hexagon\nEnter Choice");
  int ch=sc.nextInt();
  switch(ch)
  {
    case 1:Rectangle r=new Rectangle();r.numberOfSides();break;
    case 2:Triangle t=new Triangle();t.numberOfSides();break;
    case 3:Hexagon h=new Hexagon();h.numberOfSides();break;
    default:System.out.println("Invalid Input");
 }
 }
}
