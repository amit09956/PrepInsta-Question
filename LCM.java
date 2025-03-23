import java.util.Scanner;

public class LCM {
    public static int lcmN(int a,int b){
        int max=Math.max(a, b);
        int lcm=0;
        for(int i=max;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        return lcm;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the both number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(lcmN(n1,n2));
        sc.close();
    }
}
