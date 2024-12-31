package Stacks;
import java.util.Stack;

public class StackColl {

    public static void pushAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }

        int top = stack.peek();
        stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    public static String reverseString(Stack<Character> s){
        
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()){
            sb.append(s.peek());
            s.pop();
        }
        return sb.toString();

    }

    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.peek();
        s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void main(String args[]){
        StackColl s = new StackColl();
        Stack<Character> c = new Stack<>();
        Stack<Integer> stack = new Stack<>();

        String x = "abc";
        for(int i=0;i<x.length();i++){
            c.push(x.charAt(i));
        }
        System.out.println(StackColl.reverseString(c));

        stack.push(1);
        stack.push(2);
        stack.push(3);

        s.pushAtBottom(stack, 4);
        s.reverseStack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
            
        }
    }
}
