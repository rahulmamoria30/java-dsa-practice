package ArrayPractice;

public class CountZeros {
    public static void main(String[] args) {
        int n = 10000;
        if(n==0){
            System.out.println(1);
            return;
        }

        int ans = helper(n, 0);
        System.out.println(ans);
    }
    static int helper(int n, int count){
        if(n==0) return count;
        if(n%10==0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
