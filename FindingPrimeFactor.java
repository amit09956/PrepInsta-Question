import java.util.Scanner;

public class FindingPrimeFactor {
    public static void factorOfNumber(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (checkPrime(i)) {
                    System.out.println(i+" ");
                }
            }
        }
    }

    public static boolean checkPrime(int n) {

        boolean prime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                return prime;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        factorOfNumber(n);
        sc.close();
    }
}
