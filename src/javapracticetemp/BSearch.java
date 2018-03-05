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
public class BSearch {
    public static void main(String[] args){
        //linear vs binary (ordered)
        int[] array1 = new int[]{1,2,3,4,5,6,7,8,9,110};
        int checkNo = 8;
        int resultIndexOfOurNumber =  binarySearch(array1, checkNo);
        System.out.println("Hello: " + resultIndexOfOurNumber );
    }
    //iterative solution
    // 0( log (n) )
    //returns index of checkNo if present in array1[]
    //else returns -1
    public static int binarySearch(int[] localArray, int localNo){
        
        int min = 0; int max = localArray.length -1; //index max, min
        
        while(min <= max){ //whie min is still max, solves 'clash' problem
            int midGuess = min +  ( max - min / 2)  ;//find first midpoint average
            if (localArray[midGuess] == localNo){ //if you hit target, return target
                return midGuess;
            }
            if (localArray[midGuess] <  localNo){ //if x greater, ignore left half
                min = midGuess+1; //create new min point, above midpoint
            }else{ //or if localNo is smaller, ignore right half
                max = midGuess-1; //create new max point
            }
        }
        return -1; //if element not found return -1
    }
}