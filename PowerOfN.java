import java.util.Scanner;
public class PowerOfN {
    public static int power(int number,int count){
        int newN=1;
      for(int i=1;i<=count;i++){
        newN=(number*newN);
      }
      return newN;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numberand Enter the number of power");
        int n=sc.nextInt();
        int count=sc.nextInt();
        System.out.println(power(n, count));
        sc.close();

    }
}
