package com.dodi.unit17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>(Arrays.asList("A B C D".split(" ")));
		System.out.println(list);
		for(int i = 0 ; i < 100; i++) {
			list.add("A" + i);
		}
		System.out.println("-----");
		list.add("B");

		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ListIterator<String> listit = list.listIterator();
		while(listit.hasNext()) {
			System.out.println(listit.next());
		}
		while(listit.hasPrevious()) {
			System.out.println(listit.previous());
		}


		
		
		List<String> list22 = new LinkedList<String>();
		
		String last = "last";
		final String l = last;
		last = "last2";
		System.out.println(l);
		System.out.println(last);

		for(int i = 0; i < 10; i++){
			list22.add(i+"");
		}
		System.out.println(list22.get(4));
		
		List<Long> lll = new ArrayList<Long>();
		for(int i = 0; i < 10; i++){
			lll.add(new Long(i));
		}
		Iterator<Long> it1 = lll.iterator();
		while(it1.hasNext()){
			Long fdd = it1.next();
			if("6".equals(fdd.toString())){
				it.remove();
			}
		}

		System.out.println(lll);

		Long ll = 6000000000000020770L;
		System.out.println(ll);

	}

}
