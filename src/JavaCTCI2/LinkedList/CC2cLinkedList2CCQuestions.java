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
public class CC2cLinkedList2CCQuestions {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    static Node head;
    
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
            current.next = current; //make next pointer equal to current
        }
        //in this case next pointer is null
        current.next = new Node(data); //make next pointer i.e the last pointer equal to a newly created node
    }
    /***
     *  MAIN METHOD
     */
    public static void main(String[] args){
        //
        
    }
}
