package Queue;
import java.util.*;

public class StackQueueUsingDeque {

    static class Stack{
        Deque<Integer> dq = new LinkedList<>();
        
        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public  void push(int data){
            dq.addLast(data);
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty, returning -1");
                return -1;
            }
            
            return dq.removeLast();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty, returning -1");
                return -1;
            }
            return dq.getLast();
        }

    }

    static class Queue{
        Deque<Integer> dq = new LinkedList<>();
        
        public boolean isEmpty(){
            return dq.isEmpty();
        }
        

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Stack is empty, returning -1");
                return -1;
            }
            return dq.removeFirst();
            
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty, returning -1");
                return -1;
            }
            return dq.getFirst();
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        Queue q = new Queue();

        for(int i=1;i<6;i++){
            s.push(i);
            q.add(i);
        }

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println();
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

        
    }
}
