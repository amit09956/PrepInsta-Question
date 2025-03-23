import java.util.ArrayList;
import java.util.Scanner;

public class primeNGivenRange {
    public static ArrayList<Integer> prime(){
        ArrayList<Integer>primeN=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting value greater than the 1");
        int start=sc.nextInt();
        System.out.println("Enter the ending range");
        int end=sc.nextInt();
        sc.close();
        for(int i=start;i<=end;i++){
            int a=0;
            int n=i;
            for(int j=2;j<=n/2;j++){
                if(n%j==0){
                    a++;
                    
                }
            }
            if(a==0){
                primeN.add(n);
            }
        }
        return primeN;

    }
    public static void main(String[]args){
        System.out.println("Prime NUmbers:"+prime());
    }
}
