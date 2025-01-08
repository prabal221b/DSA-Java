package Queue;
import java.util.*;
public class InterleaveQueue {
    public static Queue<Integer> interleaveQueue(Queue<Integer> q){

        Queue<Integer> helper = new LinkedList<>();
        
        //finding the mid point of the queue
        int midPoint = q.size()/2;
        
        //moving the first half to the helper queue
        while(midPoint >0){
            helper.add(q.remove());
            midPoint--;
        }

        //while helper queue isnt empty, we first move helper queue's remove element and then main queue's remove element into the main queue
        while(!helper.isEmpty()){
            q.add(helper.remove());
            q.add(q.remove());
        }
        //returning the final queue
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        q = interleaveQueue(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
