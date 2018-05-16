/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI;

import java.util.ArrayList;

/**
 *
 * @author ilyas
 */
public class CC4StacksAndQueuesQuestionsNEW {
    /**
     *  3 stacks within one array
     */
    public static class Stack1{
        static final int MAX = 100; //global variable, storing size of each stack
        int[] buffer = new int[MAX*3]; //array holding 3 stacks
        int[] tracker = {-1,-1,-1}; //how many variables in each bucket
        
        // @ bucket = which segment in the array the stack belongs to. i.e 0,1,2
        public void push(int value, int bucket){            
            //push
            if(tracker[bucket]<MAX-1){
                //update tracker
                tracker[bucket]++; //increment tracker, NOTE: tracker is one more, so wont overwrite
                buffer[peakTopIndex(bucket)] = value; //add at this point
            }else{
                System.out.println("Stack Overflow");
            }
        }
        //out
        public void pop(int bucket){
            //
            if(isEmpty(bucket)){
                System.out.println("Stack Underflow");
            }else{
                tracker[bucket]--;
                buffer[peakTopIndex(bucket)] = 0;
            }
        }
        //check if empty
        public boolean isEmpty(int bucket){
            return (tracker[bucket]==-1);
        }
        //index at top of stack at specific bucket, MOST IMPORTANT
        public int peakTopIndex(int bucket){
            return (bucket*MAX)
                    + tracker[bucket];
        }
        //not needed, but useful for testing
        public int peek(int bucket){
            //case
            if(isEmpty(bucket) ){return -9999999;}//-99999999 is error code
            return buffer[  tracker[bucket] + peakTopIndex(bucket)    ];
        }
    }
    
    ///*********************** SECOND QUESTION TO BE FINISHED ******************
    public static class Stack2{
        //variables
        int[] stackInts;//stack of int elements in array
        int minTracker=0; //index of int element
        
        
        public Stack2(int MAX){
            this.stackInts = new int[MAX];//create size 
        }
        
        //push - insert
        public void push(){
            //when added, compare with min and, if new int is new min, then 
        }
        
        //delete
        public void pop(){
            //when I remove int, how do i know the last min?
            
            //need to find a way to store old index, 
            
            //i could use an arrayList if i really wanted
        }
        //min index tracker
        public int min(){
            return minTracker;
        }
        //peek 
        public void peek(){}    
    }
    ///*********************** SECOND QUESTION TO BE FINISHED ******************
    
    public static class SetOfStacks{
        private class Stack3{
            //int array stack
            final int MAX = 10;
            int[] intStack;
            
            //constructor
            public Stack3(){
                this.intStack = new int[MAX];
            }
            //push
            public void push(int element){}
            //pop
            public void pop(){}
            
            // peak or top
            public void top(){ //KEEP TRACK OF LAST ELEMENT
                               //OR KEEP TRACK OF TOP INDEX 
            }
            
            //check if current stack is full
            public boolean isFull(){
                return (intStack.length==MAX);
            }
        }
        //variables
        ArrayList<Stack3> arrayStack = new ArrayList<Stack3>();
        int indexOfCurrentStack = 0; //starts at first index
        
        //push, push calls push
        public void push(int element){
            //now working with current Stack segment/arraylist
            Stack3 current = null;
            if( isCurrentFull()  ){
                //CREATE NEW SEGMENT IN ARRAY LIST
                current = new Stack3();
                current.push(element);
                
                //
            }else{//STACK STILL HAS SPACE
                //ADD ELEMENT TO OLD STACK
                current.push(element);
            }
        }
        
        //pop, pop calls pop
        public void pop(){}
        
        //pop, at index
        public void popAtIndex(int index){
            (   arrayStack.get(index)   ).pop()    ;
        }
        
        //check if current stack is full
        public boolean isCurrentFull(){
            return (arrayStack.get(indexOfCurrentStack).isFull())  ;
        }
        
        //get current stack - return index of arraylist to see which stack we are currently using
        public int getCurrentStackIndex(){
            return indexOfCurrentStack; 
        }
    }
    //4 recursion, need to look up recursion
    
    //5 after 
    
    //6
    public static class Stack5{
        //variables
        
        
        
        //methods
    }
    
    public static void main(String[] args){
        // ******************************** Q1 *********************
        //new stack + 
        Stack1 myStack = new Stack1();
        
        myStack.pop(0);
        
        //populate
        for(int i=0;i<100;i++){
            myStack.push(i,0);
        }
        
        System.out.println("Top Index "+myStack.peakTopIndex(0));
        myStack.push(1,0);
        myStack.pop(0);
        System.out.println("Top Index "+myStack.peakTopIndex(0));
        
        // ******************************** 2 *********************
        //SPACE FOR 2 
        
        // ******************************** 3 *********************
    }        
}