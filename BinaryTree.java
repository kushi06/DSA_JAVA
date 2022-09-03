public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }

    public static class PreBinarytree{
        static int idx = -1;
        public static Node buildtree(int node[]){
            idx++;
            if(node[idx] == -1){
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);
            return newNode;
        }
    }

    public static void main(String args[]) {
	// write your code here
        int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        PreBinarytree tree = new PreBinarytree();
        Node root = tree.buildtree(node);
        System.out.println(root.data);
    }
}
