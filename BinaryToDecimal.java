import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(int n){
        int sum=0;
        int i=0;
        while(n>0){
            int digit=n%10;
            sum+=(int)Math.pow(2,i++)*digit;
            n/=10;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary number");
        int n1=sc.nextInt();
        System.out.println(binaryToDecimal(n1));
        sc.close();
    }
}
