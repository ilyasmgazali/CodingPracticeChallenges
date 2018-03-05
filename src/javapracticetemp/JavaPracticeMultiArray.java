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
public class JavaPracticeMultiArray {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printArray(twoDimentionalArray());
    }
    public static int[][] twoDimentionalArray(){
        int[][] arr = { {1,3,4,5}, {60,70,80 } };
        return arr;
    }
    public static void printArray(int[][] arrrrrrr){
        for(int i = 0; i< arrrrrrr.length ;i++){
            for (int j = 0; j< arrrrrrr[i].length ;j++){
                System.out.println("i: "+ i +" " +" j: "+ j + " Number: ______ "+
                        arrrrrrr[i][j]); //this is the part that prints
            }
        }
    }
}

//OSI layer when you open up a website
//Write a program the reads IPv4 addresses from standard input and stores them in memory. If an octet contains a wildcard then the program should return all stored addresses that match. 
// scheduling, thread, process, MMU, synchronization mechanism <program can be asked>,Deadlock etc.
// when you type url in web browser, explain each step in detail. ping between two host. etc.