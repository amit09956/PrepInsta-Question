import java.util.Scanner;
public class perfectSquare {
   public static void perfectSquare1(int n){
    int n1=(int)Math.sqrt(n);
    if(n1*n1==n){
        System.out.println("Perfect Square");
    }
    else{
        System.out.println("Not Perfect Square");
    }
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    perfectSquare1(n);
    sc.close();
   } 
}
