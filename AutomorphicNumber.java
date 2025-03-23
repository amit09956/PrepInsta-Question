import java.util.Scanner;
public class AutomorphicNumber {
  public static void automorphicNumber(int n){
    int square=n*n;
    int lastDigit=square%10;
    if(n==lastDigit){
        System.out.println("Number is automorphic");
    }
    else{
        System.out.println("Number is not automorphic");
    }

  }  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    automorphicNumber(n);
    sc.close();
  }
}
