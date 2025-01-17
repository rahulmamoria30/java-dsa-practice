package ArrayPractice;

public class UniquePaths {
    public static void main(String[] args) {
        int ans = findUniquePath(3,3);
        System.out.println("Total unique paths : "+ ans);
    }

    public static int solve(int m, int n, int[][] dp){

        if(m==0 || n==0) return 1;

        if(dp[m][n]!=-1) return dp[m][n];

        dp[m][n]= solve(m-1, n, dp) + solve(m, n-1, dp);
        return dp[m][n];
    }
     public  static int  findUniquePath(int m, int n){
        int[][]  dp = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j]=-1;
            }
        }

        return solve(m-1, n-1, dp);
    }
}
