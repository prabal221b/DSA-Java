public class LinkedList{
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

    public void addMiddle(int data, int idx){
        if (idx ==0){
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty, nothing to delete");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList is empty, nothing to delete");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int i = 0;
        Node prev = head;
        while(i < size-2){
            prev = prev.next;
            i++;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int helperSearch(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helperSearch(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helperSearch(head , key);
    }

    public void reverse(){
        if(size == 0 || size == 1){
            return;
        }
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
    }

    public void deleteNthNodefromEnd(int idx){
        //calculate size of LL
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        //if Nth node from end is the head node 
        if(sz == idx){
            head = head.next;
            return;
        }

        //deleteing n'th node from end
        int i=1;
        int iToFind = sz - idx;
        Node prev = head;

        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrom(){

        if(head == null || head.next == null){
            return true;
        }
        //step 1 find mid node
        Node midNode = findMid(head);

        //reverse second half 
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        Node right = prev;
        Node left = head;

        //compare both first half and reversed second half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        
        ll.addFirst(2);
        
        ll.addFirst(1);
        
        ll.addLast(2);
        
        ll.addLast(1);
        

        ll.addMiddle(3, 2);
        // ll.print();
        // System.out.println("Size of LinkedList is "+LinkedList.size);

        // int searchResult = ll.recSearch(3);
        // if(searchResult!=-1){
        //     System.out.println("Key found at index "+searchResult);
        // }
        // else{
        //     System.out.println("Key not found in LL!");
        // }

        // System.out.println(ll.removeFirst());
        // ll.print();
        // System.out.println("New Size of LinkedList is "+LinkedList.size);

        // System.out.println(ll.removeLast());
        // ll.print();
        // System.out.println("New Size of LinkedList is "+LinkedList.size);

        //ll.reverse();
        //ll.print();
        //ll.deleteNthNodefromEnd(2);
        ll.print();
        System.out.println(ll.isPalindrom());
    }
}