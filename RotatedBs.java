public class RotatedBs {

    public static void main(String[] args) {

        int[] arr={4,5,6,7,8,0,1,2};
        int k = findPivot(arr);
        System.out.println("Peak index : " + k);
    }

    static  int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
 
        while(start <= end){
            int mid = start + (end-start)/2;


            if(mid+1 <= end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid-1>=start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
