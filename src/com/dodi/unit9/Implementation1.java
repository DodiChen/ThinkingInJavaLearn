package com.dodi.unit9;

public class Implementation1 implements Service {
	
	private Implementation1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation1 method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation1 method2");
	}
	
	public static ServiceFactory factory =
			new ServiceFactory() {

				@Override
				public Service getService() {
					// TODO Auto-generated method stub
					return new Implementation1();
				}
		
	};

}
