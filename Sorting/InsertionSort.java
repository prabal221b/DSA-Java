public class InsertionSort {

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j = i;
            int temp=arr[i];
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr= {5,4,1,3,2};
        print(insertionSort(arr));
    }
}
