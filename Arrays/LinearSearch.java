public class LinearSearch{

    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return 0;
    }

    public static void main(String adsp[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int x= linearSearch(arr,0);
        if(x==0){
            System.out.println("Key not found in array");
        }
        else{
            System.out.println("Key found at index : "+x);
        }
    }
}