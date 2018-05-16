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
public class CC9RecursionQuestions {
    //Big O(3^N) - each branch makes 3 branch calls
    public static int possibleHops(int n){
        //TOP DOWN
        
        if(n<0){
            return 0; //only 1 answer BASE CASE
        }else if(n==1){
            return 1; //only 1 answer BASE CASE
        }else{
            //can be 3 answers/ possiblities
            return possibleHops(n-1)+possibleHops(n-2)+possibleHops(n-3);
        }
        
        //
        
    }
    
    //main driver class
    public static void main(String[] args){
        //
        int noOfStairs = 1;
        System.out.println(possibleHops(noOfStairs)+"Steps");
    }
}
