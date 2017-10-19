package com.dodi.unit3;

public class Fibonacci {
	
	public int fibonacci(int max){
		if(max == 1 || max == 2){
			return 1;
		}else{
			return fibonacci(max - 1) + fibonacci(max - 2); 
		}
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		for(int i = 1; i <= 5; i++){
			System.out.print(f.fibonacci(i) + "\t");
		}
	}
}
