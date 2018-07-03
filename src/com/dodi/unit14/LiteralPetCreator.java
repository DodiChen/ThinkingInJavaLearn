package com.dodi.unit14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.dodi.unit11.pets.Cat;
import com.dodi.unit11.pets.Cymric;
import com.dodi.unit11.pets.Dog;
import com.dodi.unit11.pets.EgyptianMau;
import com.dodi.unit11.pets.Hamster;
import com.dodi.unit11.pets.Manx;
import com.dodi.unit11.pets.Mouse;
import com.dodi.unit11.pets.Mutt;
import com.dodi.unit11.pets.Pet;
import com.dodi.unit11.pets.Pug;
import com.dodi.unit11.pets.Rat;
import com.dodi.unit11.pets.Rodent;

public class LiteralPetCreator extends PetCreator{
	
	public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(
				Arrays.asList(Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class,
						Pug.class, EgyptianMau.class, Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class)
			);
	
	private static final List<Class<? extends Pet>> types = 
			allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}
	
	public static void main(String[] args) {
		System.out.println(types);
	}

}
