package com.simplefly.algorithm;
/**   
 * @ClassName:  Solution_6   
 * @Description:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *  输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素
 * @author: simplyfly 
 * @date:   2017年12月17日 下午9:21:01   
 *     
 * @Copyright: 2017 SimplyFly2016 All rights reserved. 
 */
public class Solution_6 {
    public int minNumberInRotateArray(int [] array) {
    	if(array.length == 0)
    		return 0;
    	
    	int minNum = array[0];
    	for(int i = 1; i < array.length; i++) {
    		if(minNum > array[i])
    			minNum = array[i];
    	}
    	return minNum;	
    }
}