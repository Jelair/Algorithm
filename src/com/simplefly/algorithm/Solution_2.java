package com.simplefly.algorithm;
/**   
 * @ClassName:  Solution_6   
 * @Description:请实现一个函数，将一个字符串中的空格替换成“%20” 
 * @author: simplyfly 
 * @date:   2017年12月17日 下午9:21:01   
 *     
 * @Copyright: 2017 SimplyFly2016 All rights reserved. 
 */
public class Solution_2 {
    public String replaceSpace(StringBuffer str) {
        
    	char[] chararr = str.toString().toCharArray();
        for(int i = 0; i < chararr.length; i++){
			if(chararr[i] == ' '){
                
				str.replace(i,i+1,"%20");
                chararr = str.toString().toCharArray();
            }
        }
        return str.toString();
    }
}