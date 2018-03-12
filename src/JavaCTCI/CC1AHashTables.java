/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//thread safe, synchronised // therefore slow
//works with multiple threads
//does not allow null key
package JavaCTCI;

import java.util.Enumeration;
import java.util.Hashtable;
/**
 *
 * @author ilyas
 */
// STORE KEY/VALUE PAIRS
// SPECIFY OBJECT - USED AS KEY.    VALUE IS LINKED TO KEY. KEY IS HASHED AND USED AS INDEX IN THE TABLE.

//CONSTRUCTORS
    //HASTABLE() - DEFAULT CONSTRUCTOR
    //HASHTABLE(INT SIZE) - CONSTRUCTOR WITH INITIAL SIZE SPCIFIED BY INTEGER VALUE SIZE
    //HASHTABLE (INT SIZE, FLOAT FILLRATIO) - INITAL SIZE SPECIFIED HOW FULL TABLE MUST BE IN ORDER TO RESIZE UPWARDS, FLOAT 0.0 TO 1.0
    //HASHTABLE (MAP < ? extends K, ? extends V >t)) CONSTRUCTS HASHTABLE WITH GIVEN MAPPING

//METHODS
    //create--------
    //Object put(Object key, Object value) - Insert a key and value into hash tablem returns null if key is no already there and returns previous value associated with key if key is already in the hash table
    //void rehash() - Increase size of hash table and rehash all of its keys
    // Object clone() - return duplicate of invoking object
    
    //check---------
    //boolean contains(Object value) returns true is value exists withing table,    
    //boolean containsKey(Object key) - true if key exists, 
    //boolean containsValue(Object value)
    //int size()
    //boolean isEmpty() - Returns true is table is empty + contains no keys
    
    //retrieve------
    //Enumeration elements() returns object values, 
    //Enumeration keys() returns keys
    //Object get(Object key) - returns object with associated key
    
    //clear---------
    //clear() resets and empties hashtable, Object clone() returns a duplicate of the invoking object, 
public class CC1AHashTables {
    //
    public static void main(String[] args){
        createHashTable();
    }
    public static void createHashTable(){
        Hashtable balance = new Hashtable(); //create hashtable
        Enumeration names; //enum names 
        String str; //for storing string of enum object
        double bal; //for storing balance from get method
        
        balance.put("Zara", 3434.34); //    key ,value
        balance.put("Mahnaz", new Double(123.22));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", -19.08);
        
        //show all balances in hash table
        names = balance.keys();
        //ENUM METHODS
            //boolean hasMoreElements() - returns true if there are more elements to extract
            //Object nextElement() - returns the next object in the enum as a geeneric objec reference
        while(names.hasMoreElements()){
            str = (String)names.nextElement();
            System.out.println(str+":   "+balance.get(str)); // str = key, get(key)
        }
        System.out.println();
        
        //Deposit 1,000 into Zara's bank account
        bal = (   (Double)balance.get("Zara")    );
        balance.put("Zara", bal+1000);
        System.out.println("Zara new Balnace:   "+balance.get("Zara"));
    }
    //some other example
    private static final Hashtable<String,Integer> MYHASH = new Hashtable<String,Integer>() {{
    put("foo",      1);
    put("bar",      256);
    put("data",     3);
    put("moredata", 27);
    put("hello",    32);
    put("world",    65536);
    }};
    
    //Map<type1, type2> mymap = new HashMap<>();
    //phonebook.put("ilyas", "07550363779");
    //........
}
