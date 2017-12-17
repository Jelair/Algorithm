package com.simplefly.algorithm;
/**   
 * @ClassName:  Solution_6   
 * @Description:��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 *  ����һ���ǵݼ�����������һ����ת�������ת�������СԪ��
 * @author: simplyfly 
 * @date:   2017��12��17�� ����9:21:01   
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