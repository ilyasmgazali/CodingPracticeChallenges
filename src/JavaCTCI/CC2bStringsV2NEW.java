/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI;

//  https://www.javatpoint.com/java-string - DOCUMENTATION

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
        //String testString = "A B C"; System.out.println( replace(testString)  );
        // Q3a 
        //String a = "";String b="";System.out.println(": "+checkPerm(a,b));
        // Q3b
        //String a = "hello";String b = "helol"; System.out.println(": "+checkPerm2(a,b));
        // Q4
        //String testString = "A B C"; System.out.println( replace(testString)  );
        // Q5
        //String testString = "aabbccdd"; System.out.println(compression(testString));
        //Q5b
        String testString2 = "aaaaabbzzzzzzzzzzzzzzzz"; System.out.println(compressionImproved(testString2));
        
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
    
    // ----------------------- FUTURE --------------------------------
    //this question requires at least 2 hours
    
    /**
    *  - CTCI Q3 - Permutation
    *  0?.
    */
    //--------FIRST SOLUTION--------- simple, readable, not difficult
    public static boolean checkPerm(String str1, String str2){
        //edge case
        if(str1.length()!=str2.length()){
            return false;
        }
        
        return sort(str1).equals(sort(str2));
    } 
    public static String sort(String methodStr){
        //sort out char 
        char[] charToSort = methodStr.toCharArray();
        java.util.Arrays.sort(charToSort);
        return String.copyValueOf(charToSort);
        //Note other way create new String
        //return new String(charToSort);
    }
    //--------SECOND SOLUTION--------- 
    public static boolean checkPerm2(String str1, String str2){
        //THIS WAY CHECKS ASCII CHARACTER COUNTS
        
        //first edge case
        if(str1.length()!=str2.length()){
            return false;
        }
       
        //create ascii counter
        int[] asciiCounter = new int[256];
        
        //create and traverse through new char array, increasing counter
        char[] firstChar = str1.toCharArray();
        for(int i=0;i<firstChar.length;i++){
            //
            asciiCounter[  firstChar[i] ]++;
        }
        
        //traverse string2, decrease counter for ascii char, if <0, true
        for(int i=0;i<str2.length();i++   ){
            //ascii str>char>int
            int ascii = (int)str2.charAt(i);
            
            //decrement counter in array, if 0, then it did not exist previously
            if(--asciiCounter[ascii] < 0){
                System.out.println("check character:    "+asciiCounter[ascii]);
                return false;
            }
        }
        return true;
    }

    //--------  EXTENSION ----------
    /**
    *  - CTCI Q3 - EXTENSTION - GEEKS FOR GEEKS - Permutation (PRINT ALL)
    *  https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
    */
    
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
     * Chapter 1 Question 5 - Basic String Compression e.g aaabbbaaa = a3b3a3
     *  O(n2) - DUE TO STRING CONCATENATION .
    */
    // REMEMBER, if compressed can be larger than original
    
    //--------------THIS SOLUTION DOES NOT WORK IN "LARGER" COMPRESSED CASE
    public static String compression(String str1){
        //first convert to char
        char[] content = str1.toCharArray();
        
        String compressedString = ""; //to append or 'concatenate'
        
        //then create pointer to last character
        char last = content[0];//to start of with
        int count = 1;//default to one 
        
        for(int i=0;i<content.length;i++){//iterate through char
            if (last==content[i]){//if it already exists, increment
                count++;
            }else{
                // ADD TO COMPRESSED CHAR +COUNTER HERE, reset pointer 
                compressedString = compressedString + last + count;
                last=content[i];
                count=1;
            }
        }
        return compressedString;
    }
    public static String compressionImproved(String str1){
        //create an array of strings
        String[] stringArray = str1.split("");
        //create a stringbuffer to improve code
        StringBuffer newSentence = new StringBuffer();
        //create a counter starting at 0
        int counter = 1;
        //create a pointer make it on off only (possibly boolean)
        String pointer = stringArray[0];
        //when going through whole sequence, if new concat and print old
        for(int i=1;i<stringArray.length;i++){
            //
            
            if(pointer.equals(  stringArray[i]) ){//case where second is same as first
                counter++;
            }else{
                newSentence.append(pointer);
                newSentence.append(counter);
                //reset counter, reset pointer
                counter=1; 
                pointer=stringArray[i]; 
            }
        }
        //NOTE LAST SET IS NEVER RUN, THIS IS DUE THERE BEING NO 'NOT EQUALS CASE' AT END
        //THEREFORE MUST DO IT MANUALLY
        newSentence.append(pointer); //************
        newSentence.append(counter); //***********
        
        return newSentence.toString();
    }
    // WITH METHOD ABOVE
    //public static vo
    
    
    
    
    
    
}
 /**
 *  METHODS
 *      -   toCharArray() - converts this string into character array. returns newly created character array.
 *      -   charAt() - returns a char value at the given index number. index number starts from 0. else an exception is given.
 *      -   split(","); returns array of type String 
 * 
 *  String
 *      - String.copyValueOf(newChar) - dynamically create new String and assign .
 *      - String.split(",", myStringArray);
 * 
 * String[]
 *      - split()
 */
