/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//it is not thred safe, unsynchronised //therefore faster as works with SINGLE THREAD
//allows one null key
package JavaCTCI;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ilyas
 */
//Map<type1, type2> mymap = new HashMap<>();
    //phonebook.put("ilyas", "07550363779");
    //........


public class CC1HashMap {
    //
    public static void main(String[] args) {
        
    }
    public static HashMap createHashMap(){
        HashMap<String, String> myMapPhonebook = new HashMap<>();
        myMapPhonebook.put("A","1");
        myMapPhonebook.put("b","2");
        
        Set<String> keys = myMapPhonebook.keySet();
        
        return myMapPhonebook;
    }
    //'Other way
    public static void getAllValuesMapFunction(){
        //
    }
    //'Other way
    public static void getAllValuesArray(HashMap thisMap){
        //
        Set<String> keys = thisMap.keySet();
        for(String i : keys){
            System.out.println(i+" : " + thisMap.get(i)); //get using keys
        }
    }
    
}   
