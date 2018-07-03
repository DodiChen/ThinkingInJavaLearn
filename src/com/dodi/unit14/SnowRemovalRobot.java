package com.dodi.unit14;

import java.util.Arrays;
import java.util.List;

public class SnowRemovalRobot implements Robot{
	
	private String name;
	public SnowRemovalRobot(String name) {
		this.name = name;
	}
	@Override
	public String name() {
		return name;
	}

	@Override
	public String model() {
		return "SnowBot Series 11";
	}

	@Override
	public List<Operation> operations() {
		// TODO Auto-generated method stub
		return Arrays.asList(
				new Operation() {
					
					@Override
					public String description() {
						// TODO Auto-generated method stub
						return name + " Can shovel snow";
					}
					
					@Override
					public void command() {
						// TODO Auto-generated method stub
						System.out.println(name + " shoveling snow");
					}
				},
				new Operation() {
					
					@Override
					public String description() {
						// TODO Auto-generated method stub
						return name + " can ship ice";
					}
					
					@Override
					public void command() {
						// TODO Auto-generated method stub
						System.out.println(name + " chipping ice");
					}
				},
				new Operation() {
					
					@Override
					public String description() {
						// TODO Auto-generated method stub
						return name + " can clear the roof";
					}
					
					@Override
					public void command() {
						// TODO Auto-generated method stub
						System.out.println(name + " clearing roof");
					}
				}
			);
	}
	
	public static void main(String[] args) {
		Robot.Test.test(new SnowRemovalRobot("Slusher"));
	}

}
