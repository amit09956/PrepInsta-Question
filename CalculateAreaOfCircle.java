import java.util.Scanner;

public class CalculateAreaOfCircle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        int r=sc.nextInt();
        float area=(float)3.14*(r*r);
        System.out.println(area);
        sc.close();
    }
}
