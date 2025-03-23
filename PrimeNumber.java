import java.util.Scanner;

public class PrimeNumber {
    public static boolean checkPrime(int n){
       
        boolean prime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                prime=false;
                return prime;
            }
        }
        return prime;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(checkPrime(n)){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not Prime");
        }
        sc.close();
        
    }
}
