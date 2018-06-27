package com.dodi.unit11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.dodi.unit11.pets.Cat;
import com.dodi.unit11.pets.Pet;

public class SimpleIterator {
	public static void main(String[] args) {
		List<Pet> pets = new ArrayList<Pet>();
		for(int i = 0; i < 10; i++) {
			pets.add(new Cat("cat"));
		}
		Iterator<Pet> iterator = pets.iterator();
		while(iterator.hasNext()) {
			Pet p = iterator.next();
			System.out.println(p.getName());
		}
		for(Pet p : pets) {
			System.out.println(p.getName());
		}
		iterator = pets.iterator();
		for(int i = 0;i < 6; i++) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(pets);
	}
}
