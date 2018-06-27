package com.dodi.unit11;

import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInteger {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Set<Integer> intset = new TreeSet<Integer>();
		for(int i = 0; i < 10000; i++) {
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
	}
}
