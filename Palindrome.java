import java.util.Scanner;

public class Palindrome {
    
    public static boolean reverseN(int n){
        int a=n;
        int reverse=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            reverse=reverse*10+digit;
        }
         if(a==reverse){
            return true;
         }
         return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(reverseN(n));
        sc.close();
    }
}
