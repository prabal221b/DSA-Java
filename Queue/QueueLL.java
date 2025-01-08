package Queue;

public class QueueLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    

    static class Queue{
        static Node head = null;
        static Node tail = null;
        
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }


        public static void add(int data){
            Node newNode = new Node(data);
            if( head == null){
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
            
            
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty, nothing to remove");
                return -1;
            }
            int front = head.data;

            if(tail == head){
                head = tail = null;
            }
            else{
                head = head.next;
            }
            
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty,returning -1");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        

        while(!q.isEmpty()){
            System.out.println("Peek "+q.peek());
            System.out.println("Removed "+q.remove());
           
        }

    }
}
