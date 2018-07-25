package com.dodi.unit15;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
	
	private int n;
	public IterableFibonacci(int count) {
		n = count;
	}

	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {

			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n > 0;
			}

			public Integer next() {
				// TODO Auto-generated method stub
				n--;
				return IterableFibonacci.this.next();
			}};
	}
	public static void main(String[] args) {
		for(int i :new IterableFibonacci(18)) {
			System.out.print(i + " ");
		}
	}
	
}
