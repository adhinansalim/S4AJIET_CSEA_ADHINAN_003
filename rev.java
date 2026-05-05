import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int l;
     
      int rev=0;
      int n=34596; 
      while(n!=0){ 
          l=n%10; 
          rev=rev*10+l; 
          n=n/10;
        }
        System.out.println(rev);
}
}
