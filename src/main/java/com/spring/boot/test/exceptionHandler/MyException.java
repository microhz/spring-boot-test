package com.spring.boot.test.exceptionHandler;
/**
 * @author micro
 * @date 2017年7月14日
 * @description : 
 */
public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		return "micro-ex : " + super.getMessage();
	}
}
