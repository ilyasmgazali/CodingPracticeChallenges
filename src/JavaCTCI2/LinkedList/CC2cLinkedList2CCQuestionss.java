/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI2.LinkedList;

import java.util.HashSet;
import java.util.Set;
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
    public static void deleteDuplicated(Node actualHead){//the input will actually be the head! stupid, i know!
        //hashset for keeping track of duplicates
        Set<Integer> mySet = new HashSet<Integer>();
        //keep track of current + previous
        Node previous = null;
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
        //1>1>2>3
        
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
        deleteDuplicated(start);
        print(start);
        
        
        
    }
}
