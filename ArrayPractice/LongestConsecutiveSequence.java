package ArrayPractice;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
       int[] nums = new int[]{100, 4, 200, 3, 2, 1, 50};
       int result =longestConsecutive(nums);
        System.out.println("ans : "+result);
    }

   static public boolean ls(int[] nums, int x){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==x) return true;
        }
        return false;
    }
   static public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int ans =1;
        for(int i=0; i<n; i++){
            int x = nums[i];
            int count =1;
            while(ls(nums, x+1)==true){
                count++;
                x++;
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
