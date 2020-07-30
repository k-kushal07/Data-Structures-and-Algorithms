import java.io.*; 
  
public class LinkedListInsertAtStart {
    
    public static void main(String[] args) 
    { 
        LinkedListInsertAtStart list = new LinkedListInsertAtStart(); 
  
        insertAtStart(list, 7);
        insertAtStart(list, 4);
        insertAtStart(list, 3);  

        Node currentNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        while (currentNode != null) { 
            System.out.print(currentNode.data + " "); 
   
            currentNode = currentNode.next; 
        }
    } 
    
    Node head = null;
    
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    public static void insertAtStart(LinkedListInsertAtStart list, int data)
    {
    	Node new_node = new Node(data);
    	new_node.next = list.head;
    	list.head = new_node;
    }
}
