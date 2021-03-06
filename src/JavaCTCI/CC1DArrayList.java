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
    // TRAVERSE - FOR LOOPS - WHILE LOOP - ITERATOR - NOTE*** ORDERED!!!!!
    public static void traverseLoops(ArrayList<Integer> myList){
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
    // CHECK IF EXISTS - GET AT INDEX
    public static void checkExistAndContains(ArrayList<Integer> myArray, int index, Integer checkIfExists){
        //Check index +     //Check if exists 
        System.out.println("Check Index: " + myArray.get(index) +
                           "    Check if exists: " + myArray.contains(checkIfExists) +
                           "    Check if empty: " + myArray.isEmpty() +
                           "    Index of 1: " + myArray.indexOf(1) +
                           "    Size of ArrayList: " + myArray.size() );
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
        Collections.reverse(myList); // BUILT IN METHOD, COLLECTIONS METHOD
    }
}
// insert in middle of arraylist

/*
*   Methods
*       create
            create
            L   ist<type> myl = new ArrayList<type>();
            constructor
                ArrayList() - empty constructor
                ArrayList(Collections<? extends E>c) - List of elements
                ArrayList(int inicalCapacity)
             convert
                T<> T[] toArray(T[] a) - convert ArrayList to array
             Convert To Array
                Object[] toArray() - convert to array

        retrieve
            Object
                E get(int index) - This method returns the element at the specified position in this list
            index
                int indexOf(Object o) - find index of object, returns -1 is not present
            check
                boolean isEmpty() - check if empty
                int lastIndexOf(Object o) - index of last element --> similar to length-1. ALSO RETURNS -1 IF EMPTY
            size
                int size()

        update
            boolean add(E e) - add to end of list, give true if successful
            void add(int index, E element) - insert object at end of element
            boolean addAll(Collection E) - add new collection at end of list
            boolean addAll(int index, Collection E) - add new list into the old one at specified starting index
            
            void ensureCapacity(int minCapacity) - This increases the capacity of this ArrayList

            Change 
                E set(int index, E element) - replace element with at index with new element
            Trim to size
                void trimToSize() - trim to current array size

        delete
            Clear all
                void clear() - clear all
            At index
                E remove(int index) - remove at index
            At first instance
                boolean remove(Object o) - remove first instance if presence, 
            Range
                protected void removeRange(int fromIndex, int toIndex) - remove from range of indexes

        compare
            boolean compare(Object o) - true if same 

        other
*           Object clone() - shallow instance of array for == comparison
(
*/