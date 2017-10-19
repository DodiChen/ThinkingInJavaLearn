package com.dodi.unit3;

public class PassObject {
	
	public static void fu(Letter y){
		y.c = 'Z';
	}
	
	public static void main(String[] args){
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1: x.c: " + x.c);
		fu(x);
		System.out.println("2: x.c: " + x.c);
		
	}
}

class Letter{
	char c;
}
