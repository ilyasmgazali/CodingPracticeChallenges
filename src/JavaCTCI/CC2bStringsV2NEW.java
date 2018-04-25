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
public class CC2bStringsV2NEW {
    /**
     */ 
    public static void main(String[] args){
        // Q1
        //String testString = "Helo mat"; System.out.println(    uniqueCheck(testString) );
        // Q2
        //String testString = "abcd"; System.out.println(  reverseString(testString)   );  
        // Q3
        String testString = "A B C"; System.out.println( replace(testString)  );
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
            
            //should be that the below two lines are used to get ASCII number of character
            //they should also be used in the check, but i java did it for me
            //int ASCII = (int)myCharArray[i]; ////////////////////// MISSED THIS LINE BUT IT STILL WORKED
            //if (    check[ASCII]    )... this character is returned as ascii 
            
            if(check[   myCharArray[i]  ] == true){
                //it is already true
                return true;
            }else{
                //make it true
                check[ myCharArray[i] ] = true;
            }
        }
        return false;
    }
    /*
    *   Chapter 1 Question 1 - String - Unique characters
        SECOND ANSWER
        O(n Log n)
        https://www.geeksforgeeks.org/determine-string-unique-characters/
    */
    
    // ----------------------- FUTURE --------------------------------
    
    /**
     *  - CTCI Q2 - Reverse A String.
     *  0(n).
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
    
    // ----------------------- FUTURE --------------------------------
    //Expand the above question to also have a recursive solution
    
    /**
     * Chapter 1 Question 4 - String - Replace String Spaces With '20%'
     *  O(n).
    */
    public static String replace(String methodString){
        //convert string to char array
        char[] myChar = methodString.toCharArray();
        //calculate the length of new char array to be created
        //  iterate through char, identifying spaces and additing to counter
        int counter =0;
        for(int i=0;i<myChar.length;i++){
            if (myChar[i]==' '){
                counter++;counter++;
            }
        }
        int newCharSize = (myChar.length)+(counter); 
        System.out.println(newCharSize);
        //create a new char array, with adjusted size
        char[] newChar= new char[newCharSize];
        //iterate through old and new char array simultaneously,
        //  copy directly
        //  add 20% where a character is found
        for(int i=0,j=0;i<newChar.length;i++,j++){
            if(myChar[j] ==' '){
                newChar[i] = '2';
                i++;
                newChar[i] = '0';
                i++;
                newChar[i] = '%';       
            }else{
                newChar[i] = myChar[j];
            }
        }
        return String.copyValueOf(newChar);
        //O(n)+O(n)
    }
    /**
    *  - CTCI Q3 - Permutation
    *  0?.
    */
    
    // ----------------------- FUTURE --------------------------------
    //this question requires at least 2 hours
    
    /**
    *  - CTCI Q3 - Permutation
    *  0?.
    */
    
    
    
    
    
}
 /**
 *  METHODS
 *      -   toCharArray() - converts this string into character array. returns newly created character array.
 *      -   charAt() - returns a char value at the given index number. index number starts from 0. else an exception is given.
 * 
 *  String
 *      - String.copyValueOf(newChar) - dynamically create new String and assign 
 */