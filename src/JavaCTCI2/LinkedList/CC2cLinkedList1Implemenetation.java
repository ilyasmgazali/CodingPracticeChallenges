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

public class CC2cLinkedList1Implemenetation {//THIS CLASS SHOULD BE CALLED LinkedList
    public static class Node {
        //Pointer to the next node
        Node next; //NOT NEXT IS ALWAYS NULL, IT IS NOT ASSIGNED IN CONSTRUCTOR
        //data 
        int data;
        //constuctor
        Node(int data){
            this.data = data;   
        }
    }
    
    static Node head; //Pointer to the head
    
    
    /***
     *      APPEND TO END OF LINKEDLIST
     */
    public static void print(){
        Node current = head;
        while(current.next != null){
            System.out.println( current.data + "-->"  );
            current = current.next;
        }
        
    }
    /***
     *      APPEND TO END OF LINKEDLIST
     */
    public static void append(int data){
        //part 1
        //check if empty first, if not then create a new head
        if(head == null){
            head = new Node(data);
            //  Head.next = null;   //    DO NOT NEED TO DO THIS AS IT IS NEVER SET IN THE CONSTRUCTOR AND IS ALWAYS NULL
            return; //dont need to carry one
        }
        
        //part 2
        
        Node current=head;//make current = head, start pointer current at head
        
        while(current.next != null){//iterate untill end of LinkedList
            current.next = current;//make next pointer equal to current node, i.e go to next node in linked list
        }
        //after reaching first non null i.e end of LinkedList, create new node
        current.next = new Node(data);  //make the next pointer value to the new data
    }
    /***
     *      APPEND TO START OF LINKEDLIST
     */
    public static void prepend(int data){
        //create new node/ head value 
        Node newHead = new Node (data);
        //make next of new node point to current head. i.e. the new node points to the current 'head'
        newHead.next = head;
        //the new node then becomes the head
        head = newHead; 
    }
    /***
     *      DELETE WITH VALUE
     */
    public static void deleteWithValue(int data){ 
        //check if empty
        if(head == null){return;}
        //check if value to be deleted is head
        if(head.data==data){
            head = head.next; // what if next is null? test it out
            return;
        }
        
        //method function
        Node current = head;
        while(current.next!=null){
            if(current.next.data==data){
                current.next = current.next.next;//just walk around and skip the data
                return;
            }
            current = current.next;
        }
    }
    public static void main (String[] arg){
        int testInt =10;int testInt2 = 20;int testInt3 = 30;append(testInt);append(testInt2);append(testInt3);print();
    }
}