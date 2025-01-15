package ArrayPractice;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = new int[]{6,5,5};
        System.out.println(Majority(nums));

    }


    static public int Majority(int[] nums){
        int n = nums.length;

        int majority = nums[0];
        int count =1;
        for(int i=1; i<n; i++){
            if(count == 0){
                majority= nums[i];
            }

            count += (majority==nums[i]) ? 1 : -1;
        }

        return majority;
    }

}
