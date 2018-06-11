/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zJavaTestPack;

/**
 *
 * @author ilyas
 */
public class JavaTestPack {
    public static void main (String[] args){
        System.out.println(" ");
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(7);
        Node e = new Node(1);
        Node f = new Node(2);
        Node g = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        
        
        JavaTestPack lLClassObject = new JavaTestPack();
        Node resultNode = lLClassObject.partition(a,2);
        //print
        while (resultNode!=null){
            System.out.print(resultNode.data+"->");
            resultNode=resultNode.next;
        }
        
    }
    static class Node{
        //variables
        Node next;
        int data;
        
        //constructor
        Node (int data) {
            this.data = data;
        }
        Node(){next=null;}//null constructor
    }
    
    //variables
    static Node head;
    static Node tail;
    
    private static Node partition(Node p, int x){
        if (p == null || p.next == null){return p;}

        Node beforeStart = new Node(0);
        Node beforeEnd = beforeStart;
        Node afterStart = new Node(0);
        Node afterEnd = afterStart;

        while (p != null) {
            
            // tings
            Node next = p.next;
            p.next = null;
            if (p.data < x) {
                    beforeEnd.next = p;
                    beforeEnd = p;
            } else {
                    afterEnd.next = p;
                    afterEnd = p;
            }
            p = next;
        }
            beforeEnd.next = afterStart.next;
            return beforeStart.next;
    }

}