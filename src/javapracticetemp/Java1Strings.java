/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticetemp;

/**
 *
 * @author ilyas
 */
public class Java1Strings {
    public static void main (String args[]){
        // 1
        //String myWords = "one two three";reverseWords(myWords);
        //2
        String[] myWords = {"one", "two", "three"}; stringBuilderMethod(myWords);
    }
    public static String reverseWords(String wordInput){
        String[] wordArray = wordInput.split(""); //NOTE: CAN ALSO SPLIT BY SPACE
        
        //INCOMPLETE
        printArray(wordArray);
        return "";
    }
    public static void printArray(String[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(" " + myArray[i] );
        }
        //or just
        //https://stackoverflow.com/questions/5283444/convert-array-of-strings-into-a-string-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
        String s = String.join(" ", myArray);
        //or Stringbuilder
        //or tostring? but does not seem to work that way
    }
    public static void stringBuilderMethod(String[] stringArray){
        //method stringbuffer
        StringBuffer sentence = new StringBuffer();
        for(String w: stringArray){
            sentence.append(w);
            sentence.append(" ");
        }
        System.out.println("Result: " + sentence.toString()); //built in StringBuffer method
    }
}
// NOTE: String methods e.g split
