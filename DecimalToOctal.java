import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToOctal {
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
        System.out.println("Enter the decimal number");
        int n1=sc.nextInt();
        list1=decimalToOctal(n1);
       
       for(int i=list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i));
       }
        sc.close();
    }
}
