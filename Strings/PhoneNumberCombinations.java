package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumberCombinations {
    public static void main(String[] args) {
        String digits = "23";

        HashMap<Character, String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");

        List<String> combinations = new ArrayList<>();

        if (!digits.isEmpty()) {
            solve(digits.length(), 0, "", mp, digits, combinations);
        }

        System.out.println(combinations);
    }

    static void solve(int n, int idx, String currentCombination, HashMap<Character, String> mp, String digits, List<String> ans) {
        if (idx == n) {
            ans.add(currentCombination);
            return;
        }

        String letters = mp.get(digits.charAt(idx));

        for (int i = 0; i < letters.length(); i++) {

            solve(n, idx + 1, currentCombination + letters.charAt(i), mp, digits, ans);
        }
    }
}
