package com.dodi.unit12;

public class NeverCaught {
	
	static void f() throws RuntimeException{
		throw new RuntimeException("From f()");
	}
	
	static void g() {
		f();
	}
	
	public static void main(String[] args) {
		g();
	}
}
