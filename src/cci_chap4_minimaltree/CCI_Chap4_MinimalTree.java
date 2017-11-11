/*

Minimal Tree: Given a sorted (increasing order) array with unique integer 
elements, write an algorithm to create a binary search tree with minimal height.

 */
package cci_chap4_minimaltree;

import bst.Node;

/**
 *
 * @author Ali
 */
public class CCI_Chap4_MinimalTree 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        
        MinimalHeightTree minTree = new MinimalHeightTree();
        Node root = minTree.buildMinimumHeightTree(arr, 0, arr.length-1);
                
        System.out.println(heightOfTree(root));
    }
    
    public static int heightOfTree(Node root)
    {
        int greater;
        if(root == null)
            return -1;
        else
        {
            int heightOfLeftTree = heightOfTree(root.left);
            int heightOfRightTree = heightOfTree(root.right);
            
            greater = maxOf(heightOfLeftTree, heightOfRightTree) + 1;
        }
        return greater;
    }
    
    private static int maxOf(int val1, int val2)
    {
        if(val1 > val2)
            return val1;
        else
            return val2;
    }
    
}
