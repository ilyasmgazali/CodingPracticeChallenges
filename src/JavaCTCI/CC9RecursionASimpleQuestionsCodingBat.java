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

//http://codingbat.com/java/Recursion-1

public class CC9RecursionASimpleQuestionsCodingBat {
    //factorial
    //n*(n-1)*(n-2).... 1
    public int factorial(int n) {
    if(n==1)
        return 1;
    else
        return n * factorial(n-1);
    }
    /**
    The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.


    fibonacci(0) → 0
    fibonacci(1) → 1
    fibonacci(2) → 1
     */
    public int fib(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
    
    

    /**
     * 
    We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).


    bunnyEars(0) → 0
    bunnyEars(1) → 2
    bunnyEars(2) → 4
    */
    public int bunnyEars(int n) {   
        if(n==0)
            return 0;
        else
            return 2 + bunnyEars(n-1);
    }
    
    /**
    We have bunnies standing in a line, numbered 1, 2, ... 
    The odd bunnies (1, 3, ..) have the normal 2 ears.
    The even bunnies (2, 4, ..) we'll say have 3 ears, 
    because they each have a raised foot. 
    Recursively return the number of "ears" in the bunny line 1, 2, ... n 
    (without loops or multiplication).

    bunnyEars2(0) → 0
    bunnyEars2(1) → 2
    bunnyEars2(2) → 5
    */
    public int bunnyEars2(int n) {
      if(n==0)
        return 0;
      else
        if(n%2==0)
        return 3 + bunnyEars2(n-1);
      else
        return 2 + bunnyEars2(n-1);
    }
    /**
     * 

    We have triangle made of blocks. The topmost row has 1 block,
    the next row down has 2 blocks, the next row has 3 blocks,
    and so on. Compute recursively (no loops or multiplication) the 
    total number of blocks in such a triangle with the given number of rows.


    triangle(0) → 0
    triangle(1) → 1
    triangle(2) → 3
    */
    public int triangle(int n) {
    if(n==0)
        return 0;
    else
        return n + triangle(n-1);
    }    
    
    /**
     * 
    Given a non-negative int n, 
    return the sum of its digits recursively (no loops).
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    sumDigits(126) → 9
    sumDigits(49) → 13
    sumDigits(12) → 3
     */
    public static int sumDigits(int n,int sum) {
      if(n==0)
        return sum;
      else
        //first add right most digit, then remove right most digit   
        //ADD right most digit
        sum= sum + (n % 10); //recursive variable to keep the digitSum
        //REMOVE right most digit
        n = n / 10;
        return sumDigits(n,sum);///returning sum to print it
    }
    
    
    /**
    Given a non-negative int n, return the count of the occurrences of 7 as a digit,
    so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    
    count7(717) → 2
    count7(7) → 1
    count7(123) → 0
    */
    public static int count7(int n, int sum){ 
        if(n==0)
            return sum;
        else
            if(n%10==7){//compare right most
                sum=sum+1;
                //remove right most
                n=n/10;
                return count7(n,sum);
            }else{
                //remove right most anyway
                n=n/10;
                return count7(n,sum);
            }
    }
    /**
     * 
    Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
    except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. 
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    count8(8) → 1
    count8(818) → 2
    count8(8818) → 4
     */
    public static int countDouble8(int n, int sum){//DIFFERENT SOLUTION ON GoogleSearch
        if(n==0)
            return sum;
        else
            if((n/10)==8){sum++;} //wrong gives right most not left most
            if((n%10)==8){//compare right most
                //remove right most
                n=n/10;
                sum=sum+1;
                return countDouble8(n,sum);
            }else{
                //remove right most
                n=n/10;
                return countDouble8(n,sum);
                
            }    
    }
    
    /**
    Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
    so powerN(3, 2) is 9 (3 squared).

    powerN(3, 1) → 3
    powerN(3, 2) → 9
    powerN(3, 3) → 27
    */
    public static int powerN(int base, int n) {
      if(n==0)
        return 1;
      else
        return base * powerN(base,n-1);
    }
    
    /**
    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

    countX("xxhixx") → 4
    countX("xhixhix") → 3
    countX("hi") → 0
    */
    public int countX(String str) {
      if(str.length()==0)
        return 0;
      else
        //check index 0
        if(str.charAt(0)=='x'){
          //remove index 0
          return 1 + countX(str.substring(1) ); //return new string
        }else{
          return countX(str.substring(1) ); //return new string
        }
        //this makes the substring smaller each time
    }
    
    /**
    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

    countX("xxhixx") → 4
    countX("xhixhix") → 3
    countX("hi") → 0
     */
    public int countHi(String str) {  
      if(str.length()==0){
        return 0;//add 0 to the stack
      }else{
        if( str.charAt(0)=='h' && str.length() > 1 && str.charAt(1)=='i')
        {
          //decrement string, return new string
          return 1 + countHi(str.substring(2) );
        }
        else
        {
          //decrement string, return new string
          return countHi(str.substring(1) );
        }
      }
    }
    /**
    Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

    changeXY("codex") → "codey"
    changeXY("xxhixx") → "yyhiyy"
    changeXY("xhixhix") → "yhiyhiy"
     */
    public String changeXY(String str) {
     if(str.length()==0 ) //stop statment
       return str; //return string at end
     else
       if(str.charAt(0)=='x'){
           // ADD Y TO THE STACK + NEXT TING
         return 'y' + changeXY(str.substring(1)); //2ND IS LIKE A PROMISE
       }else{
           // ADD SAME THING TO THE STACK 
         return str.charAt(0) + changeXY(str.substring(1)); //2ND IS LIKE A PROMISE
       }
    }
    /**
    Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

    changePi("xpix") → "x3.14x"
    changePi("pipi") → "3.143.14"
    changePi("pip") → "3.14p"
     */
    public String changePi(String str) {
      if(str.length()==0)
        return str;
      else{
        if(str.length()>1 && str.charAt(0)=='p' && str.charAt(1)=='i')//checks
          //add 3.14 to the stack
          //pass on after the current index, more accuracy of indexes if...
          //i were to use chars
          return "3.14" + changePi(str.substring(2) );
        else
          //add current to the stack and
          //pass on next
          return str.charAt(0)+changePi(str.substring(1));
      }
    }
    
    /**
    Given a string, compute recursively a new string where all the 'x' chars have been removed.


    noX("xaxb") → "ab"
    noX("abc") → "abc"
    noX("xx") → ""
     */
    public String noX(String str) {
      if(str.length()==0)
        return str;
      else
        if(str.charAt(0)=='x') {
          //decrement by 1
          //remove previous from stack
          return noX(str.substring(1) );
        }else{
          //decrement by 1 
          //add previous to stack
          return str.charAt(0) + noX(str.substring(1) );
        }
    }

    
    //Some Tests are already complete in browser 
    public static void main(String[] args) {
        System.out.println("Sum of Digits   :"+sumDigits(126,0));
        System.out.println("Count 7         :"+count7(7727,0)); //can be done with 1 input
        System.out.println("Count Double    :"+countDouble8(88989,0)); //can be done with 1 input (DIFFERENT SOLUTION ON GoogleSearch)
        System.out.println("Base Powers     :"+powerN(10,3)  );
    }
}