package tree;

class Node {
    public int item;
    public Node left, right;

    Node(int item) {
        this.item = item;
        this.left = this.right = null;
    }
}

class DeleteNode{
    Node root;

    DeleteNode(){
        root=null;
    }

    DeleteNode(int item){
        root = new Node(item);
    }

    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.item);
            inorderTraversal(root.right);
        }
    }

    public Node returnRightMostNode(){
        Node tempNode;
        

        return tempNode;
    }

    public void deleteNode(int deleteItem){

    }


    public static void main(String[]args){
        DeleteNode n1 = new DeleteNode();
        n1.root = new Node(1);
        n1.root.left = new Node(2);
        n1.root.right = new Node(3);
        n1.root.left.left = new Node(4);
    }
}