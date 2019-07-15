package com.cuijie.toolss.utils;
/**
 * 
 * @ClassName: AssertExc 
 * @Description: 自定义异常类
 * @author:崔杰 
 * @date: 2019年7月15日 上午8:48:11
 */
public class AssertExc extends Exception {
	/**
	 * 
	 * @Title:AssertExc
	 * @Description:无参
	 */
	public AssertExc() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	/**
	 * 
	 * @Title:AssertExc
	 * @Description:有参
	 * @param message
	 */
	public AssertExc(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
}
