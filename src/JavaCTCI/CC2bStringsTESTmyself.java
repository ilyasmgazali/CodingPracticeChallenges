/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI;

/**
 *
 * @author ilyas
 */
public class CC2bStringsTESTmyself {
    /**
     */ 
    public static void main(String[] args){
        //
        String testString = "Helo"; System.out.println(    uniqueCheck(testString) );
    }
    /**
     *  Check if all strings are unique 
     */
    public static boolean uniqueCheck(String methodString){
        //create array of boolean, set to false as default
        boolean[] check = new boolean[256]; 
        // create array of methodString chars to loop through
        char[] myCharArray = methodString.toCharArray();
        //loop through char array
        for(int i=0; i<myCharArray.length;i++){
             //write code to turn them true, if already true, then you have duplicate
            if(check[   myCharArray[i]  ]==true){
                //
                return true;
            }else{
                check[ myCharArray[i] ] = true;
            }
        }
        return false;
    }
}
