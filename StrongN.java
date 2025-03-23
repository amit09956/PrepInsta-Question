import java.util.Scanner;
public class StrongN {
    public static int DigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += factorial(digit);
        }
        return sum;
    }
    public static int factorial(int n) {

        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n==DigitSum(n)){
            System.out.println("Number is strong");
        }
        else{
            System.out.println("Number is not strong");
        }
        sc.close();
    }
}
