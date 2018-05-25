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
public class CC5TreeQuestions {
    public static class BinaryTree{
        public static class Node{
            Node left,right;
            int key;
            Node(int key){
                this.key=key;
                left=right=null;
            }
            //logic here
        }
        static Node root;
        BinaryTree(){root=null;}//create a null tree
        BinaryTree(int key){root=new Node(key);} //create a tree with 1 node, using key
        BinaryTree(Node node){root=node;}////create a tree with 1 node, using Node
        /*
            Check height of tree - Recursive
        */
        //CHECK CC5TreeFile for weblink on explanation
        public static int getMaxHeight(Node root1){
            if (root1!=null)
                return 0;
            int left = getMaxHeight(root.left);
            int right = getMaxHeight(root.right);
            return Math.max(left, right)   +  1 ;//adds one to each step 
        }
        /*
            Check if a tree is balanced
        */
        public static boolean checkBalanced(Node root1){
            if(root1==null){return true;}//Base case + test case
            
            //at each stage
            int check = getMaxHeight(root1.left) - getMaxHeight(root1.right);
            
            if(Math.abs( check ) > 1) //if difference ever more than one     //base case 2
                return false;
            else //recursive 
                //Same as
                //return checkBalanced(root1.left &&) checkBalancedd(roo1.right);
                
                if(  checkBalanced(root1.left) ==true && checkBalanced(root1.right)==true ) 
                    return true;
                else
                    return false;
                //if both above are tree then return true.
                //where i get confused if at each subtree i will return many true statements,
                //if i return a single true statement, does that mean the whole thing is true
                
                //logic states that, the program will never reach this code, as the difference
                //in the highest stack will never be below a difference of n > 1
                //therefore the final stack will result in true each time
        }
        //PostOrderModified
        //Version 2: Time 0(n), Space(H), height
        //https://www.youtube.com/watch?v=TWDigbwxuB4 - best explanation
        public static int checkBalancedPostOrderModified(Node root){//initial
            if(root==null){return 0;}
            
            //check left
            int leftHeight = checkBalancedPostOrderModified(root.left); //return 0 last one
            if(leftHeight==-1){return -1;}//check difference, return 0 if null
            
            //check right
            int rightHeight = checkBalancedPostOrderModified(root.right);//return 0 last one
            if(rightHeight==-1){return -1;}//check difference, return 0 if null
            
            //check current is balanced
            int heightDiff = leftHeight-rightHeight;
            if(Math.abs(heightDiff)>1){
                return -1; //not balanced
            }else{
                return Math.max(leftHeight, rightHeight) + 1; //increment
                //basically adding 1 each time
                //by doing this the next recursion, it is checked against max(0,1)
                //         (1,0) 5
                //             / \
                //      (0,0)1  null
                //           / \
                //       null  null
                //notice how it moves up the recursive stack
            }
            //this will return height
        }
        public static boolean checkBalance2Wrapper(Node node){
            if(( checkBalancedPostOrderModified(node)==-1) )
                return false;
            else
                return true;
        }
        //q2 - graph
        
        //q3 - create a balanced tree from an array
        public static Node tree2Array(int[] arr, int startInt, int endInt){
            if(arr==null){return null;}//bases + test
            
            if(endInt<startInt){return null;}//base case
            
            int mid=(startInt+endInt)/2;
            Node node = new Node(arr[mid]);
            node.left=tree2Array(arr,startInt,mid-1);
            node.right=tree2Array(arr,mid+1,endInt);
            return node;
            
        }
        public static Node tree2ArrayWrapper(int[] arr){
            return tree2Array(arr, 0, arr.length-1);
        }
        
        public static void traverseInOrder(Node node){
            if(node==null){return;}//base case
            traverseInOrder(node.left);
            System.out.println(""+node.key);
            traverseInOrder(node.right);
        }
        
        public static void main(String[] args){
            int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
            BinaryTree bt = new BinaryTree( tree2ArrayWrapper(arr1) );
            bt.traverseInOrder(bt.root);
            
            //
        }
    }
}
