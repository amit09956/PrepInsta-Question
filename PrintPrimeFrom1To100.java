import java.util.ArrayList;
public class PrintPrimeFrom1To100 {
      public static ArrayList<Integer> prime(){
        ArrayList<Integer>primeN=new ArrayList<>();
       
        for(int i=2;i<=100;i++){
            int a=0;
            int n=i;
            for(int j=2;j<=n/2;j++){
                if(n%j==0){
                    a++;
                    break;
                }
            }
            if(a==0){
                primeN.add(n);
            }
        }
        return primeN;

    }
    public static void main(String[]args){
        System.out.println("Prime NUmbers:"+" "+prime());
    }
}
