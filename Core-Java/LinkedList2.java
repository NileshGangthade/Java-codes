import java.util.Scanner;


class Node {
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    class SingelyLinkedList {
        private Node head;
        public SingelyLinkedList (){
            this.head = null;
        }
        
    

    public void InsertAtStart (int data){
        Node newNode = new Node(data);

        if (head == null){
            head=newNode;
        }
        else {
            newNode.next = head;
            head= newNode;
        }
        System.out.println("Node Inserted");
    }

    public void InsertAtEnd (int data){
        Node newNode = new Node(data);

        if (head == null){
            head=newNode;
        }

        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Node Inserted");

    }

    public void insertAtMiddle (int data, int Exist ){
        Boolean flag = false;
        Node temp = head;
        Node previos = head;
        while (temp!= null){
            if(temp.data == Exist){
              flag = true;
              break;
            }
            previos = temp;
            temp = temp.next;
        }

        if (flag == false){
            System.out.println( "Element not found");
        }

        else {
            Node newNode = new Node (data);

            previos.next = newNode;
            newNode.next = temp;
            System.out.println("Node Inserted");
        }



    }
    public void print (){
        //Node newNode = new Node (data);
        Node temp = head ;

        if (head == null){
            System.out.println("list is empty");
            return;
        }

        while (temp!=null){
            System.out.print(temp.toString() + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void deleteAtStart (){
        if (head==null){
            System.out.println("List is empty ");
            return;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
        temp = null;
        System.out.println("Node deleted");
    }

    public void deleteAtEnd (){
        if (head==null){
            System.out.println("List is empty ");
            return;
        }

        Node temp = head;
        Node previes = head;

        while (temp.next != null){
            previes = temp;
            temp = temp.next;
        }
        previes.next = null;
        temp = null;

    }

    public void deleteAtMiddle (int existing){
      if (head==null){
            System.out.println("List is empty ");
            return;
        }
        Node temp = head;
        Node next = head;
        Node prev = head;

        while (temp.next != null){
            if(temp.data == existing){
                next = temp.next;
                prev.next = next;
                temp.next = null;
                temp = null;
                System.out.println("node deleted");
            }
        }
        
    }
}
public class LinkedList2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
   SingelyLinkedList obj = new SingelyLinkedList();
  // LinkedList1 object = new LinkedList1();

 // LinkedList1 object = new LinkedList1() ;
    while (true){
    System.out.println("1 . Insert Node At Start");
    System.out.println("2 . Insert Node At end");
    System.out.println("3 . Insert Node At Middle");
    System.out.println("4 . Print Linked List");
    System.out.println("5 .Delete the Start Node");
    System.out.println("6 . Delete the End Node");
    System.out.println("7. Delete the Middle Node");
    System.out.println("0 . Exist ");
    System.out.print("Enter your choice : ");

    int choice = sc.nextInt();

    if (choice == 1){
        System.out.print("Enter a data : ");
        int data = sc.nextInt();
        obj. InsertAtStart (data);
    }
    else if(choice == 2){
        System.out.print("Enter a data : ");
        int data = sc.nextInt();
        obj. InsertAtEnd (data);

    }
    else if (choice == 3){
        System.out.println (" Enter a Existing element :");
        int exist = sc.nextInt();
        System.out.println("Enter a data : ");
        int data = sc.nextInt();
        obj. insertAtMiddle (data, exist);

    }
    else if (choice == 4){
        obj.print();

    }
    else if (choice == 5){
        obj.deleteAtStart();

    }
    else if (choice == 6){
        obj.deleteAtEnd();

    }
    else if (choice == 7){
        System.out.print("Enter the Existing Element :");
        int exists = sc.nextInt();
        obj.deleteAtMiddle(exists);

    }
    
    else if (choice == 0){

        break;

    }

    else {
        System.out.println("enter correct choice"); 
    }
}
}
}



