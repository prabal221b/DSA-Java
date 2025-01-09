package Queue;
import java.util.*;
public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> q){
        if(q.size() == 0){
            System.out.println("Empty Queue");
            return;
        }
        
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        reverseQueue(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

        
    }
}
