package Strings;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<>();
        helper(str, 0, "", list);
        System.out.println(list);
        System.out.println(list.size());


    }

    static void helper(String str, int index, String ans,  List<String> list){
        if(index == str.length()) {
           list.add(ans);
            return;
        }

        helper(str, index+1, ans + str.charAt(index), list);
        helper(str, index+1, ans, list);

    }
}
