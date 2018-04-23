/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticetemp;
/**
 *
 * @author ilyas DOCUMENTATION https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html
 */


import java.util.Arrays;

//--------REMEMBER in for loop LENGTH-1 is for when ...i<=array.length-1... NOT ...i=array.length... REMEMBER -1 IS FOR LESS THAN OR EQUALS TO ONLY
public class Java1ArrayBasicFunctions {
    public static void main (String args[]){
        //create array 
        int[] array1 = new int[5];
        int[] array2 = {1,2,3,4};
        
        int[] array2Half = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        
        //create array multi - REMEMBER [ Y ],[ X ]
        int array3[][] = new int[2][5];
        int[][] arr4 = { {1,3,4,5}, {60,70,80} };
        printArray(array2Half);
        //printMultDArray(arr4);
    }
    /* CREATE TWO DIMENTIONAL ARRAY   
    */
    public static int[][] createTwoDimentionalArray(){
        int[][] arr = { {1,3,4,5}, {60,70,80 } };
        return arr;
    }
    /*  PRINT ARRAY 
    *
    */
    public static void printArray(int[] thisArray){
        
        int kPosition = 5;
        
        for(int i=0;i<thisArray.length-1;i++){
            System.out.println(":"+thisArray[i]);
            System.out.println("-------"+(thisArray[i]%kPosition));
        }
    }
    /*  PRINT MULTIDIMENTIONAL ARRAY   
    */
    public static void printMultDArray(int[][] multiD){
        //NOTE FOR MULTI dimentional array dont use length -1 !!!!!!!!!!!!!!!!!!!
        for(int i=0;i<multiD.length;i++){
            for(int j=0;j<multiD[i].length;j++){
                System.out.println(": "+multiD[i][j]);
            }
        }
    }
    /*  COMPARE ARRAYS, SINGLE OR MULTIDIMENTIONAL
    */
    public static boolean compareArrays(int[][] multiD,int[][] multiD2){
        // CAN ALSO USE Arrays.Equals(x,x); FOR STANDARD ARRAYS
        //if (Arrays.deepEquals(multiD,multiD2)){
        if (Arrays.deepEquals(multiD,multiD2)){
            return true;
        }else{
            return false;
        }
        //RETURN STATEMENT NOT REQUIRED SEE BELOW
        //return Arrays.deepEquals(multiD,multiD2);
    }    
}
