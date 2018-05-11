/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI;

/**
 *
 * @author ilyas
 */
public class CC4StacksAndQueuesImplementation {
    //Creating stack using linkedlist
    public static class Node{
        Node next;
        Object data;
        Node(Object data){
            this.data = data;
        }
    }
    //creating LinkedList stack
    public static class Stack{ 
        Node top;
        /**
         *  take item away from the stack. Note: this is done in reverse order, starting from top
         *  if there are no more items, then an UNDERFLOW problem exists
         */
        public Object pop(){
            if (top!=null){
                Object item  = top.data; //create new temp object, make it equal to top
                top = top.next; //make top equal next
                return item; //return the next object
            }
            return null; //in case where top =null
        }
        /**
         *  put item into the stack. Note: starting from bottom
         *  if there are too many items, then an OVERFLOW PROBLEM exists
         */
        public void push(Object item){
            Node newTop = new Node(item);
            newTop.next = top; //
            top = newTop; //t becomes top
        }
        /**
         *  peek or top, returns top element in the stack. 
         */
        public Object peek(){
            return top.data; //Note data is an object
        }
    }
    
    //creating Array Stack
    public static class Stack2{
       static final int MAX = 1000; //size of stack
       int top; //current top
       int[] myStack = new int[MAX]; //array with max size of stack
       //constructor
       public Stack2(){
           top = -1; //make top a negative number
       }
       //check if empty
       public boolean isEmpty(){
           return (top<0); //will be true if top stack is less than zero (negative number)
       }
       //insert
       public boolean push(int x){
           if(top>=MAX){//you added too many items
               System.out.println("Stack Overflow");
               return false;
           }else{
               //below is called pre incrementing, same as:
               // top = top + 1 ;
               myStack[++top] = x;
               return true;
           }
       }
       //take away item from stack
       public int pop(){
           if(top < 0 ){
               System.out.println("Stack Underflow");
               return 0;
           }else{
               //post incrementing, same as:
               // myStack[top] 
               // then. top = top -1; 
               int x = myStack[top--]; //minus 1 AFTER POPPED
               return x;
           }
       }
       //   driver/main
       public static void main(String[] args){
           Stack2 s = new Stack2();
           s.push(10); s.push(20); s.push(30);
           System.out.println(s.pop() + "Popped from the stack");
       }
    }
}
