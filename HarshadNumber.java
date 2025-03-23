import java.util.Scanner;

public class HarshadNumber {
    public static void harshadNumber(int n){
        if(n%DigitSum(n)==0){
            System.out.println("Number is Harshad");
        }
        else{
            System.out.println("Number is not Harshad");
        }
    }
    public static int DigitSum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            sum+=digit;
        }
        return sum;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    harshadNumber(n);
    sc.close();
    }
}
