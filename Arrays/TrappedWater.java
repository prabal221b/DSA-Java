public class TrappedWater {
    
    public static void maxTrappedWater(int[] arr){
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];

        leftMax[0] = arr[0];
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
            rightMax[arr.length-i-1] = Math.max(rightMax[arr.length-i],arr[arr.length-i-1]);
        }
        int trappedWater = 0;
        for(int i=0;i<arr.length;i++){
            trappedWater = trappedWater + (Math.min(leftMax[i],rightMax[i]) - arr[i]);
        }
        System.out.println("Max Rainwater is "+ trappedWater);
    }

    public static void main(String ads[]){
        int[] arr= {4,2,0,6,3,2,5};
        maxTrappedWater(arr);

    }
}
