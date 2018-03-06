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
public class JavaArrayFunctions {
    public static void main (String args[]){
        //create array 
        int array1[][] = new int[5][2];
        int array2[] = {1,2,3,4};
        //create array multi
        int array3[][] = new int[2][5];
        int[][] arr4 = { {1,3,4,5}, {60,70,80} };
        
        printMultDArray(arr4);
    }
    /*  This method prints arrays   
    *
    */
    public static void printArray(int[] thisArray){
        for(int i=0;i<thisArray.length-1;i++){
            System.out.println(":"+thisArray[i]);
        }
    }
    /*  This method prints multi D arrays   
    */
    public static void printMultDArray(int[][] multiD){
        //NOTE FOR MULTI dimentional array dont use length -1 !!!!!!!!!!!!!!!!!!!
        for(int i=0;i<multiD.length;i++){
            for(int j=0;j<multiD[i].length;j++){
                System.out.println(": "+multiD[i][j]);
            }
        }
    }
    
    
    
    
}


