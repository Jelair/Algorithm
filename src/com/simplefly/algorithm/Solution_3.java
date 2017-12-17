package com.simplefly.algorithm;
/**   
 * @ClassName:  Solution_6   
 * @Description:输入一个链表，从尾到头打印链表每个节点的值。 
 * @author: simplyfly 
 * @date:   2017年12月17日 下午9:21:01   
 *     
 * @Copyright: 2017 SimplyFly2016 All rights reserved. 
 */
import java.util.ArrayList;

public class Solution_3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ListNode current = listNode;
        while(current != null){
            arr.add(current.val);
			current = current.next;
        }
        for(int i = 0; i < arr.size(); i++){
            arr2.add(arr.get(arr.size()-1-i));
        }
        return arr2;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}