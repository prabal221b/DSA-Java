package BinaryTrees;

public class PreorderBuildTree {

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
    
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void preorderPrint(Node node){
        if(node == null){
            //System.out.print(-1+" "); //to print -1 to print the initial pre-order array
            return;
        }

        System.out.print(node.data+" ");
        preorderPrint(node.left);
        preorderPrint(node.right);
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        Node root = BinaryTree.buildTree(nodes);
        preorderPrint(root);
    }
}
