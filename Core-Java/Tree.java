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
    public void preOrder(){
        preOrdederTraverse (root);
        System.out.println();
    }

    public void preOrdederTraverse(Node7 curt){

        if (curt != null) {

            System.out.println(curt.data);
            preOrdederTraverse(curt.left);
            preOrdederTraverse(curt.right);
        }
    }

    public void postOrder(){
        postOrdederTraverse (root);
        System.out.println();
    }

    public void postOrdederTraverse(Node7 curt){

        if (curt != null) {
           postOrdederTraverse(curt.left);
            postOrdederTraverse(curt.right);
            System.out.println(curt.data);
        }
    }

    public boolean search (int data){
        if (searchNode (root, data)){
            return true;
        }
        else return false;
    }

    public boolean searchNode (Node7 curt , int data){

        boolean result = false;
        if ( curt == null ){
            return false;
        }
        if (curt.data == data ){
            return true;
        }
        if ( data < curt.data ){
            result = searchNode(curt.left, data);
        }
        else if ( data > curt.data ){
            result = searchNode(curt.right, data);
        }

        return result ;

    }
}

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeEx obj = new TreeEx();
        System.out.println("Enter the node: ");

        System.out.print("Enter the number of nodes : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
             obj.insert(sc.nextInt());
        }
        
        System.out.println("in order traverse : ");
        obj.inOrder();
        System.out.println( "Pre Oreder traverse : ");
        obj.preOrder();

        System.out.println("Post Order traverse : ");
        obj.postOrder();

        System.out.print("Enter the element : ");
        System.out.println(obj.search(sc.nextInt()));
    }
}
