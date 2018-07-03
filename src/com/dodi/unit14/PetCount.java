package com.dodi.unit14;

import java.util.HashMap;

import com.dodi.unit11.pets.Cat;
import com.dodi.unit11.pets.Cymric;
import com.dodi.unit11.pets.Dog;
import com.dodi.unit11.pets.Hamster;
import com.dodi.unit11.pets.Manx;
import com.dodi.unit11.pets.Mouse;
import com.dodi.unit11.pets.Mutt;
import com.dodi.unit11.pets.Pet;
import com.dodi.unit11.pets.Pug;
import com.dodi.unit11.pets.Rat;
import com.dodi.unit11.pets.Rodent;

public class PetCount {
	
	static class PetCounter extends HashMap<String, Integer>{
		public void count(String type) {
			Integer quantity = get(type);
			if(quantity == null) {
				put(type, 1);
			}else {
				put(type, quantity + 1);
			}
		}
	}
	
	public static void countPets(PetCreator creator) {
		PetCounter counter = new PetCounter();
		for(Pet pet : creator.createArray(20)){
			System.out.print(pet.getClass().getSimpleName() + " ");
			if(pet instanceof Pet) {
				counter.count("Pet");
			}
			if(pet instanceof Dog) {
				counter.count("Dog");
			}
			if(pet instanceof Mutt) {
				counter.count("Mutt");
			}
			if(pet instanceof Pug) {
				counter.count("Pug");
			}
			if(pet instanceof Cat) {
				counter.count("cat");
			}
			if(pet instanceof Manx) {
				counter.count("Manx");
			}
			if(pet instanceof Cymric) {
				counter.count("Cymric");
			}
			if(pet instanceof Rodent) {
				counter.count("Rodent");
			}
			if(pet instanceof Rat) {
				counter.count("Rat");
			}
			if(pet instanceof Mouse) {
				counter.count("Mouse");
			}
			if(pet instanceof Hamster) {
				counter.count("Hamster");
			}
		}
		System.out.println();
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		countPets(new ForNameCreator());
	}
}
