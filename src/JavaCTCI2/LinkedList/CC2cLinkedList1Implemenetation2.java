/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI2.LinkedList;

/**
 *
 * @author ilyas
 */
public class CC2cLinkedList1Implemenetation2 {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    static Node head;
    /***
     *  PRINT
     */
    public static void print(){
        Node current = head;
        while(current != null){ //DIFFERENT BECAUSE STARTING FROM FIRST
            System.out.print(current.data+"-->");
            current = current.next; //move it along **********************************
        }
    }
    
    /*
        APPEND TO END (GEEKS4G) - 6 Steps - Time O(n)
        can be optimised by keeping an extra pointer to tail of linkedlist can be O(1)
    */
    public void appendGeeks4Geeks(int new_data)
    {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        Node new_node = new Node(new_data);

        /* 4. If the Linked List is empty, then make the
               new node as head */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }

        /* 4. This new node is going to be the last node, so
             make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head; 
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
    /***
     *  APPEND TO END
     */
    public static void append(int data){
        //case where head does not exist yet
        if(head==null){
            head = new Node(data);
            return;
        }
        //Method start here
        Node current = head;
        //case where next pointer is not null
        while(current.next != null){ //check if next pointer is empty
            //
            current = current.next; //make next pointer equal to current::::MOVE ALONG ***************
        }
        //in this case next pointer is null
        current.next = new Node(data); //make next pointer i.e the last pointer equal to a newly created node
    }
    /***
     *  PREPEND to start of linkedlist - 4 Steps (Geeks4G) - Time O(1)
     */
    public static void prepend(int data){
        //1:Allocate/create new, 2: Put data in
        Node newHead = new Node(data);
        //3: Make next of new Node as hear
        newHead.next = head;
        //4: Move the head to point to new Node
        head = newHead;
    }
    /*
        Insets a node after the given prev_node - 5 Steps (Geeks4G) - Time O(1)
        Note, assumption that you already have node
    */
    public static void insertAfterGivenNode(Node prev_node, int new_data){
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

        /* 2. Allocate the Node &
           3. Put in the data*/
        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }    
    
    /***
     *  DELETE WITH VALUE
     */
    public static void deleteValue(int data){
        //case where head is null
        if(head==null){
            return;
        }
        //case where head is equal to data
        if(head.data==data){
            head = head.next;//head is displaced by next node
            //head.next=null;//head does not have pointer to next node // ************* LINE NOT REQUIED
            return;
        }
        
        //other cases
        Node current = head;
        while(current.next!=null){
            if(current.next.data==data){//never checks head!!
                //delete
                current.next = current.next.next;// i.e. skip next pointer and 
            }
            current = current.next;
        }
    }
    public static void insertAfer(Node previousNode, int data){
        //case where given node is null
        if(previousNode==null){
            System.out.println("The given previous node is null");
            return;
        }
        
        //rest of cases
        Node newNode = new Node(data);
        //make next pointer of PREVIOUS node, as NEW NODE
        newNode.next = previousNode.next;
        //Then previousnode next must point to new node
        previousNode.next = newNode;
        
        //NOTE ******** you do not have to traverse this as you already know the node
    }
    /***
     *  MAIN METHOD
     */
    public static void main(String[] args){
        CC2cLinkedList1Implemenetation2 linkedList1 = new CC2cLinkedList1Implemenetation2();
        int a =1;int b=2;int c=3; int d=4;int e=11;int f= 5;
        linkedList1.append(a);linkedList1.append(b);linkedList1.append(c);linkedList1.append(d);linkedList1.prepend(11);linkedList1.deleteValue(b);
        linkedList1.insertAfer(linkedList1.head.next, f);linkedList1.print();
    }
}
