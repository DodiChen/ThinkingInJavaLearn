package com.dodi.unit15;

public class Holder3<T> {
	private T a;
	public Holder3(T a){
		this.a = a;
	}
	public T get() {
		return a;
	}
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get();
		//h3.set("Not an Automobile");
		Holder3<String> h4 = new Holder3<String>("21");
		System.out.println(h4.get());
	}
}
