import java.util.Scanner;

class Replace0To1{
    // public static int replace0To1(int num){
    //     int num2=1;
    //     int sum=0;
    //     while(num>0){
    //         int digit=num%10;
    //         if(digit==0){
    //             digit=num2;
    //         }
    //         sum=sum*10+digit;
    //         num/=10;
    //     }
    //     return sum;
    // }
    // public static int reverse(int num){
    //     int num2=1;
    //     int sum=0;
    //     while(num>0){
    //         int digit=num%10;
    //         if(digit==0){
    //             digit=num2;
    //         }
    //         sum=sum*10+digit;
    //         num/=10;
    //     }
    //     return sum;
    // }
    
    // public static void main(String[] args) {
    //         Scanner sc=new Scanner(System.in);
    //         System.out.println("Enter the number");
    //         int n=sc.nextInt();
    //         int n1=replace0To1(n);
    //         System.out.println(reverse(n1));
    //         sc.close();
    // }

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the number : ");		
		int number = sc.nextInt();
		
		String str = Integer.toString(number);
		int len = str.length();
		String str1 = "";

		for(int i = 0 ; i < len ; i++)
		{
			if(str.charAt(i) == '0')
				str1 = str1 + '1';
			else
				str1 = str1 + str.charAt(i);	
		}
		System.out.println("Converted number is: "+str1);
		
		sc.close();									
	}

}