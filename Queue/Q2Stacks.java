package Queue;
import java.util.*;

public class Q2Stacks {
    static class Queue{
        Stack<Integer> s1 =new Stack<>();
        Stack<Integer> s2 =new Stack<>();
        
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){
            if(!s1.isEmpty()){
                return s1.pop();
            }
            else{
                System.out.println("Queue is empty, returning -1");
                return -1;
            }
        }
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public int peek(){
            if(!s1.isEmpty()){
                return s1.peek();
            }
            else{
                System.out.println("Queue is empty, returning -1");
                return -1;
            }
        }
    }

    static class QueueB{
        Stack<Integer> s1 =new Stack<>();
        Stack<Integer> s2 =new Stack<>();
        
        public void add(int data){
            s1.push(data);
        }

        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty, returning -1");
                return -1;
            }
            else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                int val = s2.pop();
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
                return val;
            }
        }


        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty, returning -1");
                return -1;
            }
            else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                int val = s2.peek();
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
                return val;
            }
        }
    }
    public static void main(String[] args){
        QueueB q= new QueueB();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println("Q peek "+q.peek());
            System.out.println("Q removed "+q.remove());
        }

    }
}
