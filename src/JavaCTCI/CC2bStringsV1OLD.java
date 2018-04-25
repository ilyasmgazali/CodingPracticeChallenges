/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//http://largepixels.net/post/1046 - github

package JavaCTCI;

/**
 *
 * @author ilyas - JavaPoint Documentation - https://www.javatpoint.com/java-string
 */
public class CC2bStringsV1OLD {
    public static void main(String args[]){
        String s = "a b c e";
        char[] charArray = s.toCharArray();
        //printA( replace(charArray)  );
        //printS( reverseSwap(s)  );
        Unique1(s);
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
    /*
    *   Chapter 1 Question 1 - String - Unique characters
        FIRST ANSWER
        O(n)
        https://www.geeksforgeeks.org/determine-string-unique-characters/
    */
    public static boolean Unique1(String str){
        char[] cha = str.toCharArray();
        //off switch
        boolean[] listA = new boolean[256]; //this uses the boolean trick
        
        for(int i=0;i<cha.length;i++){
            int acsii = (int)str.charAt(i);
            if(listA[acsii]){
                System.out.println("Contains duplicate");
                return true;
            }else{
                listA[acsii]=true;
            }
        } 
        System.out.println("No duplicate");
        return false;
    }
    /*
    *   Chapter 1 Question 1 - String - Unique characters
        SECOND ANSWER
        O(n Log n)
        https://www.geeksforgeeks.org/determine-string-unique-characters/
    */
    
    // ----------------------- FUTURE --------------------------------
    
    /**   Chapter 1 Question 2 - String - Reverse A String
        O(n)
    */
    public static String reverseSwap(String str){
        char[] thisArray = str.toCharArray(); //opposite is--> String s=valueOf(thisArray);
        //swap method
        for(int i=0,j=thisArray.length-1; i<j; i++,j--){
            char temp =thisArray[i]; //temp first
            thisArray[i]=thisArray[j];
            thisArray[j]=temp;
        }
        return String.copyValueOf(thisArray);
    }
    /**
     * Chapter 1 Question 4 - String - Replace String Spaces With '20%'
     *  O??????.
    */
    public static char[] replace(char[] thisArray){
        int spaceCount = 0;
        int size = thisArray.length; 
        //calculate number of spaces
        for(int i=0;i<size;i++){
            if(thisArray[i]==' '){ // " " - String AND ' ' - char
                spaceCount++;
            }
        }
        //calculate new size
        int newSize = size + (  spaceCount*2    ); //e.g above turns 5->9
        //new char 
        char[] newArray = new char[newSize]; // new size becomes 9 
        //find spaces, input
        for(int i=0,j=0;    i<size||j<newSize;  i++,j++  ){
            if(thisArray[i]==' '){
                newArray[j]='2';
                j++;
                newArray[j]='0';
                j++;
                newArray[j]='%';
            }else{
                newArray[j]=thisArray[i];
            }
        }
        return newArray;
    }
}

/**
 *  METHODS
 *      -   toCharArray() - converts this string into character array. returns newly created character array.
 *      -   charAt() - returns a char value at the given index number. index number starts from 0. else an exception is given.
 * 
 */