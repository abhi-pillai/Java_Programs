import java.util.*;
class Employee
{
 int empno;String name="";long phno;
 void input()
 {
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter Employee Name:");
   name=sc.nextLine();
   System.out.println("Enter Employee number:");
   empno=sc.nextInt();
   System.out.println("Enter phone Number:");
   phno=sc.nextLong();
 }
  void display()
  {
   System.out.println("Employee Number:\t"+empno);
   System.out.println("Employee Name:\t"+name);
   System.out.println("Phone Number:\t"+phno);
   }
  public static void main(String args[])
  {
    Employee e[]=new Employee[5];int i;
    for(i=0;i<5;i++)
    {
       e[i]=new Employee();
       e[i].input();
     }
    System.out.println("Employee Details:");
    for(i=0;i<5;i++)
     e[i].display();
   }
}
