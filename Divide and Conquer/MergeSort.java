public class MergeSort{
    public static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        
        mergeSort(arr,si,mid); //left
        mergeSort(arr, mid+1,ei); //right

        merge(arr,si,mid,ei);
    }
    public static void merge(int[] arr,int si,int mid, int ei){
        int[] tempArr=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                tempArr[k++] = arr[i++];
            }
            else{
                tempArr[k++] = arr[j++];
            }
        }

        while(i<=mid){
            tempArr[k++] = arr[i++];
        }
        while(j<=ei){
            tempArr[k++] = arr[j++];
        }

        for(k=0,i=si;k<tempArr.length;k++,i++){
            arr[i]=tempArr[k];
        }

    }
    public static void main(String[] ads){
        int[] arr= {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}