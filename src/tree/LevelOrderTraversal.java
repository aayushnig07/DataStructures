package DataStructures.src.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int item;
    public Node left, right;

    Node(int item) {
        this.item = item;
        this.left = this.right = null;
    }
}

class LevelOrderTraversal {

    Node root;

    LevelOrderTraversal() {
        root = null;
    }

    LevelOrderTraversal(int item) {
        root = new Node(item);
    }

    public void levelTraversal() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            // removes the head of the list
            Node tempNode = q.poll();
            System.out.println(tempNode.item);

            if (tempNode.left != null) {
                q.add(tempNode.left);
            }
            if (tempNode.right != null) {
                q.add(tempNode.right);
            }
        }

    }

    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.item);
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal n1 = new LevelOrderTraversal();
        n1.root = new Node(1);
        n1.root.left = new Node(2);
        n1.root.right = new Node(3);
        n1.root.left.left = new Node(4);
        System.out.println("Inorder");
        n1.inorderTraversal(n1.root);
        System.out.println("Level order");
        n1.levelTraversal();
    }
}