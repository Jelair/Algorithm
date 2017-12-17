package com.simplefly.algorithm;
/**   
 * @ClassName:  Solution_6   
 * @Description:请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author: simplyfly 
 * @date:   2017年12月17日 下午9:21:01   
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
