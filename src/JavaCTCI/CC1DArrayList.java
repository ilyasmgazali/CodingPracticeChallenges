/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author ilyas
 */
public class CC1DArrayList {
    public static void main (String[] args){
        //
        printArray( createArrayList() );
        checkExistAndContains(  createArrayList(), 1, 2    );
        reverse(createArrayList());
        
    }
    // CREATE
    public static ArrayList<Integer> createArrayList(){
        //
        ArrayList<Integer> arrayL1 = new ArrayList<Integer>();
        arrayL1.add(1);
        arrayL1.add(2);
        return arrayL1;
    }
    // PRINT
    public static void printArray(ArrayList<Integer> myArray){
        System.out.println(myArray);
    }
    // CHECK IF EXISTS - GET AT INDEX
    public static void checkExistAndContains(ArrayList<Integer> myArray, int index, Integer checkIfExists){
        //Check index +     //Check if exists 
        System.out.println("Check Index: " + myArray.get(index) +
                           "    Check if exists: " + myArray.contains(checkIfExists) +
                           "    Check if empty: " + myArray.isEmpty() +
                           "    Index of 1: " + myArray.indexOf(1) +
                           "    Size of ArrayList: " + myArray.size() );
    }
    // TRAVERSE - FOR LOOPS - WHILE LOOP - ITERATOR
    public static void forLoop(ArrayList<Integer> myList){
        // Normal for loop
        for(int i=0;i<myList.size();i++){
            //
            System.out.println(     myList.get(i)   );
        }
        // Advanced For Loop
        for(Integer temp : myList){
            System.out.println(temp);
        }
        // While loop
        int j =0;
        while(myList.size()<j){
            myList.get(j);
            j++;
        }
        //Iterator
        Iterator it = myList.iterator();
        while(it.hasNext()){
            System.out.println("Items" + it.next() );
        }
    }
    // DELETE + FORLOOP
    public static ArrayList<Integer> delete(ArrayList<Integer> myArray, Integer toDelete ){
        for(int i=0; i<myArray.size();i++){
            if(myArray.get(i).equals(toDelete)){
                myArray.remove( i    ); //at index
                break; // breaks for loop, no point on looping once found
            }
        }
        return myArray;
    }
    // REVERSE ARRAYLIST CONTENT - BUILT IN METHOD
    public static void reverse(ArrayList<Integer> myList){
        Collections.reverse(myList); // BUILT IN METHOD
        for(Integer i : myList){
            System.out.println(i);
        }
    }
}