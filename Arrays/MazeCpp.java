package Arrays;

import java.util.ArrayList;

public class MazeCpp {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> ans = new ArrayList<>();
         help(0,0,n, "", ans);
        System.out.println(ans);
    }

    static public void help(int row, int col, int n, String s, ArrayList<String> ans ){

        if(row==n-1 && col==n-1){
            ans.add(s);
            return;
        }
        if(row<n){
            help(row+1, col, n, s+'D', ans);

        }
        if(col<n){
            help(row, col+1, n, s+'R', ans);
        }

    }
}
