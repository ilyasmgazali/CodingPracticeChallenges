/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI2.LinkedList;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
/**
 *
 * @author ilyas
 */
public class CC2cLinkedList2CCQuestionss {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    static Node head;
    /***
     *  PRINTLIST with object and without object
     */
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    public static void print(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data+"->");
            current = current.next;
        }
    }
    /***
     *  CTCI Q2.1 - remove duplicates in unsorted linkedlist
     */
    public static void deleteDuplicated(Node actualHead){//the input will actually be the head! 
        //hashset for keeping track of duplicates
        Set<Integer> mySet = new HashSet<Integer>();
        //keep track of current + previous
        Node previous = null; //previous buffer, will become current if old current value is duplicate
        Node current = actualHead; 
        //
        while(current !=null){
            if(mySet.contains(current.data)){// if myset contains duplicate data
                //delete
                previous.next = current.next; //********* this in essence is next.next i.e skip this one
            }else{
                //add to hashset, keep track of duplicates 
                mySet.add(current.data);
                
                previous = current; //**************** KEEP TRACK OF PREVIOUS by making it equal to current
            }
            current = current.next;
        }
    }
    /***
     *  CTCI Q2.1.b - remove duplicates in unsorted linkedlist NO BUFFER
     */
    public static void deleteDuplicatedNoBuffer(Node actualHead){
        //test case if head is null
        if (actualHead==null){
            return;
        }
        
        Node current = actualHead;
        while(current.next!=null){
            //runner technique O(n2)?
            Node runner = current;
            while(runner.next!=null){
                //compare current to all runners
                if(current.data==runner.next.data){ //compare current data to next data
                    //it is a duplicate therefore delete
                    runner.next=runner.next.next;
                }else{
                    runner=runner.next; //***** dont forget, or else out of bound exception
                }
            }
            current=current.next;
        }
    }
    /***
     *  CTCI Q2.2.a - Find Kth to last element in a singularly linked list - SIMPLE SOLUTION (PROB WONT BE ASKED)
     * @param head - head 
     * @param k - kth to last element
     */
    //2a - RECURSIVE
    public static void simpleKthtoLast(Node head, int k){
        //RECURSIVE COME BACK TO THIS
    }
    /***
     *  CTCI Q2.2.b- Find Kth to last element in a singularly linked list - RECURSIVE WRAPPER
     */
    public static void wrapperKthtoLast(){
        //RECURSIVE COME BACK TO THIS
    }
    
    //GEEKS FOR GEEKS - static int solution
    
    
    /***
     *  CTCI Q2.2.c- Find Kth to last element in a singularly linked list - ITERATIVE SOLUTION
     *  O(n) time - 0(1) space (prob O(1+1) space
     */
    //TWO POINTER METHOD, ITERATIVE - MOST OPTIMAL BUT LESS STRAIGHTFORWARD
    public static Node iterativeKthtoLast(Node head, int k){
        if(k<=0){
            return null;
        }
        
        //2 pointers technique
        Node pointer1 = head;
        Node pointer2 = head;
        
        //move pointer2 ahead by k spaces
        for(int i=0; i<k; i++){
            if(pointer2==null){ //error check, should not be null
                return null;
            }
            pointer2 = pointer2.next;
            System.out.println("X");
        }
        if(pointer2==null){
            return null;
        }
        //move pointer 1 +1  ahead by 1 each time 
        while(pointer2.next!=null){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        System.out.println(k+" Last: "+pointer1.data);
        return pointer1;
        
    }
    /***
     *  CTCI Q2.3 - delete a node in the middle of a singly linked list, given only access to that node
     */
    public static boolean deleteMiddleNodeLimitedAccess(Node middleNode){
        //test cases
        if(middleNode==null||
                middleNode.next==null //OR CALL TO METHOD WHICH CAN DELETE TAIL
                )return false; //cant be 
 
        //Copy over the data from next node into current node
        //then delete next node
                
        Node next = middleNode.next; // next = next node
        
        middleNode.data=next.data; //copy data
        middleNode.next=next.next; //copy next i.e. DELETE, SKIP !!!!!!!!
        
        return true;
        
        //NOTE DOES NOT DELETE LAST NODE, SHOULD CALL OTHER METHOD IF THAT NEEDS TO BE DONE
    }
     /***
     *  CTCI Q2.4 - Partition a linked list around a value x, such that all nodes less thanx
     *              come before all nodes more than x
     */
    public static Node partitionStable(Node head, int x){//stable = x stays in place
        //NOTE *** head can be refactored to node for easier readability
        
        //before list
        Node beforeStart = null;
        Node beforeEnd = null;
        //after list
        Node afterStart = null;
        Node afterEnd = null;
        
        //Partition list
        while(head !=null){ //ITERATE THROUGH LINKEDLIST 
            Node next = head.next; //next kept in temp, used for iteration at the end of the while loop
            
            head.next = null; //head is pointed to null
            
            if(head.data<x){ //start with head, compare x value
                
                //insert node into end of before list
                if(beforeStart==null){//add first thing to before start
                    beforeStart = head; //equal current
                    beforeEnd = beforeStart; //may only be one x
                }else{//add to before start
                    beforeEnd.next=head;
                    beforeEnd=head;
                }
                
            }else{//if more than x
                
                //INSERT NODE INTO END OF THE LIST
                if(afterStart==null){
                    //
                    afterStart=head;
                    afterEnd=afterStart;
                }else{
                    //
                    afterEnd.next=head; // make end of 'after list' = current node
                    afterEnd=head; //
                }
                
                
            }
            head=next;
        }
        
        if(beforeStart==null){
            return afterStart;
        }
        
        //MERGE, simple
        beforeEnd.next=afterStart;
        
        //return beforeSent 
        return beforeStart;
        
        
    }
    /***
     *  CTCI Q2.6 - Given a circularly LinkedList, return node at start of loop 
     */
    public static Node findStartOfLoop(Node head){
        //check initial cases
        if(head!=null || head.next!=null) return null;
        
        //runners
        Node slow = head;
        Node fast = head;
        
        ///check if circular
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                //Meet
                break;
            }
        }
        
        //check if fast and slow met
        if(fast!=slow || fast==null) return null;
        
        //if i move either slow or fast to head, they will both be an equal distance from the loop
        fast = head;
        if(fast!=head){
            slow=slow.next;
            fast=fast.next;
        }
        
        return fast; //or return slow, they will both meet at the start of the loop
        //proof is confusing, but makes sense
    }
    /***
     *  CTCI Q2.7.a - Implement a method to check if a LinkedList is a palindrome
     */
    public static boolean isPalindromeIterative(Node head){
        //error cases
        if(head==null||head.next==null)return false;
        
        //runners
        Node slow = head;
        Node fast = head;
        
        //stack for first half of linkedlist
        Stack<Integer> myStack = new Stack<Integer>();
        
        //race, slow 1x, fast 2x
        while(fast!=null && fast.next!=null){
            //add first half to stack
            myStack.push(slow.data);
            //race both
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //check if it was odd
        if(fast!=null){
            slow=slow.next;
        }
        
        //compare rest of slow to stack
        while(slow.next!=null){
            int top = myStack.pop().intValue();
            
            if(top!=slow.data){
                return false;
            }
            slow=slow.next;
        }
        
        //if code reached here, all conditions have been met
        return true;
    }
    /***
     *  CTCI Q2.7.b - Implement a method to check if a LinkedList is a palindrome
     */
    public static boolean isPalindromeRecursive(){
        return false;
    }
    
    public static void main(String[] arg){
        //create custom node, no encapsulation but will do fine for demonstration purposes
        Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(112);
        start.next.next.next = new Node(10);
        start.next.next.next.next = new Node(10);
        //first set of prints
        System.out.println("print first");
        print(start);
        System.out.println();
        //second set of prints
        System.out.println("print 2nd");
        //deleteDuplicated(start);
        iterativeKthtoLast(start, 2);
        
        //deleteDuplicatedNoBuffer(start);
        print(start);
    }
}