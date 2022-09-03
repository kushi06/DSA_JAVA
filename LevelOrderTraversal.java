import java.util.*;

public class LevelOrderTraversal {

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
        static int idx = -1;
        public Node BuildTree(int[] node){
            idx++;
            if(node[idx] == -1){
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = BuildTree(node);
            newNode.right = BuildTree(node);
            return newNode;

        }
    }

    public static void LevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
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
                System.out.print(curr.data +" ");
                if(curr.left != null){
                    q.add(curr.left);

                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static int count_no_of_nodes(Node root){
        if(root == null){
                return 0;
            }
            int leftnode = count_no_of_nodes(root.left);
            int rightnode = count_no_of_nodes(root.right);
            return leftnode+rightnode+1;
    }
    
    public static int sum_of_nodes(Node root){
        if(root == null){
                return 0;
            }
            int leftsum = sum_of_nodes(root.left);
            int rightsum = sum_of_nodes(root.right);
            return leftsum+rightsum+root.data;
    }
    public static void main(String[] args) {
        int[] node = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(node);

        LevelOrder(root);
        System.out.println(count_no_of_nodes(root));

        System.out.println(sum_of_nodes(root));
    }
    
}
