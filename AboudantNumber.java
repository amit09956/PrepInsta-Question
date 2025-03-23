import java.util.Scanner;

public class AboudantNumber {
    public static void aboudantNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum > n) {
            System.out.println("Number is aboudant");
        } else {
            System.out.println("Number is not aboudant");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        aboudantNumber(n);
        sc.close();
    }
}
