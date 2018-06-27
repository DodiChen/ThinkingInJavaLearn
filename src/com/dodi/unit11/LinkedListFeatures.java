package com.dodi.unit11;

import java.util.LinkedList;

import com.dodi.unit11.pets.Cat;
import com.dodi.unit11.pets.Dog;
import com.dodi.unit11.pets.Hamster;
import com.dodi.unit11.pets.Manx;
import com.dodi.unit11.pets.Mouse;
import com.dodi.unit11.pets.Pet;

public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<Pet>();
		for(int i = 0; i < 10; i++) {
			pets.add(new Cat("cat" + i));
		}
		System.out.println(pets);
		System.out.println("pets.getFirst(): " + pets.getFirst());
		System.out.println("pets.element(): " +pets.element() );
		System.out.println("pets.peek(): " + pets.peek());
		System.out.println("pets.remove(): " + pets.remove());
		System.out.println("pets.remove(): " + pets.removeFirst());
		System.out.println("pets.poll(): " + pets.poll());
		System.out.println(pets);
		pets.addFirst(new Dog("Dog"));
		System.out.println("After addFirst(): " + pets);
		pets.offer(new Hamster("hamstr"));
		System.out.println("After offer(): " + pets);
		pets.add(new Mouse("Mouse"));
		System.out.println("after add(): " + pets);
		pets.addLast(new Manx("Manx"));
		System.out.println("After addLast(): " + pets);
		System.out.println("pets.removeLast(): " + pets.removeLast());
	}
}
