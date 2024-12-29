public class RotatedArraySearch {
    public static int rotatedBinarySearch(int[] arr, int si, int ei, int key){
        if(si>=ei){
            return -1;
        }
        int mid = si+ (ei-si)/2;
        if(arr[mid]==key){
            return mid;
        }
        //if it is on line 1
        if(arr[si]<=arr[mid]){
            if(arr[si] <= key && key <= arr[mid]){
                return rotatedBinarySearch(arr, si, mid, key); //left search of l1
            }
            else{
                return rotatedBinarySearch(arr, mid+1, ei, key); //entire right
            }
        }
        //line 2
        else{
            if(arr[mid+1]<= key && key <= arr[ei]){
                return rotatedBinarySearch(arr, mid+1, ei, key); //right search of l2
            }
            else{
                return rotatedBinarySearch(arr, si, mid, key); //entire left
            }
        }
    }
    public static void main(String[] ads) {
        int[] arr = {4,5,6,7,0,1,2};
        int idx = rotatedBinarySearch(arr, 0 , arr.length-1,0);
        if(idx!=-1){
            System.out.println("Key found at index "+idx);
        }
        else{
            System.out.println("Key not found");
        }
        
    }
    
}
