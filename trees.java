public class trees {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static  Node root;
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public static Node insertRecursive(Node root, int data){
        if(root==null) {
            root =new Node(data);
            return root; 
        }
        if(data<root.data){
            root.left=insertRecursive(root.left, data);
        }
        else{
            root.right=insertRecursive(root.right, data);
        }
        return root;

    }
    public static void insert(int value){
        root=insertRecursive(root,value);
    }
    public static Node search(int data, Node root){
        if (root == null || root.data == data)
            return root;
        if (data < root.data)
                return search(data, root.left);
        return search(data, root.right);
    }
    public static int maxNode(Node root){
        Node max=root;
        while(max.right!=null){
            max=max.right;
        }
        return max.data;
    }
    public static int minNode(Node root){
        Node min=root;
        while(min.left!=null){
            min=min.left;
        }
        return min.data;
    }
    public static int height(Node root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        // if (lh > rh)
        //         return (lh + 1);
        //     else
        //         return (rh + 1);
        return Math.max(lh,rh)+1;
    }
    public static boolean balanceTree(Node root){
        int lh=height(root.left);
        int rh=height(root.right);
        if(root==null) return true;
        if(Math.abs(lh-rh)>1) return false;
        return balanceTree(root.left) && balanceTree(root.right);
    }
    public Node deleteNode(int key,Node root) {
        if(root==null) {
            return root;
        }
        else {
            if(key<root.data) {
              root.left=deleteNode(key,root.left);
            }
            else if(key>root.data) {
                root.right=deleteNode(key,root.right);
            }
            else {
                if(root.left==null) {
                    return root.right;
                }
                else if(root.right==null) {
                    return root.left;
                }
                Node tmp=minNode(root.right);
                root.data=tmp.data;
                root.right=deleteNode(tmp.data,root.right);
            }
        }
        return root;
        
    }
    public static void main(String[] args) {
        root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // inOrderTraversal(root);
        // preOrder(root);
        // postOrder(root);
        // insert(1);
        // insert(2);
        // insert(3);
        // insert(4);
        // insert(5);
        // insert(6);
        // Node b= search(2, root);
        // if(b==null) {System.out.println("not found");}
        // else{ System.out.println("found");}
        System.out.println(maxNode(root));
        System.out.println(minNode(root));
        // System.out.println("Height/Depth of Tree is: "+height(root));
        // System.out.println(balanceTree(root));
    }
}
