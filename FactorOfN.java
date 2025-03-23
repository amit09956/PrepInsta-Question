public class FactorOfN {
    public static void factorOfNumber(int n){
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[]args){
        int n=8;
    factorOfNumber(n);
    }
}
