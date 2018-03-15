/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI;

// UNIQUE KEYS AND UNIQUE VALUES, i.e NO DUPLICATE VALUES

// IT CAN HAVE CAN HAVE SINGLE NULL KEY 

// USE ADD() TO INSERT

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/**
 *  GOOD SOURCE https://www.javatpoint.com/java-hashset 
 * @author ilyas.
 */

public class CC1CHashSET {
    public static void main(String[] args){
        //
        printHashSet(   createHashSet()   );
        //traverse(   createHashSet() ); 
    }
    // CREATE
    public static HashSet<String> createHashSet(){
        HashSet<String> myHashSet = new HashSet<String>(); 
        // OR Set<String> hsString = new HashSet<>(56); // you can also have fixed size        
        myHashSet.add("Aisha");
        myHashSet.add("Second");
        myHashSet.add("Third");
        //System.out.println(myHashSet);
        return myHashSet;
    }
    // PRINT
    public static void printHashSet(HashSet mySet){
        //Print method 1 no square brackets
        Iterator ig = mySet.iterator();
        while(ig.hasNext()){
            System.out.println("" + ig.next()); //next gives you next thing in array
        
        }
        
        //Print method 2 - with square brackets
        System.out.println(mySet);
    }
    // TRAVERSE FUNCTION - COMPARE EACH ELEMENT AND CHECK IF THEY EXIST
    public static void traverse(HashSet mySet){
       //For loop - basic
        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(" " + ); // does not have index//////
        }

        //For loop - advanced
        for(Object o: mySet ){
            System.out.println(mySet.contains(o));
        }
                
        //Iterator
        Iterator it = mySet.iterator();
        while(it.hasNext()){
            it.next();
        }
    }
    // ARRAY --> LIST --> SET. THIS TYPE CONVERSION EVENTUALLY RESULTS IN A SET, THEREFORE IT BECOMES UNIQUE
    public static void arryToListToSet(){
        String[] stringArray1 = {"A","B","C","D"}; // create arry of strings
        List<String> list1 = Arrays.asList(stringArray1); // convert into list
           
        //constructors
        Set<String> set1 = new HashSet<String>(list1); // convert into hashset, note look at constructor. this makes it UNIQUE
        //other contructors
        //Set<String> set1 = new HashSet<String>(100); this denotes size/capacity
    }
}

/**
 *   METHODS    
 *      create
 *      
 *      retrieve
 *      boolean - contains(Object 0)
 *      boolean - isEmpty() -
 *      size
 *          int - size() - get size     
 * 
 *      update
 *      boolean - remove(Object o) - it is used to remove the specified element
 *      boolean - add(Object) - adds element to set, if it is already present true
 *      //from higher up in framework 
 *              boolean - addAll(Collection);
 *              boolean - toArray();
 * 
 *      delete
 *      void clear() - 
 *      
 *      other
 *      Object - clone() - shallow copy (elements are not copied) used for comparison == and not set.equals(shallow)
 *      Iterator - iterator() - e.g Iterator it = set1.iterator(); then use while loop.
 */
