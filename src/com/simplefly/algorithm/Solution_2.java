package com.simplefly.algorithm;
/**   
 * @ClassName:  Solution_6   
 * @Description:��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�� 
 * @author: simplyfly 
 * @date:   2017��12��17�� ����9:21:01   
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