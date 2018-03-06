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
        System.out.println( linearSearchWhichPosition( createArray(), 3 ) );
    }
    //CREATE ARRAY
    public static int[] createArray(){
        int[] thisArray = {1,2,3,4}; //10?
        return thisArray;
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
        //out of bounds test
        //split into first  and second half
        
        //length of first half
        int firstHalf = thisArray.length - positionToRotate;
        
        //rotate(thisArray, 0, firstHalf-1);//rotate first half. input array, left, right
        //rotate(thisArray, firstHalf, );//rotate second half
        //rotate(thisArray, 0,);//rotate complete
        
        
    }
}
