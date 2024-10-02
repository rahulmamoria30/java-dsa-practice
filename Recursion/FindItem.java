package Recursion;

public class FindItem {
    public static void main(String[] args) {
        int[] arr={12,23,42,43,23,65,67};
        boolean ans = findItem(arr, 0, 62);
        System.out.println(ans);

    }
    static boolean findItem(int[] arr, int i, int target){
        if(i==arr.length) return false;
//        if(arr[i]==target){
//            return 1;
//        }
        return arr[i]==target || findItem(arr, i+1, target);

    }
}
