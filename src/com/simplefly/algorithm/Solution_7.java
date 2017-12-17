package com.simplefly.algorithm;

/**   
 * @ClassName:  Solution_7   
 * @Description:����Ҫ������һ������n���������쳲��������еĵ�n�
 * @author: simplyfly 
 * @date:   2017��12��17�� ����9:40:22   
 *     
 * @Copyright: 2017 SimplyFly2016 All rights reserved. 
 */
public class Solution_7 {
	
    /**   
     * @Title: Fibonacci   
     * @Description: ʹ�õݹ鷽��  
     * @param: @param n
     * @param: @return      
     * @return: int      
     */  
    public int Fibonacci(int n) {
        if(n == 0)
        	return 0;
		if(n == 1 || n == 2)
			return 1;
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    
    
    /**   
     * @Title: Fibonacci_dynamic   
     * @Description: ʹ�ö�̬�滮����
     * @param: @param n
     * @param: @return      
     * @return: int       
     */  
    public int Fibonacci_dynamic(int n) {
    	int i = 0;
    	int j = 1;
    	while(n-- > 0) {
    		i += j;
    		j = i - j;
    	}
    	return i;
    }
    
    public static void main(String[] args) {
    	System.out.println(new Solution_7().Fibonacci_dynamic(3));
    	
    }
}