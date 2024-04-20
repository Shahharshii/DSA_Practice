public class Linklistexample1 {
    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.add(1);
        ll.add(2);
        ll.add(45);
        ll.add(76);
        ll.print();
         ll.remove(2);
         ll.print();
        
    }
    
  
        
}

/**
 * linklist
 */
 class linklist {
    class Node{
        int value;
        Node next;

        Node(int val, Node next){
            value = val;
            this.next = next;
        }
    }
         Node head = null;
         Node tail = null;

    public void add(int val) {
        if (head == null) {
            head = new Node(val, null);
            tail = head;
        } else {
            tail.next = new Node(val, null);
            tail = tail.next;

        }
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    
}
