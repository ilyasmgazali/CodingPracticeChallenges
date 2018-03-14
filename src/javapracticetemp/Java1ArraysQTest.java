// More current versoin of: Java1ArrayQuestions.java




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
public class Java1ArraysQTest {
    public static void main (String args[]){
        //System.out.println( linearSearchWhichPosition( createArray(), 3 ) );
        //rotateKPosition( createArray(), 0 );
        //System.out.println(":  " + binarSearch(createArray(),4));
        maxSumArray(createArray2());
    }
    //CREATE ARRAY
    public static int[] createArray(){
        int[] thisArray = {1,2,3,4,5}; //10?
        return thisArray;
    }
    //CREATE ARRAY2
    public static int[] createArray2(){
        int[] array1 = {0,-1,5,5,5,0,-50,20,0,0,0,-20,10,10,10,10,10,10};
        return array1;
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
    //-----------------TRY AGAIN---------------------CORRECT BUT MORE KNOWLEDGE REQUIRE
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

    
    // MAX SUB ARRAY (KADANES ALGORITHM) Best explanation https://algorithms.tutorialhorizon.com/kadanes-algorithm-maximum-subarray-problem/
    public static void maxSumArray(int[] thisArray){
        //variables for current and max
        int maxSum=0;int currentSum=0;
        for(int i=0;i<thisArray.length;i++){
            currentSum=currentSum+thisArray[i];//calculate current sum
            if(currentSum<0){
                currentSum=0;//disregard and reset to 0
            }
            if(currentSum>maxSum){
                maxSum=currentSum;//update if a new max number is found
            }
        }
        System.out.println("Max Sum: "+maxSum);
    }
    
}
