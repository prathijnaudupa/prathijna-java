class DoublyLinkedList {    
    
    class Node{  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    Node head, tail = null;  
    public void addNode(int item) {  
     
        Node newNode = new Node(item);  
           if(head == null) {  
            head = tail = newNode;  
          
            head.previous =null;  
            
            tail.next = null;  
        }  
        else {  
           
            tail.next = newNode;  
          
            newNode.previous = tail;  
         
            tail = newNode;  
        
            tail.next = null;  
        }  
    }  

    public void printNodes() {  
       
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
              
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  
}
public class Tryy{
    public static void main(String[] args) {  
       
        DoublyLinkedList dl_List = new DoublyLinkedList();  
       
        dl_List.addNode(101);  
        dl_List.addNode(250);  
        dl_List.addNode(380);  
        dl_List.addNode(840);  
        dl_List.addNode(540);  
    
        dl_List.printNodes();  
    }  
}