import java.util.Scanner;

public class SumOfNNaturalWithRange {
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number starting Number");
        int start=sc.nextInt();
        System.out.println("Enter the number ending Number");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+i;
        }
        System.out.println("Sum Of"+" " +sum);
        sc.close();

      
    }
}
