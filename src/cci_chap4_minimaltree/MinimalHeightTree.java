/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci_chap4_minimaltree;

import bst.Node;

/**
 *
 * @author Ali
 */
public class MinimalHeightTree 
{
    public Node buildMinimumHeightTree(int[] arr, int start, int end)
    {
        if (end < start)
            return null;
        
        int mid = (start + end) / 2;
        Node n = new Node(arr[mid]);
        
        n.left = buildMinimumHeightTree(arr, start, mid-1);
        n.right = buildMinimumHeightTree(arr, mid+1, end);
        
        return n;
    }
}
