package ArrayPractice;

public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println("Ans : "+ maxArea(height));
    }

       static public int maxArea(int[] height) {
            int n = height.length;
            int start=0, end = n-1;

            int area = 0;

            while(start < end){
                int temp = (end - start) * Math.min(height[start], height[end]);
                area = Math.max(area, temp);
                if(height[start]<height[end]){
                    start++;
                }
                else {
                    end--;
                }

            }
            return area;
        }
}
