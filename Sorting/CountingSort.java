public class CountingSort {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] reverseCountingSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        int[] countArray= new int[max+1];

        for(int i=0;i<arr.length;i++){
            countArray[arr[i]]++;
        }
        int j=0;
        for(int i=countArray.length-1;i>=0;i--){
            while(countArray[i]>0){
                arr[j]=i;
                j++;
                countArray[i]--;
            }
        }
        return arr;

    }

    public static int[] countingSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        int[] countArray= new int[max+1];

        for(int i=0;i<arr.length;i++){
            countArray[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<countArray.length;i++){
            while(countArray[i]>0){
                arr[j]=i;
                j++;
                countArray[i]--;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr= {5,4,1,3,2};
        print(countingSort(arr));
        System.out.println();
        print(reverseCountingSort(arr));
    }
}
