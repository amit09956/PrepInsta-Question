import java.util.Scanner;
import java.util.ArrayList;

public class ArmstrongNRange {
    public static ArrayList<Integer> reverseN(int start, int end) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            int a = i;
            int sum = 0;
            int b = countDigit(a);
            while (a > 0) {
                int digit = a % 10;
                a = a / 10;
                sum = sum + (int) Math.pow(digit, b);
            }
            if (i == sum) {
                list1.add(i);
            }
            
        }
        return list1;
    }

    public static int countDigit(int n) {
        int count = 0;
        int digit;
        while (n > 0) {
            digit = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int n1 = sc.nextInt();
        System.out.println("Enter the ending number");
        int n2 = sc.nextInt();
        System.out.println(reverseN(n1,n2));
        sc.close();
    }
}
