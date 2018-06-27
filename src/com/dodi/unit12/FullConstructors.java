package com.dodi.unit12;

public class FullConstructors {
	
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}
	
	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}
	
	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
		
		try {
			g();
		} catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}
}
