package DataStructures.src.tree;


//Binary Tree
class SimpleTreeCreation {
    //root of node
    Node root;


    SimpleTreeCreation(){
        root=null;
    }

    SimpleTreeCreation(int item){
        root = new Node(item);
    }

    public void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.println(root.item);
            inorderTraversal(root.right);
        }
    }

    public static void main(String[]args) {
        SimpleTreeCreation n1 = new SimpleTreeCreation();
        n1.root=new Node(1);
        n1.root.left=new Node(2);
        n1.root.right = new Node(3);
        
        n1.inorderTraversal(n1.root);
        
    }

}

class Node {

    public int item;
    public Node left, right;

    Node(int item) {
        this.item = item;
        this.left = this.right = null;
    }
}