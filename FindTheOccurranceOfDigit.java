import java.util.Scanner;

public class FindTheOccurranceOfDigit {
    public static void findTheOccurranceOfDigit(int n,int d){
    
 
        int count = 0;



        while(n>0){
            int rem = n%10;
            if(rem == d)
                count++;
            n /= 10;
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("enter the digit");
        int d=sc.nextInt();
        findTheOccurranceOfDigit(n, d);
        sc.close();
    }

}

    

