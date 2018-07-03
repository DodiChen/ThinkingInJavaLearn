package com.dodi.unit14;

import java.util.ArrayList;
import java.util.List;

import com.dodi.unit11.pets.Pet;

public class ForNameCreator extends PetCreator{
	
	private static ArrayList<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	
	private static String[] typeNames = {
			"com.dodi.unit11.pets.Mutt",
			"com.dodi.unit11.pets.Pug",
			"com.dodi.unit11.pets.EgyptianMau",
			"com.dodi.unit11.pets.Manx",
			"com.dodi.unit11.pets.Cymric",
			"com.dodi.unit11.pets.Rat",
			"com.dodi.unit11.pets.Mouse",
			"com.dodi.unit11.pets.Hamster"
	};
	
	private static void loader() {
		try {
			for(String name : typeNames) {
				types.add((Class<? extends Pet>) Class.forName(name));
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	static {
		loader();
	}
	
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}

}
