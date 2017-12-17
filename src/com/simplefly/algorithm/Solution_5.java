package com.simplefly.algorithm;
/**   
 * @ClassName:  Solution_6   
 * @Description:用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型 
 * @author: simplyfly 
 * @date:   2017年12月17日 下午9:21:01   
 *     
 * @Copyright: 2017 SimplyFly2016 All rights reserved. 
 */
import java.util.Stack;

public class Solution_5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	
    	// 可以处理连续push的情况
        while(stack2.size() > 0) {
        	stack1.push(stack2.pop());
        }
        
        stack1.push(node);
    }
    
    public int pop() {
    
    	while(stack1.size() > 0) {
    		stack2.push(stack1.pop());
    	}
    	
    	return stack2.pop();
    	
    }
}