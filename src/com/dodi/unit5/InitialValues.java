package com.dodi.unit5;

public class InitialValues {

	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;
	
	void printInitialValules(){
		System.out.println("Data Type        Initial value");
		System.out.println("boolean          " + t);
		System.out.println("char             [" + c + "]");
		System.out.println("byte             " + b);
		System.out.println("short            " + s);
		System.out.println("int              " + i);
		System.out.println("long             " + l);
		System.out.println("float            " + f);
		System.out.println("double           " + d);
		System.out.println("reference        " + reference);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitialValues iv = new InitialValues();
		iv.printInitialValules();
	}

}
