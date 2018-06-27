package com.dodi.unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	
	public Iterable<T> reversed(){
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<T>() {
					int current = size() - 1;
					
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > -1;
					}

					@Override
					public T next() {
						// TODO Auto-generated method stub
						return get(current--);
					}
					
					public void remove() {
						throw new UnsupportedOperationException();
					}
					
				};
			}
			
		};
	}
}

public class AdapterMethodIdiom{
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<String>(Arrays.asList("A B C D E F G".split(" ")));
		for(String s : ral) {
			System.out.print(s);
		}
		System.out.println();
		for(String s : ral.reversed()) {
			System.out.print(s);
		}
		
	}
}
