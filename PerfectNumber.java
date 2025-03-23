import java.util.Scanner;
public class PerfectNumber {
    public static int perfectnumber(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n==perfectnumber(n)){
            System.out.println("Number is perfect");
        }
        else{
            System.out.println("Number is not perfect");
        }
        sc.close();
    }
}
