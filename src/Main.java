import linked.LinkedList;
import linked.Node;

public class Main {
    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void addAtStart(int data) {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;
    }

    public void addAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        Node n = head;
        if (index==0){
            addAtStart(data);
        }
        else {
            for (int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }

    public void delete(int index){
        if (index==0){
            head=head.next;
        }
        Node n = head;
        Node n1 = null;

       for (int i=0;i<index-1;i++){
           n=n.next;
       }
       n1=n.next;
       n.next=n1.next;
       n1=null;
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addAtStart(5);
        list.addAt(2,2);

        list.delete(0);
        list.show();
    }
}
