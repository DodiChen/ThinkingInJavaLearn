package com.dodi.unit5;

public class Flower {

	int petalCount = 0;
	String s = "initial value";
	
	Flower(int petals){
		this.petalCount = petals;
		System.out.println("Constructor w/ arg only, petalCount= " + petalCount);
	}
	
	Flower(String ss){
		System.out.println("COnstructor w/ String arg only, s + " + ss);
		s = ss;
	}
	
	Flower(String s, int petal){
		this(petal);
		this.s = s;
		System.out.println("String & int arg");
	}
	
	Flower(){
		this("hi", 47);
		System.out.println("default Construcor (no arg)");
	}
	
	void printPetalCount(){
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}
	
	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}
	
}
