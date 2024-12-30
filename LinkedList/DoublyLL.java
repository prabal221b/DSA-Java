public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int  deleteFirst(){
        if(head == null){
            System.out.println("nothing to delete");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev= null;
        return val;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;      
    }

    public int  deleteLast(){
        if(head == null){
            System.out.println("nothing to delete");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public void print(){
        Node temp = head;
        System.out.print("null<->");
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        if(head == null || head.next == null){
            return;
        }
        Node curr = tail = head;
        Node prev = null;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
    public static void main(String args[]){
        DoublyLL dll = new DoublyLL();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);

        dll.print();
        dll.reverse();
        dll.print();


        System.out.println("Deleted value "+ dll.deleteFirst());
        dll.print();
        System.out.println("Deleted Value "+dll.deleteLast());
        dll.print();


    }
}
