package com.simplefly.algorithm;
/**   
 * @ClassName:  Solution_6   
 * @Description:������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���� 
 * @author: simplyfly 
 * @date:   2017��12��17�� ����9:21:01   
 *     
 * @Copyright: 2017 SimplyFly2016 All rights reserved. 
 */
import java.util.Stack;

public class Solution_5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	
    	// ���Դ�������push�����
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