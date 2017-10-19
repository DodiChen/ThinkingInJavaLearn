package com.dodi.unit3;

import java.util.ArrayList;
import java.util.List;

public class Overflow {
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
		
		List<String> list = new ArrayList<String>();
		for(String s : list){
			System.out.println(s);
		}
	}
}
