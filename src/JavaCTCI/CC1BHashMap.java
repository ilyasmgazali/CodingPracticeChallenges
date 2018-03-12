/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//it is not thred safe, unsynchronised //therefore faster as works with SINGLE THREAD
//allows one null key, multiple null values
//contins unique elements
//it maintins no order
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
    }
    // CREATE HASHMAP
    public static HashMap createHashMap(){
        HashMap<Integer, String> myMapPhonebook = new HashMap<Integer, String>(); //create hashmap
        myMapPhonebook.put(1,"one");
        myMapPhonebook.put(2,"two");
        
        return myMapPhonebook;
    }
    // GET VALUE WITH KEY
    public static Integer getValue(HashMap thisHash, Integer key){
        return (Integer)thisHash.get(key);
    }
    // GET ALL KEYS AND VALUE - 
    public static void getAllValuesMapFunction(HashMap thisMap){
        Set<  Entry<Integer, String>  > mySet = thisMap.entrySet();
        // for (TYPE variable: source)
        for(Entry<Integer, String> m : mySet ){
            System.out.println("" +   m.getKey() + m.getValue()  );
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
//hashmap methods
//2 hashmap question

//hashmap vs hashset differnces

//hashset methods
//2 hashset questions

//-------------

//array list properties 
//array list vs array 
//array list properties