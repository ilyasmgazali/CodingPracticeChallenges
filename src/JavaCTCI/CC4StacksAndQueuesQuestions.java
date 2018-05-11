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
public class CC4StacksAndQueuesQuestions {
    /*
    * CTCI Chapter 3 Q1 
    *   Describe how you could use a single array to implement three stacks
    */
    public static class Stack{
        int stackSize = 100; //stack size
        int[] buffer = new int[stackSize*3]; //single array
        int[] stackPointer = {-1,-1,-1}; // pointers to track top elements, all set to null
        //insert
        public void push(int stackNum, int value) throws Exception{//stackNum = 1,2,3 AND value=object
            //check if we have space
            if(stackPointer[stackNum]+1==stackSize){//if we increment this, will it be over size limit
                //stack overflow
                System.out.println("Stack Overflow");
                return; 
                //throw new FullStackException();
            }else{
                //incement stackpointer, update top value(buffer)
                stackPointer[stackNum]++; //increment stackpointer by 1
                buffer[absTopOfStack(stackNum)] = value; // e.g i can add it at the 200th position
            }
        }
        //delete
        public int pop(int stackNum) throws Exception{
            
            if(isEmpty(stackNum)){return -1;} //or Exception
            
            int value = buffer[absTopOfStack(stackNum)]; //get top
            buffer[absTopOfStack(stackNum)] = 0;//clear index
            stackPointer[stackNum]--;//decrement pointer
            return value; //confirmation   
        }
        //check empty
        boolean isEmpty(int stackNum){return (stackPointer[stackNum] == -1);} //if stackPointer is less than 0
        //returns index of top of stack "stackNum", in absolute terms 
        int absTopOfStack(int stackNum){
            return (stackSize * stackNum) //starts at 100, 200 or 300
                    + stackPointer[stackNum]; //add amount of elements required
        }
    }
}