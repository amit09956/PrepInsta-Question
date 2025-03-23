import java.util.ArrayList;
import java.util.Scanner;

public class OctalToBinary {
    public static int octalToDecimal(int n){
        int sum=0;
        int i=0;
        
        while(n>0){
            int digit=n%10;
            sum+=(int)Math.pow(8,i++)*digit;
            n/=10;
        }
        return sum;
    }
      public static ArrayList<Integer> decimalToBinary(int n){
        ArrayList<Integer>list=new ArrayList<>();
        while(n>=1){
        int num=n%2;
        list.add(num);
        n/=2;
        }
        return list;
    }
        public static void main(String[]args){
        ArrayList<Integer>list1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Octal number");
        int n1=sc.nextInt();
        int decimalNumber = octalToDecimal(n1);
        list1 = decimalToBinary(decimalNumber);
       
       for(int i=list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i));
       }
        sc.close();
    }
}
