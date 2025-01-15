package ArrayPractice;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = digitProduct(5203);
        System.out.println(ans);
    }
    static int digitProduct(int n){
        if(n%10 == n) return n;
        return (n%10)*digitProduct(n/10);
    }
}
