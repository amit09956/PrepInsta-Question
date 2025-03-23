import java.util.Scanner;

public class HCF {
    public static int hcfN(int a,int b){
        int hcf=1;
        int min=Math.min(a, b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the both number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(hcfN(n1,n2));
        sc.close();
    }
}
