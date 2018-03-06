/*
 * ARRAYS
 * QUESTIONS ON ARRAYS
 * QUESTIONS ON ARRAYS
 */
package javapracticetemp;

/**
 *
 * @author ilyas
 */
public class JavaArraysQTest {
    public static void main (String args[]){
        //System.out.println( linearSearchWhichPosition( createArray(), 3 ) );
        //rotateKPosition( createArray(), 0 );
        System.out.println(":  " + binarSearch(createArray(),4));
        
    }
    //CREATE ARRAY
    public static int[] createArray(){
        int[] thisArray = {1,2,3,4,5}; //10?
        return thisArray;
    }
    //PRINT ARRAY
    public static void printArray(int[] thisArray){
        for(int i=0;i<thisArray.length;i++){
            System.out.println(":"+thisArray[i]);
        }
    }
    //SUM ARRAY
    public static int sumArray(int[] thisArray){
        int sum=0;
        for(int i=0;i<thisArray.length;i++){
            sum = sum + thisArray[i];    
        }
        return sum;
    }
    //LINEAR SEARCH
    public static int linearSearchWhichPosition(int[] thisArray, int numberToSearch){
        for(int i=0;i<thisArray.length;i++){
            if( numberToSearch==thisArray[i]){
                return i;
            }
        }
        return -1;
    }
    //ROTATE BY K POSITIONS
    public static void rotateKPosition(int[] thisArray, int positionToRotate){
        if(thisArray==null||thisArray.length==1){
            return;
        }

        //out of bounds test
        if (positionToRotate>thisArray.length){positionToRotate=positionToRotate%thisArray.length;}
        
        //split into first  and second half
        //length of left hand side (first half)
        int leftHand = thisArray.length - positionToRotate;
        //rotateleft
        rotate(thisArray, 0, leftHand-1);
        //rightHand
        rotate(thisArray, leftHand, thisArray.length-1);
        //rotateAll
        rotate(thisArray, 0, thisArray.length-1); //take out this line if you just want to reverse it
        
        printArray(thisArray);
    }
    //ROTATE BY K POSITIONS - CONTINUED, second part
    public static void rotate(int[] thisArray,int left,int right){
        //exceptions
        if(thisArray==null||thisArray.length==1){
            return;
        }
        while (left<right){
            int temp = thisArray[left]; //starting point, temp carries left 
            thisArray[left]=thisArray[right]; //left is eliminated
            thisArray[right]=temp; //must obviously use temp instead of left
            //iterate until converge
            left++;
            right--;
        }   
    }           
    
    
    //-----------------TRY AGAIN---------------------
    //BINARY SEARCH TREE
    public static int binarSearch(int[] thisArray, int targetNo){
        //min max index
        int min = 0;
        int max = thisArray.length-1;
        while(min<=max){
            int guess = min + (max-min / 2);//average of numbers
            if(thisArray[guess]==targetNo){
                return guess;
            }
            if(thisArray[guess]<targetNo){
                min=guess+1;
            }else{
            }{
                max=guess-1;
            }
        }
        return -1;
    }
    //-----------------TRY AGAIN---------------------
        
}
