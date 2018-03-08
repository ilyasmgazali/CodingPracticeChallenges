package ATempThrowAwayPractice;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilyas
 */
public class AJavaArraySwapMetho{
    public static void main(String[] args){
        
        printArray( swapArray( createArray(),  0,   createArray().length-1 )   ) ;
    }
    public static int[] createArray(){
        int[] myInt= {1,2,3,4,5,6,7};
        return myInt;
    }
    public static void printArray(int[] myArray){
        for(int i=0;i<myArray.length;i++){
            System.out.println("Array:   "+myArray[i]);
        }
    }
    public static int[] swapArray(int[] myArray, int left, int right){ //created swap method because 
        while(left<right){
            int temp = myArray[left];   //temp left variable
            myArray[left] = myArray[right]; //left switched with right, therefore no more left, i.e use temp
            myArray[right] = temp; //temp is left 
            
            left++; //increase left..
            right--; //and right, until convergence
        }
        return myArray;
    }

}

