import java.util.Scanner;

public class GreatestOfTwoN {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();
        System.out.println((n1>n2)?n1:n2);
        sc.close();
    }
}
