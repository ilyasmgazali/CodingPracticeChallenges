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
public class JavaArraysQTest {
    public static void main (String args[]){
        //System.out.println( linearSearchWhichPosition( createArray(), 3 ) );
        rotateKPosition( createArray(), 0 );
        
    }
    //CREATE ARRAY
    public static int[] createArray(){
        int[] thisArray = {1,2,3,4,5}; //10?
        return thisArray;
    }
    //PRINT ARRAY
    public static void prinArray(int[] thisArray){
        for(int i=0;i<thisArray.length;i++){
            System.out.println(":"+thisArray[i]);
        }
    }
    //SUM ARRAY
    public static int sumArray(int[] thisArray){
        int sum=0;
        for(int i=0;i<thisArray.length;i++){
            sum = sum + thisArray[i];    
        }
        return sum;
    }
    //LINEAR SEARCH
    public static int linearSearchWhichPosition(int[] thisArray, int numberToSearch){
        for(int i=0;i<thisArray.length;i++){
            if( numberToSearch==thisArray[i]){
                return i;
            }
        }
        return -1;
    }
    //ROTATE BY K POSITIONS
    public static void rotateKPosition(int[] thisArray, int positionToRotate){
        if(thisArray==null||thisArray.length==1){
            return;
        }

        //out of bounds test
        if (positionToRotate>thisArray.length){positionToRotate=positionToRotate%thisArray.length;}
        
        //split into first  and second half
        //length of left hand side (first half)
        int leftHand = thisArray.length - positionToRotate;
        //rotateleft
        rotate(thisArray, 0, leftHand-1);
        //rightHand
        rotate(thisArray, leftHand, thisArray.length-1);
        //rotateAll
        rotate(thisArray, 0, thisArray.length-1); //take out this line if you just want to reverse it
        
        prinArray(thisArray);
    }
    //ROTATE BY K POSITIONS - CONTINUED, second part
    public static void rotate(int[] thisArray,int left,int right){
        //exceptions
        if(thisArray==null||thisArray.length==1){
            return;
        }
        while (left<right){
            int temp = thisArray[left]; //starting point, temp carries left 
            thisArray[left]=thisArray[right]; //left is eliminated
            thisArray[right]=temp; //must obviously use temp instead of left
            //iterate until converge
            left++;
            right--;
        }   
    }           
}
