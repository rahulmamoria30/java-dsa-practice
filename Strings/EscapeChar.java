//package Strings;
//
//public class EscapeChar {
//    public static void main(String[] args) {
//        String str = "cebfnefvbhehehc";
//        char c ='c';
//        String ans = helper(str, "", 0,  c);
//        System.out.println(ans);
//    }
//    static  String helper(String str, String ans, int index, char c){
//        if(index == str.length()) return ans;
//
//        if(str.charAt(index)==c){
//           return helper(str, ans, index+1, c);
//        }
//        return helper(str, ans+str.charAt(index), index+1, c);
//    }
//}
//

/// skip a string

package Strings;

public class EscapeChar {
    public static void main(String[] args) {
        String str = "cebfnefvbhehehc";
        String sectionToSkip = "hehe";
        String ans = helper(str, "", 0, sectionToSkip);
        System.out.println(ans);
    }

    static String helper(String str, String ans, int index, String sectionToSkip) {

        if (index == str.length()) return ans;

        if (index + sectionToSkip.length() <= str.length() && str.substring(index, index + sectionToSkip.length()).equals(sectionToSkip)) {
            return helper(str, ans, index + sectionToSkip.length(), sectionToSkip);
        }

        return helper(str, ans + str.charAt(index), index + 1, sectionToSkip);
    }
}
