package BinaryTrees;
import java.util.*;

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
    
    public static void inorderPrint(Node node){
        if(node == null){
            return;
        }
        inorderPrint(node.left);
        System.out.print(node.data+" ");
        inorderPrint(node.right);
    }

    public static void postorderPrint(Node node){
        if(node == null){
            return;
        }
        postorderPrint(node.left);
        postorderPrint(node.right);
        System.out.print(node.data+" ");
        //sum += node.data;
    }

    public static void levelorderPrint(Node node){
        if(node == null){
            System.out.println("Tree is empty");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static int height(Node node){
        //check if the root node is null which means there is no tree
        if(node == null){
            return 0;
        }
        int lh = height(node.left); //recursing for left half
        int rh = height(node.right); //recursing for right half
        return Math.max(lh,rh) + 1; //returning the maximum of left or right + 1 for the step taken from child to parent node
    }

    public static int countNodes(Node node){
        //check if the root node is null which means there is no tree or we have reached the end
        if(node == null){
            return 0;
        }
        int leftCount = countNodes(node.left); //recursing for left half
        int rightCount = countNodes(node.right); //recuridng for right half
        return leftCount + rightCount + 1;
    }

    public static int sumNodes(Node node){
        if(node == null){
            return 0;
        }
        int leftSum = sumNodes(node.left);
        int rightSum = sumNodes(node.right);
        return leftSum + rightSum + node.data;
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        Node root = BinaryTree.buildTree(nodes);
        preorderPrint(root);
        System.out.println();
        inorderPrint(root);
        System.out.println();
        postorderPrint(root);
        System.out.println();
        levelorderPrint(root);
        System.out.println("Height of the tree is "+height(root));
        System.out.println("Total present nodes are "+countNodes(root));
        System.out.println("Sum is "+sumNodes(root));
    }   
}
