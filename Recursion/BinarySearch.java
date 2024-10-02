package Recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 2, 4 ,6,7, 8, 9, 10, 12, 13};
        int ans = binarySearch(0, arr.length-1, arr, 223);
        System.out.println(ans);

    }

    static int binarySearch(int start, int end, int[] arr, int target){

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
              return  binarySearch(mid + 1, end, arr, target);
            }
            else if(target < arr[mid]){
               return binarySearch(start, mid-1, arr, target);
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int binarySearch1(int start, int end, int[] arr, int target){

        if(end < start) return -1;

        int mid = start+(end-start)/2;

        if(target>arr[mid]){
            return binarySearch(mid+1, end, arr, target);
        }
        else if(target<arr[mid]){
            return binarySearch(start, mid-1, arr, target);
        }
        return mid;
    }
}
