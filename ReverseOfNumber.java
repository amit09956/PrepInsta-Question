import java.util.Scanner;

public class ReverseOfNumber {
    public static int reverseN(int n){
        int reverse=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            reverse=reverse*10+digit;
        }
        return reverse;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Sum of the digit is:"+" "+reverseN(n));
        sc.close();
    }
}
