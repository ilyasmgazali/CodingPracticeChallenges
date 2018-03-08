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
// 1 Create Collection 2 Insert an item 3 remove an item 4 test weather the collection is empty
// FIRST ONE IN, FIRST ONE OUT
// PUSH (IN), POP (OUT)
public class Java2Stack {
    //
    public static void main(String[] args) {
        System.out.println("Main Line 1 _____"); //first
        function1();
        System.out.println("Main Line 2 _____"); //last
    }
    public static void function1(){
        System.out.println("Fun1 A"); //second
        function2();
        System.out.println("Fun1 B");
    }
    public static void function2(){
        System.out.println("Fun2 line 1"); //third
    }
    
}
