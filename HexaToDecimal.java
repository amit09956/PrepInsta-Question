import java.util.Scanner;

public class HexaToDecimal {
        public static int hexaToDecimal(String number){
            int sum=0;
        String hexaNumber=number.toUpperCase();
            String digits="0123456789ABCDF";
            for(int i=0;i<hexaNumber.length();i++){
                char currentChar=hexaNumber.charAt(i);
                int d=digits.indexOf(currentChar);
               sum+=Math.pow(16,i)*d;
            }

        
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary number");
        String n1=sc.nextLine();
        System.out.println(hexaToDecimal(n1));
        sc.close();
    }
}
