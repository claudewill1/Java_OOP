import org.w3c.dom.Node;

public class SinglyLinkedList {
    private Node head;
    
    public SinglyLinkedList() {
        this.head = null;
    }
    
    public SinglyLinkedList add(int value) {
        Node newNode = new Node(value);
        newNode.next = null;
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
        
    }
    public Node remove() {
        
        if(this.head.next == null) {
            this.head = null;
        } else {
            // else traverse to second to last element
            Node last = this.head;
            
            while(last.next != null) {
                last = last.next;
            }

            // change next of the second
            // last node to null and delete the
            // last node
            Node lastNode = temp.next;
            temp.next = null;
        }
        

        return head;

    }
    public void printValues(SinglyLinkedList list) {
        Node currNode = new Node();
        currNode =list.head;
        System.out.print("LinkedList: ");

        while(currNode != null) {
            System.out.print(currNode.value + " ");

            // go to next node
            currNode = currNode.next;
        }
    }
    
}
