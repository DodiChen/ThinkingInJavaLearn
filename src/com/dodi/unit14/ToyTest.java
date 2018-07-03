package com.dodi.unit14;

interface HasBatteries{}
interface Waterproff{}
interface Shoots{}

class Toy{
	Toy(){}
	Toy(int i) {}
	void ha() {
		System.out.println("ha");
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproff, Shoots {
	FancyToy(){
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name : " + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("com.dodi.unit14.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		
		printInfo(c);
		
		for(Class face : c.getInterfaces()) {
			printInfo(face);
		}
		
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
			((Toy)obj).ha();
		} catch (InstantiationException e) {
			System.out.println("Cannot instaniate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}
