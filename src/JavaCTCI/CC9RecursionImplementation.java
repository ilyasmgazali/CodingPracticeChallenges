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
public class CC9RecursionImplementation {
    //Factorial recursion
    public static int fact(int n){
        //base case
        if(n==1) //break, last number is sequence
        {
            System.out.println("A"+n);
            return 1;
        }
        else
        {
            System.out.println("B"+n);
            return n*fact(n-1);
        }
    }
    // fact(n) = n * n-1 
    public static void main(String[] args){
        System.out.println("final " + fact(100));
    }
    
    
}
