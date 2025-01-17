package ArrayPractice;

import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {

        int[] nums = new int[]{3,2,3};
        List<Integer> ans = majorityElement(nums);

        System.out.println(ans);
    }

   static public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n= nums.length;
        List<Integer>ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            if(entry.getValue()>n/3){
                ans.add(entry.getKey());
            }

        }
        return ans;
    }


}
