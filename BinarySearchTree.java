public class BinarySearchTree {

    static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //leftsubtree
            root.left = insert(root.left, val);
        }
        else{
            //rightsubtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data +" ");
        Inorder(root.right);

    }
     public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;
        
        for (int i=0; i < values.length ; i++) {
            root = insert(root, values[i]);
        }
        
        Inorder(root);
        System.out.println();
        
        if(search(root, 4)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
     
        }
    }
    
}
