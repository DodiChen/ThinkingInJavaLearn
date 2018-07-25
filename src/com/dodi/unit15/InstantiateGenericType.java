package com.dodi.unit15;

class ClassAsFactory<T> {
	T x;
	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
}

class Employee{}

public class InstantiateGenericType {
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		System.out.println("ClassAsFactory<Employee> succeed");
		try {
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		}catch(Exception e) {
			System.out.println("ClassAsFactory<Integer> failed");
		}
		
	}
}
