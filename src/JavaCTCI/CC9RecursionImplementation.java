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
public class CC9RecursionImplementation {
    //**************** FACTORIAL *****************************
    //Factorial recursion 
    // fact(n) = n * n-1 (Picture a sequence)
    public static int factRec(int n){ //initialise
        //base case
        if(n==0) //condition, last number is sequence
        {
            System.out.println("A"+n);
            return 1;
        }
        else
        {
            System.out.println("B"+n);
            return n*factRec(n-1); //increment, decrement in this case
        }
    }
    public static int factIter(int num){ //fact param
        int total = 1;
        //loop through and add to total
        for(int i =1; i< num+1;i++){
            total = total*i;
        }      
        return total;
    }
    //**************** FACTORIAL *****************************
    /**
        f(n) f(n2) f(n3) f(n4)  f(n5) f(n6)
        0    1    1     2        3    5
        fn   fn-1  fn-2   fn-3  fn-4  fn-5
                
        only take last two
        
                
        n-1   n-2 NOTE THESE ARE THE LAST TWO FROM ABOVE
        3     5 
     */
    //Recursive fib
    public static int fibRec(int n){//initialise
        //base condition
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibRec(n-1)+fibRec(n-2); //add last and second last
        }
        //rule is add two numbers before current, only those two
    }
    public static int fibIter(int num){
        int lastOLD=0,  lastNEW=1,  current=0;
        for(int i=0;i<num;i++){
            //get new current
            current = lastOLD+lastNEW;
            //move last two along
            lastOLD=lastNEW;
            //
            lastNEW=current;
        } return current;            
    }
    
    //EXPERIMENTAL
    /**
        1   3    6
        n   n-1  n-2
        
        rule: multiply number before 
        (n*(n-1))/2;
     */
    //triangle numbers
    public static int triRec(int n){ 
        if(n==0)
            return 1;
        else
            return (n*(n-1))/2;
    }
    
    
    
    //EXPERIMENTAL, MOVE ON
    //program for length of a string using recursion
    //input: str = "abcd"
    //output: 4
    public static int lengthOfString(String s){ //initialise
        //char[] c = s.toCharArray();
        //condition base
        if(s.length()==1)
            return 1;
        else
            return -1;//LOGICE
        //increment/decrement
        
       // n n-1
        //l o
    } 
    
    //Sum of number
    //n + sum(n-1)
    //add number + number before it
    public static int sumRec(int n){ 
        //break condition
        if(n==0)//
            return 1;
        else
            return n + sumRec(n-1);
            // ADD NUMBER + ONE BEFORE THE NUMBER 
            // N + RETURN VALUE
    }
    
    
    
    
    public static void main(String[] args){
        //FACT
        System.out.println("factRec:   " + factRec(3));
        System.out.println("factIter:  " + factIter(3));
        
        //FIBONACCI
        System.out.println("FibRec:  " + fibRec(7));
        System.out.println("FibIter: " + fibIter(7));
        System.out.println("");
        
        //TRIANGLE NUMBER
        System.out.println("TriReC:" + triRec(6));
    }    
}
