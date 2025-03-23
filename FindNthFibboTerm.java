import java.util.Scanner;

public class FindNthFibboTerm {
    public static int printFibbonacci(int n){
        // int a=0;
        // int b=1;
        // System.out.print(a+" ");
        // System.out.print(b+" ");
        // for(int i=3;i<=n;i++){
        //     int next=a+b;
        //     System.out.print(next+" ");
        //     a=b;
        //     b=next;
           
        // }
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        return printFibbonacci(n-2)+printFibbonacci(n-1);
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=n;i>=n;i--){
        System.out.print(printFibbonacci(i)+" ");
        }
        sc.close();
    }
}
