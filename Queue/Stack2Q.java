package Queue;
import java.util.*;

public class Stack2Q {
    static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data){
            if(q2.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        public int pop(){
            int top = -1;
            if(isEmpty()){
                System.out.println("Stack is Empty, returning -1");
                return top;
            }   

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
                
            }
            return top;
        }

        public int top(){
            int top = -1;
            if(isEmpty()){
                System.out.println("Stack is Empty, returning -1");
                return top;
            } 
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
                
            }
            return top;
        }
    }

    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()){
            System.out.println("Top  "+stack.top());
            System.out.println("Removed "+stack.pop());
        }
    }
}
