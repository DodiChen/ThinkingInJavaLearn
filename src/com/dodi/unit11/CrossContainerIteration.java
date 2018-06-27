package com.dodi.unit11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.dodi.unit11.pets.Cat;
import com.dodi.unit11.pets.Pet;

public class CrossContainerIteration {
	
	public static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.getName() + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<Pet> pets = new ArrayList<Pet>();
		for(int i = 0; i < 10; i++) {
			pets.add(new Cat("cat"));
		}
		display(pets.iterator());
		LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
		display(petsLL.iterator());
		HashSet<Pet> petsHs = new HashSet<Pet>(pets);
		display(petsHs.iterator());
		TreeSet<Pet> petsTs = new TreeSet<Pet>(pets);
		display(petsTs.iterator());
	}
}
