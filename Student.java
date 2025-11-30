import java.util.*;
class Student
{
  String name;int rno,marks[];
  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name of Student:");
    name=sc.nextLine();
    System.out.println("Enter Roll No. of Student:");
    rno=sc.nextInt();
    System.out.println("Enter Marks of Five Subjects:");
    marks =new int[5];
    for(int i=0;i<5;i++)
    {
      System.out.print("Marks "+(i+1)+":\t");
      marks[i]=sc.nextInt();
    }
   }
  void display()
  {
    System.out.println("Name Of Student:\t"+name);
    System.out.println("Roll Number:\t\t"+rno);
    System.out.println("Marks of Five Subjects are:");
    for(int i=0;i<5;i++)
    {
      System.out.println("Marks"+(i+1)+":\t\t"+marks[i]);
    }
  }
 public static void main(String args[])
 {
   Student st=new Student();
   st.input();
   st.display();
 }
}
