public class SubArrays {
    public static void printSubArrays(int[] arr) {
        int maxSum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum=0;
                for (int k = i; k <= j; k++) {
                    //System.out.print(arr[k] + " ");
                    currentSum = currentSum + arr[k];
                }
                //System.out.println();
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
            //System.out.println();
        }
        System.out.println("Max Subarray Sum is " +maxSum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        printSubArrays(arr);
    }
}
