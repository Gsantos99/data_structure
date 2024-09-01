package structures;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int data) {
     if(head == null){
         head = new Node(data);
     } else {
         Node current = head;
         while(current.next != null){
             current = current.next;
         }
         current.next = new Node(data);
     }
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void remove(int data) {
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null && current.next.data != data){
            current = current.next;
        }

        if(current.next != null){
            current.next = current.next.next;
        } else {
            System.out.println("Element not found");
        }


    }

}
