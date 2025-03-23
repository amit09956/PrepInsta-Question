import java.util.ArrayList;
import java.util.Scanner;

public class BinaryToOctal {
    public static int binaryToDecimal(int n){
        int sum=0;
        int i=0;
        while(n>0){
            int digit=n%10;
            sum+=(int)Math.pow(2,i++)*digit;
            n/=10;
        }
        return sum;
    } 
     public static ArrayList<Integer> decimalToOctal(int n){
        ArrayList<Integer>list=new ArrayList<>();
        while(n>0){
        int num=n%8;
        list.add(num);
        n/=8;
        }
        return list;
    }
        public static void main(String[]args){
        ArrayList<Integer>list1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary number");
        int n1=sc.nextInt();
        int decimalNumber = binaryToDecimal(n1);
        list1 = decimalToOctal(decimalNumber);
       
       for(int i=list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i));
       }
        sc.close();
    }
}
