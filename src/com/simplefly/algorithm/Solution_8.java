package com.simplefly.algorithm;

/**   
 * @ClassName:  Solution_8   
 * @Description:一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。 
 * @author: simplyfly 
 * @date:   2017年12月17日 下午11:01:36   
 *     
 * @Copyright: 2017 SimplyFly2016 All rights reserved. 
 */
public class Solution_8 {
    /**   
     * @Title: JumpFloor   
     * @Description: 使用递归方法 
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
     * @Description: 利用斐波那契数列解决，减少重复计算  
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
