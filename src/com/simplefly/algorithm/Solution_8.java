package com.simplefly.algorithm;

/**   
 * @ClassName:  Solution_8   
 * @Description:һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж����������� 
 * @author: simplyfly 
 * @date:   2017��12��17�� ����11:01:36   
 *     
 * @Copyright: 2017 SimplyFly2016 All rights reserved. 
 */
public class Solution_8 {
    /**   
     * @Title: JumpFloor   
     * @Description: ʹ�õݹ鷽�� 
     * @param: @param target
     * @param: @return      
     * @return: int      
     * @throws   
     */  
    public int JumpFloor(int target) {
    	if(target == 0)
    		return 0;   	
    	else if(target == 1)
    		return 1;
    	else if(target == 2)
    		return 2;
    	
    	return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
    
    
    /**   
     * @Title: JumpFloor_improve   
     * @Description: ����쳲��������н���������ظ�����  
     * @param: @param target
     * @param: @return      
     * @return: int      
     * @throws   
     */  
    public int JumpFloor_improve(int target) {
    	int a = 1;
    	int b = 2;
    	if(target <= 2)
    		return target;
    	
    	while(target-- > 2) {
    		b += a;
    		a = b - a;
    	}
    	
    	return b;
    }
    
    public static void main(String[] args) {
    	Solution_8 testObj = new Solution_8();
    	for(int i = 0; i < 40; i++) {
    		System.out.println(testObj.JumpFloor(i) + "--" + testObj.JumpFloor_improve(i));
    	}
    }
    
    
}
