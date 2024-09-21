public class KadanesSum {
    public static void printMaxSubArrays(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0;i<arr.length;i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            System.out.print("Current Sum "+currentSum);
            // currentSum = currentSum + arr[i];
            // if(currentSum<0){
            //     currentSum = 0;
            // }
            maxSum = Math.max(currentSum, maxSum);
            System.out.print(" Max Sum "+maxSum);
            System.out.println();
        }
        System.out.println("Max Sum is "+maxSum);
    }
    public static void main(String ads[]){
        int[] arr = { -1, -2, 6, -1, 3 };
        printMaxSubArrays(arr);
    }
}
