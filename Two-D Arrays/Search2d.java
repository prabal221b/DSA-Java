public class Search2d {

    public static void search2d(int[][] arr, int key){
        int row=0;
        int col=arr[0].length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col] == key){
                System.out.println("Number found at ["+row+","+col+"]");
                return;
            }
            else if(arr[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Number not found in the array");
    }

    public static void main(String asds[]){
        int[][] arr={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        search2d(arr,33);
    }
}
