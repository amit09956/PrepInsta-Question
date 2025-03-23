import java.util.Scanner;

public class CheckLeap {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int years=sc.nextInt();
        if(years%4==0 && (years%100!=0 || years%400==0)){
            System.out.println(years+" is a leap year");
        }
        else{
            System.out.println(years+" is not a leap year");
        }
        sc.close();
    }
}
