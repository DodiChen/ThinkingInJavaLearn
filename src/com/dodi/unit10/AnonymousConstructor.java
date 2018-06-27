package com.dodi.unit10;

abstract class Base{
	public Base(int i) {
		System.out.println("Base constructor, i= " + i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	
	public static Base getBase(int i) {
		return new Base(i) {
			String s = null;
			{
				System.out.println("Inside instance initializer");
				s = "sss";
			}
			public void f() {
				System.out.println(i);
				System.out.println("In anonymous f()");
				System.out.println(s);
			}
		};
	}
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}
