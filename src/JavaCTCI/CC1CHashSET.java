/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI;

// UNIQUE KEYS AND UNIQUE VALUES, i.e NO DUPLICATE VALUES

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


// IT CAN HAVEE CAN HAVE SINGLE NULL KEY (NO NULL VALUES)

//USE ADD() TO INSERT

/**
 *
 * @author ilyas
 */
public class CC1CHashSET {
    public static void main(String[] args){
        //
        printHashSet(   createHashSet()    );
    }
    // CREATE
    public static HashSet createHashSet(){
        HashSet<String> myHashSet = new HashSet<String>(); 
        // OR Set<String> hsString = new HashSet<>(56); // you can also have fixed size        
        myHashSet.add("Aisha");
        myHashSet.add("Second");
        myHashSet.add("Third");
        System.out.println();
        return myHashSet;
    }
    // RET
    public static void printHashSet(HashSet mySet){
        Iterator ig = mySet.iterator();
        while(ig.hasNext()){
            System.out.println("" + ig.next());
        }
        
        //OR SIMPLY
        System.out.println(mySet);
        
    }
    // ARRAY --> LIST --> SET. THIS TYPE CONVERSION EVENTUALLY RESULTS IN A SET, THEREFORE IT BECOMES UNIQUE
    public static void arryToListToSet(){
        String[] stringArray1 = {"A","B","C","D"}; // create arry of strings
        List<String> list1 = Arrays.asList(stringArray1); // convert into list
           
        //constructors
        Set<String> set1 = new HashSet<String>(list1); // convert into hashset
        //other contructors
        //Set<String> set1 = new HashSet<String>(100); this denotes size/capacity
    }
}

//CRUD