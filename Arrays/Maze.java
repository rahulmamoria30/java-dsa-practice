package Arrays;

public class Maze {

    public static void main(String[] args) {

        int row=3, col=3;
        int ans = count(row, col);
        System.out.println(ans);
    }
    static  int count(int row, int col){
        if(row==1 || col ==1){
            return 1;
        }
        return count(row-1, col)+count(row, col-1);
    }
}
