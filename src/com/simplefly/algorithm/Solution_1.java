package com.simplefly.algorithm;
/**   
 * @ClassName:  Solution_6   
 * @Description:�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * @author: simplyfly 
 * @date:   2017��12��17�� ����9:21:01   
 *     
 * @Copyright: 2017 SimplyFly2016 All rights reserved. 
 */
public class Solution_1 {
    public boolean Find(int target, int [][] array) {
        
        int row = array.length;
        int column = array[0].length;
        for(int i = 0; i < row; i++){
        	for(int j = 0; j < column; j++){
        		if(array[i][j] == target)
        			return true;
        	}
        }
        return false;
    }
}
