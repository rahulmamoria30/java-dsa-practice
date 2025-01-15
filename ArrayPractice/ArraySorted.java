package ArrayPractice;

public class ArraySorted {
    public static void main(String[] args) {

        int[] arr={1};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }
    static  boolean isSorted(int[] arr, int i){
        if(i==arr.length-1) return true;
//        if(arr[i]<arr[i+1]){
//           return isSorted(arr, i+1);
//        }
        return arr[i]<arr[i+1] && isSorted(arr, i+1);
    }
}
