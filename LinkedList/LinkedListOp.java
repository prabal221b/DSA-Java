public class LinkedListOp {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public void print(){

        if(head == null){
            System.out.println("LL is empty!");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void breakCycle(){
        Node slow = head;
        Node fast = head;
        
        //detect if cycle exist 
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Cycle does not exist");
            return;
        }


        //find meeting point of slow and fast
        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
            
        }

        //break the cycle
        prev.next = null;
        
    }
    public static void main(String args[]){
        LinkedListOp ll = new LinkedListOp();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        System.out.println(isCycle());
        breakCycle();
        System.out.println(isCycle());
        ll.print();
        
    }
}
