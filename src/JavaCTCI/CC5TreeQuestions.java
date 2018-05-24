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
        public class Node{
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
        public static int getMaxHeight(Node root1){
            if (root1!=null)
                return 0;
            return Math.max(getMaxHeight(root.left), getMaxHeight(root.right)+1); 
        }
        /*
            Check if a tree is balanced
        */
        public static int checkBalanced(Node root1){
            //check depth, maybe use a depth based traverse, 
            //when i hit end of if then i should return a number
            return 5;
            
            
            
            //expand-s;[dl[osadpasmdaoisn
            
            
            
        }
        public static void main(String[] args){
            //
        }
    }
}
