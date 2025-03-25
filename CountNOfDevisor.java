import java.util.Scanner;

public class CountNOfDevisor {
    public static int countNOfDevisor(int range,int x){
        int count=0;
        for(int i=1;i<=range;i++){
            int count1=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count1++;
                }
            }
            if(count1==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range");
        int range=sc.nextInt();
        System.out.println("Enter the X");
        int x=sc.nextInt();
        System.out.println(countNOfDevisor(range, x));
        sc.close();
    }
}
