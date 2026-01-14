import java.util.HashSet;
import java.util.Scanner;
public class Duplicates {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Elements:");
        int limit=sc.nextInt();
        int arr[]=new int[limit];
        System.out.println("Enter Elements:");
        for(int i=0;i<limit;i++){
            arr[i]=sc.nextInt();
        }
        int flag=0;
        HashSet<Integer> s=new HashSet<>();
        for(int n:arr){
            if(!s.add(n)){
                System.out.println("Contains Duplicate");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Doesn't contain Duplicate");
        }
    }
}
