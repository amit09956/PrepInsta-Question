import java.util.Scanner;

public class SumOfDigits {
    public static int DigitSum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            sum+=digit;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Sum of the digit is:"+" "+DigitSum(n));
        sc.close();
    }
}
