package com.dodi.unit11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.dodi.unit11.pets.Cat;
import com.dodi.unit11.pets.Dog;
import com.dodi.unit11.pets.Pet;

public class ListInteration {
	public static void main(String[] args) {
		List<Pet> pets = new ArrayList<Pet>();
		for(int i = 0; i < 10; i++) {
			pets.add(new Cat("cat" + i));
		}
		ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.getName() + "\t");
		}
		System.out.println();
		while(it.hasPrevious()) {
			Pet p = it.previous();
			System.out.print(p.getName() + "\t");
		}
		System.out.println();
		System.out.println(pets);
		it = pets.listIterator(3);
		while(it.hasNext()) {
			it.next();
			it.set(new Dog("Dog"));
		}
		System.out.println(pets);
	}
}
