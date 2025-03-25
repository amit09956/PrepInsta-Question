import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void rootsOfQuadraticEquation(int a,int b,int c){
        int determinant=b*b-4*a*c;
        
        if(determinant>0){
            System.out.println("Roots are real and different");
            System.out.println((-b+(int)Math.sqrt(Math.abs(determinant))/(2*a)));
            System.out.println((-b-(int)Math.sqrt(Math.abs(determinant))/(2*a)));
            
        }
        else if(determinant==0){
            System.out.println("Roots are real and same ");
            System.out.println(-(double)b / (2 * a) + "\n" + -(double)b / (2 * a));
        }
        else{
            System.out.println("Roots are complex");
 
            System.out.println(-(double)b / (2 * a) + " + i" + Math.sqrt(Math.abs(determinant)) + "\n" + -(double)b / (2 * a) + " - i" + Math.sqrt(Math.abs(determinant)));
        }

        }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of A");
        int A=sc.nextInt();
        System.out.println("Enter the value of B");
        int B=sc.nextInt();
        System.out.println("Enter the value of C");
        int C=sc.nextInt();
        rootsOfQuadraticEquation(A, B, C);
        sc.close();
    }
}
