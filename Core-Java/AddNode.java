class LL {
    private NodeA head;

    public LL() {
        head = null;

    }
    class NodeA {
        public int data;
        private NodeA next;

      public  NodeA (int data){
            this.data = data;
            next = null;
        }
    }

        public void Addnode (int data){
            NodeA newNode = new NodeA (data);
            if (head == null){
                head = newNode;
                //Node(data) ;
            }
        }

        public void print (){
           // NodeA newNode = new NodeA ();
            if (head == null){
                System.out.println("List is empty");
                return;
            }
            NodeA temp = head;
            while (temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }
public class AddNode {
    public static void main(String[] args) {

        LL obj = new LL();
        obj.Addnode(3);
        obj.print();
        
    }
}
