class Odd extends Thread
{
 public void run()
  {
    for(int i=1,j=0;i<=100;j++,i+=2)
    {
      try{
         sleep(200);}
       catch(Exception e){
        }
       System.out.print(i+", ");
    }
  }
}
class Even extends Thread
{
 public void run()
  {
    for(int i=0,j=0;i<=100;j++,i+=2)
    {
       try{
         sleep(200);}
       catch(Exception e){
        }
     System.out.print(i+", ");
    }
 }
}
class Threadtry
{
  public static void main(String args[])
  {
    new Odd().start();
    new Even().start();
  }
}

