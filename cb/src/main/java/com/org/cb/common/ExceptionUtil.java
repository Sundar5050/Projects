package com.org.cb.common;

public class ExceptionUtil extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Throwable linkedException;

	public ExceptionUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExceptionUtil(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
	public ExceptionUtil(String msg, Throwable e) {
		super(msg, e);
		setLinkedException(e);
	}


	public void setLinkedException(Throwable e) {
		linkedException = e;
		
	}
	
	public Throwable getLinkedException() {
		return linkedException;
	}
	

	public ExceptionUtil(Throwable e) {
		super(e);
		// TODO Auto-generated constructor stub
	}
	

}
