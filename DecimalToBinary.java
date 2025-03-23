import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {
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
        System.out.println("Enter the decimal number");
        int n1=sc.nextInt();
        list1=decimalToBinary(n1);
       
       for(int i=list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i));
       }
        sc.close();
    }
}
