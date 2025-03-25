import java.util.Scanner;

class CountNOfDigit{
    public static int countNOfDigit(int n){
        int count=0;
        while(n>0){
            int digit=n%10;
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[]arrgs){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(countNOfDigit(n) );
        sc.close();
        
    }
}