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
public class CC5Tree {
    //not inner class can be static in java
    public static class BinaryTree{
        public static class Node{
            Node left,right;
            int key;
            public Node(int key){
                this.key=key;
                left=right=null;
            }
            //should implement logic here
        }
        Node root;
        public BinaryTree(){root=null;}
        public BinaryTree(Node root){
            this.root=root;
        }
        //Driver method - runs method without dynamic creation of class/method
        public static void main(String[] args){
            BinaryTree bt = new BinaryTree();//used empty constructor
            //Empty 
            bt.root = new Node(1);
            //                          1
            //                        /   \
            //                     null  null
            bt.root.left = new Node(2);
            //                          1
            //                        /   \
            //                       2  null
            bt.root.right = new Node(3);
            bt.root.left.left = new Node(4);
            bt.root.left.right = new Node(5);

            //                          1
            //                        /   \
            //                       2     3   
            //                      / \   /  \
            //                     4  5  null null
            //                   /\  /\
            //              null null null null
        }
        //traversals

        /**
        Preorder Traversal:
        * 
        Algorithm Preorder(tree)
           1. Visit the root.
           2. Traverse the left subtree, i.e., call Preorder(left-subtree)
           3. Traverse the right subtree, i.e., call Preorder(right-subtree) 
         * // PRE ORDER: 1 2 4 5 3
         * @param node - head
         */
        void printPreorder(Node node){
            if (node == null)
                return;

            /* first print data of node */
            System.out.print(node.key + " ");

            /* then recur on left sutree */
            printPreorder(node.left);

            /* now recur on right subtree */
            printPreorder(node.right);
        }
        
        /**
         * norder Traversal:

        Algorithm Inorder(tree)
           1. Traverse the left subtree, i.e., call Inorder(left-subtree)
           2. Visit the root.
           3. Traverse the right subtree, i.e., call Inorder(right-subtree)
         */
        /* Given a binary tree, print its nodes in preorder*/
        //PRINT IN-ORDER: 4 2 5 1 3
        //@Node node - root
    }
}
