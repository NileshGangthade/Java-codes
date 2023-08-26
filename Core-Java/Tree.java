import java.util.Scanner;

class Node7 {
    public int data;
    public Node7 left;
    public Node7 right;

    public Node7(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class TreeEx {
    private Node7 root;

    public TreeEx() {
        root = null;
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private Node7 insertNode(Node7 curt, int data) {
        if (curt == null) {
            return new Node7(data);
        }
        if (data < curt.data) {
            curt.left = insertNode(curt.left, data);
        } else if (data > curt.data) {
            curt.right = insertNode(curt.right, data);
        }
        return curt;
    }

    public void inOrder() {
        inOrderTravalse(root);
        System.out.println();
    }

    public void inOrderTravalse(Node7 curt) {
        if (curt != null) {
            inOrderTravalse(curt.left);
            System.out.println(curt.data);
            inOrderTravalse(curt.right);
        }
    }
}

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeEx obj = new TreeEx();
        System.out.println("Enter the node: ");
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());
        obj.inOrder();
    }
}
