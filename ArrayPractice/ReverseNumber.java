package ArrayPractice;

public class ReverseNumber {


    static  int helper(int n, int digits){
        if(n%10==n) return n;
        int rem = n%10;
        return (rem)* (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
    static int rev(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n, digits);
    }
    public static void main(String[] args) {
        int n =4321;
        System.out.println(rev(n));
    }

}
