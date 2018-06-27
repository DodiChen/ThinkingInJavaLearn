package com.dodi.unit10;

public class Parcel7B {
	class MyContents implements Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	public Contents contents() {
		return new MyContents();
	}
	
	public static void main(String[] args) {
		Parcel7B p = new Parcel7B();
		Contents c = p.contents();
		System.out.println(c.value());
	}
}
