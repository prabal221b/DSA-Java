public class BinarySearch {
    public static int binarySearch(int[] arr, int start, int end, int key) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 9, 10, 14, 17, 19, 25, 28 };
        int end = arr.length-1;
        int x = binarySearch(arr, 0, end, 9);
        if (x!= -1) {
            System.out.println("Key found at index : " + x);
            
        } else {
            System.out.println("Key not found in array");
        }
    }
}
