package com.dodi.unit10;

public class DotNew {
	
	public class Inner{
		public void f() {
			System.out.println("---");
		}
	}
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
		dni.f();
	}
}
