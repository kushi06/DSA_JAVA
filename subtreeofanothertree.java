public class subtreeofanothertree {

    static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.left = null;
            this.right = null;
            this.data= data;
        }
    }
    static class Tree{
        static int idx = -1;
        public Node buildTree(int[] node){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;

        }
    }

    static class Subtree{
        static int idx = -1;
        public Node buildTree1(int[] node2){
            idx++;
            if(node2[idx]==-1){
                return null;
            }
            Node newNode = new Node(node2[idx]);
            newNode.left = buildTree1(node2);
            newNode.right = buildTree1(node2);
            return newNode;

        }
    }

    public static boolean isSubtree(Node root, Node subroot){
        if(subroot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subroot)){
            return true;
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static boolean isIdentical(Node root, Node subroot){
        if(root == null && subroot == null){
            return true;
        }
        if(root == null || subroot == null){
            return false;
        }
        if(root.data == subroot.data){
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
    }



    public static void main(String[] args) {
        int[] node = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree tree = new Tree();
        Node root = tree.buildTree(node);

        int[] node2 = {2,4,-1,-1,5,-1,-1};
        Subtree Stree = new Subtree();
        Node subroot = Stree.buildTree1(node2);

        System.out.println(isSubtree(root, subroot));
    }
    
}
