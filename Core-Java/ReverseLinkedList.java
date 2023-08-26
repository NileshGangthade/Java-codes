import java.util.Scanner;

class Node3 {
    public int data;
    public Node3 next ;
    public Node3 (int data) {
        this.data = data;
        next = null;
    }
} 

class LinkedList4 {
    public Node3 head;
    public LinkedList4 (){
        this.head = null;
        }

        public void reverseLL(){
            //Node3 newNode = new Node3(data);

        if (head == null) {
            System.out.println( "List is empty" );
        }

        Node3 temp = head;
        Node3 pre = null;
        Node3 next =null;
       // Node3 curr = head;

        while (temp!= null) {
            next = temp.next;
            temp.next = pre;
            pre = temp;
           // curr = next;
            temp = next;
            //next =next.next;

        }
        head = pre;

        }

        public void display() {
        Node3 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
       public void add (int data) {
        Node3 newNode = new Node3 (data);

        if (head == null){
            head=newNode;
        }

        else {
            Node3 temp = head;
            while (temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }
    }



public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        LinkedList4 obj = new LinkedList4 ();

        System.out.print( " enter the size : " );
        int n= sc.nextInt();

        for (int i=0; i<n; i++) {
            obj.add(sc.nextInt());
        }

        obj.reverseLL ();
       obj.display();
       sc.close();
}
}
