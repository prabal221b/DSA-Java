public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 9, 10, 14, 17, 19, 25 };
        int end = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
