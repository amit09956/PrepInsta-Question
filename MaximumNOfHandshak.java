import java.util.Scanner;

public class MaximumNOfHandshak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of person ");
        int person=sc.nextInt();
        int handshake=person*(person-1)/2;
        System.out.println(handshake);
        sc.close();
    }
}
