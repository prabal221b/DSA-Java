public class TilingProblems {
    public static int tilingWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        return tilingWays(n-1) + tilingWays(n-2);
    }
    public static void main(String[] ads){
        System.out.println(tilingWays(4));
    }
}
