package com.dodi.unit5;

class A{}

public class VarArgs {
	static void printArray(Object[] args){
		for(Object obj : args){
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		VarArgs.printArray(new Object[]{
				new Integer(1), 
				new Integer(2), 
				new Integer(3)
		});
		
		VarArgs.printArray(new Object[]{
				"one", 
				"two", 
				"three"
		});
		
		VarArgs.printArray(new Object[]{
				new A(),
				new A(),
				new A()
		});
	}
	
}
