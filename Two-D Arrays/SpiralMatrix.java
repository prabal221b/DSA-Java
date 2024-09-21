public class SpiralMatrix{

    public static void printSpiral(int[][] arr){
        int endCol = arr.length-1;
        int endRow=arr[0].length-1;
        int startCol=0;
        int startRow=0;
        
        while(startRow<=endRow && startCol <= endCol){
            //top
            for(int i=startCol;i<=endCol;i++){
                System.out.print(arr[startRow][i]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }
            //bottom
            for(int i=endCol-1;i>=startCol;i--){
                
                System.out.print(arr[endRow][i]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }
            startRow++; endRow--; startCol++; endCol--;
        }

    }
    public static void main(String asds[]){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(arr);
    }
}