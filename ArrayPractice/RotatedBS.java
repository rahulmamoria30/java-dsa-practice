package ArrayPractice;

public class RotatedBS {
    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,1,2,3};
        int index = binraySearch(arr,0, arr.length-1,8);
        System.out.println(index);
    }
    static int binraySearch(int[] arr, int start, int end, int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target) return mid;

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target<=arr[mid])
               return binraySearch(arr, start, mid -1, target);
            else
               return binraySearch(arr, mid +1, end , target);
        }
        else{
            if(target>=arr[mid] && target<=arr[end]){
              return  binraySearch(arr, mid + 1, end , target);
            }
            else
              return  binraySearch(arr, start, mid -1, target);

        }
    }
}
