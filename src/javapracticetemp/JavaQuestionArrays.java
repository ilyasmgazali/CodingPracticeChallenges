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
public class JavaQuestionArrays {
    public static void main(String[] args) {
        //1 Sum in array
        int[] arr = new int[]{10,20,30,40,50};
        //1 System.out.println("Sum: "+ arraySum(arr,arr.length) );
        //2 System.out.println("returned " + findValue(arr,11));
         int times=3;rotateArraybyKPosition(arr,times);
        //4 int times=3;reverseArray(arr,times);
    }
    //1 Sum in array
    public static int arraySum(int[] arr, int size){
        int sum =0;
        for(int i=0;i<size;i++){
            sum = sum + arr[i];
        }
        System.out.println("run");
        return sum;
    }
    //2 Specific No., linear search
    public static int findValue(int[] arr, int value){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==value){
                return i; 
            }
        }
        return -1;
    }
    // 3 Rotate Array by K positions
    public static void rotateArraybyKPosition(int[] from, int kPosition){
        // put things into indent of new array
        int[] too = new int[from.length]; //new array
        for (int i=0; i<too.length;i++){ //go through all elements in old array   
            too[(i+kPosition) % from.length] = from [i]; //stop it from going out of bounds, find right index    
        }
        for (int i=0; i<from.length;i++){ //go through all elements in old array
            System.out.print(","+ too[i]);
        }
    }
    // 4 Reverse Array
    public static void reverseArray(int[] from, int kPosition) {
        // put things into indent of new array
        int[] too = new int[from.length]; //new array
        
        for (int i=0,j=too.length; i<too.length;i++,j--){ //go through all elements in old array
            too[(j-1)%from.length]=from[i]; //--------REVERSE-----------_
            //as above___ too[(j+kPosition)] // REVERSE WITH LEFT MOVEMENT
        }
        for (int i=0; i<from.length;i++){ //go through all elements in old array
            System.out.print(","+ too[i]);
        }
    }
}
//binary search tree (standard and recursive
//inverse string 
//loop through and copying data from linked list
//check if a string of brackets (all three bracket types is valid
//reverse words in a string (not letters)
//return the number of words in a string
//run length encoding of string > aaabbbbccc => a3b4c3
//reverse a linked list
