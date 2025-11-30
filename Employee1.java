import java.util.*;
class Employee1
{
 int age,salary;String name="",address="";long phno;
 Employee1(String n,int age,String add,long mob,int sal)
 {
   name=n;this.age=age;address=add;phno=mob;salary=sal;
 }
  void print_Salary()
  {
  System.out.println("Salary:\t\t "+salary);
   }
  
}
class Officer extends Employee1
{
  String Sp;
 Officer(String n,int age,String add,long mob,int sal,String Specialisation)
 {
   super(n,age,add,mob,sal);
   Sp=Specialisation;
  }
 void display()
  {
   System.out.println("Employee Name:\t"+name);
   System.out.println("Age:\t\t "+age); 
   System.out.println("Phone Number:\t"+phno);
   System.out.println("Address:\t"+address);
   System.out.println("Specialisation:\t"+Sp);
   super.print_Salary();
   }
}
class Manager extends Employee1
{
  String dept;
 Manager(String n,int age,String add,long mob,int sal,String Department)
 {
   super(n,age,add,mob,sal);
   dept=Department;
  }
 void display()
  {
   System.out.println("Employee Name:\t"+name);
   System.out.println("Age:\t\t "+age); 
   System.out.println("Phone Number:\t"+phno);
   System.out.println("Address:\t"+address);
   System.out.println("Department:\t"+dept);
   super.print_Salary();
   }
}
class Company
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("1:Display Officer Details\n2:Display Manager Details\nEnter Choice");
  int ch=sc.nextInt();String nothing=sc.nextLine();
  switch(ch)
  {
   case 1:
   System.out.println("Enter Name of Officer");
   String n=sc.nextLine();
   System.out.println("Enter Age of Officer");
   int age=sc.nextInt();nothing=sc.nextLine();
   System.out.println("Enter Address of Officer");
   String add=sc.nextLine();
   System.out.println("Enter Phone Number of Officer");
   long ph=sc.nextLong();
   System.out.println("Enter Salary of Officer");
   int sal=sc.nextInt();nothing=sc.nextLine();
   System.out.println("Enter Specialisation of Officer");
   String sp=sc.nextLine();
  Officer o=new Officer(n,age,add,ph,sal,sp);
  o.display();break;
  case 2:
  System.out.println("Enter Name of Manager");
   String n1=sc.nextLine();
   System.out.println("Enter Age of Manager");
   int ag=sc.nextInt();nothing=sc.nextLine();
   System.out.println("Enter Address of Manager");
   String ad=sc.nextLine();
   System.out.println("Enter Phone Number of Manager");
   long p=sc.nextLong();
   System.out.println("Enter Salary of Manager");
   int s=sc.nextInt();nothing=sc.nextLine();
   System.out.println("Enter Department of Manager");
   String dep=sc.nextLine();
  Manager m=new Manager(n1,ag,ad,p,s,dep);
  m.display();break;
  default:System.out.println("Invalid Input");
 }
}
}
