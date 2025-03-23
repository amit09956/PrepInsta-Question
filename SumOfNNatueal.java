import java.util.Scanner;

public class SumOfNNatueal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // int sum = 0;
        // while (n > 0) {
        //     sum = sum + n;
        //     n--;
        // }
        int sum=n*(n+1)/2;
        System.out.println("Sum of natural numbers is " + sum);
        sc.close();
    }
}
