package BinaryTrees;

public class SubTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null){ //when both root and subroot reached the end which means everything returned true;
            return true;
        }
        else if(root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean checkRoot(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        //check the left side of the root, if all left return false then check rigth sides
        return checkRoot(root.left, subRoot) || checkRoot(root.right, subRoot);
    }
    public static void main(String[] args) {
        

        /*
            root 
                     1
                  /    \  
                 2       3
               /  \    /  \
              4    5  6    7

         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
            Sub root 
                2   
               /  \
              4    5  

         */
        
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(checkRoot(root, subRoot));
    }
}
