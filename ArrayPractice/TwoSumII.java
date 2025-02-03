package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
      int[] nums= new int[]{2,7,11,15};
        System.out.println("Ans : "+ Arrays.toString(twoSum(nums, 9)));
    }

  static public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        int start =0, end = nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]==target){
                ans[0]= start+1;
                ans[1]=end+1;
                return ans;
            }
            else if(nums[start]+nums[end]>target){
                end--;
            }
            else{
                start++;
            }
        }
        return ans;
    }

    public static class PrintMazePath {

        public static void main(String[] args) {
            ArrayList<String> ans= new ArrayList<>();
            path("", 3,3,ans);
            System.out.println(ans);
        }

        static  void path(String p, int row, int col, ArrayList<String> ans){
            if(row==1 && col==1){
                ans.add(p);
                return;
            }
            if(row>1){
                path(p+'R', row-1, col, ans);
            }
            if(col>1){
                path(p+'D', row, col-1, ans);
            }

        }
    }
}
