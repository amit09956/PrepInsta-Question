import java.util.Scanner;
class checkNPositiveNegative{
    public static void checkNPositiveNegativeN(int n) {
        if(n==0){
            System.out.println("Neither Positive nor Negative");
        }
        else if(n>0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        checkNPositiveNegativeN(n);
        sc.close();

}
}