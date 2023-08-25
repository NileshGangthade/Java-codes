import java.util.Scanner;

class Node1 {
    public int data;

    public Node1 next ;
    public Node1 (int data) {
        this.data = data;
        next = null;
    }
} 

class LinkedList3 {
public Node1 head;
        public LinkedList3 (){
            this.head = null;
        }

    public void add (int data) {
        Node1 newNode = new Node1 (data);

        if (head == null){
            head=newNode;
        }

        else {
            Node1 temp = head;
            while (temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public int middleElement (int n) {
        int result =-1;
        int mid =0;
        if (n %2 == 0) {
            mid = n / 2;
        }
        else {
            mid = (n+1) /2;
        }
        int count =1 ;
        Node1 temp = head ;
        while (temp!=null){
            if (count == mid){
                result = temp.data;
                break;
            }

            temp = temp.next;
            count +=1;
        }

        return result;
    }

    public void printLinkedList(int n){

       
        int mid =0;
        if (n %2 == 0) {
            mid = n / 2;
        }
        else {
            mid = (n+1) /2;
        }
        int count =1 ;
        Node1 temp = head ;
        System.out.println( " First 50 % part : ");
        for (int i = count ; i < mid; i++) {
         System.out.print(temp.data + " -> ");
                temp = temp.next;
                count += 1;   
        }
        System.out.println( " ");
        System.out.println("Second half : ");
        while (temp!=null){
            if( count >= mid){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
                count += 1;
            }
        }
        System.out.println("null");
       
       

    }
}
public class FindMiddleEleInLL {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        LinkedList3 obj = new LinkedList3 ();

        System.out.print( " enter the size : " );
        int n= sc.nextInt();

        for (int i=0; i<n; i++) {
            obj.add(sc.nextInt());
        }

      // System.out.println("Middle Element is :" + obj.middleElement(n));

       obj.printLinkedList(n);
        
    }
}
