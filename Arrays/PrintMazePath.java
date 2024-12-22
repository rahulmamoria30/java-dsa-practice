package Arrays;

import java.util.ArrayList;

public class PrintMazePath {

    public static void main(String[] args) {
        ArrayList<String> ans= new ArrayList<>();
        path("", 3,3,ans);
        System.out.println(ans);
    }

    static  void path(String p, int row, int col, ArrayList<String> ans){
        if(row==1 && col==1){
            ans.add(p);
            return;
        }
        if(row>1){
            path(p+'R', row-1, col, ans);
        }
        if(col>1){
            path(p+'D', row, col-1, ans);
        }

    }
}
