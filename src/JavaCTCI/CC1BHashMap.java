/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//it is not thred safe, unsynchronised //therefore faster as works with SINGLE THREAD
//allows one null key, multiple null values

//it maintins no order

// PERMITS SINGLE NULL KEY AND MULTIPLE NULL VALUES

// CONTAINS UNIQUE KEYS BUT NOT UNIQUE VALUES, ie. IT CAN CONTAIN DUPLICATE VALUES

//USE PUT() TO INSERT
package JavaCTCI;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 *
 * @author ilyas
 */
//Map<type1, type2> mymap = new HashMap<>();
    //phonebook.put("ilyas", "07550363779");
    //........
public class CC1BHashMap {
    //
    public static void main(String[] args) {
        HashMap<Integer, String> thisHash = createHashMap();
        
        printHashMap(   createHashMap()   );
    }
    // CREATE HASHMAP
    public static HashMap createHashMap(){
        HashMap<Integer, String> myMapPhonebook = new HashMap<Integer, String>(); //create hashmap
        myMapPhonebook.put(1,"one");
        myMapPhonebook.put(2,"two");
        
        return myMapPhonebook;
    }
    public static void printHashMap(HashMap hMap){
        System.out.println(""+ hMap);
    }
    
    // GET VALUE WITH KEY
    public static Integer getValue(HashMap thisHash, Integer key){
        return (Integer)thisHash.get(key);
    }
    
    
    // GET ALL KEYS AND VALUE - 
    /*
    *   MAP.ENTRY is a key value combined in one class. This allows you to iterate over 
    *   Map.entryset() instead of having to iterate over Map.keyset(), then find the value
    */
    public static void getAllValuesMapFunction(HashMap thisMap){ // --------------------------ENTRY
        Set<  Entry<Integer, String>  > mySet = thisMap.entrySet(); //CREATE ENTRY SET Map.entryset()
        // for (TYPE variable: source)
        for(    Entry<Integer, String>  m : mySet ){
            System.out.println("" +   m.getKey() + m.getValue()  ); //GETKEY GETVALUE
        }
    }
    
    //'Other way - GET ALLL VALUES ONCE YOU HAVE KEYS
    // THIS CAN BE A PRINT METHOD
    public static void getAllValuesArray(HashMap thisMap){
        //for keys
        Set<String> keys = thisMap.keySet(); //value()' for values collection
        
        for(String i : keys){
            System.out.println(i+" : " + thisMap.get(i)); //get using keys
        }
    }
    
    //CHECK IF DUBPLICATE EXISTS
    public static boolean checkDuplicateKeys(HashMap myHash, Integer myKey){
        if( myHash.containsKey(myKey) ){ //myHash.containsValue()
            return true;
        }else{
            return false;
        } 
    }
}   
/*
*   Methods
*       Create

        Retrieve

        Update

        Delete

        Other

        
*/