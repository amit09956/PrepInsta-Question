import java.util.Scanner;

public class CanExpressSumOfToPrime {
    public static void canExpressSumOfToPrime(int n){
        int x=0;
        for(int i=2;i<=n/2;i++){
            if(checkPrime(i)){
                if(checkPrime(n-i)){
                    System.out.println(n+"="+i+"+"+(n-i));
                    x++;
                }
            }
        }
        if(x==0){
            System.out.println(n+ " "+ "NUmber can not expressed as  sum of prime");
        }


    }
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        canExpressSumOfToPrime(n);
        sc.close();
    }
}
