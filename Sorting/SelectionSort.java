public class SelectionSort {

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] selectionSort(int[] arr){
        int pos=0;
        
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minPos]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[pos];
            arr[pos]=temp;
            pos++;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr= {5,4,1,3,2};
        print(selectionSort(arr));
    }
}
