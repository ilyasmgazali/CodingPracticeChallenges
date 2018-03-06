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
public class JavaZTemp {
    public static void main(String[] args) {
        maxSubArraySum( createArray() );
    }
    public static int[] createArray(){
        int[] array1 = {1,2,3,4,5};
        return array1;
    }
    public static void printArray(int[] thisArray){
        for(int i=0;i<thisArray.length;i++){
            System.out.println(": "+thisArray[i]);
        }
    }
    public static void maxSubArraySum(int[] thisArray){
        
        
        
        //print
        printArray( thisArray);
    }
}
