import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       
        int n=10;
        int k=5;
        int demand=sc.nextInt();
        int a;
        if(demand<n){
           a=n-demand;
           if(demand>=6){
               a=20;
           }
           System.out.println("Number of candeis sold:"+demand);
           System.out.println("Number of candeis available"+a);
        }
       
        else{
            System.out.println("INVALID");
        }
   
   
    }
}
