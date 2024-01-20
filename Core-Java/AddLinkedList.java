

class LInkedList {
    public Node7 head;

    public LInkedList() {
        this.head = null;
    }
class Node7 {
    public int data;
    public Node7 next;

    public Node7(int data) {
        this.data = data;
        this.next = null;
    }
}
    public void insertNode(int data) {
        Node7 newNode = new Node7(data);

        if (head == null) {
            head = newNode;
        } else {
            Node7 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;  // Fixed this line
        }
    }

    public void printLL() {
        Node7 temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next; // Fixed this line
            }
            System.out.print("Null");
        }
    }
    
}

public class AddLinkedList {
    public static void main(String[] args) {
        LInkedList obj = new LInkedList();
        obj.insertNode(1);
        obj.printLL();
    }
}
