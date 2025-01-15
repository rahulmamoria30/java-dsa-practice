package ArrayPractice;

public class ReverseNumber2 {
    public static void main(String[] args) {
        int ans = helper(4302, 0);
        System.out.println(ans);
    }
    static  int helper(int n, int result){
        if(n==0) return result;

        result = result*10+n%10;
        return helper(n/10, result);
    }
}
