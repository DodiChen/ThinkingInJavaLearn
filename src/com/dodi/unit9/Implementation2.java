package com.dodi.unit9;

public class Implementation2 implements Service {
	
	private Implementation2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation2 method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation2 method2");
	}
	
	public static ServiceFactory factory = 
			new ServiceFactory() {

				@Override
				public Service getService() {
					// TODO Auto-generated method stub
					return new Implementation2();
				}
		
	};
	
}
