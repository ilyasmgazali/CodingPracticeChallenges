/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticetemp;

/**
 *
 * @author ilyas
 */
// A RECURSIVE FUNCTION IS A FUNCTION THAT CALLS ITSELF, DIRECTLY OR INDIRECTLY
// ---TERMINATION CONDITION; one ore more
// ---BODY; main logic, including calling itself, must move towards a termination state
//
// NOTE: Speed of recursive program is slower because of stack overheads. For this reason iterative solutions are better
public class Java3Recursive {
    public static void main(String[] args) {
        //
        int number = 5;
        //factorialIterative(number);
        //RECURSIVE FACTORIAL
        //int fact=1; 
        int fact = factorialRecursive(number);
        System.out.println(""+fact);
    }
   // FACTORIAL RECURSIVE - NEED MORE PRACTICE - COMPLEXITY 0(N)
    public static int factorialRecursive(int thisNumber){
        if(thisNumber<=0){ //Termination condition
            return 1;
        }else{
            return (   thisNumber* factorialRecursive(thisNumber-1)   ); //take number * by next number | BODY/ RECURSIVE/ EXPANSION
        }
    }
    // FACTORIAL ITERATIVE - NEED MORE PRACTICE - https://www.javatpoint.com/factorial-program-in-java
    public static void factorialIterative(int thisNumber){
        int factSum = 1;
        for(int i=1;i<=thisNumber;i++){
            factSum = factSum  *   i;
            System.out.println(": "+i+": sum: "+factSum);
        }
    }
}
//.    .
