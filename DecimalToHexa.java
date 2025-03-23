import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToHexa {
    public static ArrayList<Character> decimalToHexa(int n) {
        ArrayList<Character> list = new ArrayList<>();
        
        if (n == 0) {  
            list.add('0');
            return list;
        }

        while (n > 0) {  
            int num = n % 16;
            
            if (num >= 10) {  
                char c = (char) (num + 55); 
                list.add(c);
            } else {
                char c1 = (char) (num + '0'); 
                list.add(c1);
            }
            
            n /= 16; 
        }
        
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n1 = sc.nextInt();
        
        ArrayList<Character> list1 = decimalToHexa(n1);
        
        System.out.print("Hexadecimal: ");
        for (int i = list1.size() - 1; i >= 0; i--) {  
            System.out.print(list1.get(i));
        }
        
        sc.close();
    }
}

