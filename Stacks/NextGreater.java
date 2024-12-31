package Stacks;

import java.util.Stack;

public class NextGreater {
    public static int[] nextGreater(int arr[]){
        int helper[] = new int[arr.length];
        Stack<Integer> s= new Stack<>();
        

        //start from the end of the array
        for (int i=arr.length-1; i>=0;i--){

            //check if the element is greater than the stack's top element, and that the stack isnt empty
            while(!s.isEmpty() && arr[i]>=s.peek()){
                //remove the element if it is smaller than the element in hand, until there is nothing left
                s.pop();
            }
            //check if the stack is empty
            if(s.isEmpty()){
                //if it is empty then the element in hand is the greatest element to the right  and store -1 to signify that
                helper[i] = -1;

            }
            //if the stack isn't empty which means there is a greater element present
            else{
                //store that element in the array
                helper[i] = s.peek();
                
            }
            //push the element in hand inside the stack
            s.push(arr[i]);
        }

        return helper;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = nextGreater(arr);
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i]+" ");
        }
    }
}
