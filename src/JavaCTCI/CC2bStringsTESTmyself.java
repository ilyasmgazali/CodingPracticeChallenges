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
        // Q1
        //String testString = "Helo"; System.out.println(    uniqueCheck(testString) );
        // Q2
        //String testString = "abcd"; System.out.println(  reverseString(testString)   );    
    }
    /**   
     *  Print char array, no loop
    */
    public static void printCharArray(char[] thisArray){
        System.out.println(thisArray);
    }
    /**   
     *  Print String
    */
    public static void printString(String s){
        System.out.println(s);
    }
    /**
     *  CTCI 1 - Check if all strings are unique - 
     *  Big O is 0(n).
     *  First answer
     *  https://www.geeksforgeeks.org/determine-string-unique-characters/
     */
    public static boolean uniqueCheck(String methodString){
        //create array of boolean, set to false as default
        boolean[] check = new boolean[256]; 
        // create array of methodString chars to loop through
        char[] myCharArray = methodString.toCharArray();
        //loop through char array
        for(int i=0; i<myCharArray.length;i++){
             //write code to turn them true, if already true, then you have duplicate
             
            //int ASCII = (int)myCharArray[i]; ////////////////////// MISSED THIS LINE BUT IT STILL WORKED
            if(check[   myCharArray[i]  ]==true){
                //
                return true;
            }else{
                check[ myCharArray[i] ] = true;
            }
        }
        return false;
    }
    /**
     *  - CTCI Q2 - Reverse A String.
     *  .
     */
    public static String reverseString(String methodString){
        //create a char array
        char[] myChar = methodString.toCharArray();
        //temp value
        char temp = 'a';
        
        //reverse array using simple reverse for loop
        for(int i=0, j=myChar.length-1;     i<j;    i++,j--){
            //swap method
            temp = myChar[i]; //temp value
            myChar[i] = myChar[j];
            myChar[j] = temp;
        }
        //long way
        String s = "";
        s = s.copyValueOf(myChar);
        return s;
        //short way
        // return String.copyValueof(myChar); https://www.tutorialspoint.com/java/java_string_copyvalueof.htm
    }
}
