package com.dodi.unit5;

public class OptionalTrailingArguments {
	
	static void f(int require, String ... args){
		System.out.print("Required: " + require + " ");
		for(String s : args){
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}

}
