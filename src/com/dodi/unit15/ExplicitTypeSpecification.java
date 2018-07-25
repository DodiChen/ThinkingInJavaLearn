package com.dodi.unit15;

import java.util.List;
import java.util.Map;

import com.dodi.unit11.pets.Person;
import com.dodi.unit11.pets.Pet;

public class ExplicitTypeSpecification {

	static void f(Map<Person, List<Pet>> petPeople) {}
	public static void main(String[] args) {
		f(New.map());
	}
}
