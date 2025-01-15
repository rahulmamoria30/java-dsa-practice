package ArrayPractice;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class ThreeIndexes {

    public static int[] helper(int[] nums){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        int indexMax1=-1, indexMax2=-1, indexMax3=-1;

        int indexMin1=-1, indexMin2=-1;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max1){
                max3=max2;
                indexMax3=indexMax2;
                max2=max1;
                indexMax2=indexMax1;
                max1=nums[i];
                indexMax1=i;

            }
            else if(nums[i]>max2){
                max3=max2;
                indexMax3=indexMax2;
                max2=nums[i];
                indexMax2=i;
            }
            else if(nums[i]>max3){
                max3=nums[i];
                indexMax3=i;
            }


            if(nums[i]<min1){
                min2=min1;
                indexMin2=indexMin1;

                min1=nums[i];
                indexMin1=i;
            }

            else if(nums[i]<min2){
                min2=nums[i];
                indexMin2=i;
            }
        }

        int product1=max1*max2*max3;
        int product2 =max1*min1*min2;

        if(product1>product2){
            return new int[]{indexMax1,indexMax2,indexMax3};
        }
        else{
            return new int[]{indexMax1,indexMin1,indexMin2 };
        }
    }
    public static void main(String[] args) {

        int[] nums={-5,-4,-3,-2};
        int[] ans = helper(nums);
        System.out.println("ans " + Arrays.toString(ans));
    }
}