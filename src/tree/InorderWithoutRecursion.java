package tree;

import java.util.Stack;

class Node {
    public int item;
    public Node left, right;

    Node(int item) {
        this.item = item;
        this.left = this.righ = null;
    }
}

class InorderWithoutRecursion {
    // idea is to use a stack

    Node root;

    InorderWithoutRecursion() {
        root = null;
    }

    InorderWithoutRecursion(int item) {
        root = new Node(item);
    }

    Stack<Node> s = new Stack<>();

    public void check() {

        if (root == null) {
            return;
        }

        Node curr = root;
        while (curr != null || s.size() > 0) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.println(curr.item);
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        InorderWithoutRecursion n1 = new InorderWithoutRecursion();
        n1.root = new Node(1);
        n1.root.left = new Node(2);
        n1.root.right = new Node(3);
        n1.root.left.left = new Node(4);
        n1.check();
    }
}