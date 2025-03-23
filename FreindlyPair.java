import java.util.Scanner;

public class FreindlyPair {
    public static void freindlyPair(int n1, int n2){
        int sum1=factorOfNumber(n1);
        int sum2=factorOfNumber(n2);
        if(sum1/n1==sum2/n2){
            System.out.println("number is freindly pair");
        }
        else{
            System.out.println("Number is not freindly pair");
        }

    }
   
    public static int factorOfNumber(int n){
        int sum=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbe1 and Enter the number2");
    int n1=sc.nextInt();  
    int n2=sc.nextInt(); 
    freindlyPair(n1, n2); 
    sc.close();
    }
}
