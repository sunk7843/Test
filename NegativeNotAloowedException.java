package com.po;

public class NegativeNotAloowedException extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = -3149841498179127516L;
public NegativeNotAloowedException() {
	// TODO Auto-generated constructor stub
System.out.println("Negative Not Allowed");
}
public NegativeNotAloowedException(String num){
	System.out.println(num);
}
}
