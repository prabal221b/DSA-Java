public class LLMergeSort {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

        //step 1 : create a new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 : linking newNode to head's address
        newNode.next = head;

        //step 3 : making the new node as head
        head = newNode;
    }


    public void addLast(int data){
        //step 1 : create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 : linking tail to newNode's address
        tail.next = newNode;

        //step 3 : making the new node as tail
        tail = newNode;
    }

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

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //our mid 
    }

    public Node merge(Node leftHead, Node rightHead){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (leftHead != null && rightHead != null){
            if(leftHead.data <= rightHead.data){
                temp.next = leftHead;
                temp = leftHead;
                leftHead = leftHead.next;
            }
            else{
                temp.next = rightHead;
                temp = rightHead;
                rightHead = rightHead.next;
            }
        }
        while(leftHead != null){
            temp.next = leftHead;
            temp = leftHead;
            leftHead = leftHead.next;
        }
        while(rightHead != null){
            temp.next = rightHead;
            temp = rightHead;
            rightHead = rightHead.next;           
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        //find the mid value
        Node midNode = findMid(head);

        //make the next to mid value as right head and detach the mid with the right head
        Node rightHead = midNode.next;
        midNode.next = null;

        //recursive calls for left and right  heads
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //call the merge function to sort and merge the left and right heads
        return merge(newLeft, newRight);
    }

    public void zigZag(Node head){
        if(head == null || head.next == null){
            return;
        }

        Node midNode = findMid(head); //find mid
        
        //reverse the second half
        Node curr = midNode.next;
        midNode.next = null;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;

        //merge zigzag
        Node nextL, nextR;

        while(leftHead != null && rightHead != null){
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;
            
            leftHead = nextL;
            rightHead = nextR;

        }
    }     
    public static void main(String ad[]){
        LLMergeSort ll = new LLMergeSort();
        ll.addFirst(12);
        ll.addFirst(6);
        ll.addFirst(10);
        ll.addFirst(8);
        ll.addFirst(22);
        ll.addFirst(11);
        ll.addFirst(9);
        ll.print();
        
        
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        ll.zigZag(head);
        ll.print();



    }
}
