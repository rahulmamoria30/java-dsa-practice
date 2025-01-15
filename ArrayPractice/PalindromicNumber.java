package ArrayPractice;

import static ArrayPractice.ReverseNumber2.helper;

public class PalindromicNumber {
    public static void main(String[] args) {
        int n = 123321;
        int reverse = helper(n, 0);
        System.out.println(n==reverse);
    }

}
