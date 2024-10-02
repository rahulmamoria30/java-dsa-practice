package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringsPractice {

    public static void main(String[] args) {
        String name = "Rahul";

        int[] arr = {2,3,4,5,6};
        arr[0]=23;
        System.out.println(Arrays.toString(arr));

        concat(name);
        System.out.println(name);
    }
    static void concat(String name){
        name = name + " Mamoria";
//        System.out.println(name);
    }
}
