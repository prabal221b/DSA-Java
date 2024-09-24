public class Occurance {
    public static int firstOccurance(int[] arr, int n, int key){
        if(n==arr.length){
            return -1;
        }
        if(arr[n]==key){
            return n;
        }
        return firstOccurance(arr, n+1, key);
        
    }
    public static int lastOccurance(int[] arr, int n, int key){
        if(n==-1){
            return -1;
        }
        if(arr[n]==key){
            return n;
        }
        return firstOccurance(arr, n-1, key);
        
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,1,2,3,4,1,6};
        System.out.println("First occurance of number 1 is at key "+firstOccurance(arr,0, 7));
        System.out.println("Last occurance of number 1 is at key "+lastOccurance(arr,arr.length-1, 7));
    }
}
