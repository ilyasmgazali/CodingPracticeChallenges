/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCTCI;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
            if (root1==null)
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
                //if i return a single false statement, does that mean the whole thing is false
                
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
        
        //Q3 - create a balanced tree from an array
        //NOT!!! BUT SORT OF LIKE, A PRE ORDER
        /**
        A BST is balanced if:
        Height of left subtree and right subtree of root differ by at most 1. Left and right subtrees are subtrees is balanced.

        Algorithm:
        1. Initialize start = 0, end = length of the array - 1
        2. Set mid = (start+end)/2
        3. Create a tree node with mid as root (lets call it A).
        4. Recursively do following steps:
           a). Calculate mid of left subarray and make it root of left subtree of A.
           b). Calculate mid of right subarray and make it root of right subtree of A.
         */
        
        public static Node array2Tree(int[] arr, int startInt, int endInt){
            if(startInt > endInt){return null;}//base case
            //PRE       logic here
            int mid=(startInt + endInt)/2;
            Node node = new Node(arr[mid]);
            System.out.println("left--------"+ mid);
            //REC LEFT
            node.left=array2Tree(arr,startInt,mid-1);
            System.out.println(" ");
            System.out.println("right-------------------------"+mid);
            //REC RIGHT
            node.right=array2Tree(arr,mid+1,endInt);
            return node;
            
        }
        public static Node array2TreeWrapper(int[] arr){
            return array2Tree(arr, 0, arr.length-1);
        }
        
        public static void traverseInOrder(Node node){
            if(node==null){return;}//base case
            traverseInOrder(node.left);
            System.out.println(""+node.key);
            traverseInOrder(node.right);
        }
        
        /*
            LinkedList from Tree, One linked list for each depth/ height
        */
        public static void linkedListsFromTreeForDepth(){
            //first max depth
            
            
            //can keep sum of depth, if null then dont add the list
                //
            
            //keep an array of linkedlists, 
                //depth = 0; 
                    //then add to linked list of zero. I would like to add it to head of linked list, 
                        // due to O(1) insertion order
                        //no point adding it to end, plus specification does not ask for that
                        
                        //problem with array not resizable. unless i already know depth of linked list
                            //solve with arraylist
        }
        public static int maxDepth(Node node){
            //max depth
            if(node == null){return 0;}
            
            
            int left = maxDepth(node.left);
            int right = maxDepth(node.right);
            
            return Math.max(right, left) + 1;
   
            //come back to this
                    //it does look like post-order modified
                        //why?????????????????/
                        //????????
                        //????????
        }
        /*
            create linked list at each depth
        */
        static ArrayList<LinkedList<Integer>> arrList = new ArrayList<LinkedList<Integer>>(); //create variable outside of method
        
        public static void createLink(Node node, Integer level){
            if(node==null){return;} //base case, unwind recursive stack
            System.out.println("A");
            //create linked list
            LinkedList<Integer> lList;
            //check if a linked list is created at that level
            if(arrList.size() <= level   ){ // NOTE I COULD NOT DO GET(INDEX) RETURN EXCEPTION AND NOT NULL
                lList = new LinkedList<Integer>(); //create linkedlist
                arrList.add(level, lList); //add linkedlist to array
            }else{ //already exists
                lList = arrList.get(level);
            }
            lList.addFirst(node.key);
            
            //keep track of level
            level=level+1;
            
            createLink(node.left, level);
            //traverse left
            createLink(node.right,level);
            //traverse right 
        }
        //with above
        public static void createLinkWrapper(Node node){
            createLink(node, 0);
        }
        //above
        public static void traverseLinkedList(){
            for(LinkedList list : arrList ) {
                System.out.println("new line");
                for(Object i : list){
                    System.out.println(""+ i);
                }
            }
        }
        
        /*
            Q5 - Check if a binary tree is a binary search tree
        */
        
        //1st Answer - PRE ORDER 
        //return 0 - not bst
        //return 1 - bst, if it passes all tests
        //DOES NOT WORK BECAUSE NO GLOBAL VARIABLE ETC (wrong answer)
        //O(n) - time.      0(h) or 0(log n) - space
        public static int checkBSTTrue(Node node){ //0 return not bst, -1 NOT 
            if(node==null){return 1;}
            
            //check left key - stop if 0 is returned
            if( node.left != null && node.left.key > node.key ){return 0;} //check null(cut out error, left of null),compare
            
            //check right key - stop if 0 is returned
            if (node.right !=null && node.key > node.right.key){return 0;}
            
            //check right i.e RECUR LEFT and RIGHT
            //false if, recursively, the left or right, is not a binary tree (ANY OF THEM)
            //if any of the below line returns 0, stop the whole program and return 0
            if ( checkBSTTrue(node.left)== 0|| checkBSTTrue(node.right)==  0){return 0;} //check children for the ting
            
            return 1; //PASSES ALL TESTS, return true, this is after many stages
        }
        //2nd Answer - min and max
        
        //3rd Answer - global
        
        
        public static void main(String[] args){
            //Q3
            //int[] arr1 = {0,1,2,3,4};
            //BinaryTree bt = new BinaryTree( array2TreeWrapper(arr1) );
            //bt.traverseInOrder(bt.root);
            //Q4
            BinaryTree bt = new BinaryTree(27);
            bt.root.left = new Node(14);
            bt.root.right = new Node(31);
            bt.root.left.left = new Node(10);
            bt.root.left.right = new Node(19);
            bt.root.right.left = new Node(24);
            bt.root.right.right = new Node(35);
            //Q4 ALSO
            //createLinkWrapper(bt.root);
            //traverseLinkedList();
            System.out.println("New Line in main");
            bt.traverseInOrder(bt.root);
            System.out.println("New Line in main");
            System.out.println(""+ checkBSTTrue(bt.root));
        }
    }
}