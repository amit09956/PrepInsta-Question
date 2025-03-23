import java.util.Scanner;


public class armstrongN {
    public static boolean reverseN(int n){
        int a=n;
        int sum=0;
        int b=countDigit(n);
        while(n>0){
            int digit=n%10;
            n=n/10;
            sum=sum+(int)Math.pow(digit, b);
        }
         if(a==sum){
            return true;
         }
         return false;
    }
    public static int countDigit(int n){
        int count=0;
        int digit;
        while(n>0){
             digit=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(reverseN(n));
        sc.close();
    }
}
