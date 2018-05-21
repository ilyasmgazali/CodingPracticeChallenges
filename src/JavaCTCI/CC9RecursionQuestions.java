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
    
    /** Q1. CHAPTER 9.
     *  A child is running up a staircase with n steps, and can hop either 1 step, 2 steps or 3 steps at a time
     *  Implement a method to count how many possible ways the child can run up the stairs
     */
    public static int possibleHops(int n){
        if(n<0) //doesnt land on anything
            return 0;
        else if(n==0) //lands
            return 1; 
        else
            return possibleHops(n-1) + possibleHops(n-2);
    }
    //********** 2nd one, come back to later **************
    
    //ctci chapter8, q3 - find magic index using recursion
    //NOTE THIS IS FOR ....DISTINCT ELEMENTS..... IT CANT EVEN BE -20, 20...ETC
    //NOTE RECURSION IS ALWAYS 'SINGLE' MAGIGINDEX(), IT IS NOT MAGICINDEX()+2 ETC, THEREFORE ONE ANSWER
    public static int magicIndex(int[] magic, int start, int end){
        if(end<start||end>=magic.length) // ?? condition --> start<0 is included but looks like this is not required
            //finishes searching
            //end has decremented past start
            //start has become too small?????????
            //last has gone past increment
            return -1;
        else{
            int mid = (start+end)/2; // new value of mid each time
            if (magic[mid]==mid){//if mid is found
                return mid;
            }
            System.out.println("9999999");
            //search left or right
            if(magic[mid]>mid){ //must be in left region
                return magicIndex(magic, start, mid-1); //edit new end
            }else{//must be in right region hand side
                return magicIndex(magic, mid+1, end); //edit new start
            }
        }
    }
    //calls above method
    public static int magicIndexCaller(int[] array){
        return magicIndex(array, 0, array.length-1);
    }
    
    static int magicIndexDuplicates(int arr[], int start, int end)
    {
        // If No Magic Index return -1;
        if (start > end)
        {System.out.println("returning -1");return -1;}
     
        int midIndex = (start + end) / 2;
        int midValue = arr[midIndex];
     
        // Magic Index Found, return it.
        if (midIndex == midValue)
            return midIndex;
     
        // Search on Left side
        //0 to midindex -1
        System.out.println("Left Search Before");
        int left = magicIndexDuplicates(arr, start, Math.min(midValue,midIndex - 1));
        System.out.println("Left Search After");
        
        // If Found on left side, return.
        if (left >= 0)
            return left;
     
        // Return ans from right side.
        System.out.println("Right Search Before");
        return magicIndexDuplicates(arr, Math.max(midValue, midIndex + 1), end);
        
    }
    public static int magicIndexDuplicatesCaller(int[] arr){
        return magicIndexDuplicates(arr, 0, arr.length-1);
    }
    
    
    
    //main driver class
    public static void main(String[] args){
        //Q1
        //int noOfStairs = 4;System.out.println(possibleHops(noOfStairs)+" Steps");
        //Q2
        //?
        //Q3
        //int[] myInt = {-2,-1,0,1,4,10,11,22,33,44,55,66};System.out.println(""+magicIndexCaller(myInt) );
        //3B
        int arr[] = { -11, -10, -5, 3, 3, 3, 3, 4, 7, 9, 12, 13 };
        int arr2[] = {-10, 5, 2, 2, 2, 3, 4, 7, 9, 12 , 13};
        System.out.println("3B: "+magicIndexDuplicatesCaller(arr2) );
    }
}