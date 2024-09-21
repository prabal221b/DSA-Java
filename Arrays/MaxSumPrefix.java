public class MaxSumPrefix {
    public static void printMaxSubArrays(int[] arr){
        
        int[] prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];
        for(int i=1; i<arr.length;i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }
        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currentSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);


    }
    public static void main(String ads[]){
        int[] arr = { 1, -2, 6, -1, 3 };
        printMaxSubArrays(arr);
    }
}
