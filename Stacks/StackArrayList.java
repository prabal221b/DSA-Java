package Stacks;
import java.util.ArrayList;

public class StackArrayList {
    static class Stack{
        static ArrayList<Integer> stack = new ArrayList<>();

        public static boolean isEmpty(){
            return stack.size() == 0;
        }

        public static void push(int data){
            stack.add(data);
        }

        public static int pop(){
            if(stack.isEmpty()){
                System.out.println("Stack is empty, returning -1");
                return -1;
            }
            int top = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }

        public static int peek(){
            if(stack.isEmpty()){
                System.out.println("Stack is empty, returning -1");
                return -1;
            }
            return stack.get(stack.size()-1);
        }
    }

    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
