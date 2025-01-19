package Backtracking;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i == n || j == n){
            return 0;
        }

        int rightWay = gridWays(i, j+1, n, m);
        int downWay = gridWays(i+1, j, n, m);
        
        return rightWay + downWay;

    }
    public static void main(String[] args) {
        int n = 4, m = 3;
        System.out.println(gridWays(0,0,n,m));
    }
}
